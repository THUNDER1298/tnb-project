package ma.projet.tax_tnb.beans;

import jakarta.persistence.*;


@Entity
public class NotifRPNDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    // private String TRIM;       ANSWLO PROF




    @ManyToOne
    private Redevable redevable;




}

