package classes;

public class Salgadinho extends Prato{
	private String recheio;
	private String massa;
	private String tipo;
	
	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void calcularPreco() {
		if(this.massa != "") {
			this.setPrecoDeVenda(4.00 + 2.00);
		}else { 
			this.setPrecoDeVenda(4.00);
		}
	}
	
	
}
