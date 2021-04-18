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

    public Curso(String nombre, String tematica, int logo, int costo, boolean status) {
        this.nombre = nombre;
        this.tematica = tematica;
        this.logo = logo;
        this.costo = costo;
        this.status = status;
    }
    private String nombre;
    private String tematica;
    private int logo;
    private int costo;
    boolean status;
}
