/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegocuatroenlinea.controlador;

import com.juegocuatroenlinea.modelo.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Leydi
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "juegocuatroenlineaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
    //crear consultas propias
    public Usuario obtenerUsuarioxCorreo(String email)            
    {
        Query q=em.createNamedQuery("Usuario.findByCorreo", Usuario.class).setParameter("correo", email);
       
        List<Usuario> list= q.getResultList();
        if(!list.isEmpty())
        {
            return list.get(0);
        }    
        return null;
    }
}
