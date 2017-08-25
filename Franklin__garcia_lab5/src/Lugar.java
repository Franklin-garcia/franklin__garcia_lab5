
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franklin Garcia
 */
public class Lugar {
     private String nombre;
     private String dirección;
     private int nivel_seguridad;
     private ArrayList<String>carretera_entrada=new ArrayList();
     private String salida;

    public Lugar() {
    }

    public Lugar(String nombre, String dirección, int nivel_seguridad, String salida) {
        this.nombre = nombre;
        this.dirección = dirección;
        this.nivel_seguridad = nivel_seguridad;
        this.salida = salida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public int getNivel_seguridad() {
        return nivel_seguridad;
    }

    public void setNivel_seguridad(int nivel_seguridad) {
        this.nivel_seguridad = nivel_seguridad;
    }

    public ArrayList<String> getCarretera_entrada() {
        return carretera_entrada;
    }

    public void setCarretera_entrada(ArrayList<String> carretera_entrada) {
        this.carretera_entrada = carretera_entrada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    @Override
    public String toString() {
        return nombre;
    }
     
}
