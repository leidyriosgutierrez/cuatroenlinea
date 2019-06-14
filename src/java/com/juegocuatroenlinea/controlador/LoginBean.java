/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegocuatroenlinea.controlador;

import com.juegocuatroenlinea.controlador.util.FacesUtils;
import com.juegocuatroenlinea.modelo.Usuario;
import com.juegocuatroenlinea.controlador.util.JsfUtil;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;

import javax.inject.Named;

/**
 *
 * @author Leydi
 */
@Named(value = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {
    
    private Usuario usuario;
    @EJB
    private UsuarioFacade usuarioFacade;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    /**
     * Creates a new instance of ControladorJuegoCuatroenlinea
     */
    public LoginBean() {
         
    }
    @PostConstruct
    private void inicializar()
    {
       usuario = new Usuario();
    }
    public String ingresar()        
    {
        Usuario usuarioEncontrado=usuarioFacade.obtenerUsuarioxCorreo(usuario.getCorreo());
        if(usuarioEncontrado != null)
        {
            if(usuario.getContrasenia().compareTo(usuarioEncontrado.getContrasenia())==0)
            {
                ControladorJuegoCuatroenlinea contCuatroenlinea= (ControladorJuegoCuatroenlinea) FacesUtils.getManagedBean("controladorJuegoCuatroenlinea");
                contCuatroenlinea.setUsuario(usuarioEncontrado);
               
                if(usuarioEncontrado.getTipoUsuario().getIdtipoUsuario().equals("2"))
                {
                   return "ingresar";  
                }else {
                    return "jugar";
                }
            }
            
        }
        
        else
        {
            JsfUtil.addErrorMessage("El correo ingresado no existe");
        }
        return null;
    }

    
    }
            

