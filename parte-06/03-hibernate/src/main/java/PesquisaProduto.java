import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;

public class PesquisaProduto {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jornada");
        EntityManager manager = factory.createEntityManager();

        CriteriaQuery<Produto> criteria = factory.getCriteriaBuilder().createQuery(Produto.class);
        criteria.select(criteria.from(Produto.class));

        List<Produto> listProduto = manager.createQuery(criteria).getResultList();

        for (Produto produto : listProduto) {
            System.out.println(produto);
        }
    }

}
