package model;
import dao.conexaoDao;
import dao.pessoaDao;
import dao.tipoContatoDao;
import jakarta.persistence.EntityManager;
import java.time.LocalDate;
import java.util.List;

public class principal {
    public static void main(String[] args) {
        EntityManager em = conexaoDao.getentityManager();
        cadastrar(em);
        atualizar(em);
        excluir(em);
        consultarPessoaPorId(em);
        listarTodosOsContatos(em);
        listarNome(em);
    }

    public static void cadastrar(EntityManager em){
        /*Criar no banco de dados um relacionamento de muitos para muito
        * exemplo: ID 3 = amigo
        *           ID 2 = familia*/

        tipoContato Tipocontato = new tipoContato();
        Tipocontato.setTipo("amigo");
        tipoContatoDao tipoContatoDao = new tipoContatoDao(em);
        em.getTransaction().begin();
        tipoContatoDao.salvar(Tipocontato);

        /*cadastrando uma pessoa*/
        pessoa Pessoa = new  pessoa();
        Pessoa.setNome("carlos");
        Pessoa.setEmail("carlos@gmail.com");
        Pessoa.setDataNascimento(LocalDate.of(2001, 3,19));

        /*SISTEMA DAO*/
        pessoaDao pessoaDao = new pessoaDao(em);
        pessoaDao.salvar(Pessoa);
        em.getTransaction().commit();
    }

    public static void atualizar(EntityManager em){
        /*ATUALIZA O DADO*/
        pessoa Pessoa = new  pessoa();
        Pessoa.setId(0L);
        Pessoa.setNome("");
        Pessoa.setEmail("");
        Pessoa.setDataNascimento(LocalDate.of(0,0,0));

        /*SISTEMA DAO*/
        pessoaDao pessoaDao = new pessoaDao(em);
        em.getTransaction().begin();
        pessoaDao.atualizar(Pessoa);
        em.getTransaction().commit();
    }

    public static void excluir(EntityManager em){
        /*EXCLUI O DADO*/
        pessoa Pessoa = new  pessoa();
        Pessoa.setId(0L);

        /*SISTEMA DAO*/
        pessoaDao pessoaDao = new pessoaDao(em);
        em.getTransaction().begin();
        pessoaDao.excluir(Pessoa);
        em.getTransaction().commit();
    }

    public static void consultarPessoaPorId(EntityManager em){
        /*CONSULTA A PESSOA POR ID*/
        /*SISTEMA DAO*/
        pessoaDao pessoaDao = new pessoaDao(em);
        em.getTransaction().begin();
        pessoaDao.consultar(0l);
        em.getTransaction().commit();
    }

    public static void listarTodosOsContatos(EntityManager em){
        /*LISTA TODOS OS DADOS */
        pessoaDao pessoaDao = new pessoaDao(em);
        List<pessoa> Pessoa = pessoaDao.listarTodosOsContatos();
        for (pessoa Pessoas: Pessoa)
            System.out.println(Pessoas.toString());
    }

    public static void listarNome(EntityManager em){
        /*LISTA TODOS OS DADOS POR NOME*/
        pessoaDao pessoaDao = new pessoaDao(em);
        List<pessoa> Pessoa = pessoaDao.listarNome("megan");
        for (pessoa Pessoas: Pessoa)
            System.out.println(Pessoas.toString());
    }
}
