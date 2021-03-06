package GUI;

import clases.Universidad;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import util.Conecta;

/**
 *
 * @author PabloAntonio
 */
public class RepUniversidadesIF extends javax.swing.JInternalFrame {
    public Connection conn;
    JasperReport reporte;
    JasperPrint jasperprint;
    Statement stm;
    Conecta cnx = new Conecta();
    DefaultComboBoxModel modeloCombo;
    ResultSet rs;
    Universidad u = new Universidad();
    
    
    /**
     * Creates new form repUniversidadIF
     */
    public RepUniversidadesIF() {
        initComponents();        
    }
    
    public void reporteU() {       
        try {
            Class.forName("org.sqlite.JDBC"); //driver a utilizar                       
            conn=DriverManager.getConnection("jdbc:sqlite:cnae.sqlite");
            
            File f1 = new File("src/reportes/repUniversidad.jasper");            
            String template = f1.getPath();
            reporte = (JasperReport) JRLoader. loadObject(template);                                    
            
            jasperprint = JasperFillManager.fillReport(reporte, null, conn);
            JasperViewer visor=new JasperViewer(jasperprint,false);
            visor.setTitle("Universidades - CNAE");
            visor.setVisible(true);
        } catch (JRException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en Reporte Universidad: " + e.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(RepUniversidadesIF.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void reporteUDet() {       
        try {
            Class.forName("org.sqlite.JDBC"); //driver a utilizar                       
            conn=DriverManager.getConnection("jdbc:sqlite:cnae.sqlite");
            
            int Univer = u.consultaIdU(cbUniversidad.getSelectedItem().toString());            
            
            File f1 = new File("src/reportes/repCarrera.jasper");            
            String template = f1.getPath();
            reporte = (JasperReport) JRLoader. loadObject(template);                                    
            
            Map parametros = new HashMap<>();
            parametros.put("iduniv", Univer);
            
            JOptionPane.showMessageDialog(null, "El valor de iduniv: " + parametros);
            
            jasperprint = JasperFillManager.fillReport(reporte, parametros, conn);
            JasperViewer visor=new JasperViewer(jasperprint,false);
            visor.setTitle("Universidades - CNAE");
            visor.setVisible(true);
        } catch (JRException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en Reporte Universidad: " + e.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(RepUniversidadesIF.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
        public final void llenarCB() {
        cnx.Conecta();
        try {            
            modeloCombo = new DefaultComboBoxModel();            
            String SQL = "select nombreU from universidad";
            stm = cnx.conn.createStatement();            
            rs = stm.executeQuery(SQL);
            while (rs.next()) {
                modeloCombo.addElement(rs.getObject("nombreU"));
            }
            rs.close();
            cbUniversidad.setModel(modeloCombo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error LlenarCB: " + ex.getMessage());
        } finally {
            cnx.Desconecta();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnEjecutar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cbUniversidad = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        rbDetalle = new javax.swing.JRadioButton();
        rbListado = new javax.swing.JRadioButton();

        setTitle("Reporte de Universidades");
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Universidad"));

        cbUniversidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbUniversidad.setEnabled(false);

        jLabel1.setText("Universidad");

        buttonGroup1.add(rbDetalle);
        rbDetalle.setText("Detalle");
        rbDetalle.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbDetalleItemStateChanged(evt);
            }
        });

        buttonGroup1.add(rbListado);
        rbListado.setText("Listado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbDetalle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cbUniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbListado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbUniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(rbDetalle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbListado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEjecutar)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Desea Salir del Informe?","Confirmar",
            JOptionPane.OK_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
        if(i==JOptionPane.OK_OPTION){
            this.doDefaultCloseAction();  
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
       
        if(rbDetalle.isSelected()==true){
            this.reporteUDet();
        } else{
            this.reporteU();
        }        
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void rbDetalleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbDetalleItemStateChanged
        if(rbDetalle.isSelected()==true){
            cbUniversidad.setEnabled(true);
            llenarCB();
            //codigo para llenar el combobox
        } else{
            cbUniversidad.setEnabled(false);
//            this.reporteU();
        }
    }//GEN-LAST:event_rbDetalleItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEjecutar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbUniversidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbDetalle;
    private javax.swing.JRadioButton rbListado;
    // End of variables declaration//GEN-END:variables
}
