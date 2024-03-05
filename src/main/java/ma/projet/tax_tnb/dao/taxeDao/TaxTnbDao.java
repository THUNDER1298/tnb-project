package ma.projet.tax_tnb.dao;

import ma.projet.tax_tnb.beans.taxe.TaxTnb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxTnbDao extends JpaRepository<TaxTnb, Long> {

  TaxTnb findByCode(String code);
  int deleteByCode(String code);

}
