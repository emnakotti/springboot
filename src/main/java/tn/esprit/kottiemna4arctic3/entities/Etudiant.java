package tn.esprit.kottiemna4arctic3.entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant ;
    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String Ecole;
    private Date dateNaissance ;
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "etudiants")
    private Set<Reservation> reservations;
}
