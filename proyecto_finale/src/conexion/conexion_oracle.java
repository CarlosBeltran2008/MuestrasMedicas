/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class conexion_oracle {

    public static Connection conectar() {
        Connection con = null;

        String password = "123*/Abc";
        String usuario = "System";
        String url = "jdbc:oracle:thin:@localhost:1521/orcl";
        try {
            con = DriverManager.getConnection(url, usuario, password);
            if (con != null) {
                System.out.println("Conectado a la base de datos");
            }
        } catch (SQLException e) {
            System.out.println("No se pudo conectar a la base de datos");
            e.printStackTrace();
        }
        return con;
    }

}
