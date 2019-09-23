/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BONIFACIO
 */
public class Test {
        public static void main(String[] args){
            
            try {
                if(Conexion.conectar() == null){
                    System.out.println("ERROR AL CONECTAR");
                }else{
                    System.out.println("CONEXION EXITOSA");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
