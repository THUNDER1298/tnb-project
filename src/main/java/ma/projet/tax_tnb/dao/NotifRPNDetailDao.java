package ma.projet.tax_tnb.dao;

import ma.projet.tax_tnb.beans.NotifRPNDetail;
import ma.projet.tax_tnb.beans.Redevable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotifRPNDetailDao extends JpaRepository<NotifRPNDetail, Long> {

  NotifRPNDetail findByCode(String code);
  int deleteByCode(String code);
  Redevable findByRedevableCode(String code);

}
