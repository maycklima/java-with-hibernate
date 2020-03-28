/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import models.Usuario;

/**
 *
 * @author mayck
 */
public class UsuarioDAO {

    public Usuario saveUsuario(Usuario usuario) {

        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();

            if (usuario.getIdUsuario() == null) {
                em.persist(usuario);
            } else {
                em.merge(usuario);
            }

            em.getTransaction().commit();
        } catch (Exception e) {
        } finally {
            em.close();
        }
        return usuario;
    }

    public Usuario findByID(Integer idUsuario) {
        EntityManager em = new ConnectionFactory().getConnection();
        Usuario usuario = null;

        try {
            usuario = em.find(Usuario.class, idUsuario);
        } catch (Exception e) {
        } finally {
            em.close();
        }
        return usuario;
    }

    public List<Usuario> findAll() {
        EntityManager em = new ConnectionFactory().getConnection();
        List<Usuario> usuarios = null;

        try {

            usuarios = em.createQuery("from Usuario u").getResultList();

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return usuarios;
    }

    public Usuario remove(Integer id) {
        Usuario usuario = null;
        EntityManager em = new ConnectionFactory().getConnection();

        try {

            usuario = em.find(Usuario.class, id);
            em.getTransaction().begin();
            em.remove(usuario);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        return usuario;
    }

}
