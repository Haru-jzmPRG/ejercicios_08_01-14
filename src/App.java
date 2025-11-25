public class App {
    public static void main(String[] args) throws Exception {

        /* // Es capicua

        boolean esCapicua = true;

        int numeroCapicua = 464;
        int volteado = 0;
        while (numeroCapicua != 0) {
            int digito = (int) (numeroCapicua % 10);
            volteado = volteado * 10 + digito;
            numeroCapicua /= 10;
        }

        if (volteado == 464) {
            esCapicua = true;
        } else {
            esCapicua = false;
        }

        System.out.printf("El número %d %s capicua%n", 464, esCapicua ? "es" : "no es");
 */
       /*  // Es primo

        boolean esPrimo = true;

        int numeroPrimo = 29;

        for (int i = 2; i <= numeroPrimo / 2; i++) {
            if (numeroPrimo % i == 0) {
                esPrimo = false;
            }
        }
        System.out.printf("El número %d %s primo%n", 29, esPrimo ? "es" : "no es");

        // Siguiente primo

        numeroPrimo = 23;
        int numeroSiguientePrimo = 0;
        boolean esPrimoSiguiente = false;
        int pruebaNum = numeroPrimo + 1;

        while (!esPrimoSiguiente) {
            esPrimo = true;
            for (int i = 2; i <= pruebaNum / 2; i++) {
                if (pruebaNum % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                esPrimoSiguiente = true;
                numeroSiguientePrimo = pruebaNum;
            } else {
                pruebaNum++;
            }
        }

        System.out.printf("El siguiente primo de %d es %d%n", numeroPrimo, numeroSiguientePrimo);
 */
        /* // Potencia

        double base = 2;
        double exponencia = 10;
        double potencia = 1;

        for (int i = 0; i < exponencia; i++) {
            potencia *= base;
        }

        System.out.printf("%f^%f = %f%n", base, exponencia, potencia);
 */
        /* // Digitos

        long numero = 0;
        long digitos = 0;
        while (numero != 0) {
            numero /= 10;
            digitos++;
        }

        System.out.printf("El número %d tiene %d dígitos%n", 0, digitos);
 */
        /* // Volteado

        numero = 464;
        volteado = 0;
        while (numero != 0) {
            int digito = (int) (numero % 10);
            volteado = volteado * 10 + digito;
            numero /= 10;
        }

        System.out.printf("El número volteado es %d%n", volteado);
 */
        int numero = 0;
        int digito = 0;
        int potencia = 0;
        int posicion = 0;
        int digitos = 0;
        int volteadoN = 0;
        /* // Posición de un dígito

        numero = 3452;
        int digito = 4;
        int posicion = 0;
        while (numero != 0) {
            if (numero % 10 == digito) {
                posicion++;
            }
            numero /= 10;
            digito = (int) (numero % 10);
        }

        System.out.printf("En la posición %d del %d está el dígito %d%n", posicion, numero, digito);
 */
        /* // Quita por detrás

        numero = 78604321;
        int cantidad = 4;
        while (cantidad > 0) {
            numero /= 10;
            cantidad--;
        }

        System.out.printf("Si al %d se le quitan por detras %d digitos, se queda como %d%n", 78604321, 4, numero);

        // Quita por delante

        numero = 78604000;
        cantidad = 2;
        int volteadoN = 0;
        int digitosTotales = 0;

        numero = (numero * 10) + 1;

        while (numero != 0) {
            int digitoD = (int) (numero % 10);
            volteadoN = volteadoN * 10 + digitoD;
            numero /= 10;
            digitosTotales++;
        }
        cantidad = digitosTotales - cantidad;
        while (digitosTotales > cantidad) {
            volteadoN /= 10;
            digitosTotales--;
        }

        while (cantidad > 0) {
            int digitoD = (int) (volteadoN % 10);
            numero = numero * 10 + digitoD;
            volteadoN /= 10;
            cantidad--;
        }

        numero /= 10;

        System.out.printf("Si al %d se le quitan por delante %d digitos, se queda como %d%n", 78604000, 2, numero);
 */
        // Pega por detrás

        numero = 567;
        digito = 1;

        numero = numero * 10 + digito;

        System.out.printf("Si al %d se le pega por detras %d digitos, se queda como %d%n", 567, 1, numero);

        // Pega por delante

        numero = 567;
        digito = 1;

        while (numero != 0) {
            int digitoD = (int) (numero % 10);
            volteadoN = volteadoN * 10 + digitoD;
            numero /= 10;
        }

        volteadoN = volteadoN * 10 + digito;

        while (volteadoN != 0) {
            int digitoD = (int) (volteadoN % 10);
            numero = numero * 10 + digitoD;
            volteadoN /= 10;
        }
        System.out.printf("Si al %d se le pega por delante %d digitos, se queda como %d%n", 567, 1, numero);

        // Trozo de número

        numero = 78604000;
        posicion = 3;

        while (numero != 0) {
            int digitoD = (int) (numero % 10);
            volteadoN = volteadoN * 10 + digitoD;
            numero /= 10;
        }

        for (int i = 0; i <= posicion; i++) {
            int digitoD = (int) (volteadoN % 10);
            numero = numero * 10 + digitoD;
            volteadoN /= 10;
        }

        System.out.printf("Si al %d se le troca el %d digito, se queda como %d%n", 78604000, 3, numero);

        // junta de números

        int numero1 = 21;
        int numero2 = 40;
        int aux2 = numero2;
        digitos = 0;

        while (aux2 != 0) {
            aux2 /= 10;
            digitos++;
        }

        potencia = 1;
        for (int i = 0; i < digitos; i++) {
            potencia *= 10;
        }

        int resultado = numero1 * (int)potencia + numero2;

        System.out.printf("Si juntamos los números %d y %d, se queda como %d%n", numero1, numero2, resultado);

    }
}
