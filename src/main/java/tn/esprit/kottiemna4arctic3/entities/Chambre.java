package tn.esprit.kottiemna4arctic3.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idChambre;
    private String nomChambre;
    @Enumerated(EnumType.STRING)
    private typechambre typeC;
    @ManyToOne(cascade = CascadeType.ALL)
    private Bloc idbloc;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Chambre> chambres ;
}
