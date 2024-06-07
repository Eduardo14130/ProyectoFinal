/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

import java.util.ArrayList;


public class Usuario {
       Integer usuarioId;
       String usuarioLogin;
       String nombreUsuario;
       String apellidoUsuario;
       String passwordUsuario;
       String rolUsuario;
       Integer cursosAsignados;

    public Usuario(Integer usuarioId, String usuarioLogin, String nombreUsuario, String apellidoUsuario, String passwordUsuario, String rolUsuario, Integer cursosAsignados) {
        this.usuarioId = usuarioId;
        this.usuarioLogin = usuarioLogin;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.passwordUsuario = passwordUsuario;
        this.rolUsuario = rolUsuario;
        this.cursosAsignados = cursosAsignados;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getUsuarioLogin() {
        return usuarioLogin;
    }

    public void setUsuarioLogin(String usuarioLogin) {
        this.usuarioLogin = usuarioLogin;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public String getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public Integer getCursosAsignados() {
        return cursosAsignados;
    }

    public void setCursosAsignados(Integer cursosAsignados) {
        this.cursosAsignados = cursosAsignados;
    }
    

    @Override
    public String toString() {
        return  nombreUsuario + " " + apellidoUsuario;
    }
       
    
    
       
       
}
