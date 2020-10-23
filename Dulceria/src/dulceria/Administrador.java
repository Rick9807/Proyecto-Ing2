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
//Pestaña de menu principal
///Declaracion de librerias a usar

package dulceria;

import javax.swing.ImageIcon;
import java.sql.*;
import Clases.Conexion;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
//Declararcion de la clase 

public class Administrador extends javax.swing.JFrame {
//Declararcion de la variables 

    String user, nombre_usuario;
    public static int sesion_usuario;
    
   
    public Administrador() {
        initComponents();
        user = Login.user;
        sesion_usuario = 1; 
        //Diseño de la pagina

        setSize(625,451);
        setResizable(false);
        this.setLocationRelativeTo(null);//centrar las ventanas
        setTitle("Administrador- Sesion de "+ user);
         setIconImage (new ImageIcon(getClass().getResource("mentita.jpg")).getImage());
    
         setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         //Varificar el acceso a la base de datos

         try{
             Connection cn = Conexion.conectar();
             PreparedStatement pat = cn.prepareStatement(
                     //Obtener informacion de usuario
                "select nombre from usuarios where usuario= '" + user + "'");
             ResultSet rs =pat.executeQuery();
                if(rs.next()){
                    nombre_usuario = rs.getString("nombre");
                    jlabelUser.setText( nombre_usuario);
                    }
            }catch(Exception e){
                System.err.println("Error de Conexión en la interfaz Administrador");
         }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEmpleados = new javax.swing.JButton();
        btnSesion = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnProdcutos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlabelUser = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEmpleados.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/informationuser.png"))); // NOI18N
        btnEmpleados.setBorder(null);
        btnEmpleados.setBorderPainted(false);
        btnEmpleados.setContentAreaFilled(false);
        btnEmpleados.setFocusPainted(false);
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 120, 120));

        btnSesion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/log_logout_door_1563.png"))); // NOI18N
        btnSesion.setBorder(null);
        btnSesion.setBorderPainted(false);
        btnSesion.setContentAreaFilled(false);
        btnSesion.setFocusPainted(false);
        btnSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 120, 120));

        btnProveedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/capturista.png"))); // NOI18N
        btnProveedor.setBorder(null);
        btnProveedor.setBorderPainted(false);
        btnProveedor.setContentAreaFilled(false);
        btnProveedor.setFocusPainted(false);
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(btnProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 120, 120));

        btnConfiguracion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iEngrenages_24182.png"))); // NOI18N
        btnConfiguracion.setBorder(null);
        btnConfiguracion.setBorderPainted(false);
        btnConfiguracion.setContentAreaFilled(false);
        btnConfiguracion.setFocusPainted(false);
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 120, 120));

        btnVentas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cashier_icon-icons.com_53629.png"))); // NOI18N
        btnVentas.setBorder(null);
        btnVentas.setBorderPainted(false);
        btnVentas.setContentAreaFilled(false);
        btnVentas.setFocusPainted(false);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        getContentPane().add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 120, 120));

        btnProdcutos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnProdcutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if-01-halloweensweetscandytricktreat-2660267_86899.png"))); // NOI18N
        btnProdcutos.setBorder(null);
        btnProdcutos.setBorderPainted(false);
        btnProdcutos.setContentAreaFilled(false);
        btnProdcutos.setFocusable(false);
        btnProdcutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdcutosActionPerformed(evt);
            }
        });
        getContentPane().add(btnProdcutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 120, 120));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Empleados");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ventas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Proveedores");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Productos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Configuración");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 340, -1, -1));

        jlabelUser.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlabelUser.setForeground(new java.awt.Color(255, 255, 255));
        jlabelUser.setText("jLabel7");
        getContentPane().add(jlabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 440, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cerrar Sesion");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 340, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoJefe.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Boton de cierre de secion 

    private void btnSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSesionActionPerformed
        if(JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea cerrar sesion?") == 0){
            dispose();
            //Retornar a pestaña anterior
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_btnSesionActionPerformed
//Boton de menu de productos

    private void btnProdcutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdcutosActionPerformed
                 dispose();
                 //Redireccionar a menu de productos
                new Admim_Productos().setVisible(true);
        
    }//GEN-LAST:event_btnProdcutosActionPerformed
//Boton de menu de empleado
    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        dispose();
        //Redireccionar a menu de emplesdo
        new Admin_Empleados().setVisible(true);
    }//GEN-LAST:event_btnEmpleadosActionPerformed
//Boton de menu de provedores
    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
                dispose();
                //Redireccionar a menu de provedores
                new Admin_Proveedores().setVisible(true);        
        
        
    }//GEN-LAST:event_btnProveedorActionPerformed
//Boton de configuracion

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
dispose();
//Redireccionar
            new Ad_Confg().setVisible(true);
        
    }//GEN-LAST:event_btnConfiguracionActionPerformed
//Boton de menu de ventas
    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
      dispose();
      //Redireccionar a menu de ventas
      new Ad_Ventas().setVisible(true);
    }//GEN-LAST:event_btnVentasActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnProdcutos;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnSesion;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jlabelUser;
    // End of variables declaration//GEN-END:variables
}
