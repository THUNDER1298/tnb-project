package ma.projet.tax_tnb.dao;

import ma.projet.tax_tnb.beans.commun.Terrain;
import org.springframework.data.jpa.repository.JpaRepository;

;

public interface TerrainDao extends JpaRepository<Terrain, Long> {


    Terrain findByRef(String Ref);

    int deleteByRef(String Ref);


}
