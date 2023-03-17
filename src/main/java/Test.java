import java.sql.*;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) throws SQLException {

        Connection con = null;

        con = DriverManager.getConnection("jdbc:mysql://localhost/newdb?" + "user='root'&password=Mysql123");


        Statement stat = con.createStatement();
        ResultSet querries = stat.executeQuery("SELECT * FROM students;");

        ArrayList<String> surnames = new ArrayList<>();
        while (querries.next()) {
            String surname = querries.getString("last_name");
            String name = querries.getString("first_name");

            System.out.println("Name: " + name);

            surnames.add(surname);


        }
        con.close();

        System.out.println("Surname: " + surnames);

    }
}
