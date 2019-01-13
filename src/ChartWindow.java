import java.awt.HeadlessException;

import javax.swing.JFrame;


public class ChartWindow extends JFrame {
	/*
	 *jest to okno w kt�rym wy�wietla� bedzie si� wykres przestawiaj�cy sumy fal 
	 */
	private static final long serialVersionUID = 1L;


	public ChartWindow() throws HeadlessException {
		this.setSize(1200,800);
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setTitle("Wykres ---- Koty");


	}



}
