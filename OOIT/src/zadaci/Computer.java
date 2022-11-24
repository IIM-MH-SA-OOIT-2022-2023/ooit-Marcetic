package zadaci;

public class Computer {
	
	private int ram;
	private String os;
	private boolean power;
	
	
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		boolean check=false;
		for (int i=2; i<=128; i=i*2) {
			if(ram==i) {
				this.ram=ram; //c1.ram=ram;
				check=true;
			}
		}if(!check) {
			System.out.println("Moguce vrednosti rama su:" + " 2,4,8,16,32,64,128");
		}
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public boolean getPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public Computer(int ram, String os, boolean power ) {
		this.ram=ram;
		this.os=os;
		this.power=power;
	}
	public Computer() {
		
	}
	
	public void onOff() {
		if(power==true) {
			power=false;
		}else {
			power=true;
		}
	}
	
}
