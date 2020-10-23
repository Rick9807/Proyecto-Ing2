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
//Pestaña de configuracion de administrdor cambio de contraseña
///Declaracion de librerias a usar

package dulceria;
import java.sql.*;
import Clases.Conexion;
import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
//Declararcion de la clase 

public class Confi_Admin extends javax.swing.JFrame {
//Declararcion de la variables 

    String user, usuario, nombre, pass;
int ID;
   
    public Confi_Admin() {
        initComponents();
             //Diseño de la pagina

        setSize(586,511);
        setResizable(false);
        this.setLocationRelativeTo(null);//centrar las ventanas
         setIconImage (new ImageIcon(getClass().getResource("mentita.jpg")).getImage());
        user = Login.user;
        setTitle("Modificar Empleados - Sesion de "+ user);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
       txtUs.setText(user);
       txtP.setEditable(true);
       txt1.setEditable(false);
       txt2.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUs = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnBus = new javax.swing.JButton();
        btnEx = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt1 = new javax.swing.JPasswordField();
        txt2 = new javax.swing.JPasswordField();
        txtP = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUs.setEnabled(false);
        getContentPane().add(txtUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 230, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Usuario");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/padlock_77917.png"))); // NOI18N
        btnEdit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEdit.setEnabled(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 120, 120));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Actualización de password");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Guardar");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, -1));

        btnBus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user_theinformation_788.png"))); // NOI18N
        btnBus.setBorder(null);
        btnBus.setBorderPainted(false);
        btnBus.setContentAreaFilled(false);
        btnBus.setFocusPainted(false);
        btnBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusActionPerformed(evt);
            }
        });
        getContentPane().add(btnBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 120, 120));

        btnEx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salir_norm.png"))); // NOI18N
        btnEx.setBorder(null);
        btnEx.setBorderPainted(false);
        btnEx.setContentAreaFilled(false);
        btnEx.setFocusPainted(false);
        btnEx.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/salir_press.png"))); // NOI18N
        btnEx.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/salir_roll.png"))); // NOI18N
        btnEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExActionPerformed(evt);
            }
        });
        getContentPane().add(btnEx, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 120, 60));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nuevo Password");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Escribalo de nuevo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        txt1.setEditable(false);
        txt1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 230, 30));

        txt2.setEditable(false);
        txt2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 230, 30));

        txtP.setEditable(false);
        txtP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 230, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Comprobar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoAdmin.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Boton de salir de la pestaña al menu anterior
    private void btnExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExActionPerformed
        dispose();
        //Verifica los permisos del usuario

        if(Login.perm.equalsIgnoreCase("Jefe")){
            //Retornar a pestaña anterior como jefe
          new Ad_Confg().setVisible(true);
        }else{
            //Retornar a pestaña anterior
          new EmAd_Confg1().setVisible(true);
        } 
    }//GEN-LAST:event_btnExActionPerformed

//Boton de modificar y guardar cambio de contraseña

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
       //Declararcion de la variables 

        String New="", New1="";
       
        New = txt1.getText().trim();
        New1 = txt2.getText().trim();
      //Validar campos vacios

       if(!New.equals("") && !New1.equals("")){
           if(New.equals(New1)){
               //Varificar el acceso a la base de datos

                try{
                Connection cn = Conexion.conectar();

                PreparedStatement pat = cn.prepareStatement(
                        //Actualizar el registro
                    "update usuarios set password=? where usuario = '"+ user +"'");
                     pat.setString(1,New);

                    pat.executeUpdate();
                    cn.close();

                    JOptionPane.showMessageDialog(null," Se ha actualizado el password exitosamente ");
                    Limpiar();
                    
                    txt1.setEditable(false);
                    txt2.setEditable(false);
                    btnEdit.setEnabled(false);
                    txtP.setEditable(true);
                    btnBus.setEnabled(true);
                    txtP.setText("");
                    }catch(SQLException e){
                System.err.println("Error al actualizar Empleado" + e);
                }
           }else{
                JOptionPane.showMessageDialog(null," Los password deben coincidir");
           }
       }else{
            JOptionPane.showMessageDialog(null,"No se admiten passwords vacios"); 
        }
        
        
        
        
    }//GEN-LAST:event_btnEditActionPerformed
//Boton de buscar ycomprobar si existe el usuario
    private void btnBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusActionPerformed
       //Declararcion de la variables 

        pass = txtP.getText();
        
        //Validar campos vacios

        if(pass.equals("")){
            JOptionPane.showMessageDialog(null, "Debe llenar el campo requerido");
            txtP.setBackground(Color.yellow);
        }else{
            txtP.setBackground(Color.white);
            //Varificar el acceso a la base de datos

            try{
                Connection cn = Conexion.conectar();
                //Obneter infoemacion del ususario
                PreparedStatement pat = cn.prepareStatement(
                "select usuario, password from usuarios where usuario = '" + user + "' and password = '"+ pass + "'");
                ResultSet rs = pat.executeQuery();

             if(rs.next()){
                JOptionPane.showMessageDialog(null,"Datos correctos ");  
                //Ver informacion
                txt1.setEditable(true);
                txt2.setEditable(true);
                btnEdit.setEnabled(true);
                txtUs.setEditable(false);
                txtP.setEditable(false);
                btnBus.setEnabled(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Datos incorrectos");
                    Limpiar();
                }
             cn.close();
            }catch(SQLException e){
                System.err.println("Error " + e);
                JOptionPane.showMessageDialog(null," ERROR, contacte al administrador ");
            }
        }
    }//GEN-LAST:event_btnBusActionPerformed

    
    
    
    
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
            java.util.logging.Logger.getLogger(Confi_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confi_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confi_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confi_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Confi_Admin().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBus;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField txt1;
    private javax.swing.JPasswordField txt2;
    private javax.swing.JPasswordField txtP;
    private javax.swing.JTextField txtUs;
    // End of variables declaration//GEN-END:variables
 //Funcion de limpiar las cajas de texto
    public void Limpiar(){

     txtP.setEditable(true);
     txtP.setText("");
     txt2.setText("");
     txt1.setText("");
                 
                   
    
        }


}
