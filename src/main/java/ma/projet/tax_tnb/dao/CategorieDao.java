package ma.projet.tax_tnb.dao;

import ma.projet.tax_tnb.beans.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface CategorieDao extends JpaRepository<Categorie , Long> {

  Categorie findByCode(String code);
  int deleteByCode(String code);

}
