package model;
import jakarta.persistence.*;

@Entity
@Table(name = "tipoDeContato")
public class tipoContato {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "tipoContato")
    @SequenceGenerator(
            name = "tipoContato",
            sequenceName = "tipoContato",
            allocationSize = 1)
    public Long id;
    public String tipo;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
