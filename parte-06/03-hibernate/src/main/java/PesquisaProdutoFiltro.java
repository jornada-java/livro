import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class PesquisaProdutoFiltro {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jornada");
        EntityManager manager = factory.createEntityManager();

        CriteriaBuilder cb = factory.getCriteriaBuilder();
        CriteriaQuery<Produto> criteria = cb.createQuery(Produto.class);
        Root<Produto> root = criteria.from(Produto.class);

        criteria.select(root);
        criteria.where(cb.gt(root.get("valor"), 999));

        List<Produto> listProduto = manager.createQuery(criteria).getResultList();

        for (Produto produto : listProduto) {
            System.out.println(produto);
        }
    }

}
