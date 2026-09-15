public class Vehiculo2 implements Comparable<Vehiculo2> {

    int vin;
    String matricula;
    String dueño;

    public Vehiculo2() {
    }

    public Vehiculo2( int vin ,String matricula, String dueño) {
        this.vin = vin;
        this.matricula = matricula;
        this.dueño = dueño;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }


    @Override
    public String toString() {
        return "Vehiculo2{" +
                "vin=" + vin +
                ", matricula='" + matricula + '\'' +
                ", dueño='" + dueño + '\'' +
                '}';
    }

    @Override
    public int compareTo(Vehiculo2 o) {
        return this.vin - o.vin;
    }
}
