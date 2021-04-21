/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Boris Monge
 */
public class Curso {

    public Curso(String nombre, String tematica, int logo, int costo, String status) {
        this.nombre = nombre;
        this.tematica = tematica;
        this.logo = logo;
        this.costo = costo;
        this.status = status;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    private String nombre;
    private String tematica;
    private int logo;
    private int costo;
    private String status;

    public Curso() {
        this.nombre = "";
        this.tematica = "";
        this.logo = 0;
        this.costo = 0;
        this.status = "";
    }
}
