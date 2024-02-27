package ma.projet.tax_tnb.dao;

import ma.projet.tax_tnb.beans.commun.Redevable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedevableDao extends JpaRepository<Redevable , Long> {

  Redevable findByCin(String Cin);
  int deleteByCin(String cin);

}
