package ma.projet.tax_tnb.beans;

import jakarta.persistence.*;


@Entity
public class NotifiactionRetardPremierNiveauDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // private String TRIM;       ANSWLO PROF




    @ManyToOne
    private Redevable redevable;




}

