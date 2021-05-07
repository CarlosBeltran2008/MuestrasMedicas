/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.generalDao;
import daoImpl.generalDaoImpl;
import modelos.usuario;

/**
 *
 * @author ch-pc
 */
public class clientesController {

    //llama al DAO para guardar un usuario
    public void registrar(usuario user) {
        generalDao dao = new generalDaoImpl();
        dao.registrar(user);
    }
}
