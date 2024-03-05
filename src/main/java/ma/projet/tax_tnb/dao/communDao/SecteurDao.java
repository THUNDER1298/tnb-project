package ma.projet.tax_tnb.dao;

import ma.projet.tax_tnb.beans.commun.Secteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecteurDao extends JpaRepository<Secteur, Long> {

  Secteur findByCode(String code);
  int deleteByCode(String code);

}
