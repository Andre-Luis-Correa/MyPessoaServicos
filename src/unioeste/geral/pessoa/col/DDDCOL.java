package unioeste.geral.pessoa.col;

import unioeste.geral.pessoa.bo.ddd.DDD;
import unioeste.geral.pessoa.dao.DDDDao;

public class DDDCOL {

    public static boolean dddValido(DDD ddd) {
        return ddd != null &&
                ddd.getNumeroDDD() != null;
    }

    public static boolean dddExiste(DDD ddd) throws Exception {
        return ddd != null && ddd.getNumeroDDD() != null && DDDDao.selectDDDPorNumero(ddd.getNumeroDDD()) != null;
    }
}
