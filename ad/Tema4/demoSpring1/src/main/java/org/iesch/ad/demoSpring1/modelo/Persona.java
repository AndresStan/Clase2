package org.iesch.ad.demoSpring1.modelo;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class Persona {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    //@Basic
    String nombre;
    //@Column
    String apellidos;
    @Column(nullable = true)
    String dni;
    String email;
}
