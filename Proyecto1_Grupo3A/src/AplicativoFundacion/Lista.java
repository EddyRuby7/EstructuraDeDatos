/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplicativoFundacion;

/**
 *
 * @author USUARIO
 */
public class Lista {
    //Declaracion de Atributos
    private Nodo inicio;
    private Nodo fin;
	
    //Constructor
    public Lista() {
            inicio = fin = null;
    }

    //Metodeo para agregar un nuevo nodo
    public void agregarNodo(RegistroFamilia familia){
        
        Nodo nuevo = new Nodo(familia, inicio);
        
        if(inicio==fin && fin==null){
            inicio=fin=nuevo;
        }
        else{
            inicio=nuevo;
        }
    }
    
    //Metodeo para agregar un nuevo nodo
    public void agregarDatos(RegistroDatos datos){
        
        Nodo nuevo = new Nodo(datos, inicio);
        
        if(inicio==fin && fin==null){
            inicio=fin=nuevo;
        }
        else{
            inicio=nuevo;
        }
    }
    
    //Metodo para imprimir recursivamente
    public void imprimir(Nodo actual){
        if(actual!=null){
            System.out.println(actual.getDato().toString());
            imprimir(actual.getSiguiente());
        }
		
    }
	
    public void imprimir(){
        imprimir(inicio);
    }
    
    //Metodo para contar datos del Nodo
    public int contar(Nodo actual){
        int cont=0;
        if(actual!=null){
            cont=contar(actual.getSiguiente())+1;
        }
        return cont;
    }
    
    public int contar(){
        return contar(inicio);
    }
    
    //Metodo para buscar un dato
    public void buscar(int encontrar){
        Nodo aux=inicio;
        
        while(aux!=null){
            if (encontrar > aux.getDato().getCedula()){
               System.out.println(aux.getDato().toString());
            }
            aux=aux.getSiguiente();
        }
    }

    //Metodo para eliminar un nodo
    public boolean eliminar(int cedula){
        if(inicio !=null){
            
            if(inicio==fin && inicio.getDato().getCedula()==cedula){
                inicio =fin =null;
                return true;
            }else if(inicio.getDato().getCedula()==cedula){
                inicio =inicio.getSiguiente();
                return true;
            }else{
                Nodo anterior=inicio;
                Nodo temporal=inicio.getSiguiente();

                while (temporal!=null && temporal.getDato().getCedula()!=cedula){
                    anterior=anterior.getSiguiente();
                    temporal=temporal.getSiguiente();
                }
                if(temporal !=null){
                    anterior.setSiguiente(temporal.getSiguiente());
                    if(temporal==fin){
                            fin= anterior;
                    }
                    return true;
                }
                return false;
            }
        }return false;

    }
}
