package hibernatework;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;

/**
 * Created by sunkas4 on 3/27/2017.
 */
import org.hibernate.Session;
import hibernatework.DbPojo;

import javax.persistence.Query;

public class Queries {
    private static Session session;

    public Queries(Session session) {
        this.session = session;
    }


    static Transaction tx = null;

    //METHOD to Read all ROWS Of Persistant table
    public static void read_rows() {

        try {
            tx = session.beginTransaction();


            //Research on the createQuery how select query is executed ?
            Query rowsdata = session.createQuery("select count(*) from hibernatework.DbPojo");
            System.out.println(rowsdata.getFirstResult());
           List<String>rows = rowsdata.getResultList();
            for (Iterator iterator =
                         rows.iterator(); iterator.hasNext(); ) {
                DbPojo pojo = (DbPojo) iterator.next();
                System.out.print("First Name: " + pojo.getName());
                System.out.print("  Password: " + pojo.getPassword());
                System.out.println("  Phone: " + pojo.getPhone());
                System.out.println(" Created_time: " + pojo.getDatetime());
                System.out.println("  ID: " + pojo.getIdTest_db());
            }
            tx.commit();
        }
    catch (Exception exce) {
        System.out.println("Error opeing session/beginning Transaction" + "/n" + exce.fillInStackTrace());
    }

  finally {
        session.close();
    }
    }

    //METHOD to Inser a ROWS to Persistant table


}
