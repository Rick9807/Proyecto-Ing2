/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dulceria;
import java.sql.*;
import Clases.Conexion;
import Clases.NewConexion;
import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Em_Productos extends javax.swing.JFrame {

    private NewConexion con = new  NewConexion();
    String user1="", nombre_usuarios, compania;
    int id_usuario, id_proveedor;
    Ad_Proveedores p = new Ad_Proveedores();
   
    String proveedor = "";
    
    
    public Em_Productos() {
        initComponents();
          setSize(618,517);
        setResizable(false);
        this.setLocationRelativeTo(null);//centrar las ventanas
         setIconImage (new ImageIcon(getClass().getResource("mentita.jpg")).getImage());
        user1 = Login.user;
        setTitle("Registrar Productos - Sesion de "+ user1);
        String mis= p.Compania;
      
        try{
             Connection cn = Conexion.conectar();
             PreparedStatement pat = cn.prepareStatement(
                "select id_usuario from usuarios where usuario= '" + user1 + "'");
             ResultSet rs =pat.executeQuery();
                if(rs.next()){
                 id_usuario = rs.getInt("id_usuario");
                   
                    }
            }catch(Exception e){
                System.err.println("Error al buscar id_usuario");
         }
         
       
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
////       jcmbP.removeAllItems();
////       ArrayList<String> Lista = new ArrayList<String>();
////     Lista =  NewConexion.llenarcombo();
////     jcmbP.addItem(Lista);
////     for(int w=0; w<Lista.size();w++){
////     jcmbP.addItem(Lista);
////     
////     }
//this.jcmbP.setModel(con.Ob_Comp());
       
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtMarc = new javax.swing.JTextField();
        txtDes = new javax.swing.JTextField();
        txtPre = new javax.swing.JTextField();
        txtSto = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCompania = new javax.swing.JTextField();
        btnBs = new javax.swing.JButton();
        txtBus = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Agregar Productos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 230, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 70, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descripción");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Marca");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio");
        jLabel6.setName(""); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));
        jLabel6.getAccessibleContext().setAccessibleName("");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Stock");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        txtNom.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 200, 30));

        txtMarc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtMarc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 200, 30));

        txtDes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 200, 30));

        txtPre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPreKeyTyped(evt);
            }
        });
        getContentPane().add(txtPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 200, 30));

        txtSto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStoKeyTyped(evt);
            }
        });
        getContentPane().add(txtSto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 200, 30));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dulceria/add_also_insert_255.png"))); // NOI18N
        btnAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 120, 120));

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExit.setText("Salir");
        btnExit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 100, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Agregar");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 260, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Proveedor");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        txtCompania.setEditable(false);
        txtCompania.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtCompania, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 200, 30));

        btnBs.setText("Buscar");
        btnBs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBsActionPerformed(evt);
            }
        });
        getContentPane().add(btnBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 120, 30));

        txtBus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 200, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Proveedor");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoAdmin.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       
      dispose();
        new Empleados_Productos().setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
     String nombre="", marca="", descripcion="", prueba="";
     double precio=0;
     int Stock=0, validacion =0;
     String prove="";
     //prove= p.Compania;
     txtCompania.setText(prove);
      
     
//     proveedor = jcmbP.getSelectedIndex()+1;
       
     
      
     if(txtNom.getText().equals("")){
             validacion++;
     JOptionPane.showMessageDialog(null,"El campo Nombre está vacio");
     }else{
        nombre = txtNom.getText();
        }
   if(txtMarc.getText().equals("")){
        validacion++;
        JOptionPane.showMessageDialog(null,"El campo Marca está vacio");
   }else{
        marca= txtMarc.getText();
        }
    if(txtDes.getText().equals("")){
       validacion++;
        JOptionPane.showMessageDialog(null,"El campo Descripción está vacio");

   }else{
       descripcion = txtDes.getText();
        }
     if(txtSto.getText().equals("")){
       validacion++;
        JOptionPane.showMessageDialog(null,"El campo Stock está vacio");

   }else{
      Stock = Integer.parseInt(txtSto.getText());
        }
     if(txtPre.getText().equals("")){
       validacion++;
        JOptionPane.showMessageDialog(null,"El campo Precio está vacio");

   }else{
     precio = Double.parseDouble(txtPre.getText());
        }
     
     
     //prove= Integer.toString(proveedor);
     
//     if(proveedor == 1){
//        prueba ="Seleccionar";
//        
//        }else if(proveedor == 2){
//        prueba ="Pendiente";
//        
//        }
     
//     nombre= txtNom.getText().trim();
//     marca = txtMarc.getText().trim();
//     descripcion= txtDes.getText().trim();
//     proveedor = jcmbP.getSelectedIndex()+1;
//     Stock = Integer.parseInt(txtSto.getText().trim());
//     precio = Float.parseFloat(txtPre.getText().trim());
  
  
     Connection cn = Conexion.conectar();
     
     if(validacion == 0){
        
     try{
         
         PreparedStatement pat2 = cn.prepareStatement(
                 "insert into productos values(?,?,?,?,?,?,?,?)");
         
         pat2.setInt(1,0);
         pat2.setString(2,nombre);
         pat2.setString(3,marca);
         pat2.setString(4,descripcion);
         pat2.setDouble(5,precio);
         pat2.setInt(6,Stock);
         pat2.setInt(7,id_usuario);
         pat2.setString(8,proveedor);
       
        
      
         
//
pat2.executeUpdate();
cn.close();




JOptionPane.showMessageDialog(null,"Producto almacenado con exito");
//this.dispose();
Limpiar();
     }catch(SQLException e){
         
         System.err.println("Error al registrar Producto" + e);
         JOptionPane.showMessageDialog(null," ERROR al registrar, contacte al administrador ");
     }
               
                  
     }else{
                  JOptionPane.showMessageDialog(null,"Debes de llenar todos los campos ");
                 
                    }
              
          
     
     
        
        
    
    }//GEN-LAST:event_btnAgregarActionPerformed
    
    private void txtStoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStoKeyTyped
       char c = evt.getKeyChar();
       if(c < '0'|| c > '9') evt.consume();
    }//GEN-LAST:event_txtStoKeyTyped

    private void txtPreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPreKeyTyped
   
//       char c = evt.getKeyChar();
//       if(c < '0'|| c > '9') evt.consume();
    }//GEN-LAST:event_txtPreKeyTyped

    private void btnBsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBsActionPerformed
       int val=0;
        txtBus.getText().trim();
        
        if(txtBus.getText().equals("")){
            
         val++;   
            
        }
        
       if(val==0){
         
        try{
             Connection cn = Conexion.conectar();
             
             
             proveedor= txtBus.getText();
             
             PreparedStatement pat = cn.prepareStatement(
                "select compania from proovedores where compania= '" + proveedor + "'");
             ResultSet rs =pat.executeQuery();
                if(rs.next()){
                 String proveedor1 = rs.getString("compania");
                 txtCompania.setText(proveedor1);
                    }
                else{
                 JOptionPane.showMessageDialog(null,"No se encontró la compania en la BD");
                }
            }catch(Exception e){
                System.err.println("Error al buscar id_usuario");
         }
       }else{
       
       JOptionPane.showMessageDialog(null,"El campo está vacio");
       
       }
         
        
    }//GEN-LAST:event_btnBsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Em_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Em_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Em_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Em_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Em_Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBs;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBus;
    private javax.swing.JTextField txtCompania;
    private javax.swing.JTextField txtDes;
    private javax.swing.JTextField txtMarc;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPre;
    private javax.swing.JTextField txtSto;
    // End of variables declaration//GEN-END:variables
 public void Limpiar(){
    
                    txtNom.setText("");
                    txtMarc.setText("");
                    txtDes.setText("");
                    txtPre.setText("");;
                    txtSto.setText("");
                    txtCompania.setText("");
    
        }

    
}
       
   
    


