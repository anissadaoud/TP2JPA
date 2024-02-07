package monprojet.entity;

import jakarta.persistence.*;
@Entity
@DiscriminatorValue("A")

public class Administratif extends Employe {

    private String Diplome;


}
