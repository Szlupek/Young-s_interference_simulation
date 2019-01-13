import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JMenuBar{
		/*
	 * pasek pozawalaj�cy na zapis oraz wczytaanie danych
	 */
	private static final long serialVersionUID = 1L;
		JMenu fileM;
		JMenuItem newP; //otworzy kolejne okno z programem
		JMenuItem open; //otwory plik z danymi
		JMenuItem save; // zapisze plik z danymi
		JMenuItem help; // otworzy okno w ktorym znajeduje sie opis doswiadczaenia
		ActionListener saveA = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			      PrintWriter zapis;
				try {
					zapis = new PrintWriter("save1.txt");
				    zapis.println("rozstaw szczelin to: "+ PheaseDelay.getD());
				    zapis.println("odleglosc od ekranu to: "+PheaseDelay.getX());
				    zapis.println("długość fali to: "+PheaseDelay.getL());
				    zapis.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
			}
		};
	public MenuBar() {
		fileM = new JMenu("file");
		newP = new JMenuItem("new");
		open = new JMenuItem("open");
		save = new JMenuItem("save");
		help = new JMenuItem("help");
		fileM.add(newP);
		fileM.add(open);
		fileM.add(save);
		save.addActionListener(saveA);
		this.add(fileM);
		this.add(help);
		

		
	}

}
