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
//Pestaña de modificar productos
///Declaracion de librerias a usar

package dulceria;
import java.sql.*;
import Clases.Conexion;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
//Declararcion de la clase 

public class Admin_Prod_Edi extends javax.swing.JFrame {
//Declararcion de la variables 

String user, product="";
int ID;
   
    public Admin_Prod_Edi() {
        //Diseño de la pagina

        initComponents();
        setSize(617,496);
        setResizable(false);
        this.setLocationRelativeTo(null);//centrar las ventanas
         setIconImage (new ImageIcon(getClass().getResource("mentita.jpg")).getImage());
        user = Login.user;
        setTitle("Modificar Productos - Sesion de "+ user);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNom = new javax.swing.JTextField();
        txtMarc = new javax.swing.JTextField();
        txtDes = new javax.swing.JTextField();
        txtPre = new javax.swing.JTextField();
        txtSto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnMod = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDulce = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtCom = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNom.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNom.setEnabled(false);
        getContentPane().add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 200, 30));

        txtMarc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtMarc.setEnabled(false);
        getContentPane().add(txtMarc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 200, 30));

        txtDes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDes.setEnabled(false);
        getContentPane().add(txtDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 200, 30));

        txtPre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPre.setEnabled(false);
        getContentPane().add(txtPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 200, 30));

        txtSto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSto.setEnabled(false);
        getContentPane().add(txtSto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 200, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marca");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descripción");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Stock");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Proveedor");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        btnMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/businesssettings_thebox_theproduct_negocio_2327.png"))); // NOI18N
        btnMod.setBorder(null);
        btnMod.setBorderPainted(false);
        btnMod.setContentAreaFilled(false);
        btnMod.setEnabled(false);
        btnMod.setFocusPainted(false);
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });
        getContentPane().add(btnMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 120, 120));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/businesspackagewarning.png"))); // NOI18N
        btnDelete.setBorder(null);
        btnDelete.setBorderPainted(false);
        btnDelete.setContentAreaFilled(false);
        btnDelete.setEnabled(false);
        btnDelete.setFocusPainted(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 120, 120));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salir_norm.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/salir_press.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/salir_roll.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 110, 40));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Modificaciones");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Modificar");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Eliminar");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 390, -1, -1));
        getContentPane().add(txtDulce, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 200, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Producto");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/comprobar_norm.png"))); // NOI18N
        btnSearch.setBorder(null);
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.setFocusPainted(false);
        btnSearch.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/comprobar_press.png"))); // NOI18N
        btnSearch.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/comprobar_roll.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 110, 40));

        txtCom.setEditable(false);
        getContentPane().add(txtCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 200, 30));

        txtID.setEditable(false);
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 60, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Código");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoAdmin.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 616, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Boton de salir de la pestaña al menu anterior
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        //Retornar
        new Admim_Productos().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
//Boton de buscar y comprobar si existe el registro
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        //Validar campos vacios

        product= txtDulce.getText();
        if(product.equals("")){
            JOptionPane.showMessageDialog(null, "Debe llenar el campo requerido");
            txtDulce.setBackground(Color.yellow);
        }else{
            txtDulce.setBackground(Color.white);
            //Varificar el acceso a la base de datos

            try{
                Connection cn = Conexion.conectar();

                PreparedStatement pat = cn.prepareStatement(
                        //obtener informacion
                   "select * from productos where nombre= '" + product + "'");
                ResultSet rs =pat.executeQuery();
                   if(rs.next()){
                       //Asignar varibles
                       ID = rs.getInt("codigo_producto");
                       txtID.setText(rs.getString("codigo_producto"));
                       txtNom.setText(rs.getString("nombre"));
                       txtMarc.setText(rs.getString("marca"));
                       txtDes.setText(rs.getString("decripcion"));
                       txtPre.setText(rs.getString("precio"));
                       txtSto.setText(rs.getString("stock"));
                       txtCom.setText(rs.getString("compania"));
                       
                       btnMod.setEnabled(true);
                       btnDelete.setEnabled(true);
                       txtNom.setEnabled(true);
                       txtMarc.setEnabled(true);
                       txtDes.setEnabled(true);
                       txtPre.setEnabled(true);
                       txtSto.setEnabled(true);
                       txtCom.setEnabled(true);
                   }
                   else{
                        JOptionPane.showMessageDialog(null,"No existe el producto " +product+ " en la BD" );
                   }
                   cn.close();
            }catch(Exception e){
                System.err.println("Error al buscar id_usuario" + e);
                JOptionPane.showMessageDialog(null,"ERROR al cargar información del producto, contacte al administrador");
            } 
        }   
    }//GEN-LAST:event_btnSearchActionPerformed
//Boton de modificar la info de productos
    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
//Declararcion de la variables 

        String Nombre = null, Marca = null, Descripcion = null;
        double Precio = 0;
        int Cantidad = 0;
        Nombre = txtNom.getText();
        Marca= txtMarc.getText();
        Descripcion = txtDes.getText();
        //Validar campos vacios

        if(Nombre.equals("") || Marca.equals("") || Descripcion.equals("") || txtSto.getText().equals("") || txtPre.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Todos los campos deben estar llenos");
        }else{
            Cantidad = Integer.parseInt(txtSto.getText());
            Precio = Double.parseDouble(txtPre.getText());
            //Varificar el acceso a la base de datos

            try{
                Connection cn = Conexion.conectar();
                PreparedStatement pat = cn.prepareStatement(
                    "select nombre from productos where nombre = '" + product + "' and not codigo_producto = '"+ ID
                     + "'");
                     ResultSet rs = pat.executeQuery();
                    System.out.println(ID);
                     if(rs.next()){
                        JOptionPane.showMessageDialog(null,"El nombre ya existe en la Base de datos");
                        cn.close();
                     }else{
                        Connection cn2 = Conexion.conectar();
                        //Actualizar el registro
                        PreparedStatement pat2 = cn2.prepareStatement("update productos set nombre=?,marca=?"
                                   + ",decripcion=? , precio=?, stock=? where codigo_producto = '"+ ID + "'");
                        //datos
                        pat2.setString(1,Nombre);
                        pat2.setString(2,Marca);
                        pat2.setString(3,Descripcion);
                        pat2.setDouble(4,Precio);
                        pat2.setInt(5,Cantidad);

                        pat2.executeUpdate();
                        cn2.close();
                        //Comprobacion de la modificacion
                        JOptionPane.showMessageDialog(null," Se ha modificado exitosamente ");
                        Limpiar();
                      }
            }catch(SQLException e){
                System.err.println("Error al actualizar Cliente" + e);
                }
        }
    }//GEN-LAST:event_btnModActionPerformed
//Boton de eliminar un registro de productos
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        //Varificar el acceso a la base de datos

        try{
            Connection cn = Conexion.conectar();
            PreparedStatement pat = cn.prepareStatement(
                "delete from productos where nombre = '" + product + "'");  
            //Verificar y confirmar la eliminacion
            if(JOptionPane.showConfirmDialog(this, "¿Esta seguro de borrar este producto?") == 0) {
                pat.executeUpdate();
                JOptionPane.showMessageDialog(null," Se ha eliminado exitosamente ");
                Limpiar();
            }
            cn.close();
        }catch(SQLException e){
            System.err.println("Error al eliminar Producto " + e);
            JOptionPane.showMessageDialog(null," No se permite la eliminación del Producto por restriccion de la BD"); 
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Prod_Edi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Prod_Edi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Prod_Edi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Prod_Edi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Prod_Edi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCom;
    private javax.swing.JTextField txtDes;
    private javax.swing.JTextField txtDulce;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMarc;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPre;
    private javax.swing.JTextField txtSto;
    // End of variables declaration//GEN-END:variables
//Funcion de limpiar las cajas de texto.
  public void Limpiar(){
    txtDulce.setText("");
    txtID.setText("");
    txtNom.setText("");
    txtMarc.setText("");
    txtDes.setText("");
    txtPre.setText("");
    txtSto.setText("");
    txtCom.setText("");
    
    btnMod.setEnabled(false);
    btnDelete.setEnabled(false);
    txtNom.setEnabled(false);
    txtMarc.setEnabled(false);
    txtDes.setEnabled(false);
    txtPre.setEnabled(false);
    txtSto.setEnabled(false);
    txtCom.setEnabled(false);    
  }
}
