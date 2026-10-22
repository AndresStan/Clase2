import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockSafe {
    static void main(String[] args) {
        final Friend pedro = new Friend("Pedro");
        final Friend pablo = new Friend("Pablo");
        // arrancamos el saludo de pedro a plablo
        new Thread(new Bow(pedro, pablo)).start();
        // arrancamos el saludo de pedro a plablo
        new Thread(new Bow(pablo, pedro)).start();
    }

    static class Friend {
        private final String name;
        private final Lock lock;

        public Friend(String name) {
            this.name = name;
            this.lock = new ReentrantLock();
        }

        public String getName() {
            return this.name;
        }

        public boolean tryBow(Friend bower) {
            boolean myLock = false;
            boolean bowerLock = false;
            // tratamos de conseguir el bloqueo de los Lock
            // de ambos objetos
            try {
                myLock = lock.tryLock();
                bowerLock = bower.lock.tryLock();
            } finally {
                // Si no conseguimos el bloqueo de ambos
                // desbloqueamos aquel Lock
                // que hubieramos bloqueado
                if (!(myLock && bowerLock)) {
                    if (myLock) {
                        lock.unlock();
                    }
                    if (bowerLock) {
                        bower.lock.unlock();
                    }
                }
            }
            return myLock && bowerLock;
        }

        public void bow(Friend bower) {
            System.out.format("%s: %s" + " has bowed to me!%n"
                    , this.name, bower.getName());
            bower.bowBack(this);
        }

        public void bowBack(Friend bower) {
            System.out.format("%s: %s" + " has bowed back to me!%n"
                    , this.name, bower.getName());

        }
    }

    // declaramos una clase runnable para lanzar los saludos
    static class Bow implements Runnable {
        // declaramos dos objetos Friend: yo y mi amigo
        public Friend me;
        public Friend myFriend;

        public Bow(Friend me, Friend myFriend) {
            this.me = me;
            this.myFriend = myFriend;
        }

        @Override
        public void run() {
            // tratamos de obtener ambos bloqueos
            boolean locked = me.tryBow(myFriend);
            if (locked) {
                // Si lo conseguimos, saludamos y desbloqueamos
                try {
                    me.bow(myFriend);
                } finally {
                    // el bloque finally asegura el desbloqueo
                    me.lock.unlock();
                    myFriend.lock.unlock();
                }
            } else {
                // si tratamos de saludar pero alguno
                // ya había bloqueo
                // detectamos la situación
                // y devolvemos un mensaje
                System.out.println(me.name
                        + ": I was trying to bow my friend "
                        + myFriend.name
                        + " at the moment he was bowing me");

            }
        }
    }
}