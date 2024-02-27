package ma.projet.tax_tnb.beans.taxe;

import jakarta.persistence.*;
import ma.projet.tax_tnb.beans.commun.Categorie;

import java.time.LocalDateTime;


@Entity
public class TauxTnb {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private int montantParMetreCarre;
    private int montantParMetreCarrePremierMois;
    private int montantParMetreCarreAutreMois;
    private LocalDateTime dateApplicationMin;
    private LocalDateTime dateApplicationMax;

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

    public int getMontantParMetreCarre() {
        return montantParMetreCarre;
    }

    public void setMontantParMetreCarre(int montantParMetreCarre) {
        this.montantParMetreCarre = montantParMetreCarre;
    }

    public int getMontantParMetreCarrePremierMois() {
        return montantParMetreCarrePremierMois;
    }

    public void setMontantParMetreCarrePremierMois(int montantParMetreCarrePremierMois) {
        this.montantParMetreCarrePremierMois = montantParMetreCarrePremierMois;
    }

    public int getMontantParMetreCarreAutreMois() {
        return montantParMetreCarreAutreMois;
    }

    public void setMontantParMetreCarreAutreMois(int montantParMetreCarreAutreMois) {
        this.montantParMetreCarreAutreMois = montantParMetreCarreAutreMois;
    }

    public LocalDateTime getDateApplicationMin() {
        return dateApplicationMin;
    }

    public void setDateApplicationMin(LocalDateTime dateApplicationMin) {
        this.dateApplicationMin = dateApplicationMin;
    }

    public LocalDateTime getDateApplicationMax() {
        return dateApplicationMax;
    }

    public void setDateApplicationMax(LocalDateTime dateApplicationMax) {
        this.dateApplicationMax = dateApplicationMax;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    @ManyToOne
    private Categorie categorie;


}

