import br.com.dio.persistance.FilePersistence;
import br.com.dio.persistance.IOFilePersistence;
import br.com.dio.persistance.NIO2FilePersistance;
import br.com.dio.persistance.NIOFilePersistence;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException{
        FilePersistence persistence = new NIO2FilePersistance("user.csv");
        System.out.println(persistence.write("Luana;luana@luana.com;28/09;1999;"));
        System.out.println("===============================");
        System.out.println(persistence.write("Marcos;marcos@marcos.com;01/01/1999;"));
        System.out.println("===============================");
        System.out.println(persistence.write("Henrique;henrique@henrique.com;03/05/2001;"));
        System.out.println("===============================");
        System.out.println(persistence.findAll());
        System.out.println("===============================");
        System.out.println(persistence.findBy("luana@"));
        System.out.println("===============================");
        System.out.println(persistence.findBy("Jorge"));
        System.out.println("===============================");
        System.out.println(persistence.remove("luana@"));
        System.out.println("===============================");
        System.out.println(persistence.remove("Jorge"));
        System.out.println("===============================");
        System.out.println(persistence.findAll());
        System.out.println("===============================");
        System.out.println(persistence.replace("marcos@", "Poli;poli@poli.com;10/10/2000"));
        System.out.println("===============================");
        System.out.println(persistence.findAll());

    }





//  Iplementing the NIO class
//    public static void main(String[] args) throws IOException {
//        FilePersistence persistence = new NIOFilePersistence("user.csv");
//        System.out.println(persistence.write("Bianca;bianca@bianca.com;22/11/1997"));
//        System.out.println("===================================");
//        System.out.println(persistence.write("Bernardo;bernardo@bernardo;28/11/1999"));
//        System.out.println("===================================");
//        System.out.println(persistence.write("Ricardo;ricardo@ricardo;12/01/2000"));
//        System.out.println("===================================");
//        System.out.println(persistence.findAll());
//        System.out.println("===================================");
//        System.out.println(persistence.remove("ricardo@"));
//        System.out.println("===================================");
//        System.out.println(persistence.findBy("bianca@"));
//        System.out.println("===================================");
//        System.out.println(persistence.findBy("ricardo@"));
//        System.out.println("===================================");
//        System.out.println(persistence.replace("bianca@", "Lucas;lucas@lucas.com;17/12/1988"));
//        System.out.println("===================================");
//        System.out.println(persistence.replace("joaquim@", "Lucas;lucas@lucas.com;17/12/1988"));
//        System.out.println("===================================");
//        System.out.println(persistence.findAll());
//
//    }




// Implementing the IO class
//    public static void main(String[] args) throws IOException {
//        FilePersistence persistence = new IOFilePersistence("user.csv");
//        System.out.println("================================");
//        System.out.println(persistence.write("Lucas;lucas@lucas.com;15/01/1990;"));
//        System.out.println("================================");
//        System.out.println(persistence.write("Maria;maria@maria.com;23/10/2000;"));
//        System.out.println("================================");
//        System.out.println(persistence.write("João;joao@joao.com;01/12/1995;"));
//        System.out.println("================================");
//        System.out.println(persistence.findAll());
//        System.out.println("================================");
//        System.out.println(persistence.remove("/12/19"));
//        System.out.println("================================");
//        System.out.println(persistence.remove("06/20"));
//        System.out.println("================================");
//        System.out.println(persistence.findBy("Lucas;"));
//        System.out.println("================================");
//        System.out.println(persistence.findBy(";joao@joao.com;"));
//        System.out.println("================================");
//        System.out.println(persistence.findBy(";23/10/2000;"));
//        System.out.println("================================");
//        //System.out.println(persistence.replace("1990", "Jose;jose@jose.com;19/10/1995"));
//        System.out.println("================================");
//        System.out.println(persistence.replace("maria@maria.com;", "Carlos;carlos@carlos.com;22/03/1991"));
//        System.out.println("================================");
//        System.out.println(persistence.findAll());
//
//
//
//    }
}
