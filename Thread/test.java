package Thread;

import java.awt.*;
import javax.swing.*;

class TimerThread1 extends Thread {
	JLabel timerLabel;
	public TimerThread1(JLabel timerLabel){
		this.timerLabel = timerLabel;
	}
	
	public void run(){
		int n = 0;
		while(n<9){
			timerLabel.setText(Integer.toString(n));
			n++;
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){return;}
		}
	}

}

class TimerThread2 extends Thread {
	JLabel timerLabel;
	public TimerThread2(JLabel timerLabel){
		this.timerLabel = timerLabel;
	}
	
	public void run(){
		int n = 0;
		while(n<=50){
			timerLabel.setText(Integer.toString(n));
			n+=10;
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){return;}
		}
	}

}

public class test extends JFrame{
	public test(){
		setTitle("Thread를 상속받은 타이머 스레드");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		Container d = getContentPane();
		d.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		c.add(timerLabel);
		d.add(timerLabel);
		
		TimerThread1 th1 = new TimerThread1(timerLabel);
		setSize(250,150);
		setVisible(true);
		th1.start();
		
		TimerThread2 th2 = new TimerThread2(timerLabel);
		setSize(250,200);
		setVisible(true);
		th2.start();
	}
	
	public static void main(String[] args){
		new test();
	}
}
