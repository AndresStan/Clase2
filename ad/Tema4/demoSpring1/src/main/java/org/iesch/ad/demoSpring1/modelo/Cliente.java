package org.iesch.ad.demoSpring1.modelo;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Builder
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nombre;
    @OneToMany(mappedBy = "cliente") // Bidireccional
    //            @JoinColumn(name = "order_id") // Aqui
    // Para evitar la tabla intermedia
    // le indicamos como se va a llamar
    // la clave ajena de la tabla orden
    List<Orden> listaOrdenes;

}
