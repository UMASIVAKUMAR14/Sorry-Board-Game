import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

import java.awt.Color;
import java.awt.Desktop.Action;
import javax.swing.*;


public class mykeys {

	JLabel blue1;
	
	Action upAction;
	Action downAction;
	Action leftAction;
	Action rightAction;
	
	
	mykeys(){
		blue1 = new JLabel();
		blue1.setBackground(Color.BLUE);
		blue1.setBounds(10, 10, 10,10);
		blue1.setLocation(40, 890);
		blue1.setOpaque(true);
		
		
		
	}
	
	public class UpAction extends AbstractAction{
		
		public void actionPerformed(ActionEvent e) {
			
			
		
		
		}
	}
	
public class DownAction extends AbstractAction{
		
		public void actionPerformed(ActionEvent e) {
			
			
		
		
		}
	}
	


	
	
}
