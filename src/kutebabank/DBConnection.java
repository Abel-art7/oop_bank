
package kutebabank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public Connection connectFromFile() {
        String url = "";
        String user = "";
        String password = "";

        try (BufferedReader reader = new BufferedReader(new FileReader("db_config.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("url=")) {
                    url = line.substring(4).trim();
                } else if (line.startsWith("user=")) {
                    user = line.substring(5).trim();
                } else if (line.startsWith("password=")) {
                    password = line.substring(9).trim();
                }
            }

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully using file!");
            return con;

        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}


