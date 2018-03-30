/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio03;

import java.util.LinkedList;

/**
 *
 * @author Isaias Labrador Sanchez & Manuel Garcia Jimenez
 */
public class Laboratorio03 {

    
    public static void ejercicio4(LinkedList solicitudes, LinkedList almacenes){
        if(!solicitudes.isEmpty() || !almacenes.isEmpty()){
            LinkedList retornar = new LinkedList();            
            for(int i = solicitudes.size()-1; i>=1; i=i-2){
                
                int aux = (int) solicitudes.get(i-1);
                    if(almacenes.isEmpty()){
                        // Si ya no hay "neveras" a todos los almacenes que siguen les crea una lista con su nombre dicendo que estan en lista de espera
                        LinkedList aux3 = new LinkedList();
                        aux3.add(solicitudes.get(i));
                        aux3.add("En lista de espera");
                        //añade la lista del almacen diciendo que todavia esta en lista de espera
                        retornar.add(aux3);
                    }
                    else{
                        
                        // si todavia hay "neveras" el programa añade a la tienda que se esta atendiendo el
                        // el numero de neveras que requiere, segun la disponibilidad
                        int cont = 0;
                        //crea un linked list para añadir la tienda y sus neveras
                        LinkedList aux2 = new LinkedList();
                        //añade el nombre del solicitador
                        aux2.add(solicitudes.get(i));

                        for(int j = almacenes.size()-1; j>=0; j--){
                            // si el contador es diferente de el numero de neveras que pidio...
                            if(cont != aux){
                            //añade la nevera, su codigo(Posicion), y la quita de la lista
                            aux2.add(almacenes.get(j));
                            aux2.add(j);
                            almacenes.remove(j);
                            cont++;
                            }
                            }
                        //le añade a el linked list respuesta la lista con el almacen atendido y sus neveras
                        retornar.add(aux2);
                    }
            }
            //imprime La respuesta
            for(Object elem: retornar){
                  System.out.println(elem);
            }
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//__________________________________________PUNTO 1.4________________________________________//
        LinkedList almacen = new LinkedList();
            almacen.add(0,"haceb");
            almacen.add(1, "LG");
            almacen.add(2, "LG X2000");
            //ultima NEVERA
            almacen.add(3, "samsung");
        LinkedList solicitudes = new LinkedList();
            solicitudes.add(1);
            solicitudes.add("eafit");
            solicitudes.add(1);
            solicitudes.add("la14");
            solicitudes.add(3);
            solicitudes.add("Google");
        ejercicio4(solicitudes, almacen);
        
        
//_____________________________________PUNTO 1.5____________________________________________//
        System.out.println("\n PUNTO 1.5\n");
        LinkedListMauricio test = new LinkedListMauricio();
        Node uno = new Node(10);        
        test.first = uno;        
        Node dos = new Node(25);
        Node tres = new Node (99);
        uno.ref = dos;
        dos.ref = tres;
        
        test.insert(2,3);
        
        
        for(int i = 0; i<test.size();i++){
            Node aux = test.getNode(i);
            System.out.print(aux.value +  " - ");
        }
        
//_____________________________________PUNTO 1.6____________________________________________//
        //lista Vacia
        System.out.println("\n\n\n PUNTO 1.6 \n");
        System.out.println("Prueba Lista vacia");
        LinkedListMauricio test_listaVacia = new LinkedListMauricio();
        System.out.println("Borrando de la lista vacia: ");
        test_listaVacia.remove(2);
        System.out.println("Insertando en la lista vacia: ");
        test_listaVacia.insert(3,14);        
        System.out.println("\n\nImprimiendo la lista luego de pruebas: ");
        for(int i = 0; i<test_listaVacia.size();i++){
            Node aux = test_listaVacia.getNode(i);
            System.out.print(aux.value +  " - ");
            
        }
        System.out.println("\n\n\nPrueba Primer Elemento");
        
        System.out.println("\n\nImprimiendo la lista antes insertar primero: ");
        
        for(int i = 0; i<test.size();i++){
            Node aux = test.getNode(i);
            System.out.print(aux.value +  " - ");
            
        }
        
        ////////////////////////
        test.insert(243, 0);////  <---- Insertando de primero
        ////////////////////////
        
        
        System.out.println("\n\nImprimiendo la lista luego insertar primero: ");
        
        for(int i = 0; i<test.size();i++){
            Node aux = test.getNode(i);
            System.out.print(aux.value +  " - ");
            
        }
        
        System.out.println("\n\nImprimiendo la lista antes borrar primero: ");
        
        for(int i = 0; i<test.size();i++){
            Node aux = test.getNode(i);
            System.out.print(aux.value +  " - ");
            
        }
        
        ////////////////////////
        test.remove(0);////  <---- Borrando primero
        ////////////////////////
        
        
        System.out.println("\n\nImprimiendo la lista luego borrar primero: ");
        
        for(int i = 0; i<test.size();i++){
            Node aux = test.getNode(i);
            System.out.print(aux.value +  " - ");
            
        }
        
        System.out.println("\n\n\nPrueba Ultimo Elemento");
        
        System.out.println("\n\nImprimiendo la lista antes insertar ultimo: ");
        
        for(int i = 0; i<test.size();i++){
            Node aux = test.getNode(i);
            System.out.print(aux.value +  " - ");
            
        }
        
        ////////////////////////
        test.insert(243, test.size());////  <---- Insertando de ultimo
        ////////////////////////
        
        
        System.out.println("\n\nImprimiendo la lista luego insertar ultimo: ");
        
        for(int i = 0; i<test.size();i++){
            Node aux = test.getNode(i);
            System.out.print(aux.value +  " - ");
            
        }
        
        System.out.println("\n\nImprimiendo la lista antes borrar ultimo: ");
        
        for(int i = 0; i<test.size();i++){
            Node aux = test.getNode(i);
            System.out.print(aux.value +  " - ");
            
        }
        
        ////////////////////////
        test.remove(test.size()-1);////  <---- Borrando primero
        ////////////////////////
        
        
        System.out.println("\n\nImprimiendo la lista luego borrar ultimo: ");
        
        for(int i = 0; i<test.size();i++){
            Node aux = test.getNode(i);
            System.out.print(aux.value +  " - ");
            
        }
        
        System.out.println("\n\n\n PUNTO 1.7 \n");
        
        LinkedList filas = new LinkedList();
        LinkedList fila1= new LinkedList(); fila1.add(1);
        LinkedList fila2= new LinkedList(); fila2.add(2);
        LinkedList fila3= new LinkedList(); fila3.add(3);
        LinkedList fila4= new LinkedList(); fila4.add(4);
        
        fila4.add("mauricio");fila2.add("juan");fila2.add("roberto");
        fila2.add("andres");fila2.add("Vanessa");
        fila3.add("don Lucho");
        
        
        filas.add(fila1);
        filas.add(fila2);
        filas.add(fila3);
        filas.add(fila4);
        
        Banco.simular(filas);
        
        
        System.out.println("\n\n\n PUNTO 2.2 \n");
        
        Punto2_2.procesar();
       
    }
    
}
