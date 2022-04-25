

import java.util.InputMismatchException;

public class CanetaQuatroCores extends Caneta {
	private String cor;
	private String cor1;
	private String cor2;
	private String cor3;
	private String cor4;
	private int opcao;

	@Override
	public void fabricarCaneta()
	{
		try {
		System.out.println("Escreva a primeira cor");
		this.cor=ler.next();
		this.setCor1(cor);
		System.out.println("Escreva a segunda cor");
		this.cor=ler.next();
		this.setCor2(cor);
		System.out.println("Escreva a terceira cor");
		this.cor=ler.next();
		this.setCor3(cor);
		System.out.println("Escreva a quarta cor");
		this.cor=ler.next();
		this.setCor4(cor);
		do {
		System.out.println("Escreva o a ponta desejada:\nDigite\n1-Para ponta 0,5\n2-Para ponta 0,7\n3-Para ponta 0,9");
		this.opcao=ler.nextInt();
		if (opcao==1)
			this.setPonta(0.5);
		else if (opcao==2)
			this.setPonta(0.7);
		else if (opcao==3)
			this.setPonta(0.9);
		else
			System.out.println("opção inválida\n");
		}while(opcao<1||opcao>3);
			}catch (InputMismatchException erro) {
				System.out.println("Por favor colocar apenas números inteiros e não digitar espaço ' '!");
			}
	}

	@Override
	public void modeloCaneta()
	{
		this.setModelo("Caneta Multicolorida");
	}

	@Override
	public void materialCaneta()
	{
		this.setTipoDeTinta("Tinta padrão");
	}

	@Override // Método com o status da caneta.
	public void statusDaCaneta() {
		this.modeloCaneta();
		this.materialCaneta();
		System.out.println("Adicionada a sacola caneta modelo "+this.getModelo()); //Mudei para adicionado a sacola e depois a gente planeja como vai ser o colection
		System.out.println("Com ponta "+this.getPonta());
		System.out.println("A carga está em "+this.getCarga()+"%");
		System.out.println("As cores da caneta são "+this.getCor1()+", "+this.getCor2()+", "+this.getCor3()+" e "+this.getCor4());
		System.out.println("O material da caneta é "+this.getTipoDeTinta());
	}

	//adicionei os getters & setters da caneta 4 cores para o encapsulamento.

	public String getCor1() {
		return cor1;
	}

	public void setCor1(String cor1) {
		this.cor1 = cor1;
	}

	public String getCor2() {
		return cor2;
	}

	public void setCor2(String cor2) {
		this.cor2 = cor2;
	}

	public String getCor3() {
		return cor3;
	}

	public void setCor3(String cor3) {
		this.cor3 = cor3;
	}

	public String getCor4() {
		return cor4;
	}

	public void setCor4(String cor4) {
		this.cor4 = cor4;
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}



}