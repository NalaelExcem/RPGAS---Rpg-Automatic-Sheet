package theagonis;


public class Ficha {
	// Status
	private String nome;
	private Float hpMax;
	private Float mpMax;
	private Float xp;
	// Atributos
	
	
	// Retorno
	public String viewFicha() {
		String showAll = "Ficha:\n" + "Nome:" + nome + "\nHp:" + hpMax +"\nMp:" + mpMax + "\nXp:" + xp;
		return showAll;
	}
	

	// Decrease and Increase (Hp & Mp & Xp) (Metodos)
	
	public void increaseHP(Float hp) {
		this.hpMax = this.hpMax + hp; 
	};
	
	public void decreaseHP(Float Valor) {
		this.hpMax = this.hpMax - Valor;
	};
	
	public void increaseMP(Float Valor) {
		this.mpMax = this.mpMax + Valor;
	};
	
	public void decreaseMP(Float Valor) {
		this.mpMax = this.mpMax - Valor;
	};
	
	public void increaseXP(Float Valor) {
		this.xp = this.xp + Valor;
	};
	
	public void decreaseXP(Float Valor) {
		this.xp = this.xp - Valor;
	};
	
//	public void calculator(Float valor, String typeOperation, String typeAtributte) {};
	
	// TODO (Perguntar a Elton se não seria mais eficiente criar uma variavel já valor lá em cima ao invés de uma que se cria toda vez que o metodo é puxado, ou tô pensando merda)
	
	//Get and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Float getHp() {
		return hpMax;
	}
	public void setHp(Float hp) {
		this.hpMax = hp;
	}
	public Float getMp() {
		return mpMax;
	}
	public void setMp(Float mp) {
		this.mpMax = mp;
	}
	public Float getXp() {
		return xp;
	}
	public void setXp(Float xp) {
		this.xp = xp;
	}	
}
