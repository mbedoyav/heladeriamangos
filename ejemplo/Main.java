package ejemplo;

public class Main {
  
  public static void main(String[] args) {
    System.out.println("Hola como estas?");
    int suma = suma (20,30);
    System.out.println(suma);
    int resta = resta (15,9);
    System.out.println(resta);
    int multiplicacion = multiplicacion (2,3);
    System.out.println(multiplicacion);
    
    try {
      double d = divicion (5,0);
    System.out.println(d);
    }catch (Exception e) {
      e.printStackTrace();
    }
    
 
  }
  
  
  public static int  suma (int n1, int n2) {
    return n1 + n2;
  }
  
  public static int resta (int n1, int n2){
    return n1 - n2;
  }
  
  public static int multiplicacion (int n1,int n2){
    return n1 * n2;
  }
  public static double divicion (double n1, double n2 ) throws Exception {
    if (n2==0) {
      throw new Exception ("no es posible hacer division por cero");
      
    }
    return n1 /n2 ;
  }
  
}