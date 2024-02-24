package ma.projet.tax_tnb.dao;

import ma.projet.tax_tnb.beans.NotifiactionRetardPremierNiveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface notificationRetardPremierNiveauDao extends JpaRepository<NotifiactionRetardPremierNiveau, Long> {

    NotifiactionRetardPremierNiveau findByCode(String Code);

    int deleteByCode(String Code);
}
