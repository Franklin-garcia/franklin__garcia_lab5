/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franklin Garcia
 */
public class canchas extends Lugar{
    private String categoria;
    private String estado;

    public canchas() {
        super();
    }

    public canchas(String categoria, String estado, String nombre, String dirección, int nivel_seguridad, carretera salida) {
        super(nombre, dirección, nivel_seguridad, salida);
        this.categoria = categoria;
        this.estado = estado;
    }




    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
     return super.toString();
    }

}
