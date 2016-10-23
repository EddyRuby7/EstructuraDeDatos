/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplicativoFundacion;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Principal {
    public static int leerEntero(String mensaje){
        Scanner ingreso=new Scanner(System.in);
        System.out.println(""+mensaje);
        int dato=ingreso.nextInt();
        return dato;             
    }
    
    public static int menu(){
        System.out.println("\t\t\t\tMenu de opciones de la Fundacion");
        System.out.println("1.Ingreso de Datos de la familia");
        System.out.println("2.Ingreso de Datos de la persona");
        System.out.println("3.Seleccionar responsable de la familia");
        System.out.println("4.Asignacion de parentezco familiar");
        System.out.println("5.Eliminar alguna persona");
        System.out.println("6.Reporte");
        System.out.println("7.Salir");
        int dato=leerEntero("Seleccione una opcion: ");
        return dato;    
    }
    
    public static String leerString(String mensaje){
        Scanner ingreso=new Scanner(System.in);
        System.out.println(""+mensaje);
        String dato=ingreso.nextLine();
        return dato;             
    }
    
    public static void main(String[] args) {
        //LLamada de Lista
        Lista coleccion=new Lista();
        //Declaracion de atributos
        int op;
        
        do{
            op=menu();
            switch(op){
                case 1: 
                        RegistroFamilia fam1=new RegistroFamilia();
                        fam1.setCodigo(leerEntero("Ingrese el codigo de la familia: "));
                        fam1.setNombre_familia(leerString("Ingrese el nombre de la familia: "));
                        fam1.setSector(leerString("Ingrese el sector donde vive la familia: "));
                        fam1.setDireccion(leerString("Ingrese la direccion donde vive la familia: "));
                        fam1.setTelefono(leerEntero("Ingrese el numero telefonico de la familia: "));
                        coleccion.agregarNodo(fam1);
                        break;
                case 2: 
                        RegistroDatos dato=new RegistroDatos();
                        dato.setCedula(leerEntero("Ingrese el numero de cedula: "));
                        dato.setNombre(leerString("Ingrese el nombre: "));
                        dato.setApellido(leerString("Ingrese el apellido: "));
                        dato.setDia_Nacimiento(leerEntero("Ingrese el dia de nacimiento: "));
                        dato.setMes_Nacimiento(leerEntero("Ingrese el mes de nacimiento: "));
                        dato.setAnio_Nacimiento(leerEntero("Ingrese el año de nacimiento: "));
                        coleccion.agregarDatos(dato);
                        break;
                case 3:  
                        RegistroFamilia fam2=new RegistroFamilia();
                        System.out.println("Seleccionar responsable de la familia: ");
                        fam2.setNombre_familia(leerString("Ingrese el nombre de la familia: "));
                        break;
                case 4:  
                        System.out.println("Asignación del parentesco del niño o joven");
                        System.out.println("Seleccione la persona: ");
                        break;
                case 5:  
                        RegistroDatos dato2=new RegistroDatos();
                        dato2.setCedula(leerEntero("Ingrese el numero de cedula a eliminar: "));
                        System.out.println("Eliminar cedula: "+coleccion.eliminar(dato2.getCedula()));
                        System.out.println("Impresion de Datos de la persona:");
                        coleccion.imprimir();
                        System.out.println("Los datos de la persona han sido eliminados");
                        break;
                case 6:
                        
                        System.out.println("Impresion de Datos del Canton:");
                        coleccion.imprimir();
                        break;
                case 7:
                        System.exit(0);
                        break;
           }
        
        }while(op!=7);
        
        
    }
}
