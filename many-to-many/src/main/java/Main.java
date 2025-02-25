import Config.FactoryForConfigration;
import org.hibernate.Session;


public class Main {

    public static void main(String[] args) {

        Session session = FactoryForConfigration.getInstance().getSessionFactory();


        session.close();



    }

}