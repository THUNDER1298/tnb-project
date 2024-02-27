package ma.projet.tax_tnb.beans.notification;

import jakarta.persistence.*;
import ma.projet.tax_tnb.beans.commun.Redevable;

import java.math.BigDecimal;
import java.util.List;


@Entity
public class NotifiactionRetardTroisiemeNiveauDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private BigDecimal montantBase;
    private int annee;
    @OneToMany
    private List<Redevable> redevable;
    @ManyToOne
    private NotifiactionRetardDeuxeimeNiveau notifiactionRetardDeuxeimeNiveauNiveau;

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

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public BigDecimal getMontantBase() {
        return montantBase;
    }

    public void setMontantBase(BigDecimal montantBase) {
        this.montantBase = montantBase;
    }


    public List<Redevable> getRedevable() {
        return redevable;
    }

    public void setRedevable(List<Redevable> redevable) {
        this.redevable = redevable;
    }

    public NotifiactionRetardDeuxeimeNiveau getNotifiactionRetardDeuxeimeNiveauNiveau() {
        return notifiactionRetardDeuxeimeNiveauNiveau;
    }

    public void setNotifiactionRetardDeuxeimeNiveauNiveau(NotifiactionRetardDeuxeimeNiveau notifiactionRetardDeuxeimeNiveauNiveau) {
        this.notifiactionRetardDeuxeimeNiveauNiveau = notifiactionRetardDeuxeimeNiveauNiveau;
    }
}

