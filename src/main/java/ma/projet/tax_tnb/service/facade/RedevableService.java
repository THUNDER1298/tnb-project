package ma.projet.tax_tnb.service.facade;

import ma.projet.tax_tnb.beans.commun.Redevable;

import java.util.*;

public interface RedevableService{


    Redevable findByCin(String cin);
    int deleteByCin(String cin);
    public List<Redevable> findAll();

    int save(Redevable redevable);
}