import br.com.dio.persistance.FilePersistence;
import br.com.dio.persistance.IOFilePersistence;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FilePersistence persistence = new IOFilePersistence("user.csv");
        System.out.println("================================");
        System.out.println(persistence.write("Lucas;lucas@lucas.com;15/01/1990;"));
        System.out.println("================================");
        System.out.println(persistence.write("Maria;maria@maria.com;23/10/2000;"));
        System.out.println("================================");
        System.out.println(persistence.write("João;joao@joao.com;01/12/1995;"));
        System.out.println("================================");
        System.out.println(persistence.findAll());
        System.out.println("================================");
        System.out.println(persistence.remove("/12/19"));
        System.out.println("================================");
        System.out.println(persistence.remove("06/20"));
        System.out.println("================================");
        System.out.println(persistence.findBy("Lucas;"));
        System.out.println("================================");
        System.out.println(persistence.findBy(";joao@joao.com;"));
        System.out.println("================================");
        System.out.println(persistence.findBy(";23/10/2000;"));
        System.out.println("================================");
        //System.out.println(persistence.replace("1990", "Jose;jose@jose.com;19/10/1995"));
        System.out.println("================================");
        System.out.println(persistence.replace("maria@maria.com;", "Carlos;carlos@carlos.com;22/03/1991"));
        System.out.println("================================");
        System.out.println(persistence.findAll());



    }
}
