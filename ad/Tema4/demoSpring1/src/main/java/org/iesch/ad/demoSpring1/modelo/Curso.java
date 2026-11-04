package org.iesch.ad.demoSpring1.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;


@Entity
@Data
public class Curso {

    @Id
    @GeneratedValue
    Long id;
    String nombre;

    @ToString.Exclude
    @ManyToMany(mappedBy = "cursos")
    Set<Student> students = new HashSet<>();




}
