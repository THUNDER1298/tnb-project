package ma.projet.tax_tnb.dao.notificationDao;

import ma.projet.tax_tnb.beans.notification.NotificationRetardDeuxiemeNiveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NotificationRetardDeuxiemeNiveauDao extends JpaRepository<NotificationRetardDeuxiemeNiveau, Long> {

   NotificationRetardDeuxiemeNiveau findByCode(String Code);

    int deleteByCode(String Code);
}
