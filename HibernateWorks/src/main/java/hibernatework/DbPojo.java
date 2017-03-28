package hibernatework;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Created by sunkas4 on 3/21/2017.
 */


@Entity
@Table(name= "Test_db")
public class DbPojo {
    public DbPojo() {
    }
@Id
    public static  int idTest_db;
    public static String name;
    public static String password;
    public static int phone;
    public static Timestamp datetime;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        DbPojo.name = name;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        DbPojo.password = password;
    }

    public static int getPhone() {
        return phone;
    }

    public static void setPhone(int phone) {
        DbPojo.phone = phone;
    }

    public static Timestamp getDatetime() {
        return datetime;
    }

    public static void setDatetime(Timestamp datetime) {
        DbPojo.datetime = datetime;
    }

    public static int getIdTest_db() {
        return idTest_db;
    }

    public static void setIdTest_db(int idTest_db) {
        DbPojo.idTest_db = idTest_db;
    }




}
