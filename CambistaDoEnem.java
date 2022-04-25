

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CambistaDoEnem {
	public static void main(String[] args) {
		ArrayList<String> cane1 = new ArrayList<>(); //collection

		DecimalFormat df = new DecimalFormat("0.00");
		Scanner ler = new Scanner(System.in);
		CanetaEsferografica can1 = new CanetaEsferografica();
		CanetaQuatroCores can2 = new CanetaQuatroCores();
		CanetaGel can3 = new CanetaGel();
		int opcao, posicao;
		int caneta1=0, caneta2=0, caneta3=0;
		double totalC1, totalC2, totalC3, totalDaCompra;
		int unidadesCompradas=0;

		try {
		do {
		System.out.println("Escolha um modelo de caneta que deseja fabricar:\n 1-Caneta Monocor\n 2-Caneta multcor\n 3-Caneta Gel\n 4-Para ver a sua lista\n Ou digite 0 para sair\n");
		opcao=ler.nextInt();

		if (opcao==1)
		{	
			can1.fabricarCaneta();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			can1.statusDaCaneta();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			cane1.add(can1.getModelo()+" "+can1.getCor()+" "+can1.getPonta());
			caneta1++;			
		}
		else if (opcao==2)
		{
			can2.fabricarCaneta();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			can2.statusDaCaneta();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			cane1.add(can2.getModelo()+" "+can2.getCor1()+", "+can2.getCor2()+", "+can2.getCor3()+" e "+can2.getCor4()+" "+can2.getPonta());
			caneta2++;
		}
		else if (opcao==3)
		{
			can3.fabricarCaneta();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			can3.statusDaCaneta();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			cane1.add(can3.getModelo()+" "+can3.getCor()+" "+can3.getPonta()+" "+can3.cheiro());
			caneta3++;
		}
		else if (opcao==4)
		{
			    unidadesCompradas=caneta1+caneta2+caneta3;
				if(unidadesCompradas==0)
				{
					System.out.println("Sua lista está vazia");
				}
				else 
					{
			    System.out.println("\nSua lista contém\n");
				for(int x=0;x<unidadesCompradas;x++)
					{
					System.out.println(x+" "+cane1.get(x));
					}
				System.out.println("\nDeseja limpar a sua lista:\n 1-Para sim\n 2-Para não");
				opcao=ler.nextInt();
					if (opcao==1)
					{
					cane1.clear();
					caneta1=0;
					caneta2=0;
					caneta3=0;
					unidadesCompradas=0;
					System.out.println("\nTodos os itens foram removidos na lista\n");
					}
					else
					{
					System.out.println("\nTodos os itens permanecem na lista\n");
					}
				}
		}
		else
		{
			System.out.println("\n");
		}

		}while (opcao!=0);

		totalC1=can1.precificar(caneta1,1);
		totalC2=can2.precificar(caneta2, 1.5, 1.5);
		totalC3=can3.precificar(caneta3, 2);

		totalDaCompra=totalC1+totalC2+totalC3;
		unidadesCompradas=caneta1+caneta2+caneta3;

			System.out.println("Seu pedido contém:\n");
			for(int x=0;x<unidadesCompradas;x++)
				System.out.println(x+" "+cane1.get(x));
			System.out.println("\nO total da sua compra é: R$ "+df.format(totalDaCompra)+"\n");

		}catch (InputMismatchException erro)
		{
			System.out.println("ERRO: Por favor colocar apenas números inteiros e não digitar espaço ' '!");
		}				

		 System.out.println("Fim do pedido");
	}

}