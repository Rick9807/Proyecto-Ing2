
package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

public class NewConexion {

   // Connection con;
    String bd = "bd_dulceria";
    String url="jdbc:mysql://localhost/"+ bd;
    String user="root";
    String pass="12345";
    Connection con = null;
    
    public NewConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
            if(con != null){
            
            }
        } catch (SQLException e) {
        
            System.out.println(e);
            
        }catch(ClassNotFoundException e){
        
            System.out.println(e);
        
        }      
   
    }
    
    
    public ResultSet consulta(String sql){
    ResultSet rs = null;
    try{
     PreparedStatement pat = con.prepareStatement(sql);
     
     rs = pat.executeQuery();
    
        }catch(SQLException e){
        
        System.err.println("error al consultar" + e.getMessage());
        
        
        }
    
    return rs;
    
    }

    public DefaultComboBoxModel Ob_Comp(){
    DefaultComboBoxModel ListaModelo = new DefaultComboBoxModel();
    ListaModelo.addElement("Seleccione");
      ResultSet rs = this.consulta("select compania from proovedores");
      try{
      while(rs.next()){
      ListaModelo.addElement(rs.getString("compania"));
  
      }
      rs.close();
 
      }catch(SQLException e){
      
      
      }
    return ListaModelo;
    }

    
    public static ArrayList<String> llenarcombo(){
     ArrayList<String> Lista = new ArrayList<String>();
     try{
             Connection cn = Conexion.conectar();
             PreparedStatement pat = cn.prepareStatement(
                "select * from proovedores");
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
