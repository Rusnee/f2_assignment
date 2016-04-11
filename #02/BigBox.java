package assignment;

import java.awt.Graphics2D;
import java.awt.Color;

public class BigBox extends Sprite{
	
	public BigBox(int x, int y, int w, int h) {
		super(x, y, w, h);
		
	}

	@Override
	public void draw(Graphics2D g2d) {
		g2d.setColor(Color.GREEN); //Set color big bog (color green because folow teacher)
		g2d.fillRect(x, y, w, h); //Set x-axis,y-axis,width and height
		
	}
}
