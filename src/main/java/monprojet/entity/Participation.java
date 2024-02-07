package monprojet.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;


@Entity


public class Participation {
    @Id
    private int idPart;

    private String role;
    private float pourcentage;

    @ManyToMany
    private List<Projet> affectation;

    @ManyToMany
    private List<Employe> contributeur;


}
