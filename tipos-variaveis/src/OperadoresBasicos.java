public class OperadoresBasicos {

    public static void main(String args[]) {
        // Operador de Atribuição: =
        int numero = 5;
        int numeroDois = 2;
        String nome = "Nicolas";

        // Operador Artmetico: + , - , / , * , % , =
        // Utilizado para operações matematicas
        int soma = numero + numeroDois; // soma
        double subtracao = numero - numeroDois; // subtracao
        double divisao = numero / numeroDois; // divisao
        int multiplicacao = numero * numeroDois; // multiplicacao
        int modulo = 5 % 3;// modulo = resto da divisao
        double resultado = (10 * 7) + (24 / 4);// resultado de uma operação

        System.out.println(
                "Soma: " + soma + " - Subtração: " + subtracao + " - Divisão: " + divisao + " - Multiplicação: "
                        + multiplicacao + " - Modulo:" + modulo + " - Resultado: " + resultado);

        // Concatenação
        String nomeCompleto = "LINGUAGEM" + " JAVA";

        System.out.println(nomeCompleto);

        // Testes
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
    }
}
