import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
/*
 * g��wne okno programu
 * 
 */
import javax.swing.JPanel;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	
	SetPanel panelL; //panel do wprowadzania wstepnych danych
	UsePanel panelP; //panel do pozniejszych ustawien
	DrawPanel panelC; // panej na ktorym bedzie "ekran"
	MenuBar menuBar;
	public MainWindow() throws HeadlessException {
		super();
		this.setSize(1200,800);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Badanie interferencji ---- Koty");
        //this.setLayout(new FlowLayout());
        this.setLayout(new GridLayout(1,3));

        panelL= new SetPanel();
        panelP = new UsePanel();

        
        menuBar = new MenuBar();
		setJMenuBar(menuBar); 	
 
		panelC = new DrawPanel();
		
		 this.add(panelL);
		 this.add(panelC);
	     this.add(panelP);

        
	}



}
