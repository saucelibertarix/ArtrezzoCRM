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
public class ModificarTrabajo extends javax.swing.JFrame {

    /**
     * Creates new form ModificarClierte
     */
    public ModificarTrabajo() {
        initComponents();
        
        OperarTrabajos opeTra = new OperarTrabajos();
        List<Trabajo> trabajos = opeTra.listarTrabajos();
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        cbm.addElement("--Seleccionar Trabajo--");
        for(int x =0;x<trabajos.size();x++){
            String nombre = trabajos.get(x).getTrabajoNombre();
           cbm.addElement(nombre);
        }
        cmb_mod_tra.setModel(cbm);
        
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
        cmb_mod_tra = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txt_mod_tra_nom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_mod_tra_pre = new javax.swing.JTextField();
        btn_mod_tra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_mod_tra = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_mod_tra_des = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Modificar Trabajo");

        label2.setText("Trabajo");

        cmb_mod_tra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_mod_tra.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_mod_traItemStateChanged(evt);
            }
        });

        jLabel3.setText("Nuevo Nombre");

        jLabel4.setText("Nueva  Descripcion");

        jLabel5.setText("Nueva Dirección");

        btn_mod_tra.setText("Modificar Trabajo");
        btn_mod_tra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mod_traActionPerformed(evt);
            }
        });

        tbl_mod_tra.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_mod_tra);

        txt_mod_tra_des.setColumns(20);
        txt_mod_tra_des.setRows(5);
        jScrollPane2.setViewportView(txt_mod_tra_des);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmb_mod_tra, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(0, 67, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_mod_tra_pre, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(113, 113, 113))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addComponent(btn_mod_tra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                    .addComponent(txt_mod_tra_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(cmb_mod_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_mod_tra_pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(btn_mod_tra)
                .addGap(57, 57, 57))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(174, 174, 174)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txt_mod_tra_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(301, Short.MAX_VALUE)))
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

    private void cmb_mod_traItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_mod_traItemStateChanged
        String nombreTrabajo = (String)cmb_mod_tra.getSelectedItem();
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
        tbl_mod_tra.setModel(new DefaultTableModel (tableData, tableHeaders));
    }//GEN-LAST:event_cmb_mod_traItemStateChanged

    private void btn_mod_traActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mod_traActionPerformed
       String nombreTrabajo = (String)cmb_mod_tra.getSelectedItem();
       OperarTrabajos opeTra = new OperarTrabajos();
       int idTrabajo = opeTra.buscarTrabajoIdPorNombre(nombreTrabajo);
       String nuevoNombre = txt_mod_tra_nom.getText();
       String nuevaDescripcion = txt_mod_tra_des.getText();
       String nuevoPrecio =txt_mod_tra_pre.getText();
       double nuevoPre;
       if(nuevoPrecio.isEmpty()){
           nuevoPre=0;
       }else{
           nuevoPre = Double.parseDouble(nuevoPrecio);
       }
       String nuevaDirec = txt_mod_tra_pre.getText();
       opeTra.modificarTrabajo(idTrabajo, nuevoNombre, nuevaDescripcion, nuevoPre);
       
        txt_mod_tra_nom.setText("");
        txt_mod_tra_des.setText("");
        txt_mod_tra_pre.setText("");
        
        
        List<Trabajo> trabajos = opeTra.listarTrabajos();
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        cbm.addElement("--Seleccionar Trabajo--");
        for(int x =0;x<trabajos.size();x++){
            String nombre = trabajos.get(x).getTrabajoNombre();
           cbm.addElement(nombre);
        }
        cmb_mod_tra.setModel(cbm);
       
       Vector<String> tableHeaders = new Vector <String>();
        Vector tableData = new Vector();
        tableHeaders.add("Nombre");
        tableHeaders.add("Descripción");
        tableHeaders.add("Precio/Hora");
        tbl_mod_tra.setModel(new DefaultTableModel (tableData, tableHeaders));
    }//GEN-LAST:event_btn_mod_traActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ModificarTrabajo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_mod_tra;
    private javax.swing.JComboBox<String> cmb_mod_tra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label2;
    private javax.swing.JTable tbl_mod_tra;
    private javax.swing.JTextArea txt_mod_tra_des;
    private javax.swing.JTextField txt_mod_tra_nom;
    private javax.swing.JTextField txt_mod_tra_pre;
    // End of variables declaration//GEN-END:variables
}