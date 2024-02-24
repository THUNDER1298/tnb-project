package ma.projet.tax_tnb.dao;

import ma.projet.tax_tnb.beans.Quartie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuartieDao extends JpaRepository<Quartie, Long> {

    Quartie findByCode(String Code);

    int deleteByCode(String Code);


}
