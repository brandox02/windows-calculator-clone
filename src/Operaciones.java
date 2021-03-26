// 
// Decompiled by Procyon v0.5.36
// 

public class Operaciones
{
    public static double valorA;
    public static boolean ValorA;
    public static double valorB;
    public static boolean ValorB;
    public static boolean estadoOperacion;
    public static boolean suma;
    public static boolean resta;
    public static boolean multiplicacion;
    public static boolean division;
    
    public static double sumar(final double a, final double b) {
        double resultado = 0.0;
        resultado = a + b;
        return resultado;
    }
    
    public static double restar(final double a, final double b) {
        double resultado = 0.0;
        resultado = a - b;
        return resultado;
    }
    
    public static double multiplicar(final double a, final double b) {
        double resultado = 0.0;
        resultado = a * b;
        return resultado;
    }
    
    public static double dividir(final double a, final double b) {
        double resultado = 0.0;
        resultado = a / b;
        return resultado;
    }
    
    public static void operacion(final String simbolo, final double valor) {
        if (!Operaciones.ValorA) {
            Operaciones.valorA = valor;
            Operaciones.ValorA = true;
        }
        else if (!Operaciones.ValorB) {
            Operaciones.valorB = valor;
            Operaciones.ValorB = true;
            if (Operaciones.ValorB && Operaciones.ValorA) {
                switch (simbolo) {
                    case "+": {
                        final double resultado = sumar(Operaciones.valorA, Operaciones.valorB);
                        Operaciones.estadoOperacion = true;
                        NewJFrame.miframe.TextFieldPantalla.setText(String.valueOf(resultado));
                        Operaciones.ValorA = true;
                        Operaciones.valorA = resultado;
                        Operaciones.ValorB = false;
                        Operaciones.valorB = 0.0;
                        break;
                    }
                    case "-": {
                        final double resultado = restar(Operaciones.valorA, Operaciones.valorB);
                        Operaciones.estadoOperacion = true;
                        NewJFrame.miframe.TextFieldPantalla.setText(String.valueOf(resultado));
                        Operaciones.ValorA = true;
                        Operaciones.valorA = resultado;
                        Operaciones.ValorB = false;
                        Operaciones.valorB = 0.0;
                        break;
                    }
                    case "*": {
                        final double resultado = multiplicar(Operaciones.valorA, Operaciones.valorB);
                        Operaciones.estadoOperacion = true;
                        NewJFrame.miframe.TextFieldPantalla.setText(String.valueOf(resultado));
                        Operaciones.ValorA = true;
                        Operaciones.valorA = resultado;
                        Operaciones.ValorB = false;
                        Operaciones.valorB = 0.0;
                        break;
                    }
                    case "/": {
                        final double resultado = dividir(Operaciones.valorA, Operaciones.valorB);
                        Operaciones.estadoOperacion = true;
                        NewJFrame.miframe.TextFieldPantalla.setText(String.valueOf(resultado));
                        Operaciones.ValorA = true;
                        Operaciones.valorA = resultado;
                        Operaciones.ValorB = false;
                        Operaciones.valorB = 0.0;
                        break;
                    }
                }
            }
        }
    }
    
    static {
        Operaciones.ValorA = false;
        Operaciones.ValorB = false;
        Operaciones.estadoOperacion = false;
        Operaciones.suma = false;
        Operaciones.resta = false;
        Operaciones.multiplicacion = false;
        Operaciones.division = false;
    }
}
