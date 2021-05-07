/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelos.fechaDBModelo;
import modelos.usuario;

/**
 *
 * @author Usuario
 */
public interface  generalDao {
    public fechaDBModelo obtenerModelo();
    
    public boolean registrar(usuario usuario);
    
}
