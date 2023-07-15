package Uninter;

public class Dolar extends Moeda{
	public Dolar(double valorInicial) {
		this.valor = valorInicial;
	}
	
	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("Dolar - " + valor);
	}

	@Override
	public double converter() {
		// TODO Auto-generated method stub
		return this.valor * 4.88;
	}

	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Dolar ObjetoDeDolar = (Dolar) objeto;
		
		if (this.valor != ObjetoDeDolar.valor) {
			return false;
		}
		
		return true;
	}
	
	
}
