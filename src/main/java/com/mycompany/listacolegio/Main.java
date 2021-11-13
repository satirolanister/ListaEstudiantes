package com.mycompany.listacolegio;

import java.util.Scanner;
import logica.Logica;
import persona.Estudiante;

/**
 *
 * @author Dev
 */
public class Main 
{
     public static void main(String args[])
     {
         int li_op;
         Logica lil_instancia;
         Scanner lsc_input;
         
         li_op = 0;
         lil_instancia = new Logica();
         lsc_input = new Scanner(System.in);
         
         while (li_op != 6) 
         {   
             System.out.println(lil_instancia.listaMenu());
             li_op = lsc_input.nextInt();
             
             switch(li_op)
             {
                 case 1:
                     lil_instancia.getListStudent(); 
                 break;
                 case 2:
                     int cantidad;
                     
                     cantidad = lil_instancia.sizeListStudent();
                     
                     System.out.println(cantidad);
                 break;
                 case 3:
                     System.out.println("op3");
                 break;
                 case 4:
                     System.out.println("op4");
                 break;
                 case 5:
                 {
                     String ls_nombre;
                     String ls_correo;
                     String ls_curso;
                     int li_edad;

                     System.out.println("Ingrese el nombre completo del alumno\n");
                     ls_nombre = lsc_input.next();
                     System.out.println("Ingrese el correo electronico del alumno\n");
                     ls_correo = lsc_input.next();
                     System.out.println("Ingrese la edad del alumno\n");
                     li_edad = lsc_input.nextInt();
                     System.out.println("Ingrese el curso al que pertenece el alumno\n");
                     ls_curso = lsc_input.next();
                     
                     lil_instancia.addStudent(ls_nombre, ls_correo, ls_curso, li_edad);
                     
                 }    
                 break;
                 case 6:
                     System.out.println("op6");
                 break;
                 default:
                     System.out.println("opd");
                 break;
             }
         }

     }
    
}
