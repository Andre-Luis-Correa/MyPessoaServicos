package unioeste.geral.pessoa.col;

import unioeste.geral.pessoa.bo.ddi.DDI;
import unioeste.geral.pessoa.dao.DDIDao;

public class DDICOL {

    public static boolean ddiValido(DDI ddi) {
        return ddi != null &&
                ddi.getNumeroDDI() != null;
    }

    public static boolean ddiExiste(DDI ddi) throws Exception {
        return ddi != null && ddi.getNumeroDDI() != null && DDIDao.selectDDIPorNumero(ddi.getNumeroDDI()) != null;

    }
}
