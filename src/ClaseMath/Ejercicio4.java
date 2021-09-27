
package ClaseMath;


public class Ejercicio4 {

    public static void main(String[] args) {
        
        double Decimal1 = Math.random()*50;
        double Decimal2= Math.random()*50;
        
        System.out.println("Numero redondeado = " + Math.round(Decimal1));
        System.out.println("Numero redondeado = " + Math.round(Decimal2));
        
        System.out.println("Numero Mayor = " + Math.max(Decimal1, Decimal2));

    }
    
}
