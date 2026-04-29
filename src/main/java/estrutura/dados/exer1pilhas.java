/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura.dados;

/**
 *
 * @author Glaucia Oliveira
 */
import java.util.Scanner;

public class exer1pilhas {
     
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {

        }
        System.out.println("Entre com o Número: ");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("Desempilhando o número" + num);
            pilha.empilha(num);
        } else {
            Integer desempilhado = pilha.desempilha();

            if (desempilhado == num) {
                System.out.println("A pilha está vazia");
            } else {
                System.out.println("Desempilhando um elemento ímpar da pilha: " + desempilhado);

            }

        }

        System.out.println("Todos os números foram lidos, desempilhando números da pilha");

        while (!pilha.estaVazia()) {

            Integer desempilhado = pilha.desempilha();

            System.out.println("Desempilhando um elemento ímpar da pilha: " + pilha.desempilha);

        }
        System.out.println("Todos os elementos foram desempilhados");
    }

}
