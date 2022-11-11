/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudianteServices;
import java.util.ArrayList;
import java.util.List;
import p61.unidad02_01.modelo1.Estudiante;
/**
 *
 * @author LAB-2
 */
public class EstudianteServicio {
    List<Estudiante> estudianteList;
    public void crear(Estudiante estudiantes){
    this.estudianteList.add(estudiantes);
    
    }
    public List<Estudiante> listar(){
    return this.estudianteList;
    }
    public void eliminar(int posicion){
    this.estudianteList.remove(posicion);
    }
}
