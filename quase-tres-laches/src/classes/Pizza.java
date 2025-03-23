package classes;

public class Pizza extends Prato{
	private String molho;
	private String recheio;
	private String borda;
	
	public String getMolho() {
		return molho;
	}
	
	public void setMolho(String molho) {
		this.molho = molho;
	}
	
	public String getRecheio() {
		return recheio;
	}
	
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	
	public String getBorda() {
		return borda;
	}
	
	public void setBorda(String borda) {
		this.borda = borda;
	}

	@Override
	public void calcularPreco() {
		if(this.borda != "") {
			this.setPrecoDeVenda(30.00 + 2.00);
		}else { 
			this.setPrecoDeVenda(30.00);
		}
		
	}
	
	
}
