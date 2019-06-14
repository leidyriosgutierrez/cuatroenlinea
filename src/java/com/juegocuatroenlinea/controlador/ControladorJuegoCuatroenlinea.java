/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegocuatroenlinea.controlador;

import com.juegocuatroenlinea.modelo.Usuario;
import com.juegocuatroenlinea.controlador.util.JsfUtil;
import javax.inject.Named;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;


/**
 *
 * @author Leydi
 */
@Named(value = "controladorJuegoCuatroenlinea")
@SessionScoped
public class ControladorJuegoCuatroenlinea implements Serializable {
    
    private Usuario usuario;
    @EJB
    private UsuarioFacade usuarioFacade;
    

    /**
     * Creates a new instance of ControladorJuegoCuatroenlinea
     */
    public ControladorJuegoCuatroenlinea() {
         
    }
    @PostConstruct
    private void inicializar()
    {
       usuario = new Usuario();
    }
    public String ingresar()        
    {
        Usuario usuarioEncontrado=usuarioFacade.find(usuario.getCorreo());
        
        if(usuarioEncontrado != null)
        {
            if(usuario.getContrasenia().compareTo(usuarioEncontrado.getContrasenia())==0)
            {
                return "ingresar";
            }
            JsfUtil.addErrorMessage("Contraseña incorrecta");
        }
        else
        {
            JsfUtil.addErrorMessage("El correo ingresado no existe");
        }
        return null;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
            
}
