/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Administrar.Trabajos;


import Controlador.OperarClientes;
import Controlador.OperarTrabajos;
import Modelo.Cliente;
import Modelo.Trabajo;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pfarinamoreno
 */
public class BorrarTrabajo extends javax.swing.JFrame {

    /**
     * Creates new form ModificarClierte
     */
    public BorrarTrabajo() {
        initComponents();
        
        OperarTrabajos opeTra = new OperarTrabajos();
        List<Trabajo> trabajos = opeTra.listarTrabajos();
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        cbm.addElement("--Seleccionar Trabajo--");
        for(int x =0;x<trabajos.size();x++){
            String nombre = trabajos.get(x).getTrabajoNombre();
           cbm.addElement(nombre);
        }
        cmb_brr_tra.setModel(cbm);
        
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
        cmb_brr_tra = new javax.swing.JComboBox<>();
        btn_brr_tra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_brr_tra = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Borrar Trabajo");

        label2.setText("Trabajo");

        cmb_brr_tra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_brr_tra.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_brr_traItemStateChanged(evt);
            }
        });

        btn_brr_tra.setText("Borrar Trabajo");
        btn_brr_tra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_brr_traActionPerformed(evt);
            }
        });

        tbl_brr_tra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Descripción", "Precio/Hora"
            }
        ));
        jScrollPane1.setViewportView(tbl_brr_tra);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmb_brr_tra, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(btn_brr_tra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2)
                    .addComponent(cmb_brr_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_brr_tra)
                .addContainerGap(39, Short.MAX_VALUE))
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

    private void cmb_brr_traItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_brr_traItemStateChanged
        String nombreTrabajo = (String)cmb_brr_tra.getSelectedItem();
        String vacio;
        OperarTrabajos opeTra = new OperarTrabajos();
        List<Trabajo> trabajos = opeTra.buscarTrabajoPorNombre(nombreTrabajo);
        Vector<String> tableHeaders = new Vector <String>();
        Vector tableData = new Vector();
        tableHeaders.add("Nombre");
        tableHeaders.add("Descripción");
        tableHeaders.add("Precio/Hora");


        for (Object o : trabajos){
                Trabajo trabajo = (Trabajo) o;
                Vector<Object> oneRow = new Vector<Object>();

                oneRow.add(trabajo.getTrabajoNombre());
                oneRow.add(trabajo.getTrabajoDescripcion());
                oneRow.add(trabajo.getPrecioHora());
                tableData.add(oneRow);
        }
        tbl_brr_tra.setModel(new DefaultTableModel (tableData, tableHeaders));
    
    }//GEN-LAST:event_cmb_brr_traItemStateChanged

    private void btn_brr_traActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_brr_traActionPerformed
        String nombreTrabajo = (String)cmb_brr_tra.getSelectedItem();
        OperarTrabajos opeTra = new OperarTrabajos();
        int idTrabajo = opeTra.buscarTrabajoIdPorNombre(nombreTrabajo);

        opeTra.borrarTrabajo(idTrabajo);

        List<Trabajo> trabajos = opeTra.listarTrabajos();
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        cbm.addElement("--Seleccionar Trabajo--");
        for(int x =0;x<trabajos.size();x++){
            String nombre = trabajos.get(x).getTrabajoNombre();
           cbm.addElement(nombre);
        }
        cmb_brr_tra.setModel(cbm);
       
        Vector<String> tableHeaders = new Vector <String>();
        Vector tableData = new Vector();
        tableHeaders.add("Nombre");
        tableHeaders.add("Descripción");
        tableHeaders.add("Precio/Hora");
        tbl_brr_tra.setModel(new DefaultTableModel (tableData, tableHeaders));
    }//GEN-LAST:event_btn_brr_traActionPerformed

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
            java.util.logging.Logger.getLogger(BorrarTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrarTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrarTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrarTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new BorrarTrabajo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_brr_tra;
    private javax.swing.JComboBox<String> cmb_brr_tra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label2;
    private javax.swing.JTable tbl_brr_tra;
    // End of variables declaration//GEN-END:variables
}
