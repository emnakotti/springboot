package tn.esprit.kottiemna4arctic3.entities;


import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReservation ;
    private Date anneeuniversitaire;
    private Boolean estValide;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
}
