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

    public int unoConArrayList(ArrayList<Integer> a){
      int mult=1;
        for(int i=0; i<a.size(); i++){
         mult= mult*a.get(i);
        }
        return mult;
    }
    
    public int unoConLinkedList(LinkedList<Integer> a){
      int mult=1;
        for(int i=0; i<a.size(); i++){
         mult= mult*a.get(i);
        }
        return mult;
    }
    
    public void SmartInsertArrayList(ArrayList<Integer>a, int data){
   
     for(int i=0; i<a.size(); i++){
      if(data==a.get(i)){
       return;
      }
     }
      a.add(data);
    }
    
    public void SmartInsertLinkedList(LinkedList<Integer>a, int data){
     //if(){}else{}
     for(int i=0; i<a.size(); i++){
      if(data==a.get(i)){
       return;
      }
     }
      a.add(data);
    }
    
        public int tresConArrayList(ArrayList<Integer>a){
        int tot=0;
        for(int i=0; i<a.size(); i++){
         tot+= a.get(i);
        }
        int target=tot/2;
        int dif;
        int sum=0;
        for(int j=0; j<a.size(); j++){
        sum+=a.get(j);
        dif= target-sum;
        if(dif<=a.get(j+1)){
        return j+1;
        }
        }
        return 0;
    }
    
    public int tresConLinkedList(LinkedList<Integer>a){
        int tot=0;
        for(int i=0; i<a.size(); i++){
         tot+= a.get(i);
        }
        int target=tot/2;
        int dif;
        int sum=0;
        for(int j=0; j<a.size(); j++){
        sum+=a.get(j);
        dif= target-sum;
        if(dif<=a.get(j+1)){
        return j+1;
        }
        }
        return 0;
    }
    
    //La lista de neveras es una lista que enmuera las neveras en el orden en que fueron metidas a la bodega
    //La lista de solicitudes es una lista de las ordenes puestas por las tiendas en orden cronologico, su valor nos indica cuantas neveras pidió la respectiva tienda    
    public static void ejercicio4(LinkedList<Integer>neveras, LinkedList<Integer>solicitudes){
        int clientes= 0;
        int n= neveras.size();
        while(clientes<solicitudes.size()){
            int numc= clientes+1;
          System.out.println("El cliente "+numc+" se llevará las neveras:");
          int nn=0;
          for(int i=0; i<solicitudes.get(clientes); i++){
             nn= n-i;  //numero de la nevera que se va a llevar el cliente 
           System.out.print(nn+", ");
          }
          System.out.println();
          n=nn-1;
          if(solicitudes.get(clientes+1)!=null&& n<solicitudes.get(clientes+1)){
             numc++; 
           System.out.println("El numero de neveras  que quedan no cumple con la demanda del cliente "+numc);
           break;
          }
          clientes++;  
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Laboratorio03 miLab= new Laboratorio03();
//__________________________________________PUNTO 1.1________________________________________//
       
        ArrayList uno= new ArrayList<Integer>();
        uno.add(1);
        uno.add(2);
        uno.add(3);
        uno.add(4);
        LinkedList uno2= new LinkedList<Integer>();
        uno2.add(1);
        uno2.add(2);
        uno2.add(3);
        uno2.add(4);
       System.out.println(miLab.unoConArrayList(uno));
       System.out.println(miLab.unoConLinkedList(uno2));
        
//__________________________________________PUNTO 1.2________________________________________//
        miLab.SmartInsertArrayList(uno, 4);
        System.out.println();
        for(int x=0; x<uno.size(); x++){
        System.out.print(uno.get(x));
        }
        System.out.println();
        miLab.SmartInsertLinkedList(uno2, 5);
        for(int y=0; y<uno2.size(); y++){
       System.out.print(uno2.get(y));
        }
        System.out.println();
//__________________________________________PUNTO 1.3________________________________________//
        System.out.println(miLab.tresConArrayList(uno));
        System.out.println(miLab.tresConLinkedList(uno2));
//__________________________________________PUNTO 1.4________________________________________//
        LinkedList<Integer> fridges= new LinkedList(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        LinkedList<Integer> orders= new LinkedList(Arrays.asList(6,3,5,3));
        ejercicio4(fridges, orders);
        
        
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
