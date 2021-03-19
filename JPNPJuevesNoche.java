/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpnp.jueves.noche;

/**
 *
 * @author fack2
 */
public class JPNPJuevesNoche {

    /**
     * @param args the command line arguments
     * Dados dos numeros enteros ingresados por consola 
     * (metodo ingresar_numero)
     * indicar tambien por consola (system.out.print)
     * si son iguales o distintos 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Punto de entrada (entry point)
    /* Ejercicio 18/3
    1)Mostrar en consola la secuencia descendente de 10 a 1
    2)Mostrar la secuencia descendente del 10 al 5 sin mostrar al 7
    3)Mostrar solo los numeros pares del 1 al 20
    4)Mostrar la sumatoria de los numeros del 1 al 100 (mostrar solo el total)
     */
    
    System.out.println("------1------");
    for (int i=1; i<=10; i++){
        System.out.println(i);
    }
    System.out.println("------2------");
    int a = 0;
    a = 10;
    do {
        a--;
        if (a==7){
            continue;
        }
        System.out.println(a);}    
        while (a >5);
    System.out.println("------3------");
    a = 1;
    do {  
       a++;
       if (a%2==1){
           continue;
       }System.out.println(a);
    }  while (a<=20);
    System.out.println("------4------");
    a = 0;
    int b = 0;
    int sumatoria = 0;
    do {
        a++;
        sumatoria = a + sumatoria;
        b++;
    } while (b<100);
    System.out.println(sumatoria);
    
    
    /* Ejercicio desafio para 25/3
    Dado un unico parametro (cant_filas) ingresado por consola (Scanner) mayor que cero e impar
    dibujar una figura analoga a la siguiente (para cant_filas = 5):
    (cant_filas =5)
    @
    @@
    @@@
    @@
    @
    (cant_filas = 3)
    @
    @@
    @
    (cant_filas = 1)
    @
    */
    
    }
    private static int leerNumero( String mensaje )
    {
        //Instancia objeto Scanner
        java.util.Scanner teclado = new java.util.Scanner(System.in);
         
        //Muestro leyenda
        System.out.println(mensaje);
        
        //Leo y devuelvo valor 
        return teclado.nextInt();
                                    
     }
}