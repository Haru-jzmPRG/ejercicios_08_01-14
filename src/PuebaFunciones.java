import matematicas.*;

public class PuebaFunciones {
    public static void main(String[] args) throws Exception {


        System.out.printf("El número %d %s capicua%n", 464, Funciones.esCapicua(464) ? "es" : "no es");

        System.out.printf("El número %d %s primo%n",29,Funciones.esPrimo(29) ? "es" : "no es");

        System.out.printf("El siguiente primo de %d es %d%n", 23, Funciones.siguientePrimo(23));

        System.out.printf("El siguiente primo de %d es %d%n", 100, Funciones.siguientePrimo(100));

        System.out.printf("%d%n", Funciones.quitaPorDelante(78604111, 2));
    }   
}
