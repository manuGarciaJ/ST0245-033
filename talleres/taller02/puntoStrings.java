public class puntoStrings
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    subConjuntos("","abc");
  }
  public static void subConjuntos(String g, String s){
		if(s.length()==0 ){
			System.out.println(g);
		}
		else{
			subConjuntos(g + s.charAt(0), s.substring(1));			
          subConjuntos(g, s.substring(1));
          System.out.println(g);
		}
	}
}