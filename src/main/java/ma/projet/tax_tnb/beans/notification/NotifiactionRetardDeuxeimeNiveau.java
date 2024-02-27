package ma.projet.tax_tnb.beans.notification;

import jakarta.persistence.*;
import ma.projet.tax_tnb.beans.commun.Redevable;
import ma.projet.tax_tnb.beans.commun.Terrain;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
public class NotifiactionRetardDeuxeimeNiveau {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cod;
    private String description;
    private BigDecimal montantBase;
    private LocalDateTime dateNotification;
    @ManyToOne
    private Redevable redevable;
    @ManyToOne
    private Terrain terrain;
    private int annee;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateNotification() {
        return dateNotification;
    }

    public void setDateNotification(LocalDateTime dateNotification) {
        this.dateNotification = dateNotification;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getMontantBase() {
        return montantBase;
    }

    public void setMontantBase(BigDecimal montantBase) {
        this.montantBase = montantBase;
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

