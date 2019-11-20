package id.ac.its.tari.movingsprites;

import javax.swing.JFrame;

public class ShootingMissilesEx extends JFrame {

	public ShootingMissilesEx() {
		initUI();
	}
	
	private void initUI() {
		add(new Board());
		
		setTitle("Shooting sprite");
		setSize(400, 300);
		
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		ShootingMissilesEx ex = new ShootingMissilesEx();
		ex.setVisible(true);
	}
}
