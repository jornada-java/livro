import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PesquisaProdutoHQL {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jornada");
        EntityManager manager = factory.createEntityManager();

        Query query = manager.createQuery("from Produto p");
        List<Produto> listProduto = query.getResultList();

        for (Produto produto : listProduto) {
            System.out.println(produto);
        }
    }

}
