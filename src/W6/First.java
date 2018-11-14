package W6;
import java.awt.*;

public class First extends Frame{

	First() {
		Button b = new Button("Click Me");
		
		b.setBounds(30,100,80,30);// setting button position
		add(b); //adding button into frame
		setSize(300,300); //frame size 300 width and 300 height
		setLayout(null); //By default BorderLayout
		setVisible(true); //By default not visible
	}
}
