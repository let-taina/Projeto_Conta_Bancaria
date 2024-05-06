package conta.model;

public class ContaCorrente extends Conta {

	private float limite;
	
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) { // metodo construtor criado com parametros herdados da classe Conta
		super(numero, agencia, tipo, titular, saldo); // metodo super refere-se a superclasse. Indica a chamado do metodo construtor. Acessa e modifica os atributos da classe Conta
		this.limite = limite; //palavra reservada this para diferenciar o Atributo da Classe ContaCorrente do parâmetro do Método Construtor ContaCorrente.
	}

	public float getLimite() {  // menu source > generate getter and setters. 
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean sacar(float valor) { 
		
		if(this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
		
	}
	
    @Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);
		
    }
}
