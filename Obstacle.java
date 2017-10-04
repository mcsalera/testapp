import java.awt.Graphics2D;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Obstacle{
	private int xpos = 240;
	private static final ypos = 250;
	protected int height;
	protected int width; 
	private Image[] obs = {new Image("circleobs.png"), new Image("squareobs.png"), new Image("triangleobs.png"), new Image("rectangleobs.png"), new Image("diamondobs.png")};
	private Boolean[] state = new Boolean[5];
	private Boolean visible;
	int ya = 1;
	int speed = 1;

	public Obstacle(){
		for (int i=0; i<5; i++){
			state[i] = false;
		}
	}
	public Obstacle(int i, int speed){
		state[i] = true;
		this.speed = speed;
		Graphics g = new Graphics();
		paint(i,g);
	}

	public boolean isVisible(){
		return visible;
	}

	public int getTrue(){
		for(int i=0; i<5; i++){
			if (obs[i]){
				return i;
			}
		}
	}
	public int getSpeed(){
		return ya++;
	}
	public void paint(int i, Graphics g){
		g.drawImage(obs[i]);
	}
}