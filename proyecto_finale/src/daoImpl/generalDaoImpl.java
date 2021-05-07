/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImpl;

import conexion.conexion_oracle;
import dao.generalDao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelos.fechaDBModelo;
import modelos.usuario;

/**
 *
 * @author Usuario
 */
public class generalDaoImpl implements generalDao {

    @Override
    public fechaDBModelo obtenerModelo() {
        Statement stm = null;
        Connection con = null;
        ResultSet rs = null;
        fechaDBModelo objetoBD = null;

        String sql = "SELECT banner FROM v$version ";
        try {
            con = conexion_oracle.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            System.out.println(":: RS " + rs.next());

            while (rs.next()) {
                System.out.println(":: RS " + rs.getString(1));
                //objetoBD.setFecha(rs.getString("banner"));
            }

            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase metodo obtener fecha");
            e.printStackTrace();
        }
        return objetoBD;
    }

    @Override
    public boolean registrar(usuario usuario) {
        boolean registrar = false;

        Statement stm = null;
        Connection con = null;

        String sql = "INSERT INTO usuario values ('"+usuario.getTxt_nit()+"','"+usuario.getTxt_nombre()+"','"+usuario.getTxt_correo()+"','"+usuario.getTxt_contrasena()+"','"+usuario.getTxt_direccion()+"','"+usuario.getTxt_edad()+"','"+usuario.getTxt_cui()+"','"+usuario.getJdc_calendario()+"','"+usuario.getCmb_tipo_usuario()+"')";

        try {
            con = conexion_oracle.conectar();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase generalDaoImpl, método registrar");
            e.printStackTrace();
        }
        return registrar;

    }

}
