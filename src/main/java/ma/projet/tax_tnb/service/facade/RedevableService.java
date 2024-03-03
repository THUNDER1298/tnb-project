package ma.projet.tax_tnb.service;

import ma.projet.tax_tnb.bean.Redevable;
import ma.projet.tax_tnb.dao.RedevableDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

public interface RedevableService{

    Redevable findByCin(String cin);
    int deleteByCin(String cin);

    public List<Redevable> findAll();

}