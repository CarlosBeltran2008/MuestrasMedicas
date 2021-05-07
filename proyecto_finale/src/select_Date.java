
import daoImpl.generalDaoImpl;
import modelos.fechaDBModelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class select_Date {

    public static void main(String[] args) {
        generalDaoImpl generalImpl = new generalDaoImpl();
        fechaDBModelo objetoBD = generalImpl.obtenerModelo();
        //System.out.println("FECHA : " + objetoBD.getFecha());

    }
}
