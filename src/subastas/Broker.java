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
    private Connection conn = null;    
    public Broker(){
        this.conn = Broker.getConnection();
    }
    /**
     * Metodo encargado de establecer la conexión con la BD
     * @return 
     */
    public static Connection getConnection(){        
        try{  
            Class.forName("com.mysql.jdbc.Driver");
             return DriverManager.getConnection("jdbc:mysql://localhost:3306/login?user=root&password=Upb2018");
        }catch(Exception e){                        
            System.out.println(e.getMessage());
            return null;
        }        
    }

    /**
     * @return the conn
     */
    public Connection getConn() {
        return conn;
    }
}
