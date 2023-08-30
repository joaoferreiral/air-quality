import java.util.Scanner;

public class IQA {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Informe o IQA: ");
        double valorIQA = sc.nextDouble();

        String mediaIaq = classificacaoAr(valorIQA);
        String efeitosIaq = classificacaoEfeitos(valorIQA);
        System.out.println("Classificação: " + mediaIaq);
        System.out.println("Efeitos: " + efeitosIaq);
    }
    static String classificacaoAr(double valorIQA) {
        if (valorIQA <= 50) {
            return "Boa";
        } else if (valorIQA <= 101){
            return "Regular";
        } else if (valorIQA <= 199) {
            return "Inadequada";
        } else if (valorIQA <= 299) {
            return "Má";
        } else if (valorIQA <= 399) {
            return "Péssima";
        } else {
            return "Critica";
        }
    }
    static String classificacaoEfeitos(double valorIQA) {
        if (valorIQA <= 50) {
            return "Ausência de sintomas.";
        } else if (valorIQA <= 101){
            return "Ausência de sintomas.";
        } else if (valorIQA <= 199) {
            return "Leve agravamento dos sintomas de pessoas susceptíveis.";
        } else if (valorIQA <= 299) {
            return "Decréscimo da resistência física e significativo agravamento.";
        } else if (valorIQA <= 399) {
            return "Aparecimento prematuro de certas doenças.";
        } else {
            return "Morte prematura de pessoas doentes e pessoas idosas.";
        }
    }
}