/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataClasses;

import java.util.Scanner;

/**
 *
 * @author MARIEL
 */
public class Fecha {
    //atributos
    private int dia;
    private int mes;
    private int annio;

    //constructores
    public Fecha() {
        dia = 1;
        mes = 1;
        annio = 1900;
    }
    
    public Fecha(int dia, int mes, int annio) {
        this.dia = dia;
        this.mes = mes;
        this.annio = annio;
    }
    
    //metodos
    @Override
    public String toString() {
        return dia+"/"+mes+"/"+annio;
    }
    
    //getters y setters

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }
    
    
}
