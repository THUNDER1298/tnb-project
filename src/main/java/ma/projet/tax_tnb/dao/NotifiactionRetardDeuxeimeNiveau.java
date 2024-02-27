package ma.projet.tax_tnb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NotifiactionRetardDeuxeimeNiveau extends JpaRepository<NotifiactionRetardDeuxeimeNiveau, Long> {

   NotifiactionRetardDeuxeimeNiveau findByCode(String Code);

    int deleteByCode(String Code);
}
