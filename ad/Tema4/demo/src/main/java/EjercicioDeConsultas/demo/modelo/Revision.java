package EjercicioDeConsultas.demo.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Revision {

    @Id
    private String codigo;
    private boolean cambio_filtro;
    private boolean cambio_aceite;
    private double coste;

    @ManyToOne
    @JoinColumn(name = "coche_id")
    private Coche coche;

    public String getCodigo() {
        return codigo;
    }

    public void setId(String codigo) {
        this.codigo = codigo;
    }

    public boolean isCambio_filtro() {
        return cambio_filtro;
    }

    public void setCambio_filtro(boolean cambio_filtro) {
        this.cambio_filtro = cambio_filtro;
    }

    public boolean isCambio_aceite() {
        return cambio_aceite;
    }

    public void setCambio_aceite(boolean cambio_aceite) {
        this.cambio_aceite = cambio_aceite;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }
}
