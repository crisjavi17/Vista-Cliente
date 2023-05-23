/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Control.Controlgestion;
import Vista.Vistagestion;
import ws.Cliente;

/**
 *
 * @author LENOVO
 */
public class Principal {

    public static void main(String[] args) {

        Vistagestion gestion = new Vistagestion();
        Cliente clie = new Cliente();
        Controlgestion congest = new Controlgestion(gestion, clie);
        congest.iniciacontrol();
    }
}
