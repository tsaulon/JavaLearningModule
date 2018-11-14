package W6;
import java.awt.*;

public class First2 {
	
	First2() {
		Frame f=new Frame();
		Button b=new Button("Click me");
		b.setBounds(30,50,80,30);
		f.add(b);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
}
