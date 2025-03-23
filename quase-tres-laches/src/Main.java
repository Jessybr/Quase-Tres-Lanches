import java.util.Scanner;

import classes.Lanche;
import classes.Pedido;
import classes.Pizza;
import classes.Salgadinho;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Pedido pedido = new Pedido();
		
		System.out.println("Bem vindo ao Quase Três Lanches!!");
		
		int continuar = 1;
		do {
			System.out.println("\nEscolha qual prato irá ser comprado digitando o número correspondente:");
			System.out.println("\n1 - Pizza");
			System.out.println("\n2 - Lanche");
			System.out.println("\n3 - Salgados");
	
			Integer resposta = input.nextInt();
			input.nextLine();
			Float peso;
			
			switch (resposta) {
			case 1: 
				Pizza pizza = new Pizza();
				
				System.out.println("\nEscolha o recheio, a borda e o molho da pizza:");
				
				System.out.println("\nBorda:");
				System.out.println("\n Sem borda (Enter)");
				System.out.println("\n Catupiry");
				System.out.println("\n Cheddar");
				pizza.setBorda(input.nextLine());
	
				System.out.println("\nRecheio:");
				System.out.println("\n Brócolis");
				System.out.println("\n 4 Queijos");
				System.out.println("\n Portuguesa");
				pizza.setRecheio(input.nextLine());
				
				System.out.println("\nMolho:");
				System.out.println("\n Não (Enter)");
				System.out.println("\n Molho de tomate");
				pizza.setMolho(input.nextLine());
				
				System.out.println("\nPeso:");
				peso = input.nextFloat();
				pizza.setPeso(peso);
		
				pizza.calcularDataValidade();
				pizza.calcularPreco();
				pedido.setItensConsumidos(pizza);
				
				break;
			
			case 2: 
				Lanche lanche = new Lanche();
				
				System.out.println("\nEscolha o recheio, o pão e o molho do lanche:");
				
				System.out.println("\nRecheio: (digite as iniciais do recheio)");
				System.out.println("\n PQ - Presunto e Queijo");
				System.out.println("\n HOSQ - Hamburguer, Ovo, Salada e Queijo");
				System.out.println("\n HSQC - Hamburguer, Salada e Queijo Cheddar");
				lanche.setRecheio(input.nextLine());
	
				System.out.println("\nPão:");
				System.out.println("\n Integral");
				System.out.println("\n Autraliano");
				System.out.println("\n Gergelim");
				lanche.setPao(input.nextLine());
				
				System.out.println("\nMolho:");
				System.out.println("\n Sem molho (Enter)");
				System.out.println("\n Maionese");
				System.out.println("\n Cheddar");
				lanche.setMolho(input.nextLine());
				
				System.out.println("\nPeso:");
				peso = input.nextFloat();
				lanche.setPeso(peso);
				
				lanche.calcularDataValidade();
				lanche.calcularPreco();
				pedido.setItensConsumidos(lanche);
				break;
			
			case 3: 
				Salgadinho salgadinho = new Salgadinho();
				
				System.out.println("\nEscolha o tipo, o recheio e a massa:");
				
				System.out.println("\nRecheio:");
				System.out.println("\n Calabresa");
				System.out.println("\n Frango");
				System.out.println("\n Queijo");
				salgadinho.setRecheio(input.nextLine());
				
				System.out.println("\nTipo:");
				System.out.println("\n Frito");
				System.out.println("\n Assado");
				salgadinho.setTipo(input.nextLine());
	
				System.out.println("\nMassa:");
				System.out.println("\n Normal (enter)");
				System.out.println("\n Batata - Massa de batata");
				salgadinho.setMassa(input.nextLine());
				
				System.out.println("\nPeso:");
				peso = input.nextFloat();
				salgadinho.setPeso(peso);
				
				salgadinho.calcularDataValidade();
				salgadinho.calcularPreco();
				pedido.setItensConsumidos(salgadinho);
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + resposta);
			}
			
			System.out.println("\nAdicionar mais um item? \n1 - Sim\n0 - Não");
			continuar = input.nextInt();
			input.nextLine();
		
		}while(continuar == 1);
		
		System.out.println("\nNome do cliente:\n");
		String cliente = input.nextLine();
		pedido.setNomeCliente(cliente);
		pedido.calcularTotal();
		pedido.calcularTaxaDeServico();
		pedido.gerarNotaFiscal();
	}
}
