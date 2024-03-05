package ma.projet.tax_tnb.dao;

import ma.projet.tax_tnb.beans.taxe.TauxTnb;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TauxTnbDao extends JpaRepository<TauxTnb, Long> {


    TauxTnb findByCode(String Code);

    int deleteByCode(String Code);
}
