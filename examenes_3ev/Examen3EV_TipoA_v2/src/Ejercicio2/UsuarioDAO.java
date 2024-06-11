package Ejercicio2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/** Este codigo necesita de abrir el XAMPP y tener cargada la base de datos biblioteca.
 * En la carpeta ScriptBBDD se facilita el archivo biblioteca.sql
 * Se ejecuta SQL en el XAMPP y genera automaticamente todo lo necesario.
 */

public class UsuarioDAO {
    // Establecer los datos de conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public List<Usuario> cargarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Establecer la conexión con la base de datos
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            
            // Consulta SQL para seleccionar todos los usuarios de la tabla
            String sql = "SELECT * FROM usuarios";
            stmt = conn.prepareStatement(sql);
            
            // Ejecutar la consulta
            rs = stmt.executeQuery();
            
            // Iterar sobre los resultados y crear objetos Usuario
            while (rs.next()) {
                int idUsuario = rs.getInt("idusuarios");
                String nombre = rs.getString("nombre");
                String clave = rs.getString("clave");
                Usuario usuario = new Usuario(idUsuario, nombre, clave);
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar conexiones y recursos
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return usuarios;
    }
}
