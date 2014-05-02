import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;


public class DrawingSurface extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	private ArrayList<BouncingBall> bList = new ArrayList<BouncingBall>();
	private final int numBalls = 50;
	
	
	// create a list of balls in the constructor. This way it happens only one time
	// rather than EVERY time you re-draw...
	public DrawingSurface()
	{
		for(int i=0;i<numBalls;i++)
		{
			// Notice I delegate ALL of the ball functionality to the BouncingBall class. 
			// I don't want give it anything to create a new ball. 
			// The only place the balls exist is in the ArrayList.
			bList.add(new BouncingBall());  
		}
	}
	
	
	public void paintComponent(Graphics gContext)
	{
		// loop through the array list and tell each ball the size of the window
		// and give it the graphics context so it can draw itself.
		for(BouncingBall b : bList)
		{
			b.updatePosition(getWidth(), getHeight(), (Graphics2D)gContext);
		}
	}
}
