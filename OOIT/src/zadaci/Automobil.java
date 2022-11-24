package zadaci;

public class Automobil {
	private boolean onOff;
	private int brzina;
	private String marka;
	
	public Automobil(boolean onOff) {
		this.onOff=onOff;
	}
	public Automobil(boolean onOff, int brzina) {
		this(onOff);
		if(brzina<=6) {
			this.brzina=brzina;
		}
	}
	public void promeniBrzinu(int brzina) {
		if(brzina-this.brzina>1 && brzina-this.brzina<0) {
			System.out.println("Nedozvoljen prenos");
		}else {
		this.brzina=brzina;
	}
	}
	
	
	
	public boolean isOnOff() {
		return onOff;
	}
	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	
}
