/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Presupuestos;

import Controlador.OperarClientes;
import Controlador.OperarLineaPresMaterial;
import Controlador.OperarLineaPresTrabajo;
import Controlador.OperarMateriales;
import Controlador.OperarPresupuestos;
import Controlador.OperarTrabajos;
import Modelo.Cliente;
import Modelo.LineaPresMaterial;
import Modelo.LineaPresTrabajo;
import Modelo.Material;
import Modelo.Presupuesto;
import Modelo.Trabajo;
import Reportes.ReportePresupuesto;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author pfarinamoreno
 */
public class CrearPresupuesto extends javax.swing.JFrame {
    
    Vector<String> tableHeaders = new Vector <String>();
    

    /**
     * Creates new form CrearPresupuesto
     */
    public CrearPresupuesto() {
        initComponents();
        
        OperarClientes opeClie = new OperarClientes();
        List<Cliente> clientes = opeClie.listarClientes();
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        cbm.addElement("--Seleccionar Cliente--");
        for(int x =0;x<clientes.size();x++){
            String nombre = clientes.get(x).getClienteNombre();
           cbm.addElement(nombre);
        }
        cmb_cre_pre_cli.setModel(cbm);
        
        OperarMateriales opeMat = new OperarMateriales();
        List<Material> materiales = opeMat.listarMateriales();
        DefaultComboBoxModel cbm2 = new DefaultComboBoxModel();
        cbm2.addElement("--Seleccionar Material--");
        for(int x =0;x<materiales.size();x++){
            String nombre = materiales.get(x).getMaterialNombre();
           cbm2.addElement(nombre);
        }
        cmb_cre_pre_mat.setModel(cbm2);
        
        OperarTrabajos opeTra = new OperarTrabajos();
        List<Trabajo> trabajos = opeTra.listarTrabajos();
        DefaultComboBoxModel cbm3 = new DefaultComboBoxModel();
        cbm3.addElement("--Seleccionar Trabajo--");
        for(int x =0;x<trabajos.size();x++){
            String nombre = trabajos.get(x).getTrabajoNombre();
           cbm3.addElement(nombre);
        }
        cmb_cre_pre_tra.setModel(cbm3);
        
        tableHeaders.add("Concepto");
        tableHeaders.add("Precio");
        tableHeaders.add("Cantidad");
        tableHeaders.add("Subtotal");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmb_cre_pre_cli = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_cre_pre = new javax.swing.JTable();
        btm_cre_pre_imp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmb_cre_pre_mat = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_cre_pre_can_mat = new javax.swing.JTextField();
        btn_cre_pre_add_mat = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmb_cre_pre_tra = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txt_cre_pre_can_tra = new javax.swing.JTextField();
        btn_cre_pre_add_tra = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_total = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_iva = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_tot_sin_iva = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Concepto = new javax.swing.JLabel();
        txt_cre_pre_con = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Crear Presupuesto");

        jLabel2.setText("Cliente");

        cmb_cre_pre_cli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_cre_pre_cli.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_cre_pre_cliItemStateChanged(evt);
            }
        });
        cmb_cre_pre_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_cre_pre_cliActionPerformed(evt);
            }
        });

        tbl_cre_pre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Concepto", "Precio", "Cantidad", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(tbl_cre_pre);

        btm_cre_pre_imp.setText("Imprimir Presupuesto");
        btm_cre_pre_imp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_cre_pre_impActionPerformed(evt);
            }
        });

        jLabel3.setText("Material");

        cmb_cre_pre_mat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Nombre");

        jLabel5.setText("Cantidad");

        txt_cre_pre_can_mat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cre_pre_can_matActionPerformed(evt);
            }
        });

        btn_cre_pre_add_mat.setText("Añadir  Material");
        btn_cre_pre_add_mat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cre_pre_add_matActionPerformed(evt);
            }
        });

        jLabel6.setText("Mano de Obra");

        jLabel7.setText("Trabajo");

        cmb_cre_pre_tra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Horas");

        btn_cre_pre_add_tra.setText("Añadir Mano de Obra");
        btn_cre_pre_add_tra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cre_pre_add_traActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(txt_total);

        jScrollPane3.setViewportView(txt_iva);

        jScrollPane4.setViewportView(txt_tot_sin_iva);

        jLabel9.setText("Total Sin IVA");

        jLabel10.setText("IVA (21%)");

        jLabel11.setText("Total");

        Concepto.setText("Nombre Presupuesto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(Concepto)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btm_cre_pre_imp)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_cre_pre_cli, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_cre_pre_can_tra, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cmb_cre_pre_tra, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_cre_pre_can_mat, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cmb_cre_pre_mat, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_cre_pre_add_mat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_cre_pre_add_tra, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addComponent(txt_cre_pre_con, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 284, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(130, 130, 130)
                                .addComponent(jLabel10)
                                .addGap(130, 130, 130)
                                .addComponent(jLabel11)
                                .addGap(112, 112, 112))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Concepto)
                            .addComponent(txt_cre_pre_con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmb_cre_pre_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_cre_pre_mat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_cre_pre_can_mat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_cre_pre_add_mat)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmb_cre_pre_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_cre_pre_can_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_cre_pre_add_tra))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btm_cre_pre_imp)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel9))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cre_pre_can_matActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cre_pre_can_matActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cre_pre_can_matActionPerformed

    private void cmb_cre_pre_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_cre_pre_cliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_cre_pre_cliActionPerformed

    private void cmb_cre_pre_cliItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_cre_pre_cliItemStateChanged
        
    }//GEN-LAST:event_cmb_cre_pre_cliItemStateChanged

    private void btn_cre_pre_add_matActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cre_pre_add_matActionPerformed
        String clienteNombre = (String)cmb_cre_pre_cli.getSelectedItem();
        String concepto = txt_cre_pre_con.getText();
        double total = 0;
        
        OperarMateriales operarMat = new OperarMateriales();
        OperarClientes opeCli = new OperarClientes();
        OperarLineaPresMaterial opeLinMat = new OperarLineaPresMaterial();
        OperarLineaPresTrabajo opeLinTra = new OperarLineaPresTrabajo();
        OperarPresupuestos opePre = new OperarPresupuestos();
        
        if(concepto.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Antes debe introducir un Concepto");
           
            List<Cliente> clientes = opeCli.listarClientes();
            DefaultComboBoxModel cbm = new DefaultComboBoxModel();
            cbm.addElement("--Seleccionar Cliente--");
            for(int x =0;x<clientes.size();x++){
                String nombre = clientes.get(x).getClienteNombre();
               cbm.addElement(nombre);
            }
            cmb_cre_pre_cli.setModel(cbm);
            
        }else if(clienteNombre.equals("--Seleccionar Cliente--")){
            JOptionPane.showMessageDialog(rootPane, "Antes debeSeleccionar un Cliente");
        }else{
            List<Cliente> clientes = opeCli.buscarClientePorNombre(clienteNombre);
            Cliente cliente = new Cliente();
            for(int x=0;x<clientes.size();x++){
                cliente.setClienteId(clientes.get(x).getClienteId());
                cliente.setClienteNombre(clientes.get(x).getClienteNombre());
                cliente.setDniCif(clientes.get(x).getDniCif());
                cliente.setClienteDireccion(clientes.get(x).getClienteDireccion());
                cliente.setClienteTelefono(clientes.get(x).getClienteTelefono());
            }
            List<Presupuesto> presupuestosCheck = opePre.buscarPresupuesto(cliente.getClienteId(), concepto);
            if(presupuestosCheck.isEmpty()){
                opePre.crearPresupuesto(cliente, concepto, total);
            }
            
            String nombreMaterial = (String) cmb_cre_pre_mat.getSelectedItem();
            int cantidad = Integer.parseInt(txt_cre_pre_can_mat.getText());
            String nombreCliente = (String) cmb_cre_pre_cli.getSelectedItem();

            int clienteId = opeCli.buscarClienteIdPorNombre(nombreCliente);
            List<Presupuesto> presupuestos = opePre.buscarPresupuesto(clienteId, concepto);
            Presupuesto presupuesto = new Presupuesto();
            for(int x=0; x<presupuestos.size();x++){

                presupuesto.setPresupuestoId(presupuestos.get(x).getPresupuestoId());
                presupuesto.setCliente(presupuestos.get(x).getCliente());
                presupuesto.setPresupuestoTrabajo(presupuestos.get(x).getPresupuestoTrabajo());
                presupuesto.setPresupuestoTotal(presupuestos.get(x).getPresupuestoTotal());
            }

            List<Material> materiales = operarMat.buscarMaterialPorNombre(nombreMaterial);
            Material material = new Material();
            for(int x=0; x<materiales.size();x++){

                material.setMaterialNombre(materiales.get(x).getMaterialNombre());
                material.setMaterialRef(materiales.get(x).getMaterialRef());
                material.setMaterialComentario(materiales.get(x).getMaterialComentario());
                material.setMaterialPrecio(materiales.get(x).getMaterialPrecio());
            }

            String concept = material.getMaterialNombre();
            double precio = material.getMaterialPrecio();
            double subtotal = cantidad*precio;

            opeLinMat.crearLinea(material, presupuesto, concept, precio, cantidad, subtotal);

            List <LineaPresMaterial> lineasMat = opeLinMat.buscarLinea(presupuesto);
            List <LineaPresTrabajo> lineasTra = opeLinTra.buscarLinea(presupuesto);
            Vector tableData = new Vector();
            
            for(Object o : lineasMat){
                LineaPresMaterial linea = (LineaPresMaterial) o;
                Vector<Object> oneRow = new Vector<Object>();
                oneRow.add(linea.getConcepto());
                oneRow.add(linea.getPrecio());
                oneRow.add(linea.getCantidad());
                oneRow.add(linea.getSubtotal());
                tableData.add(oneRow);
            }
            
            for(Object o : lineasTra){
                LineaPresTrabajo linea = (LineaPresTrabajo) o;
                Vector<Object> oneRow = new Vector<Object>();
                oneRow.add(linea.getConcepto());
                oneRow.add(linea.getPrecio());
                oneRow.add(linea.getCantidad());
                oneRow.add(linea.getTotalLinea());
                tableData.add(oneRow);
                
            }
           
            opePre.calcularTotal(presupuesto);
            total=opePre.devolverTotal(presupuesto);
            tbl_cre_pre.setModel(new DefaultTableModel (tableData, tableHeaders));
            txt_tot_sin_iva.setText(String.valueOf(total));
            double iva = (21*total)/100;
            txt_iva.setText(String.valueOf(iva));
            txt_total.setText(String.valueOf(total+iva));
        }  
        
        
    }//GEN-LAST:event_btn_cre_pre_add_matActionPerformed

    private void btn_cre_pre_add_traActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cre_pre_add_traActionPerformed
        String nombreTrabajo = (String) cmb_cre_pre_tra.getSelectedItem();
        int cantidad = Integer.parseInt(txt_cre_pre_can_tra.getText());
        String clienteNombre = (String) cmb_cre_pre_cli.getSelectedItem();
        String concepto = txt_cre_pre_con.getText();
        double total = 0;
        
        OperarTrabajos opeTra = new OperarTrabajos();
        OperarClientes opeCli = new OperarClientes();
        OperarLineaPresMaterial opeLinMat = new OperarLineaPresMaterial();
        OperarLineaPresTrabajo opeLinTra = new OperarLineaPresTrabajo();
        OperarPresupuestos opePre = new OperarPresupuestos();

        
        if(concepto.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Antes debe introducir un Concepto");
           
            List<Cliente> clientes = opeCli.listarClientes();
            DefaultComboBoxModel cbm = new DefaultComboBoxModel();
            cbm.addElement("--Seleccionar Cliente--");
            for(int x =0;x<clientes.size();x++){
                String nombre = clientes.get(x).getClienteNombre();
               cbm.addElement(nombre);
            }
            cmb_cre_pre_cli.setModel(cbm);
            
        }else if(clienteNombre.equals("--Seleccionar Cliente--")){
            JOptionPane.showMessageDialog(rootPane, "Antes debeSeleccionar un Cliente");
        }else{
            List<Cliente> clientes = opeCli.buscarClientePorNombre(clienteNombre);
            Cliente cliente = new Cliente();
            for(int x=0;x<clientes.size();x++){
                cliente.setClienteId(clientes.get(x).getClienteId());
                cliente.setClienteNombre(clientes.get(x).getClienteNombre());
                cliente.setDniCif(clientes.get(x).getDniCif());
                cliente.setClienteDireccion(clientes.get(x).getClienteDireccion());
                cliente.setClienteTelefono(clientes.get(x).getClienteTelefono());
            }
        
            List<Presupuesto> presupuestosCheck = opePre.buscarPresupuesto(cliente.getClienteId(), concepto);
                if(presupuestosCheck.isEmpty()){
                    opePre.crearPresupuesto(cliente, concepto, total);
                }

            int clienteId = opeCli.buscarClienteIdPorNombre(clienteNombre);
            List<Presupuesto> presupuestos = opePre.buscarPresupuesto(clienteId, concepto);
            Presupuesto presupuesto = new Presupuesto();
            for(int x=0; x<presupuestos.size();x++){
                presupuesto.setPresupuestoId(presupuestos.get(x).getPresupuestoId());
                presupuesto.setCliente(presupuestos.get(x).getCliente());
                presupuesto.setPresupuestoTrabajo(presupuestos.get(x).getPresupuestoTrabajo());
                presupuesto.setPresupuestoTotal(presupuestos.get(x).getPresupuestoTotal());
            }

            List<Trabajo> trabajos = opeTra.buscarTrabajoPorNombre(nombreTrabajo);
            Trabajo trabajo= new Trabajo();
            for(int x=0;x<trabajos.size();x++){
                trabajo.setTrabajoNombre(trabajos.get(x).getTrabajoNombre());
                trabajo.setTrabajoId(trabajos.get(x).getTrabajoId());
                trabajo.setTrabajoDescripcion(trabajos.get(x).getTrabajoDescripcion());
                trabajo.setPrecioHora(trabajos.get(x).getPrecioHora());
            }

            String concept = trabajo.getTrabajoNombre();
            double precio = trabajo.getPrecioHora();
            double subtotal = cantidad*precio;

            opeLinTra.crearLinea(trabajo, presupuesto, concept, precio, cantidad, subtotal);

            List <LineaPresTrabajo> lineasTra = opeLinTra.buscarLinea(presupuesto);
            List <LineaPresMaterial> lineasMat = opeLinMat.buscarLinea(presupuesto);
            Vector tableData = new Vector();
            
            for(Object o : lineasMat){
                LineaPresMaterial linea = (LineaPresMaterial) o;
                Vector<Object> oneRow = new Vector<Object>();
                oneRow.add(linea.getConcepto());
                oneRow.add(linea.getPrecio());
                oneRow.add(linea.getCantidad());
                oneRow.add(linea.getSubtotal());
                tableData.add(oneRow);
            }
            
            for(Object o : lineasTra){
                LineaPresTrabajo linea = (LineaPresTrabajo) o;
                Vector<Object> oneRow = new Vector<Object>();
                oneRow.add(linea.getConcepto());
                oneRow.add(linea.getPrecio());
                oneRow.add(linea.getCantidad());
                oneRow.add(linea.getTotalLinea());
                tableData.add(oneRow);
                
            }
            opePre.calcularTotal(presupuesto);
            total=opePre.devolverTotal(presupuesto);
            tbl_cre_pre.setModel(new DefaultTableModel (tableData, tableHeaders));    
            txt_tot_sin_iva.setText(String.valueOf(total));
            double iva = (21*total)/100;
            txt_iva.setText(String.valueOf(iva));
            txt_total.setText(String.valueOf(total+iva));
        }
    }//GEN-LAST:event_btn_cre_pre_add_traActionPerformed

    private void btm_cre_pre_impActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_cre_pre_impActionPerformed
        List<ReportePresupuesto> lista = new ArrayList<ReportePresupuesto>();
        String clienteNombre = (String) cmb_cre_pre_cli.getSelectedItem();
        String concepto = txt_cre_pre_con.getText();
        
        OperarClientes opeCli = new OperarClientes();
        OperarLineaPresMaterial opeLinMat = new OperarLineaPresMaterial();
        OperarLineaPresTrabajo opeLinTra = new OperarLineaPresTrabajo();
        OperarPresupuestos opePre = new OperarPresupuestos();
        
        List<Cliente> clientes = opeCli.buscarClientePorNombre(clienteNombre);
        Cliente cliente = new Cliente();
        for(int x=0;x<clientes.size();x++){
            cliente.setClienteId(clientes.get(x).getClienteId());
            cliente.setClienteNombre(clientes.get(x).getClienteNombre());
            cliente.setDniCif(clientes.get(x).getDniCif());
            cliente.setClienteDireccion(clientes.get(x).getClienteDireccion());
            cliente.setClienteTelefono(clientes.get(x).getClienteTelefono());
        }
        
        int clienteId = opeCli.buscarClienteIdPorNombre(clienteNombre);
        List<Presupuesto> presupuestos = opePre.buscarPresupuesto(clienteId, concepto);
        Presupuesto presupuesto = new Presupuesto();
        for(int x=0; x<presupuestos.size();x++){
            presupuesto.setPresupuestoId(presupuestos.get(x).getPresupuestoId());
            presupuesto.setCliente(presupuestos.get(x).getCliente());
            presupuesto.setPresupuestoTrabajo(presupuestos.get(x).getPresupuestoTrabajo());
            presupuesto.setPresupuestoTotal(presupuestos.get(x).getPresupuestoTotal());
        }
        
        ReportePresupuesto reporte1 = new ReportePresupuesto(presupuesto.getPresupuestoId(), presupuesto.getPresupuestoTrabajo(), cliente.getClienteNombre(), cliente.getDniCif(), cliente.getClienteDireccion(),cliente.getClienteTelefono());
        lista.add(reporte1); 
        
        List<LineaPresMaterial> lineasMat = opeLinMat.buscarLinea(presupuesto);
        for(Object o : lineasMat){
            LineaPresMaterial linea = (LineaPresMaterial) o;
            if(linea.getCantidad()!=0){
                ReportePresupuesto reporte = new ReportePresupuesto(linea.getConcepto(),linea.getPrecio(), linea.getCantidad(), linea.getSubtotal());
                lista.add(reporte);  
            }
        }
       
        List<LineaPresTrabajo> lineasTra = opeLinTra.buscarLinea(presupuesto);
        for(Object o : lineasTra){
            LineaPresTrabajo linea = (LineaPresTrabajo) o;
            if(linea.getCantidad()!=0){
                ReportePresupuesto reporte = new ReportePresupuesto(linea.getConcepto(),linea.getPrecio(), linea.getCantidad(), linea.getTotalLinea());
                lista.add(reporte);
            }
        }
        
        double total;
        total = presupuesto.getPresupuestoTotal();
        double iva =  total*21/100;
        double totalIva = total + iva;
        ReportePresupuesto reporte2 = new ReportePresupuesto(total, iva, totalIva);
        lista.add(reporte2); 
        
        
        File file = new File("src\\Reportes\\ReportePresupuesto.jasper");
        try{
            JasperReport reporte = (JasperReport) JRLoader.loadObject(file);//JasperCompileManager.compileReport("src/Reportes/ReportePresupuesto.jrxml");
            JasperPrint  print = JasperFillManager.fillReport(reporte, null, new JRBeanCollectionDataSource(lista));
            JasperViewer view = new JasperViewer(print, false);
            view.setVisible(true);
            view.setTitle("Presupuesto:");
        }catch(JRException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btm_cre_pre_impActionPerformed

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
            java.util.logging.Logger.getLogger(CrearPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearPresupuesto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Concepto;
    private javax.swing.JButton btm_cre_pre_imp;
    private javax.swing.JButton btn_cre_pre_add_mat;
    private javax.swing.JButton btn_cre_pre_add_tra;
    private javax.swing.JComboBox<String> cmb_cre_pre_cli;
    private javax.swing.JComboBox<String> cmb_cre_pre_mat;
    private javax.swing.JComboBox<String> cmb_cre_pre_tra;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tbl_cre_pre;
    private javax.swing.JTextField txt_cre_pre_can_mat;
    private javax.swing.JTextField txt_cre_pre_can_tra;
    private javax.swing.JTextField txt_cre_pre_con;
    private javax.swing.JTextPane txt_iva;
    private javax.swing.JTextPane txt_tot_sin_iva;
    private javax.swing.JTextPane txt_total;
    // End of variables declaration//GEN-END:variables
}
