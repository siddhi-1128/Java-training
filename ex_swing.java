import java.io.*;
import javax.swing.*;
class ex_swing
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		JButton button= new JButton("Submit");
		button.setBounds(150,200,220,50);
		frame.add(button);
		frame.setSize(500,600);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}