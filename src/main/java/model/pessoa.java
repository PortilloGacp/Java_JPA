package model;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tabela_pessoa")
public class pessoa {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "tabela_id")
    @SequenceGenerator(
            name = "tabela_id",
            sequenceName = "tabela_id",
            allocationSize = 1)
    private Long id;
    private String nome;
    private String email;
    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;
    @ManyToOne
    private  tipoContato TipoContato;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public tipoContato getTipoContato() {
        return TipoContato;
    }

    public void setTipoContato(tipoContato tipoContato) {
        this.TipoContato = tipoContato;
    }

    @Override
    public String toString() {
        return "pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", TipoContato=" + TipoContato +
                '}';
    }
}



