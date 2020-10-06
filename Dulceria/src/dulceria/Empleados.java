//GEN-FIRST:event_jButton1ActionPerformed
package dulceria;//GEN-LAST:event_jButton1ActionPerformed

import java.sql.*;
import Clases.Conexion;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;
import javax.swing.WindowConstants;


public class Empleados extends javax.swing.JFrame {

    String user1, nombre_usuarios;
    public static int sesion_usuario;
   
    public Empleados() {
        initComponents();
        user1 = Login.user;
        sesion_usuario = 1;
          setSize(626,448);
        setResizable(false);
         this.setLocationRelativeTo(null);//centrar las ventanas
        setTitle("Empleado - Sesion de "+ user1);
         setIconImage (new ImageIcon(getClass().getResource("mentita.jpg")).getImage());
    
         setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         
         try{
             Connection cn = Conexion.conectar();
             PreparedStatement pat = cn.prepareStatement(
                "select nombre from usuarios where usuario= '" + user1 + "'");
             ResultSet rs =pat.executeQuery();
                if(rs.next()){
                    nombre_usuarios = rs.getString("nombre");
                    jLabel2.setText( nombre_usuarios);
                    }
            }catch(Exception e){
                System.err.println("Error de Conexión en la interfaz del Empleado");
         }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btnVentas = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnEmpl = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCongf = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVentas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cashier_icon-icons.com_53629.png"))); // NOI18N
        btnVentas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        getContentPane().add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 120, 120));

        btnProductos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if-01-halloweensweetscandytricktreat-2660267_86899.png"))); // NOI18N
        btnProductos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 120, 120));

        btnExit.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/log_logout_door_1563.png"))); // NOI18N
        btnExit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 120, 120));

        btnEmpl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/business_man_usersearch_thesearch_theclient_2356.png"))); // NOI18N
        btnEmpl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEmpl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmplActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 120, 120));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Empleados");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ventas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Productos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cerrar Sesión");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, -1, -1));

        btnCongf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iEngrenages_24182.png"))); // NOI18N
        btnCongf.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCongf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCongfActionPerformed(evt);
            }
        });
        getContentPane().add(btnCongf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 120, 120));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Configuración");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contactlist_theuser_802.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 120, 120));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Proveedores");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoAdmin.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        pack();
    }// </editor-fold>                        

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        dispose();
      new  Empleados_Productos().setVisible(true);
    }                                            

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) { 
        if(JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea cerrar sesion?") == 0){
            dispose();
            new Login().setVisible(true);
        }
    }                                       

    private void btnEmplActionPerformed(java.awt.event.ActionEvent evt) {                                        
        dispose();
                new Emp_Usuarios_Busq().setVisible(true);
        
    }                                       

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {                                          
        dispose();
        new Empleado_Ad_Ventas().setVisible(true);
        
        
    }                                         

    private void btnCongfActionPerformed(java.awt.event.ActionEvent evt) {                                         
       dispose();
        new EmAd_Confg1().setVisible(true);
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        dispose();
        new Em_Pro_Mostrar().setVisible(true);
    }                                        

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCongf;
    private javax.swing.JButton btnEmpl;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration                   

}
