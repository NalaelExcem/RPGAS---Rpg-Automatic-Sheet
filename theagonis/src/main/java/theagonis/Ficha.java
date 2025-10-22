package theagonis;


public class Ficha {
	// Status
	private String nome;
	private Float hpMax;
	private Float mpMax;
	private Float xp;
	// Atributos
	private Float str;
	private Float dex;
	private Float sap; // Sapiencia = Inteligencia
	private Float sab;
	private Float car;
	// Moedas			
	
	// Retorno
	public String viewFicha() {
		String showAll = "Ficha:\n" + "Nome:" + nome + "\nHp:" + hpMax +"\nMp:" + mpMax + "\nXp:" + xp + "\nFor:" + str + "\nDex:" + dex + "\nInt:" + sap + "\nSab:" + sab + "\nCar:" + car;
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

	// Getters and Setters dos Atributos
	public Float getStr() {
		return str;
	}
	public void setStr(Float str) {
		this.str = str;
	}
	public Float getDex() {
		return dex;
	}
	public void setDex(Float dex) {
		this.dex = dex;
	}
	public Float getSap() {
		return sap;
	}
	public void setSap(Float sap) {
		this.sap = sap;
	}
	public Float getSab() {
		return sab;
	}
	public void setSab(Float sab) {
		this.sab = sab;
	}
	public Float getCar() {
		return car;
	}
	public void setCar(Float car) {
		this.car = car;
	}
	
}
