package ma.projet.tax_tnb.dao;


import ma.projet.tax_tnb.beans.Quartie;
import ma.projet.tax_tnb.beans.Rue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RueDao extends JpaRepository<Rue, Long> {

    Quartie findByCode(String Code);

    int deleteByCode(String Code);

}
