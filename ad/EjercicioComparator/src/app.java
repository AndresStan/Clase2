import java.time.LocalDateTime;
import java.util.*;

public class app {

    public static void mostrarColaCompleta(PriorityQueue<Paciente> lista){
        lista.forEach(System.out::println);
    }

    public static void atenderPacientes(PriorityQueue<Paciente> lista){
        PriorityQueue<Paciente> copia = new PriorityQueue<>(lista);

        while (!copia.isEmpty()){
            System.out.println("Paciente atendido: " + copia.poll());
        }

    }

    public static void mostrarOrdenReal(PriorityQueue<Paciente> lista){
        lista.stream().sorted().forEach(System.out::println);
    }

    public static void main(String[] args) {

        PriorityQueue<Paciente> listaPacientes = new PriorityQueue<>();
        listaPacientes.add(new Paciente("Ana", 5, LocalDateTime.parse("2026-09-16T10:01")));
        listaPacientes.add(new Paciente("Luis", 9, LocalDateTime.parse("2026-09-16T10:02")));
        listaPacientes.add(new Paciente("Marta", 9, LocalDateTime.parse("2026-09-16T10:03")));
        listaPacientes.add(new Paciente("Pepe", 3, LocalDateTime.parse("2026-09-16T10:04")));
        listaPacientes.add(new Paciente("Sonia", 7, LocalDateTime.parse("2026-09-16T10:05")));
        listaPacientes.add(new Paciente("Raúl", 4, LocalDateTime.parse("2026-09-16T10:06")));
        listaPacientes.add(new Paciente("Julia", 10, LocalDateTime.parse("2026-09-16T10:07")));
        listaPacientes.add(new Paciente("Iván", 6, LocalDateTime.parse("2026-09-16T10:08")));
        listaPacientes.add(new Paciente("Clara", 8, LocalDateTime.parse("2026-09-16T10:09")));
        listaPacientes.add(new Paciente("Diego", 2, LocalDateTime.parse("2026-09-16T10:10")));
        listaPacientes.add(new Paciente("Nora", 10, LocalDateTime.parse("2026-09-16T10:11")));
        listaPacientes.add(new Paciente("Óscar", 1, LocalDateTime.parse("2026-09-16T10:12")));
        listaPacientes.add(new Paciente("Belén", 7, LocalDateTime.parse("2026-09-16T10:13")));
        listaPacientes.add(new Paciente("Víctor", 5, LocalDateTime.parse("2026-09-16T10:14")));
        listaPacientes.add(new Paciente("Paula", 9, LocalDateTime.parse("2026-09-16T10:15")));
        listaPacientes.add(new Paciente("Sergio", 4, LocalDateTime.parse("2026-09-16T10:16")));
        listaPacientes.add(new Paciente("Irene", 6, LocalDateTime.parse("2026-09-16T10:17")));
        listaPacientes.add(new Paciente("Tomás", 8, LocalDateTime.parse("2026-09-16T10:18")));
        listaPacientes.add(new Paciente("Laura", 3, LocalDateTime.parse("2026-09-16T10:19")));
        listaPacientes.add(new Paciente("Rubén", 7, LocalDateTime.parse("2026-09-16T10:20")));
        listaPacientes.add(new Paciente("Pilar", 10, LocalDateTime.parse("2026-09-16T10:21")));
        listaPacientes.add(new Paciente("Andrés", 2, LocalDateTime.parse("2026-09-16T10:22")));
        listaPacientes.add(new Paciente("Carla", 9, LocalDateTime.parse("2026-09-16T10:23")));
        listaPacientes.add(new Paciente("Mario", 6, LocalDateTime.parse("2026-09-16T10:24")));
        listaPacientes.add(new Paciente("Elena", 8, LocalDateTime.parse("2026-09-16T10:25")));
        listaPacientes.add(new Paciente("Fabián", 4, LocalDateTime.parse("2026-09-16T10:26")));
        listaPacientes.add(new Paciente("Rosa", 5, LocalDateTime.parse("2026-09-16T10:27")));
        listaPacientes.add(new Paciente("David", 7, LocalDateTime.parse("2026-09-16T10:28")));
        listaPacientes.add(new Paciente("Silvia", 3, LocalDateTime.parse("2026-09-16T10:29")));
        listaPacientes.add(new Paciente("Héctor", 9, LocalDateTime.parse("2026-09-16T10:30")));


       // atenderPacientes(listaPacientes);
        mostrarColaCompleta(listaPacientes);
       // mostrarOrdenReal(listaPacientes);


    }
}
