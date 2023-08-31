public class OperadorUnario {

    public static void main(String args[]) {
        int numero = 5; // o numero esta positivo
        // transformando ele em negativo:
        numero = -numero;

        System.out.println(numero);

        int numeroDois = 10;
        int incremento = ++numeroDois;
        int decremento = --numeroDois;
        boolean negacao = !true;

        System.out.println(incremento);
        System.out.println(decremento);
        System.out.println(negacao);
    }
}
