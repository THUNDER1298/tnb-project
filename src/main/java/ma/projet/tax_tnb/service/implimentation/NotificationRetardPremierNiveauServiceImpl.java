package ma.projet.tax_tnb.service.implimentation;

import ma.projet.tax_tnb.beans.commun.Redevable;
import ma.projet.tax_tnb.beans.commun.Terrain;
import ma.projet.tax_tnb.beans.notification.NotificationRetardPremierNiveau;
import ma.projet.tax_tnb.dao.notificationDao.NotificationRetardPremierNiveauDao;
import ma.projet.tax_tnb.service.facade.NotificationRetardPremierNiveauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class NotificationRetardPremierNiveauServiceImpl implements NotificationRetardPremierNiveauService {
    @Autowired
    private NotificationRetardPremierNiveauDao notificationDao;


}
