package teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.*;

import modelo.ObraDeArte;


public class Teste {


    public static Calendar converterData(String data) throws Exception {

        Date d = new SimpleDateFormat("dd/MM/yyyy")
                .parse(data);

        Calendar c = Calendar.getInstance();

        c.setTime(d);

        return c;
    }



    public static void main(String[] args) throws Exception {


        EntityManagerFactory fabrica =
        Persistence.createEntityManagerFactory("obras");


        EntityManager em =
        fabrica.createEntityManager();



        ObraDeArte obra = new ObraDeArte();


        obra.setTitulo(
        "Caminho de São Francisco");


        obra.setAutor(
        "Adir Sodré");


        obra.setTipo(
        "Quadro");


        obra.setTecnica(
        "Óleo sobre tela");


        obra.setProcedencia(
        "Museu da Caixa D'Água");


        obra.setDimensoes(
        "154cm x 154cm");


        obra.setDataObra(
        converterData("25/11/1988"));



        em.getTransaction().begin();


        em.persist(obra);


        em.getTransaction().commit();



        em.close();

        fabrica.close();



        System.out.println(
        "Obra cadastrada com sucesso!");
    }

}
