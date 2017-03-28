package hibernatework;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by sunkas4 on 3/27/2017.
 */
public class MainHibExec {
private static Session session;
    //Test Connection
    public static void main(String[] args) throws Exception{
        try {
            SessionFactory factory = HibDbSessionCreate.DbSession();
             session = factory.openSession();
            System.out.println("Session Opened Successfully");
        } catch (Exception exce) {
            System.out.println("failed at opening session");
            System.out.println(exce);
            //  System.out.println(exce.fillInStackTrace());
            exce.printStackTrace();


        }

        //Begin transactions from the opened sessions
        Queries query = new Queries(session);
        query.read_rows();

    }
}
