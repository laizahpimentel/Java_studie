package br.code.letscode.java;

public class App {
    // EstruturasCondicionais
    public static void main(String[] args) {

        int nota = 50;
        String graduacao;

        if (nota >= 80) {
            graduacao = "A";
            // System.out.println("graduaçao A");
        } else if (nota < 80 && nota >= 70) {
            graduacao = "B";
            // System.out.println("Graduaçao B");
        }
        if (nota < 70 && nota >= 60) {
            graduacao = "C";
            // System.out.println("Graduaçao C");
        }
        if (nota < 60 && nota >= 0) {
            graduacao = "D";
            // System.out.println("Graduaçao D");
        } else {
            graduacao = null;
            // System.out.println("Nota invalida");
        }

        // Opçao de SWITCH com else/if

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno aprovado");
                break; // interrompidp
            case "C":
            case "D":
                System.out.println("Nao aprovado ");
                break; //
            default:
                System.out.println("Graduacao Invalida");
        }

        // int nota = 70;

        // se nota maior ou igual 70, entao aprovado
        // if-else

        // if (nota >= 70) {
        // System.out.println("Aluno aprovado!");
        // }

        // if (nota <= 70) {
        // System.out.println("Aluno Reprovador!");
        // }
    }
}

// package br.code.letscode.java;

// public class App {
// Operadores
// public static void main(String[] args) {

// boolean fimDeSemana = true;
// boolean fazendoSol = false;
// boolean vamosAPraia = fimDeSemana && fazendoSol;

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

// System.out.println(vamosAPraia);

// String mensagem = fimDeSemana ? "é fim de semana " : "Nao é fim de semana";
// System.out.println(mensagem);
// }
// }
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
