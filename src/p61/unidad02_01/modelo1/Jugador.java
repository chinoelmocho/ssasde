/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad02_01.modelo1;
import java.time.LocalDate;


 
public class Jugador {
    
    private String nombre;
    private double peso ;
    private int estatura; 
    private LocalDate Fechadenacimeinto;

    public Jugador(String nombre, double peso, int estatura, LocalDate Fechadenacimeinto) {
        this.nombre = nombre;
        this.peso = peso;
        this.estatura = estatura;
        this.Fechadenacimeinto = Fechadenacimeinto;
    }

    public int Calcularedad(){
    var yearActual=LocalDate.now().getYear();
    var retorno =yearActual-this.Fechadenacimeinto.getYear();
    var monthActual=LocalDate.now().getMonthValue();
    var deiActual=LocalDate.now().getDayOfMonth();
    var plan= monthActual-this.Fechadenacimeinto.getMonthValue();
    var soso= deiActual-this.Fechadenacimeinto.getDayOfMonth();
    if (plan>0){    
     retorno-=1;
        
    }
    if (plan==0){    
     if(soso<0);
     retorno-=1;
        
    }
       
    return retorno;
    
    
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    

    public LocalDate getFechadenacimeinto() {
        return Fechadenacimeinto;
    }

    public void setFechadenacimeinto(LocalDate Fechadenacimeinto) {
        this.Fechadenacimeinto = Fechadenacimeinto;
        }}
    
    
    
   
         
          

