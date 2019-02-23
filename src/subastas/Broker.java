/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subastas;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Carlos Arango
 * Clase que se encarga de la comunicación con la BD
 */
public class Broker {
    private static Connection conn = null;    
    public Broker(){
        
    }
    public static Connection getConnection(){
        try{  
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?user=root&password=Upb2018");
        }catch(Exception e){
            conn = null;
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
