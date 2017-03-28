package hibernatework;

/**
 * Created by sunkas4 on 3/22/2017.
 */
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibDbSessionCreate {
    public static SessionFactory factory;

    public static SessionFactory DbSession() {
//Create session for db connection and Service registry stnadard builder is required after hibernate 4.
        try {
            Configuration cfg = new Configuration().configure();
            StandardServiceRegistryBuilder registry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());

            factory = cfg.configure().buildSessionFactory(registry.build());
System.out.println("factory was opened correctly");





        } catch (Exception excep) {
            System.out.println(excep.fillInStackTrace());

        }
        return factory;
    }


}