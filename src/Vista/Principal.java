/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.OperarClientes;
import Vista.Administrar.*;
import Vista.Administrar.Clientes.BorrarCliente;
import Vista.Administrar.Clientes.CrearCliente;
import Vista.Administrar.Clientes.BuscarClientes;
import Vista.Administrar.Clientes.ModificarCliente;
import Vista.Administrar.Materiales.BorrarMaterial;
import Vista.Administrar.Materiales.BuscarMateriales;
import Vista.Administrar.Materiales.CrearMaterial;
import Vista.Administrar.Materiales.ModificarMaterial;
import Vista.Administrar.Proveedores.BorrarProveedor;
import Vista.Administrar.Proveedores.BuscarProveedor;
import Vista.Administrar.Proveedores.CrearProveedor;
import Vista.Administrar.Proveedores.ModificarProveedor;
import Vista.Administrar.Trabajos.BorrarTrabajo;
import Vista.Administrar.Trabajos.BuscarTrabajos;
import Vista.Administrar.Trabajos.CrearTrabajo;
import Vista.Administrar.Trabajos.ModificarTrabajo;
import Vista.Presupuestos.*;
import Vista.Facturas.*;
import Vista.Facturas.Crear.DesdePresupuesto;

/**
 *
 * @author pfarinamoreno
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
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
        jMenuBar1 = new javax.swing.JMenuBar();
        men_adm = new javax.swing.JMenu();
        men_adm_cli = new javax.swing.JMenu();
        men_it_cre_cli = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        men_it_bus_cli = new javax.swing.JMenuItem();
        men_it_mod_cli = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        men_it_brr_cli = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        men_adm_pro = new javax.swing.JMenu();
        men_it_cre_pro = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        men_it_bus_pro = new javax.swing.JMenuItem();
        men_it_mod_pro = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        men_it_brr_pro = new javax.swing.JMenuItem();
        men_adm_mat = new javax.swing.JMenu();
        men_it_cre_mat = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        men_it_bus_mat = new javax.swing.JMenuItem();
        men_it_mod_mat = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        men_it_brr_mat = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        men_adm_tra = new javax.swing.JMenu();
        men_it_cre_tra = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        men_it_bus_tra = new javax.swing.JMenuItem();
        men_it_mod_tra = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        men_it_brr_tra = new javax.swing.JMenuItem();
        men_pre = new javax.swing.JMenu();
        men_pre_cre = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        men_pre_bus = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        men_pre_imp = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        men_pre_brr = new javax.swing.JMenuItem();
        men_fac = new javax.swing.JMenu();
        men_fac_cre = new javax.swing.JMenu();
        men_fac_cre_pre = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        men_fac_cre_nue = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        men_fac_bus = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        men_fac_imp = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        men_pre_brr1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Artrezzo CRM");
        setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/artezzoblanco2.jpg"))); // NOI18N

        jMenuBar1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        men_adm.setText("Administrar");

        men_adm_cli.setText("Clientes");

        men_it_cre_cli.setText("Crear Cliente");
        men_it_cre_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_it_cre_cliActionPerformed(evt);
            }
        });
        men_adm_cli.add(men_it_cre_cli);
        men_adm_cli.add(jSeparator5);

        men_it_bus_cli.setText("Buscar Cliente");
        men_it_bus_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_it_bus_cliActionPerformed(evt);
            }
        });
        men_adm_cli.add(men_it_bus_cli);

        men_it_mod_cli.setText("Modificar Cliente");
        men_it_mod_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_it_mod_cliActionPerformed(evt);
            }
        });
        men_adm_cli.add(men_it_mod_cli);
        men_adm_cli.add(jSeparator6);

        men_it_brr_cli.setText("Borrar Cliente");
        men_it_brr_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_it_brr_cliActionPerformed(evt);
            }
        });
        men_adm_cli.add(men_it_brr_cli);

        men_adm.add(men_adm_cli);
        men_adm.add(jSeparator1);

        men_adm_pro.setText("Proveedores");
        men_adm_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_adm_proActionPerformed(evt);
            }
        });

        men_it_cre_pro.setText("Nuevo Proveedor");
        men_it_cre_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_it_cre_proActionPerformed(evt);
            }
        });
        men_adm_pro.add(men_it_cre_pro);
        men_adm_pro.add(jSeparator7);

        men_it_bus_pro.setText("Buscar Proveedor");
        men_it_bus_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_it_bus_proActionPerformed(evt);
            }
        });
        men_adm_pro.add(men_it_bus_pro);

        men_it_mod_pro.setText("Modificar Proveedor");
        men_it_mod_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_it_mod_proActionPerformed(evt);
            }
        });
        men_adm_pro.add(men_it_mod_pro);
        men_adm_pro.add(jSeparator8);

        men_it_brr_pro.setText("Borrar Proveedor");
        men_it_brr_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_it_brr_proActionPerformed(evt);
            }
        });
        men_adm_pro.add(men_it_brr_pro);

        men_adm.add(men_adm_pro);

        men_adm_mat.setText("Materiales");
        men_adm_mat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_adm_matActionPerformed(evt);
            }
        });

        men_it_cre_mat.setText("Nuevo Material");
        men_it_cre_mat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_it_cre_matActionPerformed(evt);
            }
        });
        men_adm_mat.add(men_it_cre_mat);
        men_adm_mat.add(jSeparator9);

        men_it_bus_mat.setText("Buscar Material");
        men_it_bus_mat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_it_bus_matActionPerformed(evt);
            }
        });
        men_adm_mat.add(men_it_bus_mat);

        men_it_mod_mat.setText("Modificar Material");
        men_it_mod_mat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_it_mod_matActionPerformed(evt);
            }
        });
        men_adm_mat.add(men_it_mod_mat);
        men_adm_mat.add(jSeparator10);

        men_it_brr_mat.setText("Borrar Material");
        men_it_brr_mat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_it_brr_matActionPerformed(evt);
            }
        });
        men_adm_mat.add(men_it_brr_mat);

        men_adm.add(men_adm_mat);
        men_adm.add(jSeparator2);

        men_adm_tra.setText("Trabajos");

        men_it_cre_tra.setText("Crear Trabajo");
        men_it_cre_tra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_it_cre_traActionPerformed(evt);
            }
        });
        men_adm_tra.add(men_it_cre_tra);
        men_adm_tra.add(jSeparator11);

        men_it_bus_tra.setText("Buscar Trabajo");
        men_it_bus_tra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_it_bus_traActionPerformed(evt);
            }
        });
        men_adm_tra.add(men_it_bus_tra);

        men_it_mod_tra.setText("Modificar Trabajo");
        men_it_mod_tra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_it_mod_traActionPerformed(evt);
            }
        });
        men_adm_tra.add(men_it_mod_tra);
        men_adm_tra.add(jSeparator12);

        men_it_brr_tra.setText("Borrar Trabajo");
        men_it_brr_tra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_it_brr_traActionPerformed(evt);
            }
        });
        men_adm_tra.add(men_it_brr_tra);

        men_adm.add(men_adm_tra);

        jMenuBar1.add(men_adm);

        men_pre.setText("Presupuestos");

        men_pre_cre.setText("Crear Presupuesto");
        men_pre_cre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_pre_creActionPerformed(evt);
            }
        });
        men_pre.add(men_pre_cre);
        men_pre.add(jSeparator3);

        men_pre_bus.setText("Buscar Presupuesto");
        men_pre_bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_pre_busActionPerformed(evt);
            }
        });
        men_pre.add(men_pre_bus);
        men_pre.add(jSeparator16);

        men_pre_imp.setText("Imprimir Presupues");
        men_pre_imp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_pre_impActionPerformed(evt);
            }
        });
        men_pre.add(men_pre_imp);
        men_pre.add(jSeparator13);

        men_pre_brr.setText("Borrar Presupuesto");
        men_pre.add(men_pre_brr);

        jMenuBar1.add(men_pre);

        men_fac.setText("Facturas");

        men_fac_cre.setText("Crear Factura...");

        men_fac_cre_pre.setText("A Partir de Presupuesto");
        men_fac_cre_pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_fac_cre_preActionPerformed(evt);
            }
        });
        men_fac_cre.add(men_fac_cre_pre);
        men_fac_cre.add(jSeparator15);

        men_fac_cre_nue.setText("Nueva");
        men_fac_cre_nue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_fac_cre_nueActionPerformed(evt);
            }
        });
        men_fac_cre.add(men_fac_cre_nue);

        men_fac.add(men_fac_cre);
        men_fac.add(jSeparator4);

        men_fac_bus.setText("Buscar Factura");
        men_fac.add(men_fac_bus);
        men_fac.add(jSeparator17);

        men_fac_imp.setText("Imprimir Factura");
        men_fac.add(men_fac_imp);
        men_fac.add(jSeparator14);

        men_pre_brr1.setText("Borrar Factura");
        men_fac.add(men_pre_brr1);

        jMenuBar1.add(men_fac);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void men_pre_creActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_pre_creActionPerformed
        CrearPresupuesto crePres =  new CrearPresupuesto();
        crePres.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        crePres.setVisible(true);
    }//GEN-LAST:event_men_pre_creActionPerformed

    private void men_pre_impActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_pre_impActionPerformed
        BuscarPresupuesto impPres =  new BuscarPresupuesto();
        impPres.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        impPres.setVisible(true);
    }//GEN-LAST:event_men_pre_impActionPerformed

    private void men_fac_cre_preActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_fac_cre_preActionPerformed
        DesdePresupuesto factDesPres = new DesdePresupuesto();
        factDesPres.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        factDesPres.setVisible(true);
    }//GEN-LAST:event_men_fac_cre_preActionPerformed

    private void men_fac_cre_nueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_fac_cre_nueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_men_fac_cre_nueActionPerformed

    private void men_it_cre_matActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_it_cre_matActionPerformed
        CrearMaterial crearMat = new CrearMaterial();
        crearMat.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        crearMat.setVisible(true);
    }//GEN-LAST:event_men_it_cre_matActionPerformed

    private void men_it_cre_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_it_cre_cliActionPerformed
        CrearCliente crearCli = new CrearCliente();
        crearCli.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        crearCli.setVisible(true);
    }//GEN-LAST:event_men_it_cre_cliActionPerformed

    private void men_it_bus_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_it_bus_cliActionPerformed
        BuscarClientes mostrarCli = new BuscarClientes();
        mostrarCli.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        mostrarCli.setVisible(true);
    }//GEN-LAST:event_men_it_bus_cliActionPerformed

    private void men_it_mod_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_it_mod_cliActionPerformed
        ModificarCliente modificarCli = new ModificarCliente();
        modificarCli.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        modificarCli.setVisible(true);
    }//GEN-LAST:event_men_it_mod_cliActionPerformed

    private void men_it_brr_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_it_brr_cliActionPerformed
        BorrarCliente borrarCli = new BorrarCliente();
        borrarCli.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        borrarCli.setVisible(true);
    }//GEN-LAST:event_men_it_brr_cliActionPerformed

    private void men_adm_proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_adm_proActionPerformed
        
    }//GEN-LAST:event_men_adm_proActionPerformed

    private void men_it_cre_proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_it_cre_proActionPerformed
        CrearProveedor crearPro = new CrearProveedor();
        crearPro.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        crearPro.setVisible(true);
    }//GEN-LAST:event_men_it_cre_proActionPerformed

    private void men_it_bus_proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_it_bus_proActionPerformed
        BuscarProveedor buscarPro = new BuscarProveedor();
        buscarPro.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        buscarPro.setVisible(true);
    }//GEN-LAST:event_men_it_bus_proActionPerformed

    private void men_it_mod_proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_it_mod_proActionPerformed
        ModificarProveedor modificarPro = new ModificarProveedor();
        modificarPro.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        modificarPro.setVisible(true);
    }//GEN-LAST:event_men_it_mod_proActionPerformed

    private void men_it_brr_proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_it_brr_proActionPerformed
        BorrarProveedor borrarPro = new BorrarProveedor();
        borrarPro.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        borrarPro.setVisible(true);
    }//GEN-LAST:event_men_it_brr_proActionPerformed

    private void men_adm_matActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_adm_matActionPerformed
        
    }//GEN-LAST:event_men_adm_matActionPerformed

    private void men_it_bus_matActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_it_bus_matActionPerformed
        BuscarMateriales buscarMat = new BuscarMateriales();
        buscarMat.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        buscarMat.setVisible(true);
    }//GEN-LAST:event_men_it_bus_matActionPerformed

    private void men_it_mod_matActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_it_mod_matActionPerformed
        ModificarMaterial modMat = new ModificarMaterial();
        modMat.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        modMat.setVisible(true);
    }//GEN-LAST:event_men_it_mod_matActionPerformed

    private void men_it_brr_matActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_it_brr_matActionPerformed
        BorrarMaterial borrarMat = new BorrarMaterial();
        borrarMat.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        borrarMat.setVisible(true);
    }//GEN-LAST:event_men_it_brr_matActionPerformed

    private void men_it_cre_traActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_it_cre_traActionPerformed
        CrearTrabajo crearTra = new CrearTrabajo();
        crearTra.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        crearTra.setVisible(true);
    }//GEN-LAST:event_men_it_cre_traActionPerformed

    private void men_it_bus_traActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_it_bus_traActionPerformed
        BuscarTrabajos buscarTra = new BuscarTrabajos();
        buscarTra.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        buscarTra.setVisible(true);
    }//GEN-LAST:event_men_it_bus_traActionPerformed

    private void men_it_mod_traActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_it_mod_traActionPerformed
        ModificarTrabajo modTra = new ModificarTrabajo();
        modTra.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        modTra.setVisible(true);
    }//GEN-LAST:event_men_it_mod_traActionPerformed

    private void men_it_brr_traActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_it_brr_traActionPerformed
        BorrarTrabajo borrarTra = new BorrarTrabajo();
        borrarTra.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        borrarTra.setVisible(true);
    }//GEN-LAST:event_men_it_brr_traActionPerformed

    private void men_pre_busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_pre_busActionPerformed
        BuscarPresupuesto busPres =  new BuscarPresupuesto();
        busPres.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        busPres.setVisible(true);
    }//GEN-LAST:event_men_pre_busActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenu men_adm;
    private javax.swing.JMenu men_adm_cli;
    private javax.swing.JMenu men_adm_mat;
    private javax.swing.JMenu men_adm_pro;
    private javax.swing.JMenu men_adm_tra;
    private javax.swing.JMenu men_fac;
    private javax.swing.JMenuItem men_fac_bus;
    private javax.swing.JMenu men_fac_cre;
    private javax.swing.JMenuItem men_fac_cre_nue;
    private javax.swing.JMenuItem men_fac_cre_pre;
    private javax.swing.JMenuItem men_fac_imp;
    private javax.swing.JMenuItem men_it_brr_cli;
    private javax.swing.JMenuItem men_it_brr_mat;
    private javax.swing.JMenuItem men_it_brr_pro;
    private javax.swing.JMenuItem men_it_brr_tra;
    private javax.swing.JMenuItem men_it_bus_cli;
    private javax.swing.JMenuItem men_it_bus_mat;
    private javax.swing.JMenuItem men_it_bus_pro;
    private javax.swing.JMenuItem men_it_bus_tra;
    private javax.swing.JMenuItem men_it_cre_cli;
    private javax.swing.JMenuItem men_it_cre_mat;
    private javax.swing.JMenuItem men_it_cre_pro;
    private javax.swing.JMenuItem men_it_cre_tra;
    private javax.swing.JMenuItem men_it_mod_cli;
    private javax.swing.JMenuItem men_it_mod_mat;
    private javax.swing.JMenuItem men_it_mod_pro;
    private javax.swing.JMenuItem men_it_mod_tra;
    private javax.swing.JMenu men_pre;
    private javax.swing.JMenuItem men_pre_brr;
    private javax.swing.JMenuItem men_pre_brr1;
    private javax.swing.JMenuItem men_pre_bus;
    private javax.swing.JMenuItem men_pre_cre;
    private javax.swing.JMenuItem men_pre_imp;
    // End of variables declaration//GEN-END:variables
}
