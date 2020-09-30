
package dulceria;
import java.sql.*;
import Clases.Conexion;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class Usuarios_Busqueda extends javax.swing.JFrame {

    String user;
   public static String user_update = "";
   
   DefaultTableModel model = new DefaultTableModel();
    public Usuarios_Busqueda() {
        initComponents();
         user = Login.user;
          setSize(800,482);
        setResizable(false);
        this.setLocationRelativeTo(null);//centrar las ventanas
         setIconImage (new ImageIcon(getClass().getResource("mentita.jpg")).getImage());
 
        setTitle("Empleados registrados - Sesión de "+ user);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        try{
        
            Connection cn = Conexion.conectar();
             PreparedStatement pat = cn.prepareStatement(
              "select id_usuario, nombre, apellidos, edad, sexo, telefono, puesto, usuario from usuarios");
            ResultSet rs= pat.executeQuery();
            
            table_muestra = new JTable(model);
            jScrollPane1.setViewportView(table_muestra);
            
            model.addColumn("Id_Usuarios");
            model.addColumn("Nombre");
            model.addColumn("Apellidos");
            model.addColumn("Edad");
            model.addColumn("Sexo");
            model.addColumn("Teléfono");
            model.addColumn("Puesto");
            model.addColumn("Usuario");
            while(rs.next()){
            Object [] filas = new Object[8];
            
                for (int i = 0; i < 8; i++) {
                    filas[i] = rs.getObject(i + 1);
                    }
                model.addRow(filas);
                }
                    cn.close();
            
            }catch(SQLException e){
            System.err.println("No se pudo mostrar la tabla" + e);
            
            JOptionPane.showMessageDialog(null, "Error al mostrar la información / Contacte al Administrador");
                }
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_muestra = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_muestra.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table_muestra);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 800, 235));
        jScrollPane1.getAccessibleContext().setAccessibleName("");

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExit.setText("Salir");
        btnExit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 100, 30));

        btnConsultar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 100, 30));

        txtBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 160, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Puesto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 60, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Empleados Registrados");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoAdmin-bspline.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
                dispose();
                new Admin_Empleados().setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
limpiarTabla();
       String cons=""; int validacion=0;
      cons=txtBuscar.getText().trim();
      
      if(txtBuscar.getText().equals("")){
      validacion++;
        
      }
      if(validacion == 0){
      try{
        Connection cn2 = Conexion.conectar();
           PreparedStatement pat2 = cn2.prepareStatement(
           "select id_usuario, nombre, apellidos, edad, sexo, telefono, puesto, usuario from usuarios"
                   + " where puesto = '"+ cons +"'");
      
           ResultSet rs= pat2.executeQuery();
        
            jScrollPane1.setViewportView(table_muestra);
        
            while(rs.next()){
            Object [] filas = new Object[8];
            
                for (int i = 0; i < 8; i++) {
                    filas[i] = rs.getObject(i + 1);
                    }
                model.addRow(filas);
                }
           
        
           cn2.close();
            }catch(SQLException e){
            System.err.println("No se pudo mostrar la tabla" + e);
            
            JOptionPane.showMessageDialog(null, "Error al mostrar la información / Contacte al Administrador");
                }
      
      }else{
      
      JOptionPane.showMessageDialog(null,"Debes de llenar el campo");
      
      
      }
                
   
         
        
        
    }//GEN-LAST:event_btnConsultarActionPerformed
public void limpiarTabla(){
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i=i-1;
        }
    }
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios_Busqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_muestra;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
