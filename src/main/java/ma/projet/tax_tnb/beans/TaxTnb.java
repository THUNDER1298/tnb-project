package ma.projet.tax_tnb.beans;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
public class TaxTnb {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int annee;
    private LocalDateTime datePresentation;
    private int nombreMoisRetard;
    private Long montantBase;
    private Long montantRetardPremierMois;
    private Long montantRetardAutreMois;
    private Long montantTotal;



    @ManyToOne
    private Redevable redevable;
    @ManyToOne
    private Terrain terrain;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public LocalDateTime getDatePresentation() {
        return datePresentation;
    }

    public void setDatePresentation(LocalDateTime datePresentation) {
        this.datePresentation = datePresentation;
    }

    public int getNombreMoisRetard() {
        return nombreMoisRetard;
    }

    public void setNombreMoisRetard(int nombreMoisRetard) {
        this.nombreMoisRetard = nombreMoisRetard;
    }

    public Long getMontantBase() {
        return montantBase;
    }

    public void setMontantBase(Long montantBase) {
        this.montantBase = montantBase;
    }

    public Long getMontantRetardPremierMois() {
        return montantRetardPremierMois;
    }

    public void setMontantRetardPremierMois(Long montantRetardPremierMois) {
        this.montantRetardPremierMois = montantRetardPremierMois;
    }

    public Long getMontantRetardAutreMois() {
        return montantRetardAutreMois;
    }

    public void setMontantRetardAutreMois(Long montantRetardAutreMois) {
        this.montantRetardAutreMois = montantRetardAutreMois;
    }

    public Long getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(Long montantTotal) {
        this.montantTotal = montantTotal;
    }

    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }
}

