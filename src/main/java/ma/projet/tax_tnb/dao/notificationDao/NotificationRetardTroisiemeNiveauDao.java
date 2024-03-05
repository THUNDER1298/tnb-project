package ma.projet.tax_tnb.dao.notificationDao;

import ma.projet.tax_tnb.beans.commun.Redevable;
import ma.projet.tax_tnb.beans.notification.NotificationRetardTroisiemeNiveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRetardTroisiemeNiveauDao extends JpaRepository<NotificationRetardTroisiemeNiveau, Long> {

NotificationRetardTroisiemeNiveauDao findByCode(String code);
  int deleteByCode(String code);
  Redevable findByRedevableCode(String code);

}
