package geometry;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {

EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					
					Main frame = new Main();
					frame.setVisible(true);

						
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	protected void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
