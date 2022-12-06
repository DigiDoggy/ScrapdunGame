package digidoggy.scrapdun.dataBase;

import digidoggy.scrapdun.combat.CombatMechanics;
import digidoggy.scrapdun.model.Player;

import java.sql.*;

public class Data extends Config{

    static {
        try {
            con = DriverManager.getConnection(dbURL,userName,password);
        }catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    static {
        try {
            statement = con.createStatement();
        }catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        try(Connection con = DriverManager.getConnection(dbURL,userName,password)){

           createGameTable(con);





        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void createGameTable(Connection con)throws SQLException{
        String SQL = "CREATE TABLE IF NOT EXISTS SCRAPDUN " +
                "(id INTEGER AUTO_INCREMENT NOT NULL, " +
                " name VARCHAR(60) NOT NULL, " +
                " win BOOLEAN NOT NULL, " +
                "lose BOOLEAN NOT NULL," +
                " PRIMARY KEY (id))";

        //git test

        Statement statement = con.createStatement();
        statement.executeUpdate(SQL);
    }

    public static void insert(Connection con) throws SQLException{

        String sql = "INSERT INTO SCRAPDUN(name, win, lose) VALUES (?, ?, ? )";
        PreparedStatement preparedStatement = con.prepareStatement(sql);

        String player = "INSERT INTO MOVIES (name, genre, year) VALUES ("+ Player.getCharacterName()+", 'Comedy', 2000)";

        preparedStatement.executeUpdate(player);


    }

}
