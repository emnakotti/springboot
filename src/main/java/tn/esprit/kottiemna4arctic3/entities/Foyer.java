package tn.esprit.kottiemna4arctic3.entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer ;
    private String nomFoyer;
    private  Long capaciteFoyer;
    @OneToOne(mappedBy = "idfoyer")
    private Universite iduniversite;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "idfoyer")
    private Set<Bloc> blocs;


}
