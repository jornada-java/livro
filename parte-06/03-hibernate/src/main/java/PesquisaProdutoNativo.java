import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PesquisaProdutoNativo {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jornada");
        EntityManager manager = factory.createEntityManager();

        Query query = manager.createNativeQuery("Select id, descricao, nome, valor from Produto");

        List<Object[]> linhas = query.getResultList();
        for (Object[] coluna : linhas) {
            Produto produto = new Produto();
            produto.setId(Integer.parseInt(coluna[0].toString()));
            produto.setDescricao(coluna[1].toString());
            produto.setNome(coluna[2].toString());
            produto.setValor(Integer.parseInt(coluna[3].toString()));
            System.out.println(produto);
        }
    }

}
