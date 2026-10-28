package org.iesch.ad.demoSpring1.modelo;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@ToString
@Builder
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

    @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "coche_id", referencedColumnName = "id")
    Coche coche;

    LocalDateTime createdAt;

    @PrePersist // Si le pones esto se ejecuta antes del save
    public void preGuardar(){
        this.createdAt = LocalDateTime.now();


    }

    @PostPersist
    public void postGuardar(){
        System.out.println("Se guarda la persona con ID: " + this.id);

    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", coche=" + coche.id +
                ", createdAt=" + createdAt +
                '}';
    }
}
