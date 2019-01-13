import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class DrawPanel extends JPanel {

	JButton start;
	 int nn = 5;
	 int x = 200;
	 int[] y = new int [nn];
	
	 ActionListener startA = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			for (int i = 0; i<(nn)/2; i++){
				y[i]= PheaseDelay.getNMax(i);
			}
			repaint();
		}
	};
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);       
        g.setColor(Color.white);  //rysuje ekran
        g.fillRect(x,100,10,500);
        g.setColor(Color.BLACK);
        g.drawRect(x,100,10,500);
        for (int i = 0; i<(nn)/2; i++){    //odpowiada za rysowanie prazkow
    	    g.fillOval(x-5, y[i]+350, 20, 6);
    	    g.fillOval(x-5, -y[i]+350, 20, 6);
        }

    }  
	
	public DrawPanel() {
		this.setBackground(Color.WHITE);
		JLabel text = new JLabel("Tu bedzie symulacja ekranu"); //panel �rodkowy
		text.setForeground(Color.black); 
		start = new JButton ("Symuluj"); // przycisk rozpoczynajacy symulacje
		start.addActionListener(startA);
		this.add(start);
	}
	

	
	


}
