import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class UI extends JFrame implements Runnable, ActionListener
{
	

	@Override
	public void run()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 500);
		setLocationRelativeTo(null);
		setTitle("Bouncing Balls!");
		
		add(new DrawingSurface());
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		repaint();
	}

}
