package classes;

import java.util.Calendar;
import java.util.Date;

public abstract class Prato {
	private Double precoDeVenda = 0.00;
	private Date dataDeValidade;
	private Float peso;
	
	public Double getPrecoDeVenda() {
		return precoDeVenda;
	}
	
	public void setPrecoDeVenda(Double precoDeVenda) {
		this.precoDeVenda = precoDeVenda;
	}
	
	public Date getDataDeValidade() {
		return dataDeValidade;
	}
	
	public void setDataDeValidade(Date dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}
	
	public Float getPeso() {
		return peso;
	}
	
	public void setPeso(Float peso) {
		this.peso = peso;
	}
	
	public abstract void calcularPreco();

	public void calcularDataValidade() {
		Date hoje = new Date();
		Calendar cal = Calendar.getInstance(); 
		
		cal.setTime(hoje); 
		cal.add(Calendar.DATE, 5);
		hoje = cal.getTime();
		
		this.dataDeValidade = hoje;
	}
}
