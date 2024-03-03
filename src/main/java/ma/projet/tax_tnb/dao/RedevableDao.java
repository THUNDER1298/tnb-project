package ma.projet.tax_tnb.dao;

import ma.projet.tax_tnb.beans.commun.Redevable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface RedevableDao extends JpaRepository<Redevable , Long> {

  Redevable findByCin(String cin);
  int deleteByCin(String cin);

  public List<Redevable> findAll();

}
