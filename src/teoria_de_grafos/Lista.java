/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria_de_grafos;

/**
 *
 * @author Usuario
 */
public class Lista {
    private Nodo first;
    private String nombre;
    private int tamano;
    private Nodo last;
    
    public Lista(String nombre_lista){
        this.first = null;
        this.nombre = nombre_lista;
        this.tamano = 0;
        this.last=null;
    }
    
    public void setPrimero(Nodo Point){
        this.first = Point;
    }
   
    
    public int length(){
        return tamano;
    }
    
    public boolean esVacio(){
        return first==null;
    }
    
    public Nodo primero(){
        return first;
    }
    
    public Nodo proximo(Nodo valor){
        if(valor != null){
            valor = valor.pnext;
            return valor;
        }else{
            return null;
        }
    }
    
    public int leer_id(Nodo valor){
        return valor.ID;
    }
    
    public int leer_anio(Nodo valor){
        return valor.anio;
    }
    
    public String leer_nombre(Nodo valor){
        return valor.nombre;
    }
    
    public void recorrer(){
        Nodo aux;
        if(esVacio()){
            System.out.println(nombre +" está vacía");
        }else{
            aux=first;
            while(aux!=null){
                aux = proximo(aux);
            }
        }
    }
    
    public Nodo ultimo(){
        Nodo aux;
        if(esVacio()){
            return null;
        }else{
            aux=first;
            while(aux.pnext!=null){
                aux = proximo(aux);
            }
            return aux;
        }
    }
    public void Insertar_final( int ID,String Nombre, int anio) {
        Nodo nuevo = new Nodo(Nombre,ID,anio);
        if (esVacio()) {
            first = last = nuevo;
        } else {
            //nuevo.setSiguiente(last.getSiguiente());
            last.setPnext(nuevo);
            last = nuevo;
        }
        tamano++;
    }
}
