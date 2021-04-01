/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.RepLatoneria;
import Modelo.RepMecanica;
import Modelo.Revision;
import Modelo.Vehiculo;
import dao.VehiculoDAOMongo;
import iDAO.IRepMecanicaDAO;
import java.util.Iterator;
import java.util.List;
import iDAO.IRepLatoneriaDAO;
import iDAO.IRevisionDAO;


/**
 *
 * @author Usuario
 */
public class RegistrarTrabajoFr extends javax.swing.JFrame implements IRepMecanicaDAO, IRepLatoneriaDAO, IRevisionDAO  {

    /**
     * Creates new form RegistrarTrabajoFr
     */
    public RegistrarTrabajoFr() {
        initComponents();
        //Llenar el campo vehiculoCmb con la información de la BD
        VehiculoDAOMongo vDAO = new VehiculoDAOMongo();
        List<Vehiculo> list = vDAO.obtenerVehiculos();
        Iterator<Vehiculo> iter = list.iterator();
        Vehiculo v = null;
        while (iter.hasNext()) {
            v = iter.next();
            this.vehiculosCmb.addItem(v.getPlaca());
//                System.out.println(v.toString());
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

        Trabajocmb = new javax.swing.JComboBox<>();
        vehiculosCmb = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        datos_trabajo = new javax.swing.JLabel();
        guardarTrabajoBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto1 = new javax.swing.JTextArea();
        BotonLimpiar = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Trabajocmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MECANICA", "LATONERIA", "REVISION" }));
        Trabajocmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrabajocmbActionPerformed(evt);
            }
        });

        vehiculosCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehiculosCmbActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Selelcio el tipo de trabajo");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Selecione el Vehículo");

        datos_trabajo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        datos_trabajo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        datos_trabajo.setText("Datos de Trabajo");
        datos_trabajo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        datos_trabajo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        datos_trabajo.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        guardarTrabajoBtn.setText("Guardar");
        guardarTrabajoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarTrabajoBtnActionPerformed(evt);
            }
        });

        texto1.setEditable(false);
        texto1.setColumns(20);
        texto1.setRows(5);
        jScrollPane1.setViewportView(texto1);

        BotonLimpiar.setText("Limpiar");
        BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarActionPerformed(evt);
            }
        });

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(vehiculosCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Trabajocmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(datos_trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(guardarTrabajoBtn)
                                .addGap(44, 44, 44)
                                .addComponent(BotonLimpiar)
                                .addGap(42, 42, 42)
                                .addComponent(BotonSalir)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Actualizar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehiculosCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Trabajocmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(datos_trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Actualizar)
                        .addGap(50, 50, 50)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarTrabajoBtn)
                    .addComponent(BotonLimpiar)
                    .addComponent(BotonSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TrabajocmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrabajocmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TrabajocmbActionPerformed

    private void guardarTrabajoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarTrabajoBtnActionPerformed
        // TODO add your handling code here:
        //Registar en la colección correspondiente de acuerdo al 
        //comboBox de tipo de trabajo
        /*VehiculoDAOMongo vDAO = new VehiculoDAOMongo();
        List<Vehiculo> list = vDAO.obtenerVehiculos();
        Iterator<Vehiculo> iter = list.iterator();
        Vehiculo v = null;
        while (iter.hasNext()) {
            v = iter.next();
            
//                System.out.println(v.toString());
        }
        String categoria2 = (String) vehiculosCmb.getSelectedItem();*/

       RepMecanica repmecanica = null;
       RepLatoneria replatoneria = null;
       Revision revision = null;
       
        String categoria1 = (String) Trabajocmb.getSelectedItem();
        if(categoria1 == "MECANICA"){
            this.insertarRepMecanica(repmecanica);
       
        }else {if(categoria1 == "LATONERIA"){
        this.insertarRepLatoneria(replatoneria);
        }else{if(categoria1 == "REVISION"){
        this.insertarRevision(revision);
        }}}
        
    }//GEN-LAST:event_guardarTrabajoBtnActionPerformed

    private void vehiculosCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehiculosCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehiculosCmbActionPerformed

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
      this.texto1.setText("");  // remplazo el texto con otro texto vacio para simular que se limpio el area de texto
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
System.exit(0);         // evento para salir
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
      String categoria2 = (String) vehiculosCmb.getSelectedItem();
      String categoria1 = (String) Trabajocmb.getSelectedItem();
      
      
        VehiculoDAOMongo vDAO = new VehiculoDAOMongo();
        List<Vehiculo> list = vDAO.obtenerVehiculos();
        Iterator<Vehiculo> iter = list.iterator();
        //Vehiculo v = new  Vehiculo();
         Vehiculo v =iter.next();
            while (!v.getPlaca().equals(categoria2)){
            
            v = iter.next();
            
            }
            
            
//                System.out.println(v.toString());
        
        
            
              this.texto1.setText("Tipo de Trabajo: "+categoria1+"\n Informacion del Vehiculo \nPlaca: "+v.getPlaca()+"\n Marca: "+v.getMarca()+"\n Color: "+v.getColors()+"\n Propietario: "+v.getPropietario()+"\n Modelo: "+v.getModelo());

            
       
        
       
// TODO add your handling code here:
    }//GEN-LAST:event_ActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarTrabajoFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarTrabajoFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarTrabajoFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarTrabajoFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarTrabajoFr().setVisible(true);
            }
            
        });
    //Buscar los datos del vehiculo y colocarlos en vehiculoCmb
    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JComboBox<String> Trabajocmb;
    private javax.swing.JLabel datos_trabajo;
    private javax.swing.JButton guardarTrabajoBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea texto1;
    private javax.swing.JComboBox<String> vehiculosCmb;
    // End of variables declaration//GEN-END:variables

    @Override
    public List<RepMecanica> obtenerRepMecanicas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RepMecanica obtenerRepMecanica(String placa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertarRepMecanica(RepMecanica repmecanica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarRepMecanica(RepMecanica repmecanica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarRepMecanica(RepMecanica repmecanica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<RepLatoneria> obtenerRepLatonerias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RepLatoneria obtenerRepLatoneria(String placa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertarRepLatoneria(RepLatoneria replatoneria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarRepLatoneria(RepLatoneria replatoneria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarRepLatoneria(RepLatoneria replatoneria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Revision> obtenerRevisiones() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Revision obtenerRevision(String placa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertarRevision(Revision revision) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarRevision(Revision revision) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarRevision(Revision revision) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
