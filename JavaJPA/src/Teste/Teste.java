/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import DAO.ProcessoDAO;
import DAO.UsuarioDAO;
import java.util.List;
import models.Processo;
import models.Usuario;

/**
 *
 * @author mayck
 */
public class Teste {

    public static void main(String[] args) {

        //System.out.println("Arrozera"); Comentantoo código de imprimir
        /*
        Usuario u = new Usuario();

        UsuarioDAO uDAO = new UsuarioDAO();

        u.setIdUsuario(3);
        u.setNome("Corona");
        u.setSobreNome("Virus");

        uDAO.saveUsuario(u);
         */
 /*
        UsuarioDAO uDAO = new UsuarioDAO();
        Usuario u = uDAO.findByID(3);
        System.out.println("Usuario: " + u.getNome());
         */
 /*
        UsuarioDAO uDAO = new UsuarioDAO();
        for (Usuario u : uDAO.findAll()) {
            System.out.println("Nome: " + u.getNome());
        }*/
        //UsuarioDAO uDAO = new UsuarioDAO();
        //Usuario u = new Usuario();
        //uDAO.remove(3);
        /*
        ProcessoDAO pDAO = new ProcessoDAO();

        Usuario u = new Usuario();
        u.setIdUsuario(1);

        Processo p = new Processo();
        p.setDescricao("Terceiro");
        p.setUsuario(u);

        pDAO.save(p);
         */
 /*
        ProcessoDAO pDAO = new ProcessoDAO();
        Processo p = new Processo();

        p = pDAO.findById(1);

        System.out.println("ID do Processo: " + p.getIdProcesso());
        System.out.println("Descrição do Processo: " + p.getDescricao());
        System.out.println("Usuário do Processo: " + p.getUsuario().getNome() + " " + p.getUsuario().getSobreNome());
         */
 /*
        ProcessoDAO pDAO = new ProcessoDAO();

        for (Processo p : pDAO.findAll()) {
            System.out.println("ID: " + p.getIdProcesso());
            System.out.println("Nome: " + p.getDescricao());
            System.out.println("Sobrenome: " + p.getUsuario().getNome());
        }
         */

 /*
        ProcessoDAO pDAO = new ProcessoDAO();
        Processo p = new Processo();
        pDAO.remove(2);
         */
    }
}
