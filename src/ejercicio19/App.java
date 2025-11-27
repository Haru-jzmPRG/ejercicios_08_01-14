package ejercicio19;

public class App {
    public static void main(String[] args) {
        int opcion = -1;
        do {
            String valor = "";
            menu();
            opcion = leerOpcion();
            if (opcion <= 12) {
                valor = pideValor();
                switch (opcion) {
                    case 1:
                        System.out.println("Binario -> Octal");
                        System.out.println(
                                convierteDecimalABase(
                                        Integer.parseInt(
                                                convierteBaseADecimal(valor, 2)),
                                        8));
                        break;
                    case 2:
                        System.out.println("Binario -> Decimal");
                        System.out.println(
                                convierteDecimalABase(
                                        Integer.parseInt(
                                                convierteBaseADecimal(valor, 2)),
                                        10));
                        break;
                    case 3:
                        System.out.println("Binario -> Hexadecimal");
                        System.out.println(
                                convierteDecimalABase(
                                        Integer.parseInt(
                                                convierteBaseADecimal(valor, 2)),
                                        16));
                        break;
                    case 4:
                        System.out.println("Octal -> Binario");
                        System.out.println(
                                convierteDecimalABase(
                                        Integer.parseInt(
                                                convierteBaseADecimal(valor, 8)),
                                        2));
                        break;
                    case 5:
                        System.out.println("Octal -> Decimal");
                        System.out.println(
                                convierteDecimalABase(
                                    Integer.parseInt(
                                        convierteBaseADecimal(valor, 8)), 10));
                        break;
                    case 6:
                        System.out.println("Octal -> Hexadecimal");
                        System.out.println(
                            convierteDecimalABase(
                                Integer.parseInt(
                                    convierteBaseADecimal(valor, 8)), 16));
                        break;
                    case 7:
                        System.out.println("Decimal -> Binario");
                        System.out.println(
                                    convierteDecimalABase(
                                        Integer.parseInt(
                                            convierteBaseADecimal(valor, 10)), 2));
                        break;
                    case 8:
                        System.out.println("Decimal -> Octal");
                        System.out.println(
                                    convierteDecimalABase(
                                        Integer.parseInt(
                                            convierteBaseADecimal(valor, 10)), 8));
                        break;
                    case 9:
                        System.out.println("Decimal -> Hexadecimal");
                        System.out.println(
                                    convierteDecimalABase(
                                        Integer.parseInt(
                                            convierteBaseADecimal(valor, 10)), 16));
                        break;
                    case 10:
                        System.out.println("Hexadecimal -> Binario");
                        System.out.println(
                                    convierteDecimalABase(
                                        Integer.parseInt(
                                            convierteBaseADecimal(valor, 16)), 2));
                        break;
                    case 11:
                        System.out.println("Hexadecimal -> Octal");
                        System.out.println(
                                    convierteDecimalABase(
                                        Integer.parseInt(
                                            convierteBaseADecimal(valor, 16)), 8));
                        break;
                    case 12:
                        System.out.println("Hexadecimal -> Decimal");
                        System.out.println(
                                    convierteDecimalABase(
                                        Integer.parseInt(
                                            convierteBaseADecimal(valor, 16)), 10));
                        break;
                    default:
                        break;

                }
            }
        } while (opcion != 13);
        System.out.println("¡Hasta luego!");
    }

    public static void menu() {
        System.out.println("""
                1) Binario -> Octal
                2) Binario -> Decimal
                3) Binario -> Hexadecimal
                4) Octal -> Binario
                5) Octal -> Decimal
                6) Octal -> Hexadecimal
                7) Decimal -> Binario
                8) Decimal -> Octal
                9) Decimal -> Hexadecimal
                10) Hexadecimal -> Binario
                11) Hexadecimal -> Octal
                12) Hexadecimal -> Decimal
                13) Salir
                    """);
    }

    public static int leerOpcion() {
        boolean correcto = false;
        int opcion = -1;
        do {
            try {
                System.out.print("Seleccione una opción (1-12): ");
                opcion = Integer.parseInt(System.console().readLine());
                if (opcion >= 1 && opcion <= 13) {
                    correcto = true;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, introduzca un número entre 1 y 12.");
            }
        } while (!correcto);
        return opcion;
    }

    public static String pideValor() {
        String valor = "";
        valor = System.console().readLine("Introduzca el valor a convertir: ");
        return valor;
    }

    public static String convierteDecimalABase(int valorDecimal, int base) {
        String resultado = "";
        while (valorDecimal > 0) {
            int resto = valorDecimal % base;
            resultado = convertirABase(resto, base) + resultado;
            valorDecimal /= base;
        }
        return resultado;
    }

    private static String convertirABase(int valor, int base) {
        if (valor > 7 && base == 8)
            return "";
        if (valor > 9 && base == 10)
            return "";
        if (base == 16 && valor > 15)
            return "";
        if (base <= 10)
            return "" + valor;
        else {
            return switch (valor) {
                case 10 -> "A";
                case 11 -> "B";
                case 12 -> "C";
                case 13 -> "D";
                case 14 -> "E";
                case 15 -> "F";
                default -> "" + valor;
            };
        }

    }

    public static String convierteBaseADecimal(String valorBase, int base) {
        long resultado = 0;
        for (int i = 0; i < valorBase.length(); i++) {
            int decimal = convertirADecimal(valorBase.charAt(i), base);
            resultado += decimal * Math.pow(base, valorBase.length() - i - 1);
        }
        return "" + resultado;
    }

    private static int convertirADecimal(char caracter, int base) {
        if (base == 8 && (caracter < '0' || caracter > '7'))
            return -1;
        if (base == 10 && (caracter < '0' || caracter > '9'))
            return -1;
        return switch (caracter) {
            case '0' -> 0;
            case '1' -> 1;
            case '2' -> 2;
            case '3' -> 3;
            case '4' -> 4;
            case '5' -> 5;
            case '6' -> 6;
            case '7' -> 7;
            case '8' -> 8;
            case '9' -> 9;
            case 'A', 'a' -> 10;
            case 'B', 'b' -> 11;
            case 'C', 'c' -> 12;
            case 'D', 'd' -> 13;
            case 'E', 'e' -> 14;
            case 'F', 'f' -> 15;
            default -> -1;
        };
    }
}
