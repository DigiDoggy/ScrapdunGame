package digidoggy.scrapdun.dataBase;

import java.sql.Connection;
import java.sql.Statement;

public class Config {

    protected static String dbURL = "jdbc:mysql://localhost:3306/javaee18";
    protected static String userName = "root";
    protected static String password = "12345678Java!";
    protected static Connection con;
    protected static Statement statement;


}
