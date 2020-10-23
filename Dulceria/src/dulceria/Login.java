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
//Pestaña de login de usuario
///Declaracion de librerias a usar

package dulceria;


import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.sql.*;
import Clases.Conexion;


import javax.swing.JOptionPane;

//Declararcion de la clase 

public class Login extends javax.swing.JFrame {
    //Declararcion de la variables 

    public static String user= "", perm="";
    String pass= "";

    public Login() {
        initComponents();
        //Diseño de la pagina

        setSize(641,600);
        setResizable(false);
        this.setLocationRelativeTo(null);
        setTitle("Acceso al sistema");
        setIconImage (new ImageIcon(getClass().getResource("mentita.jpg")).getImage());
        
    }

 /*   @Override
    public Image getIconImage(){
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("add.png"));
    return retValue;
    }
   */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtpass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtpass.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtpass.setForeground(new java.awt.Color(102, 102, 102));
        txtpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpass.setToolTipText("");
        txtpass.setBorder(null);
        txtpass.setName(""); // NOI18N
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 250, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/txt_med700.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 290, -1));

        btnIngresar.setBackground(new java.awt.Color(255, 51, 0));
        btnIngresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(0, 0, 255));
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/acep_norm.png"))); // NOI18N
        btnIngresar.setBorder(null);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setFocusPainted(false);
        btnIngresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/acep_press.png"))); // NOI18N
        btnIngresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/acep_roll.png"))); // NOI18N
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 110, 40));

        jLabel2.setBackground(new java.awt.Color(255, 204, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 255));
        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 290, 110, 20));

        jLabel3.setBackground(new java.awt.Color(255, 204, 255));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 255));
        jLabel3.setText("Usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        btnExit.setBackground(new java.awt.Color(0, 0, 204));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 51, 204));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/salir_norm.png"))); // NOI18N
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
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 130, 40));

        txtUser.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtUser.setForeground(new java.awt.Color(102, 102, 102));
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setBorder(null);
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 250, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/txt_med700.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dulceria/dulceria.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Boton de Ingreso a la aplicacion

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
//Declararcion de la variables 

user = txtUser.getText().trim();
pass = txtpass.getText().trim();
//Validar campos vacios

if(!user.equals("") || !pass.equals("")){
//Varificar el acceso a la base de datos

    try{
        Connection en = Conexion.conectar();
        PreparedStatement pat = en.prepareStatement(
                //Obtener la informacion del registro
            "select puesto from usuarios where usuario = '" + user
            + "' and password = '"+ pass + "'");
        
        ResultSet rs= pat.executeQuery();
        if(rs.next()){
            //Obtener valores del puesto
            String puesto = rs.getString("puesto");
            perm = puesto;
            //Verifica los permisos del usuario

            if(puesto.equalsIgnoreCase("Jefe")){
                dispose();
                new Administrador().setVisible(true);
            }else if(puesto.equalsIgnoreCase("Empleado")){
                 dispose();
                new Empleados().setVisible(true);
                } 
            
            }else{
            //Mensajes de error
             JOptionPane.showMessageDialog(null,"Datos de acceso incorrectos");
             txtUser.setText("");
             txtpass.setText("");
            }
        }catch(SQLException e){
            System.err.println("Error en el boton ingresar" + e);
            JOptionPane.showMessageDialog(null,"Error al iniciar sesion");
    }

}else{

JOptionPane.showMessageDialog(null,"Debes llenar todos los campos");

}


    }//GEN-LAST:event_btnIngresarActionPerformed
//Boton de salir de la aplicacion
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       //Verificaccion de salida
        if(JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea salir?") == 0)
            System.exit(0);
       
    }//GEN-LAST:event_btnExitActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtUser;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}
