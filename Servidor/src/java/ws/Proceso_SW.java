/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import Modelo.Cliente;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author LENOVO
 */
@WebService(serviceName = "Proceso_SW")
public class Proceso_SW {

    private ArrayList<Cliente> arraycliente = new ArrayList<>();

    @WebMethod(operationName = "registrar")
    public boolean registrar(@WebParam(name = "usuario") Cliente cli) {

        return arraycliente.add(cli);
    }

    @WebMethod(operationName = "login")
    public Cliente login(@WebParam(name = "usuarios") Cliente cli) {

        Cliente clien = new Cliente();

        for (int i = 0; i < arraycliente.size(); i++) {

            if (arraycliente.get(i).getUsuario().equals(cli.getUsuario())) {

                clien = arraycliente.get(i);

            }
        }

        return clien;
    }

}
