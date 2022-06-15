package entites;

public class Aluguel {

	/*aluguel de dez quartos:
	 * Um progama que inicia os 10 quartos
	 * vazios, e depois leia uma N (que pode ser de 1 a10).
	 * Resgistre aluguel dos hospedes e o quarto que ele ecolheu
	 * Ao final mostre um relatario com todas as ocupação.
	 */
	
	private String nome;
	private String email;
	
	//get = pegue
	//set = faça
	
	public Aluguel(String nome, String email) {
		this.nome = nome;
		email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome =nome;
	}
	
	public String getEmail() {
		return email;
	}
		public void setEmail(String email) {
			this.email = email;
			
			
		
	}
		public String toString() {
			return nome +", "+ email;
			
		
		}
}
