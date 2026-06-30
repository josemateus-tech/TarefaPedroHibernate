package modelo;

import java.util.Calendar;
import javax.persistence.*;

@Entity
@Table(name="Obra")
public class ObraDeArte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String titulo;

    @Column(name="nome_autor")
    private String autor;

    private String tecnica;
    private String tipo;
    private String procedencia;
    private String dimensoes;

    @Temporal(TemporalType.DATE)
    @Column(name="data_obra")
    private Calendar dataObra;


    public ObraDeArte() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }


    public String getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }


    public Calendar getDataObra() {
        return dataObra;
    }

    public void setDataObra(Calendar dataObra) {
        this.dataObra = dataObra;
    }

}
