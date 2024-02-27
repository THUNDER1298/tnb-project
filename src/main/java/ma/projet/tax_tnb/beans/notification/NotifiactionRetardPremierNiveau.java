package ma.projet.tax_tnb.beans.notification;

import jakarta.persistence.*;
import ma.projet.tax_tnb.beans.commun.Redevable;
import ma.projet.tax_tnb.beans.commun.Terrain;

import java.time.LocalDateTime;


@Entity
public class NotifiactionRetardPremierNiveau {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private LocalDateTime dateNotification;
    private int annee;
    private String description;
    @ManyToOne
    private Redevable redevable;
    @ManyToOne
    private Terrain terrain;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }
}

