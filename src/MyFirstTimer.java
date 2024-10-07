import acm.graphics.*;
import acm.program.*;
import javax.swing.*;
import java.awt.event.*;
public class MyFirstTimer extends GraphicsProgram implements ActionListener {
	public static final int PROGRAM_HEIGHT = 600;
	public static final int PROGRAM_WIDTH = 800;
	public static final int MAX_STEPS = 20;
	private GLabel myLabel;
	private int numTimes;

	
	public void init() {
		setSize(PROGRAM_WIDTH, PROGRAM_HEIGHT);
		requestFocus();
	}
	
	public void run() {
		numTimes = 0;
		myLabel = new GLabel("# of times called?", 0, 100);
		add(myLabel);
		ActionListener objectToBeWokenUp = this;
		Timer someTimerVar = new Timer(1000, objectToBeWokenUp);
		someTimerVar.start();
	}
	
	public void actionPerformed(ActionEvent e) {
		numTimes = numTimes + 1;
		myLabel.move(5,0);
		myLabel.setLabel("times called? " + numTimes);
		if (numTimes == 10) {
			Timer somTimerVar = null;
			somTimerVar.stop();
		}
		// add what we want to do every 2 seconds implement method
	}
	
	
	/*ball = new TimerBall(20,30, 20, 20);
	add(ball);
	
	ball2 = new TimerBall(20,60, 30, 30);
	add(ball2);
	
	timerBall = 
	*/
			
	public static void main(String[] args) {
		new MyFirstTimer().start();
	}
	


}

	