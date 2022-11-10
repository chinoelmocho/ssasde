/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad02_01.modelo1;

import java.util.ArrayList;

/**
 *
 * @author LAB-2
 */
public class Atencion {

  private String Veterinario;
  private double costo;
  private Mascota mascota;
  private int cantidadRecetas;
  private ArrayList<Receta> resetini;

    public Atencion(String Veterinario, double costo, Mascota mascota) {
        this.Veterinario = Veterinario;
        this.costo = costo;
        this.mascota = mascota;
        this.resetini = new ArrayList<Receta>();

    }
    public void recetas(String medicamento, int cantidad, String indicacion){
    var recetas=new Receta(medicamento,cantidad,indicacion);
    this.resetini.add(recetas);
    }

    

  

    public String getVeterinario() {
        return Veterinario;
    }

    public void setVeterinario(String Veterinario) {
        this.Veterinario = Veterinario;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
           public String toString() {
        var retorno= "Atencion{" + "Veterinario=" + Veterinario + ", costo=" + costo + ", mascota=" + mascota + ","+ "cantidadRecetas=" + cantidadRecetas +"\n";
        for(var rezeta:this.resetini){
            retorno+=rezeta.toString()+"\n";
    }
        return retorno;
}
}
