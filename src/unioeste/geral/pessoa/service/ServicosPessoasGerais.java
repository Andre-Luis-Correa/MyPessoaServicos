package unioeste.geral.pessoa.service;

import unioeste.geral.pessoa.bo.ddd.DDD;
import unioeste.geral.pessoa.bo.ddi.DDI;
import unioeste.geral.pessoa.bo.sexo.Sexo;
import unioeste.geral.pessoa.dao.DDDDao;
import unioeste.geral.pessoa.dao.DDIDao;
import unioeste.geral.pessoa.dao.SexoDAO;

import java.util.List;

public class ServicosPessoasGerais {

    public ServicosPessoasGerais() {

    }

    public static List<DDD> obterTodosDDD() throws Exception {
        return DDDDao.selecionarTodosDDD();
    }

    public static List<DDI> obterTodosDDI() throws Exception {
        return DDIDao.selecionarTodosDDI();
    }

    public static List<Sexo> obterTodosSexo() throws Exception {
        return SexoDAO.selecionarTodosSexo();
    }

    public static void main(String[] args) {
        try {
            System.out.println("Obtendo todos os DDDs...");
            List<DDD> ddds = obterTodosDDD();
            for (DDD ddd : ddds) {
                System.out.println("DDD: " + ddd);
            }

            System.out.println("\nObtendo todos os DDIs...");
            List<DDI> ddis = obterTodosDDI();
            for (DDI ddi : ddis) {
                System.out.println("DDI: " + ddi);
            }

            System.out.println("\nObtendo todos os Sexos...");
            List<Sexo> sexos = obterTodosSexo();
            for (Sexo sexo : sexos) {
                System.out.println("Sexo: " + sexo);
            }

        } catch (Exception e) {
            System.err.println("Erro ao obter dados: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
