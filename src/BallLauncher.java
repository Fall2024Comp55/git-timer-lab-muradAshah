import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class BallLauncher extends GraphicsProgram{
	public static final int PROGRAM_HEIGHT = 600;
	public static final int PROGRAM_WIDTH = 800;
	public static final int SIZE = 25;
	public static final int MS = 50;
	public static final int SPEED = 2;
	private ArrayList<GOval> balls;
	private Timer timer;
	
	public void init() {
		setSize(PROGRAM_WIDTH, PROGRAM_HEIGHT);
		requestFocus();
	}
	
	public void run() {
		balls = new ArrayList<GOval>();
		addMouseListeners();
		timer = new Timer(MS, this);
		timer.start();
	}
	
	public void actionPerformed(ActionEvent e) {
		for(int i = 0; i < balls.size(); ++i) {
			balls.get(i).move(SPEED,0);
		}
		
	}
		
	public void mousePressed(MouseEvent e) {
		GOval ball = makeBall(SIZE/2, e.getY());
		add(ball);
		balls.add(ball);
	}
	
	public GOval makeBall(double x, double y) {
		GOval temp = new GOval(x-SIZE/2, y-SIZE/2, SIZE, SIZE);
		temp.setColor(Color.RED);
		temp.setFilled(true);
		return temp;
	}
	
	/*ball = new TimerBall(20,30, 20, 20);
	add(ball);
	
	ball2 = new TimerBall(20,60, 30, 30);
	add(ball2);
	
	timerBall = 
	*/
	
	public static void main(String[] args) {
		new BallLauncher().start();
	}

}
