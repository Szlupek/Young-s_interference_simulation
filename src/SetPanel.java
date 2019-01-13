import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SetPanel extends JPanel {
	/*
	 * panel z lewej stony g��wnego ekrany odpowiadaj�cy za wyb�r wst�knych ustawie�  
	 */
	private static final long serialVersionUID = 1L;
	double xx;
	double dd; //odleg�o�� miedy szczelinami
	double ll; // d�ugo�� fali
	JTextField fieldX;
	JTextField fieldD;
	JTextField fieldL;
	JPanel p;
	JPanel pX;
	JPanel pD;
	JPanel pL;
	PheaseDelay calc; 
	
	JButton start;
	KeyListener saveD = new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyReleased(KeyEvent arg0) {
			PheaseDelay.setD( Double.parseDouble(fieldD.getText()));
            System.out.println("dlugosc ustawiona na "+ PheaseDelay.getY());
            System.out.println("dlugosc ustawiona na "+ PheaseDelay.getX());
            System.out.println("dlugosc ustawiona na "+ PheaseDelay.getD());
            System.out.println("dlugosc ustawiona na "+ PheaseDelay.getL());
			
		}
		
		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	};
	
	KeyListener saveX = new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyReleased(KeyEvent arg0) {
			PheaseDelay.setX(Double.parseDouble(fieldX.getText()));
            System.out.println("odleglosc ustawiona na "+ PheaseDelay.getX());
			
		}
		
		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	};
	KeyListener saveL = new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyReleased(KeyEvent arg0) {
			PheaseDelay.setL(Double.parseDouble(fieldL.getText()));
            System.out.println("dlugosc ustawiona na "+ PheaseDelay.getL());
			
		}
		
		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	};

	public SetPanel() {
		this.setBackground(Color.gray);
        this.setLayout(new FlowLayout());
        
        calc = new PheaseDelay();
		
		JLabel text = new JLabel("Wprowadz odleglosc miedzy szczelinami:"); //instrukacja
		text.setForeground(Color.white); 
		
		JLabel text2 = new JLabel("Wprowadz dlugosc fali:"); //instrukacja
		text2.setForeground(Color.white); 
		
		JLabel text1 = new JLabel("Wprowadz odleglosc szczelin od ekranu:"); //instrukacja
		text1.setForeground(Color.white);
		
		JLabel texts = new JLabel("d="); //instrukacja
		texts.setForeground(Color.white); 
		
		JLabel text2s = new JLabel("l="); //instrukacja
		text2s.setForeground(Color.white); 
		
		JLabel text1s = new JLabel("x="); //instrukacja
		text1s.setForeground(Color.white); 
		
		
		
		p = new JPanel();
        p.setLayout(new GridLayout(6,1)); //panel wew.
        p.setBackground(Color.gray);
		
        pD = new JPanel();
        pD.setLayout(new FlowLayout()); //panel wew.
        pD.setBackground(Color.gray);
        
        pX = new JPanel();
        pX.setLayout(new FlowLayout()); //panel wew.
        pX.setBackground(Color.gray);
        
        pL = new JPanel();
        pL.setLayout(new FlowLayout()); //panel wew.
        pL.setBackground(Color.gray);
		
		fieldX = new JTextField(20); //pole tekstowe do wprowadzena odleg�o�ci szczelin od ekranu
		fieldX.addKeyListener(saveX);
		fieldD = new JTextField(20); //pole tekstowe do wprowadzena d
		fieldD.addKeyListener(saveD);
		fieldL = new JTextField(20); //pole tekstowe do wprowadzena D�UGO�CI FALI
		fieldL.addKeyListener(saveL);
		
		
		p.add(text);
		pD.add(texts);
		pD.add(fieldD);
		p.add(pD);
		p.add(text1);
		pX.add(text1s);
		pX.add(fieldX);
		p.add(pX);
		p.add(text2);
		pL.add(text2s);
		pL.add(fieldL);
		p.add(pL);
		this.add(p);
		
	}

}
