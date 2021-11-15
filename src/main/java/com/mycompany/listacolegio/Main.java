package com.mycompany.listacolegio;

import java.util.Scanner;
import logica.Logica;


/**
 *
 * @author Dev
 */
public class Main 
{
     public static void main(String args[])
     {
         int opcionesMenu;
         Logica instanciaLogica;
         Scanner input;
         
         opcionesMenu = 0;
         instanciaLogica = new Logica();
         input = new Scanner(System.in);
         
         while (opcionesMenu != 6) 
         {   
             System.out.println(instanciaLogica.listaMenu());
             opcionesMenu = input.nextInt();
             
             switch(opcionesMenu)
             {
                 case 1:
                     instanciaLogica.getListStudent(); 
                 break;
                 case 2:
                     int cantidad;
                     
                     cantidad = instanciaLogica.sizeListStudent();
                     
                     System.out.println("Cantidad de alumnos en la lista "+cantidad);
                 break;
                 case 3:
                     String alumnoBusqueda;
                     instanciaLogica.getListStudent();
                     System.out.println("Escriba el nombre del estudiante que desee borrar");
                     alumnoBusqueda = input.next();
                     if(alumnoBusqueda!=null)
                     {
                       instanciaLogica.deleteStudent(alumnoBusqueda);
                     }
                     
                 break;
                 case 4:
                     int select;
                     System.out.println("Desea eliminar todos los registros de la lista de alunmos");
                     select = input.nextInt();
                     instanciaLogica.deleteAllList(select);
                 break;
                 case 5:
                 {
                     String ls_nombre;
                     String ls_correo;
                     String ls_curso;
                     int li_edad;
                     
                     System.out.println("Ingrese el nombre completo del alumno\n");
                     ls_nombre = input.next();
                     System.out.println("Ingrese el correo electronico del alumno\n");
                     ls_correo = input.next();
                     System.out.println("Ingrese la edad del alumno\n");
                     li_edad = input.nextInt();
                     System.out.println("Ingrese el curso al que pertenece el alumno\n");
                     ls_curso = input.next();
                                         
                     instanciaLogica.addStudent(ls_nombre, ls_correo, ls_curso, li_edad);
                     
                 }    
                 break;
                 case 6:
                     System.out.println("Adios, Gracias por usar la aplicacion");
                 break;
                 default:
                     System.out.println("Opcion invalida");
                 break;
             }
         }

     }
    
}
