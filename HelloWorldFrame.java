//Java (Frame) Hello World!

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld
 {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setTitle("Hi!");
		frame.add(new JLabel("Hello, world!"));
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}