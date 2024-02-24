package ma.projet.tax_tnb.dao;

import ma.projet.tax_tnb.beans.Terrain;
import org.springframework.data.jpa.repository.JpaRepository;

;

public interface TerrainDao extends JpaRepository<Terrain, Long> {


    Terrain findByRef(String Ref);

    int deleteByRef(String Ref);


}
