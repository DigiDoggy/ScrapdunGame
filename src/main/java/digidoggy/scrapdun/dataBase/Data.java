//package digidoggy.scrapdun.dataBase;
//
//import digidoggy.scrapdun.Main;
//import digidoggy.scrapdun.color.Color;
//import digidoggy.scrapdun.combat.CombatMechanics;
//import digidoggy.scrapdun.model.User;
//
//import java.sql.*;
//
//public class Data extends Config {
//
//
//    public static void drop() {
//
//        try (Connection connection = DriverManager.getConnection(dbURL, userName, password)) {
//            Statement dropStatement = connection.createStatement();
//            dropStatement.execute("DROP TABLE IF EXISTS scrapdun");
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//
//    public static void createGameTable(){
//
//        try (Connection con = DriverManager.getConnection(dbURL, userName, password)) {
//
//            String SQL = "CREATE TABLE IF NOT EXISTS SCRAPDUN " +
//                    "(id INTEGER AUTO_INCREMENT NOT NULL, " +
//                    "name VARCHAR(60) NOT NULL, " +
//                    "weaponName VARCHAR(100) NOT NULL," +
//                    "win boolean not null , " +
//                    "lose boolean not null ," +
//                    " PRIMARY KEY (id))";
//            Statement statement = con.createStatement();
//            statement.executeUpdate(SQL);
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public static void insert(){
//        try (Connection con = DriverManager.getConnection(dbURL, userName, password)) {
//
//
//            String sql = "INSERT INTO SCRAPDUN(name, weaponName, win, lose) VALUES (?, ?, ?, ?)";
//            PreparedStatement preparedStatement = con.prepareStatement(sql);
//
//            String player = "INSERT INTO SCRAPDUN (name, weaponName, win, lose) VALUES ( '" + User.getCharacterName()
//                    + "',  + '" + User.getCharacterWeapon()
//                    + "' ,  '" + CombatMechanics.win
//                    + "', '" + CombatMechanics.lose + "')";
//
//            preparedStatement.executeUpdate(player);
//
//            CombatMechanics.setWin(0);
//            CombatMechanics.setLose(0);
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    //top  5
////    public static void statisticTop5(){
////        try (Connection connection = DriverManager.getConnection(dbURL, userName, password)) {
////
////            String sql = "Select NAME, COUNT(WIN), COUNT(LOSE) FROM SCRAPDUN ORDER BY COUNT(WIN)";
////            Statement statement = connection.createStatement();
////            ResultSet resultSet = statement.executeQuery(sql);
////
////            while (resultSet.next()) {
////                String name = "Player name: " + resultSet.getString("name");
////                String win = "wins: " + resultSet.getString("win");
////                String lose = "lesions: " + resultSet.getString("lose");
////
////
////                System.out.println("##################" + "\n" + name + "\n" + win + "\n" + lose + "\n");
////            }
////
////        } catch (SQLException e) {
////            e.printStackTrace();
////        }
////    }
//
//    public static void read() {
//
//
//        try (Connection connection = DriverManager.getConnection(dbURL, userName, password)) {
//
//            String sql = "SELECT * FROM SCRAPDUN";
//
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(sql);
//
//
//            while (resultSet.next()) {
//                String id = "Id: " + resultSet.getString("id");
//                String name = "Player name: " + resultSet.getString("name");
//                String weaponName = "Name weapon: " + resultSet.getString("weaponName");
//                String win = "Number of wins: " + resultSet.getString("win");
//                String lose = "Number of lesions: " + resultSet.getString("lose");
//
//
//                System.out.println("##################" + "\n" + id + "\n" + name + "\n" + win + "\n" + lose +
//                        "\n" + weaponName + "\n" + "##################" + "\n");
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//
//    public static void dataOptions() throws SQLException {
//        createGameTable();
//        System.out.println(Color.ANSI_WHITE + "1.Read data");
//        System.out.println("2.Delete all data");
//        System.out.println("3.Back to menu" + Color.ANSI_RESET);
//
//        int choice = Main.choiceFromTo(1, 3);
//
//        switch (choice) {
//            case 1:
//
//                read();
//                System.out.println();
//                dataOptions();
//                break;
//            case 2:
//                drop();
//                dataOptions();
//            case 3:
//                Main.action1();
//                break;
//
//        }
//    }
//
//    // table checking
////    static boolean tableExistsSQL(String tableName) {
////        try (Connection con = DriverManager.getConnection(dbURL, userName, password)) {
////            PreparedStatement preparedStatement = con.prepareStatement("SELECT count(*) "
////                    + "FROM information_schema.tables "
////                    + "WHERE table_name = ?"
////                    + "LIMIT 1;");
////            preparedStatement.setString(1, tableName);
////
////            ResultSet resultSet = preparedStatement.executeQuery();
////            resultSet.next();
////            return resultSet.getInt(1) != 0;
////
////        } catch (SQLException e) {
////            e.printStackTrace();
////        }
////        return false;
////    }
//
////    public static void notExistsDataThenCreate() throws SQLException {
////        if (!tableExistsSQL("scrapdun")) {
////            createGameTable();
////        }
////    }
//
//
//}
