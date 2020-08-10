package Escuela;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class Conexion {

    public static final String URL = "jdbc:mysql://localhost:3306/escuela?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contrasena = "upoli123";

    public Connection getConnection() {

        Connection conexion = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, usuario, contrasena);
        } catch (Exception e) {
            System.out.println(e);
        }
        return conexion;
    }

}
