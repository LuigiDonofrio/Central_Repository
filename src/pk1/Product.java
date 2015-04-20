package pk1;

public class Product {
	private String nomeProdotto;
	private String prezzoProdotto;
	private String descProdotto;
	
	public String getNomeProdotto() {
		return nomeProdotto;
	}

	public void setNomeProdotto(String nomeProdotto) {
		this.nomeProdotto = nomeProdotto;
	}

	public String getPrezzoProdotto() {
		return prezzoProdotto;
	}

	public void setPrezzoProdotto(String prezzoProdotto) {
		this.prezzoProdotto = prezzoProdotto;
	}

	public String getDescProdotto() {
		return descProdotto;
	}

	public void setDescProdotto(String descProdotto) {
		this.descProdotto = descProdotto;
	}

	public Product(String nomeProdotto, String prezzoProdotto,
			String descProdotto) {
		super();
		this.nomeProdotto = nomeProdotto;
		this.prezzoProdotto = prezzoProdotto;
		this.descProdotto = descProdotto;
	}
	
	

}
