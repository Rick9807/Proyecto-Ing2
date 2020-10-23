/*
MANTENIMIENTO DE SOFTWARE 1
Equipo 5 Ingenieria de software II
Fecha de la ultima modificacion: 31 de octubre de 2020
Por:
Murillo Rivas Patricia Montserrat - patricia.murillo7467@alumnos.udg.mx
Mares Guzmán Jesús Alejandro - jesus.mares5041@alumnos.udg.mx
Ramírez Guzmán Ricardo -ricardo.guzman7966@alumnos.udg.mx
Moncayo Mendoza Axel - Red18.21uchiha@gmail.com
*/
//Pestaña de agregar productos
///Declaracion de librerias a usar

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
//Declararcion de la clase 

public class Productos extends javax.swing.JFrame {
//Declararcion de la variables 

    private NewConexion con = new  NewConexion();
    String user1="", nombre_usuarios, compania;
    int id_usuario, id_proveedor;
    Ad_Proveedores p = new Ad_Proveedores();
    String proveedor1="";
   
    String proveedor = "";
    
    public Productos() {
        initComponents();
        //Diseño de la pagina

        setSize(618,517);
        setResizable(false);
        this.setLocationRelativeTo(null);//centrar las ventanas
         setIconImage (new ImageIcon(getClass().getResource("mentita.jpg")).getImage());
        user1 = Login.user;
        setTitle("Registrar Productos - Sesion de "+ user1);
        String mis= p.Compania;
      //Varificar el acceso a la base de datos

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
        setResizable(false);
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
        txtNom.setEnabled(false);
        getContentPane().add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 200, 30));

        txtMarc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtMarc.setEnabled(false);
        getContentPane().add(txtMarc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 200, 30));

        txtDes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDes.setEnabled(false);
        getContentPane().add(txtDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 200, 30));

        txtPre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPre.setEnabled(false);
        txtPre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPreKeyTyped(evt);
            }
        });
        getContentPane().add(txtPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 200, 30));

        txtSto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSto.setEnabled(false);
        txtSto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStoKeyTyped(evt);
            }
        });
        getContentPane().add(txtSto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 200, 30));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dulceria/add_also_insert_255.png"))); // NOI18N
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setDefaultCapable(false);
        btnAgregar.setEnabled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 120, 120));

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salir_norm.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setFocusPainted(false);
        btnExit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/salir_press.png"))); // NOI18N
        btnExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/salir_roll.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 110, 50));

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

        btnBs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/comprobar_norm.png"))); // NOI18N
        btnBs.setBorder(null);
        btnBs.setBorderPainted(false);
        btnBs.setContentAreaFilled(false);
        btnBs.setFocusPainted(false);
        btnBs.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/comprobar_press.png"))); // NOI18N
        btnBs.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/comprobar_press.png"))); // NOI18N
        btnBs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBsActionPerformed(evt);
            }
        });
        getContentPane().add(btnBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 120, 40));

        txtBus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 260, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Proveedor");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoComodin.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Boton de salir de la pestaña al menu anterior
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
      dispose();
      //Retornar a pestaña anterior

      if(Login.perm.equalsIgnoreCase("Jefe")){
          //Retornar a pestaña anterior

          new Admim_Productos().setVisible(true);
        }else{
          //Retornar a pestaña anterior

          new Empleados_Productos().setVisible(true);
        }   
    }//GEN-LAST:event_btnExitActionPerformed
//Boton de agregar productos a la base de datos
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
     //Declararcion de la variables 

    String nombre="", marca="", descripcion="", prueba="", comp="";
     double precio=0;
     int Stock=0;
     String prove="";
     txtCompania.setText(proveedor1);
     nombre = txtNom.getText();
     marca= txtMarc.getText();
     descripcion = txtDes.getText();
     //Validar campos vacios

     if(nombre.equals("") || marca.equals("") || descripcion.equals("") || txtSto.getText().equals("") || txtPre.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Todos los campos deben esta llenos");
     }else{
         txtCompania.setText(prove);
         Stock = Integer.parseInt(txtSto.getText());
         precio = Double.parseDouble(txtPre.getText());
         //Varificar el acceso a la base de datos

         try {
            Connection cn = Conexion.conectar();
            PreparedStatement pat = cn.prepareStatement(
             "select nombre from productos where nombre = '" + nombre + "'");
              ResultSet rs = pat.executeQuery();
              if(rs.next()){
                JOptionPane.showMessageDialog(null," El nombre ingresado pertence a otro producto en existencia"); 
              }else{
                    try{
                        Connection cn2 = Conexion.conectar();
                        PreparedStatement pat2 = cn2.prepareStatement(
                                //Insertar en la base de datos
                                "insert into productos values(?,?,?,?,?,?,?,?)");
                        //Datos a insertar
                        pat2.setInt(1,0);
                        pat2.setString(2,nombre);
                        pat2.setString(3,marca);
                        pat2.setString(4,descripcion);
                        pat2.setDouble(5,precio);
                        pat2.setInt(6,Stock);
                        pat2.setInt(7,id_usuario);
                        pat2.setString(8,proveedor);

                        pat2.executeUpdate();
                        cn2.close();
                        Limpiar();

                        JOptionPane.showMessageDialog(null,"Producto almacenado con exito");
                        
                    }catch(SQLException e){
                        System.err.println("Error al registrar Producto" + e);
                        JOptionPane.showMessageDialog(null," ERROR al registrar, contacte al administrador ");
                    }
                }
            cn.close();
        }catch(SQLException e){
           System.err.println("Error en validar el usuario" + e);
           JOptionPane.showMessageDialog(null," ERROR al comparar usuario, contacte al administrador ");
        }
      }
  
    }//GEN-LAST:event_btnAgregarActionPerformed
    //Validar entrada de numeros
    private void txtStoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStoKeyTyped
       char c = evt.getKeyChar();
       if(c < '0'|| c > '9') evt.consume();
    }//GEN-LAST:event_txtStoKeyTyped

    private void txtPreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPreKeyTyped
   
//       char c = evt.getKeyChar();
//       if(c < '0'|| c > '9') evt.consume();
    }//GEN-LAST:event_txtPreKeyTyped
//Boton de buscar y comprobar productos
    private void btnBsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBsActionPerformed

       proveedor = txtBus.getText();  
       //Validar campos vacios

        if(proveedor.equals("")){
            JOptionPane.showMessageDialog(null, "Debe llenar el campo requerido");
            txtBus.setBackground(Color.yellow);
        }else{
            txtBus.setBackground(Color.white);
            try{
                //Varificar el acceso a la base de datos

                 Connection cn = Conexion.conectar();

                 PreparedStatement pat = cn.prepareStatement(
                         //Obtener datos
                    "select compania from proovedores where compania= '" + proveedor + "'");
                 ResultSet rs =pat.executeQuery();
                    if(rs.next()){
                       proveedor1 = rs.getString("compania");
                       txtCompania.setText(proveedor1);

                       txtNom.setEnabled(true);
                       txtMarc.setEnabled(true);
                       txtDes.setEnabled(true);
                       txtPre.setEnabled(true);
                       txtSto.setEnabled(true);
                       btnAgregar.setEnabled(true);
                    }
                    else{
                     JOptionPane.showMessageDialog(null,"No se encontró la compania en la BD");
                    }
                }catch(Exception e){
                    System.err.println("Error al buscar id_usuario");
                    JOptionPane.showMessageDialog(null,"Error, no se encontro el proveedor");
                }
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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
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
 //Funcion de limpiar las cajas de texto
    public void Limpiar(){
    
        txtBus.setText("");
        txtCompania.setText("");
        txtNom.setText("");
        txtMarc.setText("");
        txtDes.setText("");
        txtPre.setText("");;
        txtSto.setText("");
        txtCompania.setText("");
        
        txtNom.setEnabled(false);
        txtMarc.setEnabled(false);
        txtDes.setEnabled(false);
        txtPre.setEnabled(false);
        txtSto.setEnabled(false);
        btnAgregar.setEnabled(false);
    
        }

    
}
       
   
    


