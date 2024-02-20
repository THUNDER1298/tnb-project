package ma.projet.tax_tnb.beans;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
public class TaxTnb {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Redevable redevable;
    @ManyToOne
    private Terrain terrain;



}

