
package ClaseMath;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        int Nota1 = (int) (Math.random()*10);
        int Nota2 = (int) (Math.random()*10);
        int Nota3 = (int) (Math.random()*10);
        int Nota4 = (int) (Math.random()*10);
        int Nota5 = (int) (Math.random()*10);
        
        int suma = Nota1+Nota2+Nota3+Nota4+Nota5;
        int division = suma/5;
        
        System.out.println("El promedio es: " +division);

    }
    
}
