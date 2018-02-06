/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleres;

/**
 *
 * @author ELO
 */
public class PuntoHanoi {
    
    
    public static void main (String[] args) throws java.lang.Exception
	{
		hanoi(3,1,2,3);
	}
 
	// CODIGO REALIZADO CON AYUDA DE LAS PISTAS Y EL VIDEO DEL DOCUMENTO PDF 
	// EL METODO RECIBE EL NUMERO DE DISCOS QUE HAY INICIALMENTE EN EL POSTE, EL
	// POSTE DESTINO, EL POSTE DE ENMEDIO Y EL POSTE DESTINO.
 
	public static void hanoi(int discos, int origen, int intermedio, int destino){
		// SI EL NUMERO DE DISCOS ES IGUAL A 1 IMPRIME EL ORIGEN Y EL DESTINO DEL MISMO
		if(discos == 1){
			System.out.println("Pasar el disco del poste: " + origen + " a el poste " + destino);
		}else{
		// DE LO CONTRARIO LLAMARA TRES "HANOI" QUE MOVERAN EL DISCO HASTA QUE ESTE SEA IGUAL A 1	
			hanoi(discos-1, origen, destino, intermedio);
			hanoi(1, origen, intermedio, destino);
			hanoi(discos-1, intermedio, origen, destino);
		}
	}
}
