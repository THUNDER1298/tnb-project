package ma.projet.tax_tnb.beans;

import jakarta.persistence.*;


@Entity
public class NotifiactionRetardPremierNiveau {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int annee;
    // private String TRIM;       ANSWLO PROF




    @ManyToOne
    private Redevable redevable;
    @ManyToOne
    private Terrain terrain;



}

