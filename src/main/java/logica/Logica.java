package logica;

import persona.Estudiante;
import db.ListaInformacion;
import java.util.Scanner;

public class Logica {

    private final ListaInformacion instanciaListas;

    public Logica() {
        instanciaListas = new ListaInformacion();
    }

    public String listaMenu() {
        String returnMenu;

        returnMenu = "\n";
        returnMenu += "---------";
        returnMenu += "Menú";
        returnMenu += "---------\n";
        returnMenu += "1. Listar aprendices\n";
        returnMenu += "2. Ver cantidad de aprendices\n";
        returnMenu += "3. Remover un aprendiz\n";
        returnMenu += "4. Limpiar la lista\n";
        returnMenu += "5. Agregar Aprendiz\n";
        returnMenu += "6. Salir\n";
        returnMenu += "Digite el número de la opción que necesite";
        return returnMenu;
    }

    public void addStudent(String nombre, String correo, String curso, int edad) {
        Estudiante instanciaEstudiante;
        instanciaEstudiante = new Estudiante();

        instanciaEstudiante.setNombre(nombre);
        instanciaEstudiante.setCorreo(correo);
        instanciaEstudiante.setIs_curso(curso);
        instanciaEstudiante.setEdad(edad);

        instanciaListas.addElement(instanciaEstudiante);

        System.out.println("Se ha agregado al estudiante " + instanciaEstudiante.getNombre());

    }

    public void getListStudent() {
        int tamanoLista = instanciaListas.getInstantListStudent().size();

        if (tamanoLista == 0) 
        {
            System.out.println("No hay datos en el momento");
        } 
        else 
        {
            String cabeceras[] = {"nombre", "Edad", "correo", "curso"};
            System.out.println("indice |\t"+cabeceras[0].toUpperCase() + "\t|\t"+cabeceras[1].toUpperCase() + "|\t"+cabeceras[2].toUpperCase() + "\t|\t"+cabeceras[3].toUpperCase() + "\t|\t");
            
            for (int i = 0; i <= tamanoLista-1 ; i++) 
            {
                
                System.out.println(
                        "\n\t"+(i+1)+"|\t"+instanciaListas.getInstantListStudent().get(i).getNombre()
                        + "|\t"+ instanciaListas.getInstantListStudent().get(i).getEdad()
                        + "\t|\t"+ instanciaListas.getInstantListStudent().get(i).getCorreo()
                        + "|\t"+ instanciaListas.getInstantListStudent().get(i).getIs_curso());
            }
        }
    }

    public int sizeListStudent() 
    {
        return instanciaListas.getInstantListStudent().size();
    }
    
    public void deleteStudent(String arg) 
    {
        int indice;
        indice = instanciaListas.seachStudent(arg);
        if(indice ==-1)
        {
          System.out.println("El alumno "+arg+" no ser encuentra en la lista");
        }else
        {
          Scanner input;
          int seleccion;
          
          input = new Scanner(System.in);
          
          System.out.println("Desea eliminar el registro del alumno \n 1.Si \t 2.No");
          seleccion = input.nextInt();
          
              switch(seleccion)
                {
                    case 1:
                        instanciaListas.deleteEment(indice);
                        System.out.println("Alumno seleccionado ha sido borrado "+arg);  
                    break;
                    case 2:
                        System.out.println("No se elimina registro del alumno "+arg);
                    break;
                    default:
                        System.out.println("Opcion invalida");
                    break;    
                }
        }       
    }
    
    public void deleteAllList(int select)
    {
        if(select == 1)
        {
            instanciaListas.allDeleteRegister();
            System.out.println("Se a eliminado todos los registros de la lista \n1.Si\t2.No");
        }
        else
        {
            System.out.println("No se elimino la lista");
        }
    }
        
}
