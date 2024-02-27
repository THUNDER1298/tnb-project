package ma.projet.tax_tnb.beans;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Rue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libelle ;
    private String code;
    @ManyToOne
    private Quartie quartie;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Quartie getQuartie() {
        return quartie;
    }

    public void setQuartie(Quartie quartie) {
        this.quartie = quartie;
    }
}

