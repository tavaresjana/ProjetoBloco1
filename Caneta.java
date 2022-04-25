

import java.util.*;

/*  Nome da classe mãe e a interface de onde ela puxa os métodos
 */
public abstract class Caneta implements LojaDeCanetas  { 
	Scanner ler = new Scanner(System.in);
	// atributos da classe mãe que são passados para todas as classes filhas
	 private int carga=100;
	 private int opcao;
	 private double preco;
	 private double ponta;
	 private String cor; 
	 private String tipoDeTinta;
	 private String modelo;

	// A partir daqui temos os métodos

	@Override // Método sobrecarga para atribuir preço ao produto
	public double precificar(double quantidade, double valor)
	{
		this.setPreco(quantidade*valor);
		return this.getPreco();

	}

	public double precificar(double quantidade, double valor1, double valor2)
	{
		this.setPreco(quantidade*(valor1+valor2));
		return this.getPreco();			
	}

	@Override // Método com o status da caneta.
	public void statusDaCaneta() {
		this.modeloCaneta();
		this.materialCaneta();
		System.out.println("Status da caneta modelo "+this.getModelo());
		System.out.println("Com ponta "+this.getPonta());
		System.out.println("A carga está em "+this.getCarga()+"%");
		System.out.println("A cor da caneta é "+this.getCor());
		System.out.println("O material da caneta é "+this.getTipoDeTinta());
	}


	//Removi o metodo de recarregar a caneta

	public void materialCaneta(){
		this.setTipoDeTinta("tipo genérico");
	}

	public void fabricarCaneta()
	{
		System.out.println("Escreva o a cor da caneta desejada");
		this.cor=ler.next(); //colocar erro de espaçamento aqui
		this.setCor(this.cor);

		do {
		System.out.println("Escreva o a ponta desejada:\nDigite\n1-Para ponta 0,5\n2-Para ponta 0,7\n3-Para ponta 0,9");
		this.opcao=ler.nextInt(); //colocar erro de caractere aqui
		if (opcao==1)
			this.setPonta(0.5);
		else if (opcao==2)
			this.setPonta(0.7);
		else if (opcao==3)
			this.setPonta(0.9);
		else
			System.out.println("opção inválida\n");
		}while(opcao<1||opcao>3);
		}

	public void modeloCaneta()
	{
		this.setModelo("Genérico");
	}

	// Getter e setters servem para encapsular os atributos e alterar o seu valor.

	public int getCarga() {
		return carga;
	}

	//Removi o quantidade de cor uma vez que a gente já estipulou 4 na caneta 4 cores

	public double getPonta() {
		return ponta;
	}

	public void setPonta(double ponta) {
		this.ponta = ponta;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipoDeTinta() {
		return tipoDeTinta;
	}

	public void setTipoDeTinta(String tipoDeTinta) {
		this.tipoDeTinta = tipoDeTinta;
	}


	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}


}