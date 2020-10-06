

package dulceria;
import java.sql.*;
import Clases.Conexion;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;


        
public class Ad_Clientes extends javax.swing.JFrame {

String user;
String ven = null;
int ID=0, V;
String nombre="", vent="";
public static String user_update = "";
   
   DefaultTableModel model = new DefaultTableModel();

    public Ad_Clientes() {
        initComponents();
         setSize(743,430);
        setResizable(false);
        this.setLocationRelativeTo(null);//centrar las ventanas
         setIconImage (new ImageIcon(getClass().getResource("mentita.jpg")).getImage());
        user = Login.user;
        setTitle("Clientes - Sesion de "+ user);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);   
   try{
       Connection cn = Conexion.conectar();
       
        PreparedStatement pat = cn.prepareStatement(
            "SELECT MAX(id_cliente) AS id_cliente FROM clientes");
             ResultSet rs = pat.executeQuery();
                      if(rs.next()){                        
                 //V = rs.getInt("id_cliente");           
//System.out.println(V+1);
                    }
      
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se ha encontrado el id de las ventas " + V + " en la BD");
        }
    //ven= String.valueOf(V+1).toString();
              //txtID.setText(ven);
               
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtbs = new javax.swing.JTextField();
        btnBus = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApe = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnAdd2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnShow = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clientes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));

        txtbs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 270, 30));

        btnBus.setForeground(new java.awt.Color(0, 0, 255));
        btnBus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/comprobar_norm.png"))); // NOI18N
        btnBus.setBorder(null);
        btnBus.setBorderPainted(false);
        btnBus.setContentAreaFilled(false);
        btnBus.setFocusPainted(false);
        btnBus.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/comprobar_press.png"))); // NOI18N
        btnBus.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/comprobar_roll.png"))); // NOI18N
        btnBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusActionPerformed(evt);
            }
        });
        getContentPane().add(btnBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 110, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Buscar por nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, 20));

        txtNom.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });
        getContentPane().add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 200, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        txtApe.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 200, 30));

        txtTel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 200, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellidos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Télefono");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/addusergroup_1251.png"))); // NOI18N
        btnAdd.setBorder(null);
        btnAdd.setBorderPainted(false);
        btnAdd.setContentAreaFilled(false);
        btnAdd.setFocusPainted(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 100, 100));

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
        getContentPane().add(btnMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 100, 100));

        btnAdd2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user_eliminate_1102.png"))); // NOI18N
        btnAdd2.setBorder(null);
        btnAdd2.setBorderPainted(false);
        btnAdd2.setContentAreaFilled(false);
        btnAdd2.setEnabled(false);
        btnAdd2.setFocusPainted(false);
        btnAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 100, 100));

        jButton1.setForeground(new java.awt.Color(51, 255, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/salir_norm.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBotones/salir_press.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/salir_roll.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 110, 40));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Agregar");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Modificar");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Eliminar");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));

        btnShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contactlist_theuser_802.png"))); // NOI18N
        btnShow.setBorder(null);
        btnShow.setBorderPainted(false);
        btnShow.setContentAreaFilled(false);
        btnShow.setFocusPainted(false);
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });
        getContentPane().add(btnShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 100, 100));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Clientes");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoAdmin-bspline.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String nom ="", ape="", tel="";

        nom = txtNom.getText().trim();
        ape= txtApe.getText().trim();
        tel = txtTel.getText().trim();
        
        if(nom.equals("") || ape.equals("") || tel.equals("")){
          //txtNom.setBackground(Color.WHITE);
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos");
        }else{
          try{
            Connection cn = Conexion.conectar();
            PreparedStatement pat = cn.prepareStatement(
             "select nombre from clientes where nombre = '" + nom+ "'");
              ResultSet rs = pat.executeQuery();
              if(rs.next()){
              txtNom.setBackground(Color.yellow);
              JOptionPane.showMessageDialog(null," El nombre ingresado pertence a otro Cliente");
               txtNom.setBackground(Color.WHITE);
              cn.close();
              }else{
                try{
                    PreparedStatement pat2 = cn.prepareStatement(
                      "insert into clientes values(?,?,?,?)");

                      pat2.setInt(1,0);
                      pat2.setString(2,nom);
                      pat2.setString(3,ape);
                      pat2.setString(4,tel);

                     pat2.executeUpdate();
                     cn.close();
                     Limpiar();

                     JOptionPane.showMessageDialog(null,"Cliente almacenado con exito");

                    }catch(SQLException e){
                      System.err.println("Error al registrar Cliente" + e);
                      JOptionPane.showMessageDialog(null," ERROR al registrar, contacte al administrador ");
                    }
               }
             }catch(SQLException e){
                System.err.println("Error en validar el Cliente" + e);
                JOptionPane.showMessageDialog(null," ERROR al comparar Cliente, contacte al administrador ");
             }
        }
        /*if(ape.equals("")){
        
            txtApe.setBackground(Color.WHITE);
            
        }
        if(tel.equals("")){
        
            txtTel.setBackground(Color.WHITE);
            
        }*/
    
            
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new Ad_Ventas().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        String Nombre, Apellidos, Telefono;

        Nombre= txtNom.getText().trim();
        Apellidos = txtApe.getText().trim();
        Telefono = txtTel.getText().trim();

        if(Nombre.equals("") || Apellidos.equals("") || Telefono.equals("")){
           JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }else{
            try{
                Connection cn = Conexion.conectar();

                PreparedStatement pat = cn.prepareStatement(
                    "select nombre from clientes where nombre = '" + Nombre + "' and not id_cliente = '"+ ID
                     + "'");
                     ResultSet rs = pat.executeQuery();
                    System.out.println(ID);
                     if(rs.next()){
                         JOptionPane.showMessageDialog(null,"El nombre ya existe en la Base de datos");
                         cn.close();
                     }
                      else{
                            Connection cn2 = Conexion.conectar();
                            PreparedStatement pat2 = cn2.prepareStatement("update clientes set nombre=?,apellidos=?"
                                       + ",telefono=? where id_cliente = '"+ ID + "'");

                            pat2.setString(1,Nombre);
                            pat2.setString(2,Apellidos);
                            pat2.setString(3,Telefono);
                            pat2.executeUpdate();
                             cn2.close();

                             JOptionPane.showMessageDialog(null," Se ha modificado exitosamente ");
                             Limpiar();

                       }
            }catch(SQLException e){
                System.err.println("Error al actualizar Cliente" + e);
                }
        }
       /* if(Apellidos.equals("")){
          validacion++;
            JOptionPane.showMessageDialog(null, "El campo Apellidos esta vacio");
            }
        if(Telefono.equals("")){
          validacion++;
        JOptionPane.showMessageDialog(null, "El campo Télefono esta vacio");
            }
       */
    }//GEN-LAST:event_btnModActionPerformed

    private void btnBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusActionPerformed
        nombre = txtbs.getText();
        
        if(nombre.equals("")){
            JOptionPane.showMessageDialog(null, "Debe llenar el campo requerido");
            txtbs.setBackground(Color.yellow);
        }else{
            txtbs.setBackground(Color.white);
           try{
            Connection cn = Conexion.conectar();
            PreparedStatement pat = cn.prepareStatement(
            "select * from clientes where nombre = '" + nombre + "'");
             ResultSet rs = pat.executeQuery();

             if(rs.next()){
             ID = rs.getInt("id_cliente");
            //vent= String.valueOf(ID).toString();
              //txtID.setText(vent);
             txtNom.setText(rs.getString("nombre"));
             txtApe.setText(rs.getString("apellidos"));
             txtTel.setText(rs.getString("telefono"));
             
             btnAdd2.setEnabled(true);
             btnMod.setEnabled(true);
                       
             cn.close();
             }

             else{
             JOptionPane.showMessageDialog(null,"No existe el Cliente "+ nombre +" en la Base de datos" );
             Limpiar();
             }
            }catch(SQLException e){
                System.err.println("Error al cargar la información del Cliente" + e);
                JOptionPane.showMessageDialog(null," ERROR al cargar información del Cliente, contacte al administrador ");
                }
        }
    }//GEN-LAST:event_btnBusActionPerformed

    private void btnAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd2ActionPerformed
        String Nombre, Apellidos, Telefono;

        Nombre= txtNom.getText().trim();
        Apellidos = txtApe.getText().trim();
        Telefono = txtTel.getText().trim();
       
        if(Nombre.equals("") || Apellidos.equals("") || Telefono.equals("")){
               JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }else{
           try{
                Connection cn = Conexion.conectar();

                PreparedStatement pat = cn.prepareStatement(
                    "delete from clientes where nombre = '" + nombre+ "'");  
                //ResultSet rs = pat.executeQuery();
                if(JOptionPane.showConfirmDialog(this, "¿Esta seguro de borrar este cliente?") == 0){
                    pat.executeUpdate();
                    JOptionPane.showMessageDialog(null," Se ha eliminado exitosamente ");
                    Limpiar();
                }
                cn.close();
            }catch(SQLException e){
                System.err.println("Error al eliminar Cliente " + e);
                 JOptionPane.showMessageDialog(null," No se permite la eliminación del Cliente por restriccion de la BD"); 
            } 
        }
        /*if(Apellidos.equals("")){
          validacion++;
            JOptionPane.showMessageDialog(null, "El campo Correo esta vacio");
            }
        if(Telefono.equals("")){
          validacion++;
        JOptionPane.showMessageDialog(null, "El campo Télefono esta vacio");
            }*/
    }//GEN-LAST:event_btnAdd2ActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
      dispose();
      new Ad_Clientes_Show().setVisible(true);
    }//GEN-LAST:event_btnShowActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

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
            java.util.logging.Logger.getLogger(Ad_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ad_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ad_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ad_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ad_Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAdd2;
    private javax.swing.JButton btnBus;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtbs;
    // End of variables declaration//GEN-END:variables

   public void Limpiar(){
        //txtID.setText("");
        txtbs.setText("");
        txtNom.setText("");
        txtApe.setText("");
        txtTel.setText("");
        btnAdd2.setEnabled(false);
        btnMod.setEnabled(false);
    
        }
}
