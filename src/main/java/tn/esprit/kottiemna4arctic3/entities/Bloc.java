package tn.esprit.kottiemna4arctic3.entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private String nomBloc;
    private Long capaciteBbloc;
@ManyToOne(cascade = CascadeType.ALL)
    private Foyer idfoyer;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "idbloc")
    private Set<Chambre> chambres;

}
