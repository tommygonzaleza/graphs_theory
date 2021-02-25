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
public class GrafoMA {
    boolean dirigido;           // Inidica si es dirigido o no.
    int maxNodos;               // Tamaño máximo de la tabla.
    int numVertices;            // Número de vértices del grafo.
    boolean[][] matriz;      // Matriz de adyacencias del grafo.
    
    GrafoMA(int maxNodos){
        maxNodos = numVertices = 0;
        matriz = new boolean[maxNodos][maxNodos];
    }
    
    public void insertarArista(int nodoA, int nodoB){
        matriz[nodoA][nodoB] = true;
    }
    
    public boolean esAdyacente(int nodoA, int nodoB){
        return matriz[nodoA][nodoB];
    }
    
    
}
