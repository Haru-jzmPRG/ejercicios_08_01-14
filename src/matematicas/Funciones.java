package matematicas;

public class Funciones {

     /**
      * Comprueba si un numero es capicua
      * @param numero
      * @return
      */
    public static boolean esCapicua (int numero) {
        boolean esCapicua =  false;
        if (numero == voltea(numero)) {
            esCapicua = true;
        }
        return esCapicua;
    }

    /**
     * Devuelve el siguiente numero primo de un numero dado por parametro
     * @param numero
     * @return
     */
    public static int siguientePrimo (int numero) {
        int numeroSiguientePrimo = 0;
        boolean esPrimoSiguiente = false;
        int pruebaNum = numero + 1;

        while (!esPrimoSiguiente) {
            esPrimoSiguiente = esPrimo(pruebaNum);
            if (esPrimoSiguiente) {
                numeroSiguientePrimo = pruebaNum;
            } else {
                pruebaNum++;
            }
        }
        return numeroSiguientePrimo;
    }

    /**
     * Comprueba si un numero es primo
     * @param numero
     * @return
     */
    public static boolean esPrimo (int numero) {
        boolean esPrimo = true;
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                esPrimo = false;
            }
        }
        return esPrimo;
    }

    /**
     * Calcula la potencia de un numero
     * @param base
     * @param exponente
     * @return
     */

    public static double potencia (double base, int exponente) {
        double potencia = 1;

        for (int i = 0; i < exponente; i++) {
            potencia *= base;
        }

        return potencia;
    }

    /**
     * Voltea un numero
     * @param numero
     * @return
     */

    public static int voltea (int numero) {

        int numeroVolteado = 0;

        while (numero != 0) {
            int digito = numero % 10;
            numeroVolteado = (numeroVolteado * 10) + digito;
            numero /= 10;
        }

        return numeroVolteado;
    }

    /**
     * Devuelve la posicion de un digito en un numero
     * @param numero
     * @param digitoBuscado
     * @return
     */
    public static int posicionDeDigito (int numero, int digitoBuscado) {
        int posicion = -1;
        int posicionActual = 0;

        while (numero != 0) {
            int digito = numero % 10;
            if (digito == digitoBuscado) {
                posicion = digitos(numero);
            }
            numero /= 10;
            posicionActual++;
        }

        return posicion;
    }

    
    /**
     * Cuenta los digitos de un numero
     * @param numero
     * @return
     */
    public static int digitos (int numero) {
        int digitos = 0;

        while (numero != 0) {
            numero /= 10;
            digitos++;
        }

        return digitos;
    }





}
