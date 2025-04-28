package dao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
public class conexaoDao {
    public static EntityManagerFactory EMF = Persistence.createEntityManagerFactory( "contato");
    public static EntityManager getentityManager() {
        return EMF.createEntityManager();
    }
}
