package ma.projet.tax_tnb.service.facade;

import ma.projet.tax_tnb.beans.commun.Redevable;
import ma.projet.tax_tnb.beans.commun.Terrain;
import ma.projet.tax_tnb.beans.notification.NotificationRetardPremierNiveau;

public interface NotificationRetardPremierNiveauService{

    int save(NotificationRetardPremierNiveau notification);

    NotificationRetardPremierNiveau findByCode(String code);

    NotificationRetardPremierNiveau findByAnnee(int annee);

    int deleteByCode(String code);

    Redevable findByRedevableCode(String code);

    Terrain findByTerrainRef(String ref);

}