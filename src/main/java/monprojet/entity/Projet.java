package monprojet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Projet {
    @Id
    private int code;

    private String nom;

    private LocalDate debut;

    private LocalDate fin;

}
