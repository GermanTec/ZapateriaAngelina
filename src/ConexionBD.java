
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Toshiba-PC
 */
public class ConexionBD {
    public static Connection getConetion(){
      
        String connectionURL="jdbc:sqlserver://DESKTOP-STU78QO:1433;"
                + "database=ZapateriaGely;"
                + "user=sa;"
                + "password=german;";
        
        try{
        Connection con=DriverManager.getConnection(connectionURL);
        return con;
        }catch(SQLException e){
        System.out.println(e.toString());
        return null;
        }

    }
}
