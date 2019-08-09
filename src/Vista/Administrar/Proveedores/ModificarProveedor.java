/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Administrar.Proveedores;

import Controlador.OperarClientes;
import Controlador.OperarProveedor;
import Modelo.Cliente;
import Modelo.Proveedor;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class ModificarProveedor extends javax.swing.JFrame {

    /**
     * Creates new form ModificarClierte
     */
    public ModificarProveedor() {
        initComponents();
        
        OperarProveedor opePro = new OperarProveedor();
        List<Proveedor> proveedores = opePro.listarProveedores();
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        cbm.addElement("--Seleccionar Proveedor--");
        for(int x =0;x<proveedores.size();x++){
           String nombre = proveedores.get(x).getProveedorNombre();
           cbm.addElement(nombre);
        }
        cmb_mod_pro.setModel(cbm);
        
    }

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
        label2 = new javax.swing.JLabel();
        cmb_mod_pro = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txt_mod_pro_nom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_mod_pro_cif = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_mod_pro_dir = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_mod_pro_tel = new javax.swing.JTextField();
        btn_mod_pro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_mod_pro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Modificar Proveedor");

        label2.setText("Proveedor");

        cmb_mod_pro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_mod_pro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_mod_proItemStateChanged(evt);
            }
        });

        jLabel3.setText("Nuevo Nombre");

        jLabel4.setText("Nuevo CIF");

        jLabel5.setText("Nueva Dirección");

        jLabel6.setText("Nuevo Teléfono");

        txt_mod_pro_tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mod_pro_telActionPerformed(evt);
            }
        });

        btn_mod_pro.setText("Modificar Proveedor");
        btn_mod_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mod_proActionPerformed(evt);
            }
        });

        tbl_mod_pro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "CIF", "Dirección", "Teléfono"
            }
        ));
        jScrollPane1.setViewportView(tbl_mod_pro);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmb_mod_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(0, 33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_mod_pro)
                .addGap(62, 62, 62))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_mod_pro_cif, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                            .addComponent(txt_mod_pro_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_mod_pro_dir, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                .addComponent(txt_mod_pro_nom))))
                    .addGap(113, 113, 113)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2)
                    .addComponent(cmb_mod_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                .addComponent(btn_mod_pro)
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(174, 174, 174)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txt_mod_pro_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txt_mod_pro_cif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txt_mod_pro_dir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txt_mod_pro_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(175, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_mod_pro_telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mod_pro_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mod_pro_telActionPerformed

    private void cmb_mod_proItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_mod_proItemStateChanged
        String nombrePro = (String)cmb_mod_pro.getSelectedItem();
        String vacio;
        OperarProveedor opePro = new OperarProveedor();
        List<Proveedor> proveedores = opePro.buscarProveedorPorNombre(nombrePro);
        Vector<String> tableHeaders = new Vector <String>();
        Vector tableData = new Vector();
        tableHeaders.add("Nombre");
        tableHeaders.add("CIF");
        tableHeaders.add("Dirección");
        tableHeaders.add("Teléfono");


        for (Object o : proveedores){
                Proveedor proveedor = (Proveedor) o;
                Vector<Object> oneRow = new Vector<Object>();

                oneRow.add(proveedor.getProveedorNombre());
                oneRow.add(proveedor.getCif());
                oneRow.add(proveedor.getProveedorDireccion());
                oneRow.add(proveedor.getProveedorTelefono());
                tableData.add(oneRow);
        }
        tbl_mod_pro.setModel(new DefaultTableModel (tableData, tableHeaders));
    }//GEN-LAST:event_cmb_mod_proItemStateChanged

    private void btn_mod_proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mod_proActionPerformed
       String nombrePro = (String)cmb_mod_pro.getSelectedItem();
       OperarProveedor opePro = new OperarProveedor();
       int idPro = opePro.buscarProveedorIdPorNombre(nombrePro);
       String nuevoNombre = txt_mod_pro_nom.getText();
       String nuevoCif = txt_mod_pro_cif.getText();
       String nuevoTelefono =txt_mod_pro_tel.getText();
       int nuevoTel;
       if(nuevoTelefono.isEmpty()){
           nuevoTel=0;
       }else{
           nuevoTel = Integer.parseInt(nuevoTelefono);
       }
       String nuevaDirec = txt_mod_pro_dir.getText();
       opePro.modificarProveedor(idPro, nuevoNombre, nuevoCif, nuevoTel, nuevaDirec);
       
        txt_mod_pro_nom.setText("");
        txt_mod_pro_cif.setText("");
        txt_mod_pro_tel.setText("");
        txt_mod_pro_dir.setText("");
        
        
        List<Proveedor> proveedores = opePro.listarProveedores();
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        cbm.addElement("--Seleccionar Proveedor--");
        for(int x =0;x<proveedores.size();x++){
           String nombre = proveedores.get(x).getProveedorNombre();
           cbm.addElement(nombre);
        }
        cmb_mod_pro.setModel(cbm);
       
        Vector<String> tableHeaders = new Vector <String>();
        Vector tableData = new Vector();
        tableHeaders.add("Nombre");
        tableHeaders.add("CIF");
        tableHeaders.add("Dirección");
        tableHeaders.add("Teléfono");
        tbl_mod_pro.setModel(new DefaultTableModel (tableData, tableHeaders));
    }//GEN-LAST:event_btn_mod_proActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_mod_pro;
    private javax.swing.JComboBox<String> cmb_mod_pro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label2;
    private javax.swing.JTable tbl_mod_pro;
    private javax.swing.JTextField txt_mod_pro_cif;
    private javax.swing.JTextField txt_mod_pro_dir;
    private javax.swing.JTextField txt_mod_pro_nom;
    private javax.swing.JTextField txt_mod_pro_tel;
    // End of variables declaration//GEN-END:variables
}
