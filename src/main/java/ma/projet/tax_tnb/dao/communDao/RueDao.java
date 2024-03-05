package ma.projet.tax_tnb.dao.communDao;


import ma.projet.tax_tnb.beans.commun.Quartie;
import ma.projet.tax_tnb.beans.commun.Rue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RueDao extends JpaRepository<Rue, Long> {

    Quartie findByCode(String Code);

    int deleteByCode(String Code);

}
