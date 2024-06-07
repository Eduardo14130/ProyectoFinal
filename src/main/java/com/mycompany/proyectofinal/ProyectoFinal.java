/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectofinal;

import java.util.ArrayList;

public class ProyectoFinal {

    public static ArrayList<Usuario> listaUsuario = new ArrayList();
    public static ArrayList<Curso> listaCurso = new ArrayList();

    public static void main(String[] args) {

        listaUsuario = new ArrayList();
        listaCurso = new ArrayList();

        Usuario user = new Usuario(null, "admin", null, null, "admin", "Administrador",0);
        ProyectoFinal.listaUsuario.add(user);

        Login login = new Login();
        login.setVisible(true);

    }
}
