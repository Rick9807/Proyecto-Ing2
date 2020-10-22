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
//Pestaña de modificar provedores
///Declaracion de librerias a usar

package dulceria;
import java.sql.*;
import Clases.Conexion;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
//Declararcion de la clase 

public class Admin_Prov_Edi extends javax.swing.JFrame {
//Declararcion de la variables 

String user;
int es, ID;
public static int Sesion_usuario, Id;
   
    public Admin_Prov_Edi() {
        initComponents();
        //Diseño de la pagina

        setSize(622,448);
        setResizable(false);
        this.setLocationRelativeTo(null);//centrar las ventanas
         setIconImage (new ImageIcon(getClass().getResource("mentita.jpg")).getImage());
        user = Login.user;
        setTitle("Modificar Proveedores - Sesion de "+ user);
        
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

        txtNom = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtComp = new javax.swing.JTextField();
        btnMod = new javax.swing.JButton();
        btnMod1 = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCop = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnBs = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNom.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNom.setEnabled(false);
        getContentPane().add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 210, 30));

        txtTel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTel.setEnabled(false);
        getContentPane().add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 210, 30));

        txtCorreo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCorreo.setEnabled(false);
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 210, 30));

        txtComp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtComp.setEnabled(false);
        getContentPane().add(txtComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 210, 30));

        btnMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/writer_person_people_man_you_1633.png"))); // NOI18N
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
        getContentPane().add(btnMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 120, 120));

        btnMod1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete_delete_exit_1577.png"))); // NOI18N
        btnMod1.setBorder(null);
        btnMod1.setBorderPainted(false);
        btnMod1.setContentAreaFilled(false);
        btnMod1.setEnabled(false);
        btnMod1.setFocusPainted(false);
        btnMod1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMod1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 120, 120));

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salir_norm.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setFocusPainted(false);
        btnExit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/salir_press.png"))); // NOI18N
        btnExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/salir_roll.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 110, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modificar Proveedores");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modificar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 215, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Eliminar");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 365, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Teléfono");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Correo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Compañia");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 280, -1, -1));

        txtCop.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtCop, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 210, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Compañia");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 100, -1, -1));

        btnBs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/comprobar_norm.png"))); // NOI18N
        btnBs.setBorder(null);
        btnBs.setBorderPainted(false);
        btnBs.setContentAreaFilled(false);
        btnBs.setFocusPainted(false);
        btnBs.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/comprobar_press.png"))); // NOI18N
        btnBs.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/comprobar_roll.png"))); // NOI18N
        btnBs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBsActionPerformed(evt);
            }
        });
        getContentPane().add(btnBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoAdmin.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 448));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Boton de modificar la info de provedor

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
      //Declararcion de la variables 

        String Nombre, Correo, Compania, Telefono;

        Nombre = txtNom.getText().trim();
        Correo = txtCorreo.getText().trim();
        Telefono = txtTel.getText().trim();
        Compania = txtComp.getText().trim();
//Validar campos vacios

        if(Nombre.equals("") || Correo.equals("") || Telefono.equals("") || Compania.equals("")){
            JOptionPane.showMessageDialog(null, "Todos los campos deben esta llenos");
        }else{
            //Varificar el acceso a la base de datos

            try{
                Connection cn = Conexion.conectar();

                PreparedStatement pat = cn.prepareStatement(
                    "select compania from proovedores where compania = '" + Compania + "' and not id_proveedor = '"+ ID
                     + "'");
                     ResultSet rs = pat.executeQuery();

                     if(rs.next()){
                        JOptionPane.showMessageDialog(null,"La compañia ya existe en la Base de datos");
                     }else{
                        Connection cn2 = Conexion.conectar();
                        //Actualizar base de datos
                        PreparedStatement pat2 = cn2.prepareStatement("update proovedores set nombre=?,"
                                   + "telefono=?, correo=?, compania=? where id_proveedor = '"+ ID + "'");

                               pat2.setString(1,Nombre);
                               pat2.setString(2,Telefono);
                               pat2.setString(3,Correo);
                               pat2.setString(4,Compania);

                                pat2.executeUpdate();
                         cn2.close();

                         JOptionPane.showMessageDialog(null," Se ha modificado exitosamente ");
                         Limpiar();
                    }
                    cn.close();
            }catch(SQLException e){
               System.err.println("Error al actualizar Proveedor" + e);
               JOptionPane.showMessageDialog(null,"ERROR al modificar al proveedor, consulte al administrador"); 
            }
        }
    }//GEN-LAST:event_btnModActionPerformed
//Boton de eliminar provedor
    private void btnMod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMod1ActionPerformed
       //Declararcion de la variables 

        String Compania;
        Compania = txtCop.getText().trim();
        //Varificar el acceso a la base de datos

        try{
            Connection cn = Conexion.conectar();

            PreparedStatement pat = cn.prepareStatement(
                "delete from proovedores where compania = '" + Compania+ "'"); 
            //Comprobar y validar la eliminacion
            if(JOptionPane.showConfirmDialog(this, "¿Esta seguro de borrar a este empleado?") == 0) {
                pat.executeUpdate();
                JOptionPane.showMessageDialog(null," Se ha eliminado exitosamente ");
                Limpiar();
            }
            cn.close();  
        }catch(SQLException e){
            System.err.println("Error al eliminar Empleado " + e);
            JOptionPane.showMessageDialog(null," No se permite la eliminación del proveedor por restriccion de la BD "); 
        }
    }//GEN-LAST:event_btnMod1ActionPerformed
//Boton de salir de la pestaña al menu anterior
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       dispose();
       //Retornar
       new Admin_Proveedores().setVisible(true);
        
    }//GEN-LAST:event_btnExitActionPerformed
//Boton de comprobacion y buesqueda de registro
    private void btnBsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBsActionPerformed
       //Declararcion de la variables 

        String compania="",nombre="";
        
        compania = txtCop.getText();
        //Verifica los permisos del usuario

        if(compania.equals("")){
            JOptionPane.showMessageDialog(null, "Debe llenar el campo requerido");
            txtCop.setBackground(Color.yellow);
        }else{
            txtCop.setBackground(Color.white);
            //Varificar el acceso a la base de datos

           try{
            Connection cn = Conexion.conectar();

            PreparedStatement pat = cn.prepareStatement(
                "select * from proovedores where compania = '" + compania + "'");
                 ResultSet rs = pat.executeQuery();
                 //Obtener info
                 if(rs.next()){
                    ID = rs.getInt("id_proveedor");
                    txtNom.setText(rs.getString("nombre"));
                    txtTel.setText(rs.getString("telefono"));
                    txtCorreo.setText(rs.getString("correo"));
                    txtComp.setText(rs.getString("compania"));
                    Id = rs.getInt("id_usuario");
                   
                    btnMod.setEnabled(true);
                    btnMod1.setEnabled(true);
                    txtNom.setEnabled(true);
                    txtTel.setEnabled(true);
                    txtCorreo.setEnabled(true);
                    txtComp.setEnabled(true);
                 }
                 else{
                    JOptionPane.showMessageDialog(null,"No existe la compañia "+ compania +" en la Base de datos" );
                    Limpiar();
                 }
                 cn.close();
            }catch(SQLException e){
                System.err.println("Error al cargar la información del empleado" + e);
                JOptionPane.showMessageDialog(null," ERROR al cargar información del proveedor, contacte al administrador ");
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
            java.util.logging.Logger.getLogger(Admin_Prov_Edi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Prov_Edi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Prov_Edi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Prov_Edi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Prov_Edi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBs;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnMod1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtComp;
    private javax.swing.JTextField txtCop;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
//Funcion de limpiar las cajas de texto
    public void Limpiar(){ 
        txtCop.setText("");
        txtNom.setText("");
        txtCorreo.setText("");
        txtTel.setText("");
        txtComp.setText("");
    
        btnMod.setEnabled(false);
        btnMod1.setEnabled(false);
        txtNom.setEnabled(false);
        txtTel.setEnabled(false);
        txtCorreo.setEnabled(false);
        txtComp.setEnabled(false);
    }



}
