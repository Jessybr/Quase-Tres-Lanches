package classes;

import java.util.ArrayList;

public class Pedido {
	private String nomeCliente;
	private Double taxaDeServico;
	private Double total;
	private ArrayList<Prato> itensConsumidos = new ArrayList<>();
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public Double getTaxaDeServico() {
		return taxaDeServico;
	}
	
	public void setTaxaDeServico(Double taxaDeServico) {
		this.taxaDeServico = taxaDeServico;
	}
	
	public Double getTotal() {
		return total;
	}
	
	public void setTotal(Double total) {
		this.total = total;
	}
	
	public ArrayList<Prato> getItensConsumidos() {
		return itensConsumidos;
	}
	
	public void setItensConsumidos(Prato prato) {
		this.itensConsumidos.add(prato);
	}
	
	public void visualizarPrato() {
		
	}
	
	public Double calcularTotalComTaxa() {
		Double total = this.total + this.taxaDeServico;
		return total;
	}
	
	public void calcularTotal() {
		double total = 0.0;
		for(Prato prato : this.itensConsumidos) {
			total += prato.getPrecoDeVenda();
		}
		this.total = total;
	}
	
	public void gerarNotaFiscal() {
		System.out.println("\n\n======= NOTA FISCAL =======");
	    System.out.println("Cliente: " + this.nomeCliente);
	    
	    for (Prato prato : this.itensConsumidos) {
	        System.out.println("\nPrato: " + prato.getClass().getSimpleName());
	        System.out.println("Preço: R$ " + prato.getPrecoDeVenda());
	        System.out.println("Peso: " + prato.getPeso() + "g");
	        System.out.println("Validade: " + prato.getDataDeValidade());
	    }

	    System.out.println("\nSubtotal: R$ " + this.getTotal());
	    System.out.println("Taxa de Serviço: R$ " + this.getTaxaDeServico());
	    System.out.println("Total a Pagar: R$ " + this.calcularTotalComTaxa());
	    System.out.println("===========================");
    }
	
	public void calcularTaxaDeServico() {
		this.taxaDeServico = this.total * 0.20;
	}
	
	
}
