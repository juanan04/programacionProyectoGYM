/*
 * Dialogo Cliente
 */
package dialogos;

import clases.Cliente;
import clases.Cliente.Pago;
import clases.Gym;
import clases.Persona;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import visualGrafica.paginaMain;

/**
 *
 * @author Juan Antonio
 */
public class DialogoCliente extends javax.swing.JDialog {

    /*Creación de los atributos necesrios*/
    private Gym gym;
    private String tipo; // Saber el tipo de acción a realizar (Actualizar o Añadir)
    private paginaMain pagPri;
    public DefaultComboBoxModel<Persona> modeloComboPersona = new DefaultComboBoxModel<>();

    /*Constructor de la clase*/
    public DialogoCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        gym = ((paginaMain) parent).getGym();
        this.pagPri = (paginaMain) parent;
        initComponents();
    }

    /*Métodos*/
    // Método para saber la acción que se va ha realizar
    public void tipoAccion(String tipo) {
        this.tipo = tipo;
        /*Establecemos los datos de */
        txtTitulo.setText(tipo);
        botonAceptar.setText(tipo);
        if (!tipo.equals("Actualizar")) {
            labelCombo.setText("Seleccione un nuevo Cliente:");
            personasDeCombo();

        } else if (tipo.equals("Actualizar")) { //  Rellenamos campos con los datos del Cliente seleccionado
            labelCombo.setText("Cliente Seleccionado:");
            Cliente actualizarCliente = pagPri.getSelectedClienteListaDatos();
            DefaultComboBoxModel modeloComboActualizar = new DefaultComboBoxModel();
            Persona perSelect = new Persona(
                    actualizarCliente.getNombre(),
                    actualizarCliente.getApellidos(),
                    actualizarCliente.getDni(),
                    actualizarCliente.getFechaNacimiento(),
                    actualizarCliente.getSexo()
            );
            modeloComboActualizar.addElement(perSelect);
            comboPersona.setModel(modeloComboActualizar);
            textPeso.setText(Double.toString(actualizarCliente.getPeso()));
            textAltura.setText(Double.toString(actualizarCliente.getAltura()));
            textDuracionMensualidad.setText(Integer.toString(actualizarCliente.getDuracionMensualidad()));
            comboFormaPago.setSelectedItem((actualizarCliente.getFormaPago()));
        }

    }

    // Método para añadir a las personas en el JComboBox
    public void personasDeCombo() {
        modeloComboPersona.removeAllElements();
        for (Persona pe : gym.getPersonas()) {
            modeloComboPersona.addElement(pe);
        }
        comboPersona.setModel(modeloComboPersona);
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
        txtTitulo = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        labelCombo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textPeso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textAltura = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textDuracionMensualidad = new javax.swing.JTextField();
        botonAceptar = new javax.swing.JButton();
        comboPersona = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        comboFormaPago = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(599, 320));

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        txtTitulo.setFont(new java.awt.Font("Source Serif Pro", 1, 36)); // NOI18N
        txtTitulo.setText("Añadir");

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        labelCombo.setText("Seleccione la persona:");

        jLabel3.setText("Peso:");

        jLabel4.setText("Altura:");

        jLabel5.setText("Duración de la Mensualidad:");

        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        jLabel6.setText("Forma de Pago:");

        comboFormaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PayPal", "Transferencia", "Tarjeta", "Otro" }));

        jLabel1.setText("kg");

        jLabel2.setText("m");

        jLabel7.setText("días");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboPersona, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonVolver)
                        .addGap(173, 173, 173)
                        .addComponent(txtTitulo))
                    .addComponent(labelCombo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textDuracionMensualidad, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(8, 8, 8)
                                .addComponent(comboFormaPago, 0, 160, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(textAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(85, 85, 85)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(botonAceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonVolver)))
                .addGap(10, 10, 10)
                .addComponent(labelCombo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(textAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textDuracionMensualidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(comboFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(botonAceptar)
                .addGap(18, 18, 18))
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

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        if (tipo != null) { //  Si no hay tipo no hay opciones Añadir o Actualizar
            if (tipo.equals("Añadir")) {    //  Líneas necesarias para añadir
                try {
                Cliente nuevo = new Cliente();
                Persona personaElegida = (Persona) modeloComboPersona.getSelectedItem();
                nuevo.setNombre((String) personaElegida.getNombre());
                nuevo.setApellidos((String) personaElegida.getApellidos());
                nuevo.setDni((String) personaElegida.getDni());
                nuevo.setFechaNacimiento(personaElegida.getFechaNacimiento());
                nuevo.setSexo(personaElegida.getSexo());
                nuevo.setPeso(Double.parseDouble(textPeso.getText()));
                nuevo.setAltura(Double.parseDouble(textAltura.getText()));
                nuevo.setDuracionMensualidad(Integer.parseInt(textDuracionMensualidad.getText()));
                nuevo.setFormaPago(Pago.valueOf(((String)comboFormaPago.getSelectedItem()).toUpperCase()));
                gym.getClientes().add((Cliente) nuevo);
                pagPri.getModeloLista().addElement(nuevo);
                JOptionPane.showMessageDialog(  //  Diálogo final mostrando mensaje de éxito al crear
                        null, 
                        "El cliente ha sido añadido con éxito",
                        "Cambio Realizado", 
                        JOptionPane.INFORMATION_MESSAGE
                );
                } catch(NullPointerException | IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(this,
                            "Error al añadir el cliente: " + e.getMessage(),
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            } else if (tipo.equals("Actualizar")) {
                try {
                Cliente actualizarCliente = pagPri.getSelectedClienteListaDatos();  //  Nos referimos al dato seleccionado en el JList del principio
                actualizarCliente.setNombre(actualizarCliente.getNombre());
                actualizarCliente.setApellidos(actualizarCliente.getApellidos());
                actualizarCliente.setDni(actualizarCliente.getDni());
                actualizarCliente.setFechaNacimiento(actualizarCliente.getFechaNacimiento());
                actualizarCliente.setSexo(actualizarCliente.getSexo());
                actualizarCliente.setPeso(Double.parseDouble(textPeso.getText()));
                actualizarCliente.setAltura(Double.parseDouble(textAltura.getText()));
                actualizarCliente.setDuracionMensualidad(Integer.parseInt(textDuracionMensualidad.getText()));  //  Al final se actualizan todos los datos
                actualizarCliente.setFormaPago(Pago.valueOf(((String)comboFormaPago.getSelectedItem()).toUpperCase()));
                JOptionPane.showMessageDialog(  //  Diálogo final mostrando mensaje de Éxito al actualizar dato seleccionado
                        null, 
                        "Se ha actualizado al cliente con éxito",
                        "Cambio Realizado", 
                        JOptionPane.INFORMATION_MESSAGE
                );
                } catch(NullPointerException | IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(this,
                            "Error al actualizar el cliente: " + e.getMessage(),
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        }
        dispose();
    }//GEN-LAST:event_botonAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(DialogoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogoCliente dialog = new DialogoCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JComboBox<String> comboFormaPago;
    private javax.swing.JComboBox<Persona> comboPersona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCombo;
    private javax.swing.JTextField textAltura;
    private javax.swing.JTextField textDuracionMensualidad;
    private javax.swing.JTextField textPeso;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}