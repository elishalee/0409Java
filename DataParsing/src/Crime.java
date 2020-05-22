
public class Crime {
	private String classfication;
	private int murder;
	private int steal;
	private int rape;
	private int violence;

	public String getClassfication() {
		return classfication;
	}

	public void setClassfication(String classfication) {
		this.classfication = classfication;
	}

	public int getMurder() {
		return murder;
	}

	public void setMurder(int murder) {
		this.murder = murder;
	}

	public int getSteal() {
		return steal;
	}

	public void setSteal(int steal) {
		this.steal = steal;
	}

	public int getRape() {
		return rape;
	}

	public void setRape(int rape) {
		this.rape = rape;
	}

	public int getViolence() {
		return violence;
	}

	public void setViolence(int violence) {
		this.violence = violence;
	}

	@Override
	public String toString() {
		return "Crime [classfication=" + classfication + ", murder=" + murder + ", steal=" + steal + ", rape=" + rape
				+ ", violence=" + violence + "]";
	}

}
