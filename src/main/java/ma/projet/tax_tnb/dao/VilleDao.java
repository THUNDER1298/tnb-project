package ma.projet.tax_tnb.dao;

import ma.projet.tax_tnb.beans.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

;

public interface VilleDao extends JpaRepository<Ville, Long> {

    Ville findByRef(String Ref);

    int deleteByRef(String Ref);


}
