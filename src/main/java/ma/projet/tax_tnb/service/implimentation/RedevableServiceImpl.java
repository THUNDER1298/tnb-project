package ma.projet.tax_tnb.service;

import ma.projet.tax_tnb.bean.Redevable;
import ma.projet.tax_tnb.dao.RedevableDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class RedevableServiceImpl implements RedevableService {

    @Autowired
    private RedevableDao redevableDao;

    public List<Redevable> findAll(){
        return redevableDao.findAll();
    }

    public Redevable findByCin(String cin){
        return redevableDao.findByCin(cin);
    }

    @Transactional
    public int deleteByCin(String cin){
        return deleteByCin(cin);
    }

    public int save(Redevable redevable){
        if(findByCin(redevable.getCin()) != null){
            return -1;
        }else{
            redevableDao.save(redevable);
            return 1;
        }
    }
}