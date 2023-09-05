package br.code.letscode.java;

public class App {
    // Operadores
    public static void main(String[] args) {

        boolean fimDeSemana = true;
        boolean fazendoSol = false;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        // tabela verdade

        // Operador && (AND)
        // true && true = true
        // true &&false = false
        // false && true = false
        // false && false = false

        // Operador || (OR)
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false

        System.out.println(vamosAPraia);

        String mensagem = fimDeSemana ? "é fim de semana " : "Nao é fim de semana";
        System.out.println(mensagem);
    }
}

// package br.code.letscode.java;

// public class App {
// // variável
// public static void main(String[] args) throws Exception {

// // String nome = "Laiza";
// // System.out.println("Olá," + nome);

// int a;
// int b = 2;
// a = 3;
// int soma = a + b;
// int subtracao = a - b;
// int multiplicacao = a * b;
// // int divisao = a / b;
// float divisao = (float) a / b;

// System.out.println(soma);
// System.out.println(subtracao);
// System.out.println(multiplicacao);
// System.out.println(divisao);
// }
// }
