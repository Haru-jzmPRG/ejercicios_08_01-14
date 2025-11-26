import matematicas.*;

public class PuebaFunciones {
    public static void main(String[] args) throws Exception {
        // 1. esCapicua
        System.out.println("El 464 "+(Funciones.esCapicua(464)?"es capicúa":"no es capicúa"));

        // 2. esPrimo
        System.out.println("El 29 "+(Funciones.esPrimo(29)?"es primo":"no es primo"));

        // 3. siguientePrimo
        System.out.println("El siguiente primo mayor a 23 es " + Funciones.siguientePrimo(23));
        System.out.println("El siguiente primo mayor a 100 es " + Funciones.siguientePrimo(100));

        // 4. potencia
        System.out.println("2^10 = " + Funciones.potencia(2, 10));
        System.out.println("5^(-3) = " + Funciones.potencia(5, -3));
        System.out.println("10^6 = " + Funciones.potencia(10, 6));

        // 5. digitos
        System.out.println("El número 0 tiene " + Funciones.digitos(0) + " dígito/s.");
        System.out.println("El número 7 tiene " + Funciones.digitos(7) + " dígito/s.");
        System.out.println("El número 674893123 tiene " + Funciones.digitos(674893123) + " dígito/s.");

        // 6. voltea
        System.out.println("El 5 volteado es " + Funciones.voltea(5));
        System.out.println("El 398004321 volteado es " + Funciones.voltea(398004321));
        System.out.println("El -75839 volteado es " + Funciones.voltea(-75839));

        // 7. digitoN
        System.out.println("En la posición 0 del 3452 está el " + Funciones.digitoN(3452, 0));
        System.out.println("En la posición 6 del 857964034 está el " + Funciones.digitoN(857964034, 6));
        System.out.println("En la posición 4 del 857964034 está el " + Funciones.digitoN(857964034, 4));

        // 8. posicionDeDigito
        System.out.println("En el 3452, el dígito 4 está en la posición " + Funciones.posicionDeDigito(3452, 4));
        System.out.println("En el 78604321, el dígito 1 está en la posición " + Funciones.posicionDeDigito(78604321, 1));
        System.out.println("En el 78604321, el dígito 7 está en la posición " + Funciones.posicionDeDigito(78604321, 7));
        System.out.println("En el 78604321, el dígito 5 está en la posición " + Funciones.posicionDeDigito(78604321, 5));

        // 9. quitaPorDetras
        System.out.println("Si al 78604321 se le quitan por detrás 4 dígitos, se queda como " + Funciones.quitaPorDetras(78604321, 4));
        System.out.println("Si al 1000 se le quita por detrás 1 dígito, se queda como " + Funciones.quitaPorDetras(1000, 1));

        // 10. quitaPorDelante
        System.out.println("Si al 78604321 se le quitan por delante 4 dígitos, se queda como " + Funciones.quitaPorDelante(78604321, 4));
        System.out.println("Si al 78604000 se le quitan por delante 2 dígitos, se queda como " + Funciones.quitaPorDelante(78604000, 2));

        // 11. pegaPorDetras
        System.out.println("Si al 567 se le pega por detrás el 1 da el " + Funciones.pegaPorDetras(567, 1));
        System.out.println("Si al 33 se le pega por detrás el 0 da el " + Funciones.pegaPorDetras(33, 0));

        // 12. pegaPorDelante
        System.out.println("Si al 567 se le pega por delate el 1 da el " + Funciones.pegaPorDelante(567, 1));
        System.out.println("Si al 33 se le pega por delante el 0 da el " + Funciones.pegaPorDelante(33, 0));

        // 13. trozoDeNumero
        System.out.println("Al 78604000 le cojo el trozo que va de la posición 0 a la 3: " + Funciones.trozoDeNumero(78604000, 0, 3));
        System.out.println("Al 78604000 le cojo el trozo que va de la posición 4 a la 6: " + Funciones.trozoDeNumero(78604000, 4, 6));
        System.out.println("Al 78604000 le cojo el trozo que va de la posición 2 a la 2: " + Funciones.trozoDeNumero(78604000, 2, 2));

        // 14. juntaNumeros
        System.out.println("Juntando el 21 y el 40 da el " + Funciones.juntaNumeros(21, 40));
        System.out.println("Juntando el 789 y el 250 da el " + Funciones.juntaNumeros(789, 250));

        // Numeros primos desde 1 hasta 100

        for (int i = 2; i < 1000; i++) {
            if (Funciones.esPrimo(i)) {
                System.out.print(i+ " ");            
            }
        }  

        System.out.println();

        //Numeros capicúas desde 1 hasta 9999

        for (int i = 1; i < 10000; i++) {
            if (Funciones.esCapicua(i)) {
                System.out.print(i+ " ");            
            }
        }

        System.out.println();

    }
}
