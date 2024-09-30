package model;

public class Bola implements Cloneable {
	private String namaBola;
	private Integer hargaBola;
//	private String tipeBola;

	public Bola(String namaBola, Integer hargaBola) {
		super();
		this.namaBola = namaBola;
		this.hargaBola = hargaBola;
	}

	public String getNamaBola() {
		return namaBola;
	}

	public void setNamaBola(String namaBola) {
		this.namaBola = namaBola;
	}

	public Integer getHargaBola() {
		return hargaBola;
	}

	public void setHargaBola(Integer hargaBola) {
		this.hargaBola = hargaBola;
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clone;
	}
	

}
