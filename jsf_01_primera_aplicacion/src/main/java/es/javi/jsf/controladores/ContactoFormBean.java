package es.javi.jsf.controladores;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import es.javi.jsf.util.ResourcesUtil;

@ManagedBean
@RequestScoped
public class ContactoFormBean {

    private String nombre;

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getSaludo(){
        return ResourcesUtil.getString("#{msg['app.saludo']}")  +nombre;
    }

    /**
     * Creates a new instance of ContactoFormBean
     */
    public ContactoFormBean() {
    }
}
