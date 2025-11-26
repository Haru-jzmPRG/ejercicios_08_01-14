package matematicas;

public class Funciones {

//      /**
//       * Comprueba si un numero es capicua
//       * @param numero
//       * @return
//       */
//     public static boolean esCapicua (int numero) {
//         boolean esCapicua =  false;
//         if (numero == voltea(numero)) {
//             esCapicua = true;
//         }
//         return esCapicua;
//     }

//     /**
//      * Devuelve el siguiente numero primo de un numero dado por parametro
//      * @param numero
//      * @return
//      */
//     public static int siguientePrimo (int numero) {
//         int numeroSiguientePrimo = 0;
//         boolean esPrimoSiguiente = false;
//         int pruebaNum = numero + 1;

//         while (!esPrimoSiguiente) {
//             esPrimoSiguiente = esPrimo(pruebaNum);
//             if (esPrimoSiguiente) {
//                 numeroSiguientePrimo = pruebaNum;
//             } else {
//                 pruebaNum++;
//             }
//         }
//         return numeroSiguientePrimo;
//     }

//     /**
//      * Comprueba si un numero es primo
//      * @param numero
//      * @return
//      */
//     public static boolean esPrimo (int numero) {
//         boolean esPrimo = true;
//         for (int i = 2; i <= numero / 2; i++) {
//             if (numero % i == 0) {
//                 esPrimo = false;
//             }
//         }
//         return esPrimo;
//     }
    
//     /**
//      * Devuelve la posicion de un digito en un numero
//      * @param numero
//      * @param digitoBuscado
//      * @return
//      */
//     public static int posicionDeDigito (int numero, int digitoBuscado) {
//         int posicion = -1;
//         int posicionActual = 0;

//         while (numero != 0) {
//             int digito = numero % 10;
//             if (digito == digitoBuscado) {
//                 posicion = digitos(numero);
//             }
//             numero /= 10;
//             posicionActual++;
//         }

//         return posicion;
//     }


//     /**
//      * Quita por detras
//      * @param numero
//      * @param cantidad
//      * @return
//      */
//     public static int quitaPorDetras (int numero, int cantidad) {
//         while (cantidad > 0) {
//             numero /= 10;
//             cantidad--;
//         }
//         return numero;
//     }

//     /**
//      * Quita por delante
//      * @param numero
//      * @param cantidad
//      * @return
//      */
//     public static int quitaPorDelante (int numero, int cantidad) {
//         numero = voltea(numero);
//         while (cantidad > 0) {
//             numero /= 10;
//             cantidad--;
//         }
//         numero = voltea(numero);
//         return numero;
//     }

//     /**
//      * Pega por detras
//      * @param numero
//      * @param digito
//      * @return
//      */
//     public static int pegaPorDetras (int numero, int digito) {
//         numero = (numero * 10) + digito;
//         return numero;
//     }

//     /**
//      * Pega por delante
//      * @param numero
//      * @param digito
//      * @return
//      */
//     public static int pegaPorDelante (int numero, int digito) {
//         int volteadoN = voltea(numero);
//         volteadoN = pegaPorDetras(volteadoN, digito);
//         return voltea(volteadoN);
//     }

//     /**
//      * Voltea un numero
//      * @param numero
//      * @return
//      */

//     /**
//      * Devuelve el digito que está en la posición n de un numero entero, contando de izquierda a dercha
//      * @param numero
//      * @param posicion
//      * @return
//      */
//     public static int digitoN (int numero, int posicion) {
//         int digitoN = 0;
//         int digito = 0;
//         numero = voltea(numero);
//         while (numero != 0) {
//             digito = numero % 10;
//             if (digitoN == posicion) {
//                 digitoN = digito;
//             }
//             numero /= 10;
//         }
//         return digitoN;
//     }

    
//     /**
//      * Voltea un numero
//      * @param numero
//      * @return
//      */
//     public static int voltea (int numero) {

//         int numeroVolteado = 0;

//         while (numero != 0) {
//             int digito = numero % 10;
//             numeroVolteado = (numeroVolteado * 10) + digito;
//             numero /= 10;
//         }

//         return numeroVolteado;
//     }

//     /**
//      * Cuenta los digitos de un numero
//      * @param numero
//      * @return
//      */
//     public static int digitos (int numero) {
//         int digitos = 0;

//         while (numero != 0) {
//             numero /= 10;
//             digitos++;
//         }

//         return digitos;
//     }

//     /**
//      * Calcula la potencia de un numero
//      * @param base
//      * @param exponente
//      * @return
//      */

//     public static double potencia (double base, int exponente) {
//         double potencia = 1;

//         for (int i = 0; i < exponente; i++) {
//             potencia *= base;
//         }

//         return potencia;
//     }
// }

    // ─────────────────────────────────────────────
    //  FUNCIONES COMPLEJAS
    // ─────────────────────────────────────────────

    public static boolean esCapicua(int numero){
        return esCapicua((long)numero);
    }

    public static boolean esCapicua(long numero){
        return numero == voltea(numero);
    }

    public static int voltea(int numero){
        return (int) voltea((long) numero);
    }

    public static long voltea(long numero){
        boolean negativo = numero < 0;
        numero = Math.abs(numero);
        int volteado = 0;
        for(int i=1; i<=digitos(numero);i++)
            volteado = pegaPorDetras(volteado, digitoN(numero, digitos(numero)-i));
        return (negativo)?-volteado:volteado;
    }

    public static int posicionDeDigito(int numero, int digito){
        return posicionDeDigito((long)numero, digito);
    }

    public static int posicionDeDigito(long numero, int digito){
        for(int i=0; i<digitos(numero);i++){
            if(digitoN(numero, i)==digito)
                return i;
        }
        return -1;
    }

    public static int digitoN(int numero, int posicion){
        return (int) trozoDeNumero(numero, posicion, posicion);
    }

    public static int digitoN(long numero, int posicion){
        return (int) trozoDeNumero(numero, posicion, posicion);
    }

    public static int pegaPorDelante(int numero, int digito){
        return (int) pegaPorDelante((long) numero, digito);
    }

    public static long pegaPorDelante(long numero, int digito){
        return juntaNumeros(digito, numero);
    }     

    public static int juntaNumeros(int numero1, int numero2){
        return (int) juntaNumeros((long) numero1, (long) numero2);
    }

    public static long juntaNumeros(long numero1, long numero2){
        int digitosSegundo = digitos(numero2);
        for(int i=0;i<digitosSegundo;i++){            
            numero1 = pegaPorDetras(numero1, digitoN(numero2, i));            
        }
        return numero1;
    }

    public static int quitaPorDetras(int numero, int digitos){
        return (int) quitaPorDetras((long)numero, digitos);
    }

    public static int quitaPorDelante(int numero, int digitos){
        return (int) quitaPorDelante((long)numero, digitos);
    }

    public static int trozoDeNumero(int numero, int inicio, int fin){                
        return (int) trozoDeNumero((long)numero, inicio, fin);
    }

    public static long trozoDeNumero(long numero, int inicio, int fin){
        if(inicio <= fin){            
            numero = quitaPorDetras(numero, digitos(numero)-fin-1);
            return quitaPorDelante(numero, inicio);
        }
        return numero;
    }

    // ─────────────────────────────────────────────
    //  PRIMOS
    // ─────────────────────────────────────────────

    public static boolean esPrimo(int numero){
        return esPrimo((long)numero);
    }

    public static short siguientePrimo(short numero){
        return (short) siguientePrimo((long)numero);
    }

    public static int siguientePrimo(int numero){
        return (int) siguientePrimo((long)numero);
    }

    public static long siguientePrimo(long numero){
        while(!esPrimo(++numero)){}
        return numero;
    }

    public static boolean esPrimo(long numero){
        for(int i = 2; i<=numero/2; i++){
            if(numero % i == 0)
                return false;
        }
        return true;
    }

    // ─────────────────────────────────────────────
    //  DIGITOS
    // ─────────────────────────────────────────────

    public static int digitos(int numero){
        return digitos((long)numero);
    }

    public static int digitos(long numero){
        numero = Math.abs(numero);
        int digitos = 0;
        do{
            digitos++;
            numero/=10;
        }
        while(numero>0);
        return digitos;            
    }

    // ─────────────────────────────────────────────
    //  PEGAR Y QUITAR DÍGITOS
    // ─────────────────────────────────────────────

    public static int pegaPorDetras(int numero, int digito){
        return (int) pegaPorDetras((long)numero, digito);
    }

    public static long pegaPorDetras(long numero, int digito){
        return numero*10+digito;
    }

    public static long quitaPorDetras(long numero, int digitos){
        return numero/(long)potencia(10,digitos);
    }

    public static long quitaPorDelante(long numero, int digitos){
        return numero % (int)potencia(10, digitos(numero)-digitos);
    }

    // ─────────────────────────────────────────────
    //  POTENCIAS
    // ─────────────────────────────────────────────

    public static float potencia(float base, int exponente){
        return (float) potencia((double)base, exponente);
    }

    public static double potencia(double base, int exponente){        
        return (exponente<0)?(double)1/_potencia(base, Math.abs(exponente)):_potencia(base, exponente);
    }

    private static double _potencia(double base, int exponente){
        double res = 1;
        for(int i=0;i<exponente;i++){
            res*=base;
        }
        return res;
    }
    
}
