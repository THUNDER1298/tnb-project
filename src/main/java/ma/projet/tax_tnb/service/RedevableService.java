package ma.projet.tax_tnb.service;

import ma.projet.tax_tnb.bean.Redevable;


@Service
public class RedevableService {

    @Autowired
    private RedevableDao redevableDao;

    public List<Redevable> findAll(){
        return redevableDao.findAll();
    }

    public Redevable findByCin(String cin){
        return redevableDao.findByCin(cin);
    }

    public int deleteByCin(String cin){
        return deleteByCin(cin);
    }

}