

public interface LojaDeCanetas { // Nome da Classe interface
	
	// Interface com os métodos da classe
	public abstract void statusDaCaneta();
	public abstract double precificar(double material, double cor);
	public double precificar(double quantidade, double valor1, double valor2);
	public abstract void materialCaneta();

}