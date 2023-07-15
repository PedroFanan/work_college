package Uninter;
import java.util.ArrayList;
public class Cofrinho {

	private ArrayList<Moeda> ListaDeMoedas;
	
	public Cofrinho() {
		this.ListaDeMoedas = new ArrayList<>();
	}
	
	
	public void Adicionar(Moeda moeda) {
		this.ListaDeMoedas.add(moeda);
		
	}
	
	public boolean Remover(Moeda moeda) {
		return this.ListaDeMoedas.remove(moeda);
		
	}
	
	public void ListarMoedas() {
		
	if (this.ListaDeMoedas.isEmpty()) {
		System.out.println("A lista esta vaisa! ");
		return;
	}
	
	for (Moeda moeda : this.ListaDeMoedas) {
		moeda.info();
	}

	}


	


	public double totalConvertido() {
		if (this.ListaDeMoedas.isEmpty()) {
			return 0;
		}
		double ValorAcumulado = 0;
		
		for (Moeda moeda : this.ListaDeMoedas) {
			ValorAcumulado = ValorAcumulado + moeda.converter();
	}
	
	return ValorAcumulado;
	
}

	
}	