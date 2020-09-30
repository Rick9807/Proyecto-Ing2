
package Clases;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Conexion {
    
    //conexion Local
    
    public static Connection conectar(){
    
    try{
    Connection en = DriverManager.getConnection("jdbc:mysql://localhost/bd_dulceria","root","12345");
    return en;
    }catch(SQLException e){
    
        //System.out.println("Error en la conexion local" + e);
        JOptionPane.showMessageDialog(null,"Error en la conexion local" + e);
    
    }
    
    return(null);
    }
    
    public static ArrayList<String> llenarcombo(){
     ArrayList<String> Lista = new ArrayList<String>();
     try{
             Connection cn = Conexion.conectar();
             PreparedStatement pat = cn.prepareStatement(
                "select compania from proovedores");
             ResultSet rs =pat.executeQuery();
                while(rs.next()){
                 Lista.add(rs.getString("compania"));
                   
                    }
            }catch(Exception e){
                System.err.println("Error al buscar id_usuario");
         }
    
    return Lista;
    }
}
