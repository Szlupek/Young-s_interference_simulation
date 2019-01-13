import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * jest to panel po prawej stronie ekranu g��wnego na kt�rym zajduje si� wi�kszo�� opcji dla u�ytkownika
 * 
 * 
 */
public class UsePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	JTextField fieldY;
	JTextField fieldI;
	JButton calcButton;
	JButton paintButton; // odpowiada za rysownie wykresu
	JSlider slider; //uwak pozwalajacy na wyzanaczenie punktu na ekranie
	double yy;
	double II;//punkt na ekranie
	JPanel p;
	JPanel pY;
	JPanel pI;
	PheaseDelay calc;
	
	KeyListener saveY = new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyReleased(KeyEvent arg0) {
			PheaseDelay.setY(Double.parseDouble(fieldY.getText()));
            System.out.println("dlugosc ustawiona na "+ PheaseDelay.getY());
		}
		
		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	};
	
	ActionListener a = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			ChartWindow chartW = new ChartWindow(); //otwiera okno w korym bedzie wykres 
			
		}
	};
	ActionListener schowI = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			fieldI.setText(String.valueOf(PheaseDelay.getI())); //otwiera okno w korym bedzie wykres 
			System.out.println( PheaseDelay.getI());
		}
	};	
	ChangeListener slide = new ChangeListener() {
		
		@Override
		public void stateChanged(ChangeEvent arg0) {
			int a = slider.getValue();
            System.out.println("wybrano wartosc " + a);
    
		}
	};

	

	public UsePanel() {
		this.setBackground(Color.gray);
		
        this.setLayout(new FlowLayout());
		fieldY = new JTextField(20);
		fieldY.addKeyListener(saveY);
		fieldI = new JTextField(20);
		calc = new PheaseDelay();
		
        paintButton = new JButton("Rysuj Wykres"); //przycisk wywo�uj�cy rysowanie wykresu
        paintButton.addActionListener(a);
        
        calcButton = new JButton("Licz I");
        calcButton.addActionListener(schowI);
        
        slider = new JSlider(JSlider.VERTICAL ,-1000,1000,0); //suwak
    	slider.addChangeListener(slide);
    	
		JLabel text = new JLabel("Wybierz punk na ekranie:"); //instrukacja
		text.setForeground(Color.white); 
		
		JLabel text2 = new JLabel("Natezenie w tym punkcie to:"); //instrukacja
		text2.setForeground(Color.white); 
		
		JLabel texts = new JLabel("y="); //instrukacja
		texts.setForeground(Color.white); 
		
		JLabel text2s = new JLabel("I="); //instrukacja
		text2s.setForeground(Color.white);
		
		p = new JPanel();
		p.setLayout(new GridLayout(6,1));
        p.setBackground(Color.gray);
        
		pY = new JPanel();
		pY.setLayout(new FlowLayout());
        pY.setBackground(Color.gray);
        
		pI = new JPanel();
		pI.setLayout(new FlowLayout());
        pI.setBackground(Color.gray);
		p.add(text);
		pY.add(texts);
		pY.add(fieldY);
		p.add(pY);
		p.add(calcButton);
		p.add(text2);
		pI.add(text2s);
		pI.add(fieldI);
		p.add(pI);
        p.add(paintButton);
        
        

		this.add(slider);
        this.add(p);
		

	}


}
