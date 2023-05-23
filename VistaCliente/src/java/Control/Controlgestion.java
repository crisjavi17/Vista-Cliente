/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Vista.Vistagestion;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import ws.Cliente;
import ws.ProcesoWS;
import ws.ProcesoWS_Service;
import ws.Retirardepositar;

/**
 *
 * @author LENOVO
 */
public class Controlgestion {

    private Vistagestion vistages;
    private ProcesoWS_Service servicio = new ProcesoWS_Service();
    private ProcesoWS trans = servicio.getProcesoWSPort();
    Retirardepositar retiro = new Retirardepositar();
    Retirardepositar deposito = new Retirardepositar();
    private JComboBox<String> cmbMetodo;
    Cliente cliente;

    public Controlgestion(Vistagestion vistages, Cliente cliente) {
        this.vistages = vistages;
        this.cliente = cliente;
        vistages.setVisible(true);
        vistages.getLabelregistroexitoso().setVisible(false);
        vistages.getAlerta_ingresofallido().setVisible(false);
        vistages.getPanelIniciosesion().setVisible(false);
        vistages.getPanelretiro().setVisible(false);

    }

    public void iniciacontrol() {
        vistages.getBotonregistrar().addActionListener(l -> resgistrousuario());
        vistages.getBotonsalir().addActionListener(l -> regresarlogin());
        vistages.getBotoningresar_inicio().addActionListener(l -> iniciarsesion());
        vistages.getBotonregistrar_inicio().addActionListener(l -> pasaralregistrar());
        vistages.getRegistroPD().addActionListener(l -> transaccciondeporeti());

    }

    public void iniciarsesion() {

        String usuario = vistages.getTxtusuario_inicio().getText();
        char clave[] = vistages.getPasswordclave_inicio().getPassword();
        String clavedef = new String(clave);

        if (!usuario.isEmpty() || !clavedef.isEmpty()) {
            cliente.setUsuario(usuario);
            cliente.setClave(clavedef);

            cliente = trans.login(cliente);

            if (cliente.getUsuario() == null) {

                vistages.getAlerta_ingresofallido().setVisible(true);

            } else {
                System.out.println(cliente.getUsuario());
                System.out.println(cliente.getClave());
                System.out.println(cliente.getSaldo());

                vistages.getPanelretirodeposito().setVisible(true);
                vistages.getPanelIniciosesion().setVisible(false);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Campos vacios");
        }

    }

    public void resgistrousuario() {

        String nombre = "";
        String clave = "";
        String claver = "";
        int saldo = 0;

        nombre = vistages.getTxtusuario().getText();
        clave = vistages.getTxtclave().getText();
        claver = vistages.getTxtclaver().getText();
        saldo = Integer.parseInt(vistages.getSpinnersaldo_reg().getValue().toString());

        if (!nombre.isEmpty() || !clave.isEmpty() || !claver.isEmpty()) {

            if (clave.equals(claver)) {

                cliente.setUsuario(nombre);
                cliente.setClave(clave);
                cliente.setSaldo(saldo);
                System.out.println(trans.registrar(cliente));
                vistages.getLabelregistroexitoso().setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Clave incorrecta");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Hay campos vacios");
        }
    }

    private void regresarlogin() {
        vistages.getPanelRegistro().setVisible(false);
        vistages.getPanelIniciosesion().setVisible(true);
    }

    private void atraslogin() {
        vistages.getPanelretirodeposito().setVisible(false);
        vistages.getPanelIniciosesion().setVisible(true);
    }

    private void pasaralregistrar() {
        vistages.getPanelRegistro().setVisible(true);
        vistages.getPanelIniciosesion().setVisible(false);
    }

    public void transaccciondeporeti() {

        int saldoDisponible = 100;

        if (vistages.getCheckretiro().isSelected()) {

            int cantidadRetiro = Integer.parseInt(vistages.getTxtvalorPD().getText());
            if (cantidadRetiro > saldoDisponible) {
                JOptionPane.showMessageDialog(null, "La cantidad que desea retirar es mayor a su saldo.");
                return;
            }
            retiro.setValor(Integer.parseInt(vistages.getTxtvalorPD().getText()));
            retiro.setUsua(cliente.getUsuario());
            JOptionPane.showMessageDialog(null, "Su saldo luego del retiro es: " + trans.retiro(retiro).getValor() + " $");
            System.out.println(trans.retiro(retiro).getValor());
            deposito.setValor(0);
        } else if (vistages.getCheckdeposito().isSelected()) {
            deposito.setValor(Integer.parseInt(vistages.getTxtvalorPD().getText()));
            deposito.setUsua(cliente.getUsuario());
            System.out.println(trans.deposito(deposito).getValor());
            JOptionPane.showMessageDialog(null, "Su saldo luego del saldo es: " + trans.deposito(deposito).getValor() + " $");
            retiro.setValor(0);
        }
    }

}
