package ma.projet.tax_tnb.dao.notificationDao;

import ma.projet.tax_tnb.beans.commun.Redevable;
import ma.projet.tax_tnb.beans.commun.Terrain;
import ma.projet.tax_tnb.beans.notification.NotificationRetardPremierNiveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRetardPremierNiveauDao extends JpaRepository<NotificationRetardPremierNiveau, Long> {

    NotificationRetardPremierNiveau findByCode(String code);

    NotificationRetardPremierNiveau findByAnnee(int annee);

    int deleteByCode(String code);

    Redevable findByRedevableCode(String code);

    Terrain findByTerrainRef(String ref);

}
