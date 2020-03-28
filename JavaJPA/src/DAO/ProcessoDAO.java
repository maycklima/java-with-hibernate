/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import models.Processo;

/**
 *
 * @author mayck
 */
public class ProcessoDAO {

    public Processo save(Processo processo) {

        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            if (processo.getIdProcesso() == null) {
                em.merge(processo);
            } else {
                em.persist(processo);
            }

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        return processo;
    }

    public Processo findById(Integer id) {
        EntityManager em = new ConnectionFactory().getConnection();
        Processo processo = null;

        try {
            processo = em.find(Processo.class, id);
        } catch (Exception e) {

        } finally {
            em.close();
        }
        return processo;

    }

    public List<Processo> findAll() {
        EntityManager em = new ConnectionFactory().getConnection();
        List<Processo> processo = null;

        try {

            processo = em.createQuery("from Processo p").getResultList();

        } catch (Exception e) {
        } finally {
            em.close();
        }

        return processo;
    }

    public Processo remove(Integer id) {
        Processo processo = null;
        EntityManager em = new ConnectionFactory().getConnection();

        try {
            processo = em.find(Processo.class, id);
            em.getTransaction().begin();
            em.remove(processo);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return processo;
    }
}
