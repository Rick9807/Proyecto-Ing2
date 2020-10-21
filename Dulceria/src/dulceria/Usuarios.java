
package dulceria;
import Clases.Conexion;
import java.awt.Color;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;


public class Usuarios extends javax.swing.JFrame {

String user;
   
    public Usuarios() {
        initComponents();
        
        setSize(586,503);
        setResizable(false);
        this.setLocationRelativeTo(null);//centrar las ventanas
         setIconImage (new ImageIcon(getClass().getResource("mentita.jpg")).getImage());
        user = Login.user;
        setTitle("Registrar Empleados - Sesion de "+ user);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        txtape = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        cmbP = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        cmbsx = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registro de Empleados");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 300, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Apellidos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sexo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 40, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Usuario");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 70, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Edad");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 40, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Password");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 70, 40));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Puesto");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 70, 40));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Telefono");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 70, 40));

        txtnom.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtnom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomKeyTyped(evt);
            }
        });
        getContentPane().add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 230, 30));

        txtape.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapeKeyTyped(evt);
            }
        });
        getContentPane().add(txtape, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 230, 30));

        txtedad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadKeyTyped(evt);
            }
        });
        getContentPane().add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 230, 30));

        txtTel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelKeyTyped(evt);
            }
        });
        getContentPane().add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 230, 30));

        txtMail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 230, 30));

        txtPass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 230, 30));

        cmbP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Jefe" }));
        cmbP.setToolTipText("");
        getContentPane().add(cmbP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 230, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/addUser.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 110, 120));

        cmbsx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));
        getContentPane().add(cmbsx, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 60, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Agregar");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

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
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 120, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoAdmin.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int puesto_cmb = 0, sexo = 0 , validacion =0;
        
        String edad ,nombre, apellidos, telefono,correo , contrasena, permisos_string ="", permisos="";
        
        correo = txtMail.getText().trim();
        contrasena = txtPass.getText().trim();
        nombre = txtnom.getText().trim();
        apellidos = txtape.getText().trim();
        telefono = txtTel.getText().trim();
        puesto_cmb = cmbP.getSelectedIndex()+1;
        sexo = cmbsx.getSelectedIndex()+1;
        edad = txtedad.getText();

        if(correo.equals("") || contrasena.equals("") || nombre.equals("") || apellidos.equals("") || telefono.equals("") || edad.equals("")){
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos");
            txtMail.setBackground(Color.white);
        }else{
            if(puesto_cmb == 1){
                permisos_string ="Empleado";
            }else if(puesto_cmb == 2){
                permisos_string ="Jefe";
            }
            if(sexo == 1){
                permisos ="F";
            }else if(sexo == 2){
                permisos ="M";
            }
            try {
               txtMail.setBackground(Color.white);
               Connection cn = Conexion.conectar();
                PreparedStatement pat = cn.prepareStatement(
                "select usuario from usuarios where usuario = '" + correo + "'");
                 ResultSet rs = pat.executeQuery();
                 if(rs.next()){
                    txtMail.setBackground(Color.yellow);
                    JOptionPane.showMessageDialog(null," El usuario ingresado pertence a otro empleado, por favor ingrese otro");
                    cn.close();
                 }else{
                    try{  
                     PreparedStatement pat2 = cn.prepareStatement(
                       "insert into usuarios values(?,?,?,?,?,?,?,?,?)");

                       pat2.setInt(1,0);
                       pat2.setString(2,nombre);
                       pat2.setString(3,apellidos);
                       pat2.setString(4,edad);
                       pat2.setString(5,permisos);
                       pat2.setString(6,telefono);
                       pat2.setString(7,permisos_string);
                       pat2.setString(8,correo);
                       pat2.setString(9,contrasena);

                       pat2.executeUpdate();

                        Limpiar();
                        cn.close();
                        JOptionPane.showMessageDialog(null,"Empleado almacenado con exito");
                       }catch(SQLException e){
                         System.err.println("Error al registrar usuario" + e);
                         JOptionPane.showMessageDialog(null," ERROR al registrar, contacte al administrador " + e);
                    }
              }
            }catch(SQLException e){
                System.err.println("Error en validar el usuario" + e);
                JOptionPane.showMessageDialog(null," ERROR al comparar usuario, contacte al administrador ");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
                dispose();
                new Admin_Empleados().setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyTyped
       char a = evt.getKeyChar();
       
       if(a < '0' || a > '9') evt.consume();
    }//GEN-LAST:event_txtedadKeyTyped

    private void txtTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyTyped
        char z = evt.getKeyChar();
        
        if(z < '0' || z > '9' ) evt.consume();
    }//GEN-LAST:event_txtTelKeyTyped

    private void txtnomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomKeyTyped
//       char x = evt.getKeyChar();
//       
//       if((x < 'a' || x > 'z') && (x < 'A' || x > 'Z'))
//           evt.consume();
    }//GEN-LAST:event_txtnomKeyTyped

    private void txtapeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapeKeyTyped
//       char l = evt.getKeyChar();
//       
//       if((l < 'a' || l > 'z') && (l < 'A' || l > 'Z'))
//           evt.consume();
    }//GEN-LAST:event_txtapeKeyTyped

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox<String> cmbP;
    private javax.swing.JComboBox<String> cmbsx;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtMail;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtape;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnom;
    // End of variables declaration//GEN-END:variables

    
    public void Limpiar(){
        txtMail.setText("");
        txtPass.setText("");
        txtnom.setText("");
        txtape.setText("");;
        txtTel.setText("");
        cmbP.setSelectedIndex(0);
        cmbsx.setSelectedIndex(0);
        txtedad.setText("");
    }


}


