package game;

import java.sql.*;

/*
TODO
 1. Create dataBase ( and use that DataBase)
 2. Create Table ( Armor , Weapon ) where we have columns
  armor - ( id, armor name, armor class(light, heavy), defence)
  weapon - (id, weapon name, weapon hit)
 3. Create table for result of fight.
 */
public class Data {
    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/javaee18";
        String username = "root";
        String password = "1234";
        try (
                Connection con = DriverManager.getConnection(dbURL, username, password)) {
           // dropTable(con);
            createTable(con);
           // insertData(con);
            readData(con);





        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }




    public static void dropTable(Connection con) throws SQLException{
        Statement dropStatement = con.createStatement();
        dropStatement.execute("DROP TABLE IF EXISTS movies"); }

    public static void createTable(Connection con) throws SQLException{
        Statement createStatement = con.createStatement();

        String sql = "CREATE TABLE IF NOT EXISTS movies ("
                + "	id integer AUTO_INCREMENT,"
                + "	title varchar(255) NOT NULL,"
                + "	genre varchar(255) NOT NULL, "
                + "yearOfRelease integer NOT NULL,"
                + "PRIMARY KEY(id))";

        createStatement.execute(sql);




    }
    public static void readData(Connection con) throws SQLException {

        String sql = "SELECT*FROM movies";
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        int row = 1;

        while (resultSet.next()) {


            String title = resultSet.getString("title");
            String genre = resultSet.getString("genre");
            String yearOfRelease = resultSet.getString("yearOfRelease");


            String output = "movie #%d:  %s - %s - %s #####$$$$$$$$$$$$$$$$$$$$$$$$$$$$$";
            System.out.printf((output) + "%n", row++, title, genre, yearOfRelease);
            // comment for git

        }

    }

    public static void insertData(Connection con) throws SQLException {
        Statement statement = con.createStatement();

        statement.executeUpdate("INSERT INTO movies " + " VALUES (id,'St wars','fantasy',1990)");
        statement.executeUpdate("INSERT INTO movies " + " VALUES (id,'St wars2','fantasy',1990)");
        statement.executeUpdate("INSERT INTO movies " + " VALUES (id,'St wars3','fantasy',1990)");


    }

}
