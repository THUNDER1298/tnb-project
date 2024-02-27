package ma.projet.tax_tnb.dao;

import ma.projet.tax_tnb.beans.commun.Redevable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotifiactionRetardTroisiemeNiveauDetail extends JpaRepository<NotifiactionRetardTroisiemeNiveauDetail, Long> {

NotifiactionRetardTroisiemeNiveauDetail findByCode(String code);
  int deleteByCode(String code);
  Redevable findByRedevableCode(String code);

}
