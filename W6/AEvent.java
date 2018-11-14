package W6;

import java.awt.*;
import java.awt.event.*;

public class AEvent extends Frame implements ActionListener{

	TextField tf;
	
	//	create components
	AEvent() {
		tf = new TextField();
		tf.setBounds(60,50,170,20);
		
		Button b = new Button("Click Me");
		b.setBounds(100, 120, 80, 30);
		
		//	register listener
		b.addActionListener(this);	//	pass the current instance
		
		//	add components and set size, layout and visibility
		add(b);
		add(tf);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		tf.setText("Welcome");
	}

}
