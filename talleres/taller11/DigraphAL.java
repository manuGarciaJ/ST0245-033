/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.ArrayList;


/**
 *
 * @see Grafo con listas
 * Codigo esqueleto tomado de: https://github.com/mauriciotoro/ST0245-Eafit/blob/master/talleres/taller11/Java/Laboratorio1/DigraphAL.java
 * y modificado por: Isaias Labrador Sánchez. Sin intencion de infringir los derechos de autor.
 */
public class DigraphAL{
    
    int tamaño = 0;
    ArrayList [] nodos = new ArrayList [tamaño];
    
    public DigraphAL(int size)
    {
      this.tamaño = size;     
    }
   
    /**
     * 
     * @param source
     * @param destination
     * @param weight
     * @see Añade peso a de un nodo a otro (distancia) 
     */
    public void addArc(int source, int destination, int weight)
    {
        this.nodos[source].add(destination, weight);
    }

    /**
     * 
     * @param source
     * @param destination
     * @return peso entre los dos vertices 
     */
    public int getWeight(int source, int destination)
    {
        return (int) this.nodos[source].get(destination);
    }

    /**
     * 
     * @param vertice
     * @return vertices vecinos ArrayList<Integer> 
     */
    public ArrayList<Integer> getSuccessors(int vertice)
    {
        return this.nodos[vertice];
    }
    
}
