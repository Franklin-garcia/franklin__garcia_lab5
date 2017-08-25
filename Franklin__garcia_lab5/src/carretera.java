/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franklin Garcia
 */
public class carretera {
    private int numero;
    private double distancia;
    private int inicio;
    private int fin;

    public carretera() {
    }

    public carretera(int numero, double distancia, int inicio, int fin) {
        this.numero = numero;
        this.distancia = distancia;
        this.inicio = inicio;
        this.fin = fin;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getFin() {
        return fin;
    }

    public int getInicio() {
        return inicio;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }



    @Override
    public String toString() {
        return ""+numero;
    }
   
}
