/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Alway
 */
public class Curso {

    Integer idCurso;
    String nombreCurso;
    String seccionCurso;
    Date fechaInicio;
    Date fechaFin;
    String horaInicio;
    String horaFin;
    Usuario usuarioAsignado;
    ArrayList<Usuario> alumnoAsignado;
    Map<Usuario, Integer> notasAlumnos;
    Integer conteoAsignados;

    public Curso(Integer idCurso, String nombreCurso, String seccionCurso, Date fechaInicio, Date fechaFin, String horaInicio, String horaFin, Usuario usuarioAsignado, Integer conteoAsignados) {
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.seccionCurso = seccionCurso;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.conteoAsignados = conteoAsignados;
        this.usuarioAsignado = usuarioAsignado;
        this.alumnoAsignado = new ArrayList<>();
        this.notasAlumnos = new HashMap<>();

    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getSeccionCurso() {
        return seccionCurso;
    }

    public void setSeccionCurso(String seccionCurso) {
        this.seccionCurso = seccionCurso;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public Usuario getUsuarioAsignado() {
        return usuarioAsignado;
    }

    public void setUsuarioAsignado(Usuario usuarioAsignado) {
        this.usuarioAsignado = usuarioAsignado;
    }

    public Integer getConteoAsignados() {
        return conteoAsignados;
    }

    public void setConteoAsignados(Integer conteoAsignados) {
        this.conteoAsignados = conteoAsignados;
    }

    public ArrayList<Usuario> getAlumnoAsignado() {
        return alumnoAsignado;
    }

    public void agregarAlumnos(Usuario alumno) {
        alumnoAsignado.add(alumno);
        notasAlumnos.put(alumno, null);
    }

    public void eliminarAlumno(Usuario alumno) {
        alumnoAsignado.remove(alumno);
        notasAlumnos.remove(alumno, null);
    }

    public void agregarNota(Usuario alumno, int nota) {
        if (notasAlumnos.containsKey(alumno)) {
            notasAlumnos.put(alumno, nota);
        }
    }

    public Integer getNota(Usuario alumno) {
        return notasAlumnos.get(alumno);
    }
    
    public Map<Usuario, Integer> getNotasAlumnos() {
        return notasAlumnos;
    }


    @Override
    public String toString() {
        return idCurso + " -- " + nombreCurso;
    }

}
