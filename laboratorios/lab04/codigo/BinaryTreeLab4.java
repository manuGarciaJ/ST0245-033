
package binarytreelab4;

/**
 *Esta es la solucion a los ejercicios del punto 1
 * @Manuel García 
 */
import java.lang.Math;
public class BinaryTreeLab4 {
    public BinaryTreeLab4 left;
    public BinaryTreeLab4 right;
    public BinaryTreeLab4 actual;
    private final String nombre;
    
    public int size=0;
    
    public BinaryTreeLab4(String n){
    nombre= n;
    }
    
    private BinaryTreeLab4(){
     nombre="a";
    }
    
    public String getNombre(){
     return nombre;
    }
    
    
    public void setRight(String n){
    right= new BinaryTreeLab4(n);
    }
    
    public void setLeft(String n){
    left= new BinaryTreeLab4(n);
    }
    
    //este es el arbol genialogico de Manuel
    public void punto1(){
    BinaryTreeLab4 arbolg= new BinaryTreeLab4("Manuel");
    arbolg.setLeft("Amparo");
    arbolg.setRight("Omar");
    arbolg.right.setRight("Napoleon");
    arbolg.right.setLeft("Ahida");
    arbolg.left.setRight("Ana");
    arbolg.left.setLeft("Guillermo");
    arbolg.right.right.setRight("Manuel");
    arbolg.right.right.setLeft("Carlina");
    arbolg.right.left.setRight("Beatriz");
    arbolg.right.left.setLeft("Arturo");
    arbolg.left.left.setLeft("Rosaura");
    arbolg.left.left.setRight("Jesus");
    arbolg.left.right.setLeft("Eva");
    arbolg.left.right.setRight("Manuel");
    
    // muestra de que esto esta bien:
    
    System.out.println("yo me llamo "+arbolg.getNombre()+" y estas son las personas en mi arbol geneologíco:");
    System.out.println("Mis padres son "+ arbolg.right.getNombre()+" y "+arbolg.left.getNombre());
    System.out.println("Por el lado de mi madre mis abuelos son "+ arbolg.left.left.getNombre()+ " y " + arbolg.left.right.getNombre());
    System.out.println("Los abuelos maternos de mi madre se llamaban "+ arbolg.left.left.left.getNombre()+ " y " + arbolg.left.left.right.getNombre());
    System.out.println("Los abuelos paternos de mi madre se llamaban "+ arbolg.left.right.left.getNombre()+ " y " + arbolg.left.right.right.getNombre());
    System.out.println("Por el lado de mi padre mis abuelos son "+ arbolg.right.right.getNombre()+ " y " + arbolg.right.left.getNombre());
     System.out.println("Los abuelos maternos de mi padre se llamaban "+ arbolg.right.left.left.getNombre()+ " y " + arbolg.right.left.right.getNombre());
    System.out.println("Los abuelos paternos de mi padre se llamaban "+ arbolg.right.right.left.getNombre()+ " y " + arbolg.right.right.right.getNombre());
    }
    
    public void imprimir(){
     if(left!=null){
     left.imprimir();
    }
    System.out.print(nombre+" ");
    if(right!=null){
    right.imprimir();
    }
    }
    
    public boolean buscar(String str){
    if(nombre.equals(str)){
     return true;
    }else{
     if(left!=null){
      return left.buscar(str);
     }
     if(right!=null){
      return right.buscar(str);
     } 
    }
    return false;
    }
    
   public int size(){
   if(nombre!=null)size++;
   if(left!=null)size+=left.size();
   if(right!=null)size+=right.size();
   return size;
   }
   
   public int height(){
    int h= Math.round(Math.round((Math.log10((double)size)/Math.log10((double)2))));
    return h;
   }
   
   public String punto4(){
    if(left.left!=null){
    return left.left.nombre;
    }else return "No se conoce el nombre de la abuela materna";
    
   }
    
    public static void main(String[] args) {
     
     BinaryTreeLab4 a= new BinaryTreeLab4("d");
     a.punto1();//Como el punto 1 y el 2 son iguales solo se hizo una vez
     //punto 3
     a.setLeft("b");
     a.setRight("f");
     a.right.setLeft("e");
     a.right.setRight("g");
     a.left.setLeft("a");
     a.left.setRight("c");
     a.right.right.setRight("h");
     a.imprimir();
     System.out.println();
     System.out.println(a.buscar("a"));
     System.out.println(a.size());
     System.out.println(a.height());
     //punto 4
     System.out.println(a.punto4());
    }
    
    
    
}
