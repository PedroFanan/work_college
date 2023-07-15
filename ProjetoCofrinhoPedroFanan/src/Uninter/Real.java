package Uninter;

public class Real extends Moeda{
	public Real(double valorInicial) {
		this.valor = valorInicial;
		
		
	}
	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("Real - " + valor);
	}

	@Override
	public double converter() {
		return this.valor;
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Real ObjetoDeReal = (Real) objeto;
		
		if (this.valor != ObjetoDeReal.valor) {
			return false;
		}
		
		return true;
	}
	
	
}
