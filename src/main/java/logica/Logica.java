package logica;

import persona.Estudiante;
import db.ListaInformacion;
import java.util.Iterator;



public class Logica 
{
        
    public String listaMenu()
    {
       String ls_return;
       
       ls_return = "\n";
       ls_return+= "---------";
       ls_return+= "Menú";
       ls_return+= "---------\n";
       ls_return+= "1. Listar aprendices\n";
       ls_return+= "2. Ver cantidad de aprendices\n";
       ls_return+= "3. Remover un aprendiz\n";
       ls_return+= "4. Limpiar la lista\n";
       ls_return+= "5. Agregar Aprendiz\n";
       ls_return+= "6. Salir\n";
       ls_return+= "Digite el número de la opción que necesite";
       return ls_return;
    }
    
    public void addStudent(String as_nombre, String as_correo, String as_curso, int ai_edad)
    {
      Estudiante les_listaEstudiante;
      ListaInformacion lii_lista;
      
      les_listaEstudiante = new Estudiante();
      lii_lista = new ListaInformacion();
      
            les_listaEstudiante.setIs_nombre(as_nombre);
            les_listaEstudiante.setIs_correo(as_correo);
            les_listaEstudiante.setIs_curso(as_curso);
            les_listaEstudiante.setIs_edad(ai_edad);

            lii_lista.addElement(les_listaEstudiante);
            
            System.out.println("Se ha agregado al estudiante "+as_nombre);

    }
    
    public void getListStudent()
    {
        ListaInformacion lli_lista;
        
        lli_lista = new ListaInformacion();
        
        int li_valorLista = lli_lista.getIles_listaStudent().size();
        
        for(int i = 0; i <= li_valorLista-1; i++)
        {
            System.out.println(lli_lista.getIles_listaStudent().get(i));
        }

    }
    
    public int sizeListStudent()
    {
        ListaInformacion lli_lista;
        
        lli_lista = new ListaInformacion();
                
        return lli_lista.studentToList();
    }
    
    public void deleteStudent()
    {
        
    }
}
