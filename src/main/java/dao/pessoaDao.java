package dao;
import jakarta.persistence.EntityManager;
import model.pessoa;
import java.util.List;
public class pessoaDao {
        private EntityManager em;
        public pessoaDao(EntityManager em) {
            this.em = em;
        }

        public void salvar(pessoa Pessoa) {
            em.persist(Pessoa);
        }

        public void atualizar(pessoa Pessoa) {
            em.merge(Pessoa);
        }

        public void excluir(pessoa Pessoa){
            pessoa PessoaExcluir = em.find(pessoa.class, Pessoa.getId());
            em.remove(PessoaExcluir);
        }

        public void consultar(long id){
            pessoa consultarPessoa = em.find(pessoa.class, id);
            if (consultarPessoa == null) {
                System.out.println("ID não existe");
            } else { System.out.println(consultarPessoa.toString());
            }
        }

        public List<pessoa> listarTodosOsContatos() {
            String consulta = "SELECT c FROM pessoa c ORDER BY nome ASC";
            return em.createQuery(consulta).getResultList();
        }

        public List<pessoa> listarNome(String nome) {
            String consulta = "SELECT c FROM pessoa c WHERE nome = :nomes";

            return em.createQuery(consulta, pessoa.class)
                    .setParameter("nomes", nome)
                    .getResultList();
        }





}



