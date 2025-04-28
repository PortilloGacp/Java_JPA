package dao;
import jakarta.persistence.EntityManager;
import model.pessoa;
import model.tipoContato;

public class tipoContatoDao {
    private EntityManager em;
    public tipoContatoDao(EntityManager em) {
        this.em = em;
    }

    public void salvar(tipoContato tipoContato) {
        em.persist(tipoContato);
    }
}
