/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class NotasIF extends javax.swing.JInternalFrame {

    /**
     * Creates new form Evaluación
     */
    public NotasIF() {
        initComponents();
    }
    
//     private void limpiar(){
//        cbxFecha.removeAllItems();        
//    }
//    
//    private void Deshabilitar() {        
//        cbxFecha.setEnabled(false);
//    }
//    
//    private void Habilitar(){
//        cbxFecha.setEnabled(true);
//        cbxFecha.requestFocus();
//    }
//    
//    private void BotonesInicio(){
//        btnGuardar.setEnabled(true);
//        btnModificar.setEnabled(true);
//        btnActualizar.setEnabled(false);
//        btnEliminar.setEnabled(false);        
//        btnCancelar.setEnabled(true);
//    }
//    
//    private void BotonesModificar(){
//        btnGuardar.setEnabled(false);
//        btnModificar.setEnabled(false);
//        btnActualizar.setEnabled(true);
//        btnEliminar.setEnabled(true);        
//        btnCancelar.setEnabled(true);
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Evaluación"));

        jLabel1.setText("Evaluación");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addGap(12, 12, 12)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir)))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar)
                    .addComponent(btnCancelar)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
//        limpiar();
//        Deshabilitar();
//        LlenarTabla();
//        BotonesInicio();
//    }//GEN-LAST:event_btnCancelarActionPerformed
 private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {}
 
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Desea Salir?","Confirmar",
            JOptionPane.OK_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
        if(i==JOptionPane.OK_OPTION){
            this.doDefaultCloseAction();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
//        if (validar()==true){
//            int i = JOptionPane.showConfirmDialog(null, "Desea Actualizar?","Confirmar",
//                JOptionPane.OK_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
//            if(i==JOptionPane.OK_OPTION){
//                cnx.Conecta();
//                try{
//                    String SQL ="update asignatura set nombreA=?,"
//                    + "grupo=?,anio=?,periodo=?,"
//                    + "idcarrera=? where idasignatura=?";
//                    int fila = tblAsignatura.getSelectedRow();
//                    String dato = (String)tblAsignatura.getValueAt(fila, 0);
//                    PreparedStatement ps = cnx.conn.prepareStatement(SQL);
//                    ps.setString(1, txtAsignatura.getText().trim());
//                    ps.setString(2, txtCodigoGrupo.getText().trim());
//                    ps.setString(3, txtAnio.getText().trim());
//                    ps.setString(4, txtPeriodo.getText().trim());
//                    ps.setInt(5, c.consultaId((String)cbxCarrera.getSelectedItem()));
//                    ps.setString(6, dato);
//
//                    int n = ps.executeUpdate();
//                    if(n>0){
//                        JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
//                    }
//                }catch(SQLException | HeadlessException e){
//                    JOptionPane.showMessageDialog(null, "Error Actulizar: " + e.getMessage());
//                } finally {
//                    LlenarTabla();
//                    limpiar();
//                    Deshabilitar();
//                    BotonesInicio();
//                    cnx.Desconecta();
//                }
//            }
//        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
//        int i = JOptionPane.showConfirmDialog(null, "Desea Eliminar?","Confirmar",
//            JOptionPane.OK_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
//        if(i==JOptionPane.OK_OPTION){
//            int fila = tblAsignatura.getSelectedRow();
//            cnx.Conecta();
//            try {
//                String SQL = "delete from asignatura where idasignatura= " + tblAsignatura.getValueAt(fila, 0);
//                stm = cnx.conn.createStatement();
//                int n = stm.executeUpdate(SQL);
//                if(n>0){
//                    JOptionPane.showMessageDialog(null, "Datos eliminados correctamente");
//                }
//            } catch(SQLException | HeadlessException e){
//                JOptionPane.showMessageDialog(null, "Error Eliminar: " + e.getMessage());
//            } finally {
//                limpiar();
//                LlenarTabla();
//                Deshabilitar();
//                BotonesInicio();
//                cnx.Desconecta();
//            }
//        }
//    }//GEN-LAST:event_btnEliminarActionPerformed
//
    }
//    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
//        if (validar()==true){
//            int i = JOptionPane.showConfirmDialog(null, "Desea Guardar?","Confirmar",
//                JOptionPane.OK_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
//            if(i==JOptionPane.OK_OPTION){
//                cnx.Conecta();
//                try {
//                    String SQL = "insert into asignatura(nombreA,"
//                    + "grupo,periodo,anio,idcarrera) "
//                    + "values(?,?,?,?,?)";
//                    PreparedStatement ps = cnx.conn.prepareStatement(SQL);
//                    ps.setString(1, txtAsignatura.getText().trim());
//                    ps.setString(2, txtCodigoGrupo.getText().trim());
//                    ps.setString(3, txtPeriodo.getText().trim());
//                    ps.setString(4, txtAnio.getText().trim());
//                    ps.setInt(5, c.consultaId(cbxCarrera.getSelectedItem().toString()));
//                    int n = ps.executeUpdate();
//                    if (n>0){
//                        JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
//                    }
//                } catch(SQLException | HeadlessException e){
//                    JOptionPane.showMessageDialog(null, "Error Guardar: " + e.getMessage());
//                } finally {
//                    LlenarTabla();
//                    limpiar();
//                    Deshabilitar();
//                    BotonesInicio();
//                    cnx.Desconecta();
//                }
//            }
//        }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {
    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
