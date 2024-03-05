package ma.projet.tax_tnb.service.implimentation;

import ma.projet.tax_tnb.beans.commun.Redevable;
import ma.projet.tax_tnb.beans.commun.Terrain;
import ma.projet.tax_tnb.beans.notification.NotificationRetardPremierNiveau;
import ma.projet.tax_tnb.dao.notificationDao.NotificationRetardPremierNiveauDao;
import ma.projet.tax_tnb.service.facade.NotificationRetardPremierNiveauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NotificationRetardPremierNiveauServiceImpl implements NotificationRetardPremierNiveauService {
    @Autowired
    private NotificationRetardPremierNiveauDao notificationDao;



   @Override
   public int save(NotificationRetardPremierNiveau notification){
       if(findByCode(notification.getCode()) != null){
           return -2;
       } else if (findByAnnee(notification.getAnnee()) != null) {
           return -1;
       } else {
           notificationDao.save(notification);
           return 1;
       }
   }

    @Override
    public NotificationRetardPremierNiveau findByCode(String code) {
        return notificationDao.findByCode(code);
    }

    @Override
    public NotificationRetardPremierNiveau findByAnnee(int annee) {
        return notificationDao.findByAnnee(annee);
    }

    @Override
    public int deleteByCode(String code) {
        return notificationDao.deleteByCode(code);
    }

    @Override
    public Redevable findByRedevableCode(String code) {
        return notificationDao.findByRedevableCode(code);
    }

    @Override
    public Terrain findByTerrainRef(String ref) {
        return notificationDao.findByTerrainRef(ref);
    }
}
