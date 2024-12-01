package Aplicacao;

import java.util.Scanner;

public class VendaIngresso {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("**** Informe os dados da sessão ****");
        System.out.print("Informe o horário da sessão: ");
        float horario = sc.nextFloat();
        System.out.print("Informe o valor da sessão: ");
        float valor = sc.nextFloat();
        System.out.print("Informe a sala da sessão: ");
        int sala = sc.nextInt();
        System.out.print("Informe a idade do cliente: ");
        int idade = sc.nextInt();
        System.out.print("Informe o número da carteira de estudante ou digite 0 caso não tenha: ");
        int carteiraEstudante = sc.nextInt();

        EntradaDeCinema entrada = new EntradaDeCinema(horario, sala, valor);
        entrada.CalculaDesconto(idade);
        entrada.CalculaDesconto(idade, carteiraEstudante);
        entrada.CalculaDesconto(horario);
        System.out.println(entrada);
        
    sc.close();
    }

}
