/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.util.ArrayList;
import java.util.List;
import persona.Estudiante;

/**
 *
 * @author Dev
 */
public class ListaInformacion 
{
    private List<Estudiante> iles_listaStudent;
    
    public ListaInformacion()
    {
        this.iles_listaStudent = new ArrayList<>();
    }

    public List<Estudiante> getIles_listaStudent() {
        return iles_listaStudent;
    }

    public void setIles_listaStudent(List<Estudiante> iles_listaStudent) {
        this.iles_listaStudent = iles_listaStudent;
    }
    
    public void addElement(Estudiante ae_a)
    {
        iles_listaStudent.add(ae_a);
    }
    
    public int studentToList()
    {
        return iles_listaStudent.size();
    }
    
    
    
}
