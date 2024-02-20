package ma.projet.tax_tnb.beans;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
public class TauxTnb {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public int montantParMetreCarre;
    public int montantParMetreCarrePremierMois;
    public int montantParMetreCarreAutreMois;
    private LocalDateTime dateApplicationMin;
    private LocalDateTime dateApplicationMax;
    @ManyToOne
    private Categorie categorie;


}

