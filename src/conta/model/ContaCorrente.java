package conta.model;

//ContaCorrente herda de Conta
public class ContaCorrente extends Conta {
	
	private float limite;

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		//Metodo Const. da Super Classe
		//Conta
		super(numero, agencia, tipo, titular, saldo);
		
		//Atributo da Classe
		this.limite = limite;
		
		// Gets e Sets
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	//Métodos Específicos
	
	@Override //Override = Sobrescrever - reforça para o java que o que vai acontecer vai sobrescrever
	
	public void visualizar () {
		super.visualizar();
		System.out.println(" Limite de Crédito: " + this.limite);
	}

}
