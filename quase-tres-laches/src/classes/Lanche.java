package classes;

public class Lanche extends Prato{
	private String pao;
	private String recheio;
	private String molho;
	
	public String getPao() {
		return pao;
	}

	public void setPao(String pao) {
		this.pao = pao;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	@Override
	public void calcularPreco() {
		if(this.molho != "") {
			this.setPrecoDeVenda(10.00 + 2.00);
		}else { 
			this.setPrecoDeVenda(10.00);
		}
	}
	
	
}
