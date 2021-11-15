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
    private List<Estudiante> instantListStudent;
    
    public ListaInformacion()
    {
        this.instantListStudent = new ArrayList<>();
    }

    public List<Estudiante> getInstantListStudent() {
        return instantListStudent;
    }

    public void setInstantListStudent(List<Estudiante> instantListStudent) {
        this.instantListStudent = instantListStudent;
    }
    
    public void addElement(Estudiante ae_a)
    {
        instantListStudent.add(ae_a);
    }
    
    public void deleteEment(int indice)
    {
        instantListStudent.remove(indice);
    }
    
    public int seachStudent(String r)
    {
        int index = -1;
        int bound = instantListStudent.size();
        for (int userInd = 0; userInd < bound; userInd++) {
            if (instantListStudent.get(userInd).getNombre().equals(r)) {
                index = userInd;
                break;
            }
        }
        return index;
    }
    
    public void allDeleteRegister()
    {
        instantListStudent.clear();
    }
    

    
    
    
}
