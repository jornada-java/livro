import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsereProduto {

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setDescricao("Produto Descrição");
        produto.setNome("Produto 01");
        produto.setValor(1000);

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jornada");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin(); // Inicia uma transação com o Banco de dados

        manager.persist(produto); // Cria o registro no banco de dados
        System.out.println("Produto incluido!");

        manager.getTransaction().commit(); // Finaliza a transação no banco de dados

        manager.close();
        factory.close();

    }

}
