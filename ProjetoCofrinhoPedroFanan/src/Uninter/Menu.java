package Uninter;

import java.util.Scanner;

public class Menu {
	
	
	private Scanner sc;
	private Cofrinho cofrinho;
	
	
	public Menu(){
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}
	
	
	public void exibirMenuPrincipal() {
		System.out.println("Cofrinho: ");
		System.out.println("1 - Adicionar Moeda:");
		System.out.println("2 - Remover Moeda:");
		System.out.println("3 - Listar Moeda:");
		System.out.println("4 - Calcular valor total convertido para real:");
		System.out.println("0 - Encerrar. ");
		
		String opcaoSelecionanda = sc.next();
			
		switch (opcaoSelecionanda) {
		case "0":
			System.out.println("Sistema finalizado!");
			break;
			
		case "1":
			ExbirSubMenuAddMoedas();
			exibirMenuPrincipal();
			break;
		
		case "2":
			ExbirSubMenuRemoveMoedas();
			exibirMenuPrincipal();
			break;
			
		
		case "3":
			cofrinho.ListarMoedas();
			exibirMenuPrincipal();
			break;
			
			
		default:
			System.out.println("Opcao invalida, tente novamente!");
			exibirMenuPrincipal();
			break;
			
			
		case "4":
			double ValorConvertido = cofrinho.totalConvertido();
			String ValorTotalConvertidoTextual = String.format("%.2f", ValorConvertido);
			ValorTotalConvertidoTextual = ValorTotalConvertidoTextual.replace(".", ",");
			System.out.println("O valor total convertido para real é: " + ValorTotalConvertidoTextual);
			exibirMenuPrincipal();
			break;
		}
	
	}
	
	private void ExbirSubMenuAddMoedas() {
		System.out.println("Escolha a Moeda:");
		System.out.println("1 - Real");
		System.out.println("2 - Dolar");
		System.out.println("3 - Euro");
		
		int MoedaEscolhida = sc.nextInt();
		System.out.println("Digite um valor:");
		String ValorMoedaTexto = sc.next();
		
		ValorMoedaTexto = ValorMoedaTexto.replace(",", ".");
		
		double ValorMoeda = Double.parseDouble(ValorMoedaTexto);
		
		Moeda moeda = null;
		
		if (MoedaEscolhida == 1) {
			moeda = new Real(ValorMoeda);
			}
		
		else if(MoedaEscolhida == 2) {
			moeda = new Dolar(ValorMoeda);
			}
		
		else if(MoedaEscolhida == 3) {
			moeda = new euro(ValorMoeda);
			}
		else {
			System.out.println("Ops, moeda não encontrada!");
			exibirMenuPrincipal();
		}
		cofrinho.Adicionar(moeda);
		System.out.println("Oba, moeda adicionada com sucesso!");
		
	}
	
	private void ExbirSubMenuRemoveMoedas() {
		System.out.println("Escolha a Moeda:");
		System.out.println("1 - Real");
		System.out.println("2 - Dolar");
		System.out.println("3 - Euro");
		
		int MoedaEscolhida = sc.nextInt();
		System.out.println("Digite um valor:");
		String ValorMoedaTexto = sc.next();
		
		ValorMoedaTexto = ValorMoedaTexto.replace(",", ".");
		
		double ValorMoeda = Double.parseDouble(ValorMoedaTexto);
		
		Moeda moeda = null;
		
		if (MoedaEscolhida == 1) {
			moeda = new Real(ValorMoeda);
			}
		
		else if(MoedaEscolhida == 2) {
			moeda = new Dolar(ValorMoeda);
			}
		
		else if(MoedaEscolhida == 3) {
			moeda = new euro(ValorMoeda);
			}
		else {
			System.out.println("Ops, moeda não encontrada!");
			exibirMenuPrincipal();
		}
		
		boolean RemoveuMoeda = cofrinho.Remover(moeda);
		if(RemoveuMoeda) {
			System.out.println("Removida com sucesso");
		} else {
			System.out.println("Não foi encontrada nenhuma moeda com este valor");
		}
		
		
	}

}