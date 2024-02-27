package ma.projet.tax_tnb.beans.taxe;

import jakarta.persistence.*;
import ma.projet.tax_tnb.beans.commun.Redevable;
import ma.projet.tax_tnb.beans.commun.Terrain;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
public class TaxTnb {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private int annee;
    private LocalDateTime datePresentation;
    private int nombreMoisRetard;
    private BigDecimal montantBase;
    private BigDecimal montantRetardPremierMois;
    private BigDecimal montantRetardAutreMois;
    private BigDecimal montantTotal;
    @ManyToOne
    private TauxTnb tauxTnb;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public BigDecimal getMontantBase() {
        return montantBase;
    }

    public void setMontantBase(BigDecimal montantBase) {
        this.montantBase = montantBase;
    }

    public BigDecimal getMontantRetardPremierMois() {
        return montantRetardPremierMois;
    }

    public void setMontantRetardPremierMois(BigDecimal montantRetardPremierMois) {
        this.montantRetardPremierMois = montantRetardPremierMois;
    }

    public BigDecimal getMontantRetardAutreMois() {
        return montantRetardAutreMois;
    }

    public void setMontantRetardAutreMois(BigDecimal montantRetardAutreMois) {
        this.montantRetardAutreMois = montantRetardAutreMois;
    }

    public BigDecimal getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(BigDecimal montantTotal) {
        this.montantTotal = montantTotal;
    }

    public TauxTnb getTauxTnb() {
        return tauxTnb;
    }

    public void setTauxTnb(TauxTnb tauxTnb) {
        this.tauxTnb = tauxTnb;
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

    @ManyToOne
    private Redevable redevable;
    @ManyToOne
    private Terrain terrain;



}

