

import java.util.InputMismatchException;

public class CanetaGel extends Caneta {
	private boolean cheiro;
	String cor;
	int opcao;

	public void comCheiro()
	{
		this.setCheiro(true);
	}
	public void semCheiro()
	{
		this.setCheiro(false);
	}

	public String cheiro()
	{
		if(this.isCheiro()==true)
		{
			return "com cheiro";
		}
		else
		{
			return "sem cheiro";

		}
	}
	@Override
	public void materialCaneta()
	{
		this.setTipoDeTinta("Tinta gel");
	}

	@Override
	public void modeloCaneta()
	{
		this.setModelo("Caneta Gel");
	}
	//adicionei no menu da caneta gel a opção de com cheiro e sem cheiro.
	@Override
	public void fabricarCaneta()
	{
		System.out.println("Escreva o a cor da caneta desejada");
		this.cor=ler.next();
		this.setCor(this.cor);
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
		do {
			System.out.println("Deseja que a caneta tenha cheiro?\nDigite\n1-Para Sim\n2-Para Não");
			this.opcao=ler.nextInt();
			if (opcao==1)
				this.comCheiro();
			else if (opcao==2)
				this.semCheiro();
			else
				System.out.println("opção inválida\n");
			}while(opcao<1||opcao>2);

	}

	public boolean isCheiro() {
		return cheiro;
	}
	public void setCheiro(boolean cheiro) {
		this.cheiro = cheiro;
	}


}