/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.javi.jsf.util;

import javax.faces.context.FacesContext;

/**
 *
 * @author dsilva
 */
public class ResourcesUtil {

    public static String getString(String key) {
        FacesContext context = FacesContext.getCurrentInstance();
        String value = context.getApplication().evaluateExpressionGet(context, key, String.class);
        
        return value;
    }
}
