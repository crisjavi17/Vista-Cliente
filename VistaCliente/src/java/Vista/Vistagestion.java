/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.TextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSpinner;

/**
 *
 * @author LENOVO
 */
public class Vistagestion extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Vistagestion() {
        initComponents();
    }

    public ButtonGroup getBontongrupopciones() {
        return Bontongrupopciones;
    }

    public JRadioButton getCheckdeposito() {
        return checkdeposito;
    }

    public void setCheckdeposito(JRadioButton checkdeposito) {
        this.checkdeposito = checkdeposito;
    }

    public JRadioButton getCheckretiro() {
        return checkretiro;
    }

    public void setCheckretiro(JRadioButton checkretiro) {
        this.checkretiro = checkretiro;
    }

    public void setBontongrupopciones(ButtonGroup Bontongrupopciones) {
        this.Bontongrupopciones = Bontongrupopciones;
    }

    public JButton getRegistroPD() {
        return RegistroPD;
    }

    public void setRegistroPD(JButton RegistroPD) {
        this.RegistroPD = RegistroPD;
    }

    public JLabel getAlerta_ingresofallido() {
        return alerta_ingresofallido;
    }

    public void setAlerta_ingresofallido(JLabel alerta_ingresofallido) {
        this.alerta_ingresofallido = alerta_ingresofallido;
    }

    public JButton getBotoningresar_inicio() {
        return botoningresar_inicio;
    }

    public void setBotoningresar_inicio(JButton botoningresar_inicio) {
        this.botoningresar_inicio = botoningresar_inicio;
    }

    public JButton getBotonregistrar_inicio() {
        return botonregistrar_inicio;
    }

    public void setBotonregistrar_inicio(JButton botonregistrar_inicio) {
        this.botonregistrar_inicio = botonregistrar_inicio;
    }

    public JButton getBotonregresaraliniciosesion_DP() {
        return botonregresaraliniciosesion_DP;
    }

    public void setBotonregresaraliniciosesion_DP(JButton botonregresaraliniciosesion_DP) {
        this.botonregresaraliniciosesion_DP = botonregresaraliniciosesion_DP;
    }

    public JRadioButton getjRadioButton1() {
        return checkdeposito;
    }

    public void setjRadioButton1(JRadioButton jRadioButton1) {
        this.checkdeposito = jRadioButton1;
    }

    public JRadioButton getjRadioButton2() {
        return checkretiro;
    }

    public void setjRadioButton2(JRadioButton jRadioButton2) {
        this.checkretiro = jRadioButton2;
    }

    public JLabel getLabelnotificacionPD() {
        return labelnotificacionPD;
    }

    public void setLabelnotificacionPD(JLabel labelnotificacionPD) {
        this.labelnotificacionPD = labelnotificacionPD;
    }

    public JLabel getLabelusuarioPD() {
        return labelusuarioPD;
    }

    public void setLabelusuarioPD(JLabel labelusuarioPD) {
        this.labelusuarioPD = labelusuarioPD;
    }

    public JPanel getPanelretirodeposito() {
        return panelretirodeposito;
    }

    public void setPanelretirodeposito(JPanel panelretirodeposito) {
        this.panelretirodeposito = panelretirodeposito;
    }

    public JPasswordField getPasswordclave_inicio() {
        return passwordclave_inicio;
    }

    public void setPasswordclave_inicio(JPasswordField passwordclave_inicio) {
        this.passwordclave_inicio = passwordclave_inicio;
    }

    public TextField getTxtclave_reg() {
        return txtclave_reg;
    }

    public void setTxtclave_reg(TextField txtclave_reg) {
        this.txtclave_reg = txtclave_reg;
    }

    public TextField getTxtclaver_reg() {
        return txtclaver_reg;
    }

    public void setTxtclaver_reg(TextField txtclaver_reg) {
        this.txtclaver_reg = txtclaver_reg;
    }

    public TextField getTxtsaldoPD() {
        return txtsaldoPD;
    }

    public void setTxtsaldoPD(TextField txtsaldoPD) {
        this.txtsaldoPD = txtsaldoPD;
    }

    public TextField getTxtusuario_inicio() {
        return txtusuario_inicio;
    }

    public void setTxtusuario_inicio(TextField txtusuario_inicio) {
        this.txtusuario_inicio = txtusuario_inicio;
    }

    public TextField getTxtusuario_reg() {
        return txtusuario_reg;
    }

    public void setTxtusuario_reg(TextField txtusuario_reg) {
        this.txtusuario_reg = txtusuario_reg;
    }

    public TextField getTxtvalorPD() {
        return txtvalorPD;
    }

    public void setTxtvalorPD(TextField txtvalorPD) {
        this.txtvalorPD = txtvalorPD;
    }

  

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bontongrupopciones = new javax.swing.ButtonGroup();
        PanelIniciosesion = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        alerta_ingresofallido = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        botoningresar_inicio = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        txtusuario_inicio = new java.awt.TextField();
        passwordclave_inicio = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        botonregistrar_inicio = new javax.swing.JButton();
        PanelRegistro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonregistrar = new javax.swing.JButton();
        txtusuario_reg = new java.awt.TextField();
        txtclave_reg = new java.awt.TextField();
        txtclaver_reg = new java.awt.TextField();
        jSeparator1 = new javax.swing.JSeparator();
        spinnersaldo_reg = new javax.swing.JSpinner();
        Labelregistroexitoso = new javax.swing.JLabel();
        Botonsalir = new javax.swing.JButton();
        panelretirodeposito = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labelnotificacionPD = new javax.swing.JLabel();
        txtsaldoPD = new java.awt.TextField();
        txtvalorPD = new java.awt.TextField();
        jSeparator5 = new javax.swing.JSeparator();
        RegistroPD = new javax.swing.JButton();
        labelusuarioPD = new javax.swing.JLabel();
        checkdeposito = new javax.swing.JRadioButton();
        checkretiro = new javax.swing.JRadioButton();
        botonregresaraliniciosesion_DP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelIniciosesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Formulario de Acceso");
        PanelIniciosesion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel7.setText("Usuario:");
        PanelIniciosesion.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel8.setText("Clave:");
        PanelIniciosesion.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        alerta_ingresofallido.setForeground(new java.awt.Color(255, 51, 51));
        alerta_ingresofallido.setText("El usuario ingresado no existe o las credenciales son incorrectas.");
        PanelIniciosesion.add(alerta_ingresofallido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));
        PanelIniciosesion.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 290, 10));

        botoningresar_inicio.setText("Ingresar");
        PanelIniciosesion.add(botoningresar_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));
        PanelIniciosesion.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 340, 10));
        PanelIniciosesion.add(txtusuario_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 110, -1));

        passwordclave_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordclave_inicioActionPerformed(evt);
            }
        });
        PanelIniciosesion.add(passwordclave_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 130, -1));
        PanelIniciosesion.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 290, 10));

        jLabel10.setText("Si eres nuevo registrate aqui");
        PanelIniciosesion.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        botonregistrar_inicio.setForeground(new java.awt.Color(0, 102, 204));
        botonregistrar_inicio.setText("Registrar");
        PanelIniciosesion.add(botonregistrar_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        getContentPane().add(PanelIniciosesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 310));

        PanelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRAR USUARIO");
        PanelRegistro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel2.setText("USUARIO:");
        PanelRegistro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel3.setText("PASSWORD:");
        PanelRegistro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel4.setText("PASSWORD:");
        PanelRegistro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setText("SALDO INICIAL:");
        PanelRegistro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        botonregistrar.setText("REGISTRAR");
        PanelRegistro.add(botonregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        txtusuario_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuario_regActionPerformed(evt);
            }
        });
        PanelRegistro.add(txtusuario_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 160, -1));
        PanelRegistro.add(txtclave_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 160, -1));
        PanelRegistro.add(txtclaver_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 160, -1));
        PanelRegistro.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 330, 20));

        spinnersaldo_reg.setModel(new javax.swing.SpinnerNumberModel(100, 100, 100, 1));
        PanelRegistro.add(spinnersaldo_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 140, -1));

        Labelregistroexitoso.setText("Registro Exitoso");
        PanelRegistro.add(Labelregistroexitoso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        Botonsalir.setText("Salir");
        Botonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonsalirActionPerformed(evt);
            }
        });
        PanelRegistro.add(Botonsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        getContentPane().add(PanelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 4, 440, 310));

        panelretirodeposito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Cuenta de Usuario:");
        panelretirodeposito.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel11.setText("Saldo:");
        panelretirodeposito.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel12.setText("Seleccione:");
        panelretirodeposito.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel13.setText("Valor:");
        panelretirodeposito.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        panelretirodeposito.add(labelnotificacionPD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 230, 20));

        txtsaldoPD.setEditable(false);
        txtsaldoPD.setText("100");
        panelretirodeposito.add(txtsaldoPD, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 150, -1));

        txtvalorPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalorPDActionPerformed(evt);
            }
        });
        panelretirodeposito.add(txtvalorPD, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 140, -1));
        panelretirodeposito.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 210, 10));

        RegistroPD.setText("Registrar");
        RegistroPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroPDActionPerformed(evt);
            }
        });
        panelretirodeposito.add(RegistroPD, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));
        panelretirodeposito.add(labelusuarioPD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 130, 20));

        Bontongrupopciones.add(checkdeposito);
        checkdeposito.setText("Desposito");
        panelretirodeposito.add(checkdeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        Bontongrupopciones.add(checkretiro);
        checkretiro.setText("Retiro");
        panelretirodeposito.add(checkretiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        botonregresaraliniciosesion_DP.setText("Atras");
        panelretirodeposito.add(botonregresaraliniciosesion_DP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        getContentPane().add(panelretirodeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuario_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuario_regActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuario_regActionPerformed

    private void BotonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonsalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonsalirActionPerformed

    private void passwordclave_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordclave_inicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordclave_inicioActionPerformed

    private void RegistroPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroPDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistroPDActionPerformed

    private void txtvalorPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalorPDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalorPDActionPerformed

    public JButton getBotonsalir() {
        return Botonsalir;
    }

    public void setBotonsalir(JButton Botonsalir) {
        this.Botonsalir = Botonsalir;
    }

    public JPanel getPanelIniciosesion() {
        return PanelIniciosesion;
    }

    public void setPanelIniciosesion(JPanel PanelIniciosesion) {
        this.PanelIniciosesion = PanelIniciosesion;
    }

    public JPanel getPanelRegistro() {
        return PanelRegistro;
    }

    public void setPanelRegistro(JPanel PanelRegistro) {
        this.PanelRegistro = PanelRegistro;
    }

    public JPanel getPanelretiro() {
        return panelretirodeposito;
    }

    public void setPanelretiro(JPanel Panelretiro) {
        this.panelretirodeposito = Panelretiro;
    }

    public JButton getBotonregistrar() {
        return botonregistrar;
    }

    public void setBotonregistrar(JButton botonregistrar) {
        this.botonregistrar = botonregistrar;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JPanel getjPanel1() {
        return PanelRegistro;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.PanelRegistro = jPanel1;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public TextField getTxtclave() {
        return txtclave_reg;
    }

    public void setTxtclave(TextField txtclave) {
        this.txtclave_reg = txtclave;
    }

    public TextField getTxtclaver() {
        return txtclaver_reg;
    }

    public void setTxtclaver(TextField txtclaver) {
        this.txtclaver_reg = txtclaver;
    }


    public TextField getTxtusuario() {
        return txtusuario_reg;
    }

    public void setTxtusuario(TextField txtusuario) {
        this.txtusuario_reg = txtusuario;
    }

    public JSpinner getSpinnersaldo_reg() {
        return spinnersaldo_reg;
    }

    public void setSpinnersaldo_reg(JSpinner spinnersaldo_reg) {
        this.spinnersaldo_reg = spinnersaldo_reg;
    }

    public JLabel getLabelregistroexitoso() {
        return Labelregistroexitoso;
    }

    public void setLabelregistroexitoso(JLabel Labelregistroexitoso) {
        this.Labelregistroexitoso = Labelregistroexitoso;
    }

    
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
            java.util.logging.Logger.getLogger(Vistagestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vistagestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vistagestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vistagestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vistagestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Bontongrupopciones;
    private javax.swing.JButton Botonsalir;
    private javax.swing.JLabel Labelregistroexitoso;
    private javax.swing.JPanel PanelIniciosesion;
    private javax.swing.JPanel PanelRegistro;
    private javax.swing.JButton RegistroPD;
    private javax.swing.JLabel alerta_ingresofallido;
    private javax.swing.JButton botoningresar_inicio;
    private javax.swing.JButton botonregistrar;
    private javax.swing.JButton botonregistrar_inicio;
    private javax.swing.JButton botonregresaraliniciosesion_DP;
    private javax.swing.JRadioButton checkdeposito;
    private javax.swing.JRadioButton checkretiro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel labelnotificacionPD;
    private javax.swing.JLabel labelusuarioPD;
    private javax.swing.JPanel panelretirodeposito;
    private javax.swing.JPasswordField passwordclave_inicio;
    private javax.swing.JSpinner spinnersaldo_reg;
    private java.awt.TextField txtclave_reg;
    private java.awt.TextField txtclaver_reg;
    private java.awt.TextField txtsaldoPD;
    private java.awt.TextField txtusuario_inicio;
    private java.awt.TextField txtusuario_reg;
    private java.awt.TextField txtvalorPD;
    // End of variables declaration//GEN-END:variables
}
