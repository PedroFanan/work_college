package Uninter;

public class euro extends Moeda {

	public euro(double valorInicial) {
		this.valor = valorInicial;
	}
	
	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("Euro - " + valor);
	}

	@Override
	public double converter() {
		// TODO Auto-generated method stub
		return this.valor * 5.3;
	}

	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		
		euro ObjetoDeEuro = (euro) objeto;
		
		if (this.valor != ObjetoDeEuro.valor) {
			return false;
		}
		
		return true;
	}
	
	
	
}
