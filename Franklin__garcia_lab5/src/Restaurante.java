/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franklin Garcia
 */
public class Restaurante extends Lugar {

    private String categoria;
    private String calificacion;
    
    public Restaurante() {
        super();
    }

    public Restaurante(String categoria, String calificacion, String nombre, String dirección, int nivel_seguridad, carretera salida) {
        super(nombre, dirección, nivel_seguridad, salida);
        this.categoria = categoria;
        this.calificacion = calificacion;
    }

 

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
