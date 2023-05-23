
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para login complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="login"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usuarios" type="{http://ws/}cliente" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "login", propOrder = {
    "usuarios"
})
public class Login {

    protected Cliente usuarios;

    /**
     * Obtiene el valor de la propiedad usuarios.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getUsuarios() {
        return usuarios;
    }

    /**
     * Define el valor de la propiedad usuarios.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setUsuarios(Cliente value) {
        this.usuarios = value;
    }

}
