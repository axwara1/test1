import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class ArrowKeys {

	public ArrowKeys() {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setFocusable(true);
		
		JPanel panel = new JPanel();
		JLabel up = new JLabel();
		JLabel down = new JLabel();
		JLabel left= new JLabel();
		JLabel right = new JLabel();
		
		
		panel.add(up);
		panel.add(down);
		panel.add(right);
		panel.add(left);

		up.setText("up:0");
		down.setText("down:0");
		right.setText("right:0");
		left.setText("left:0");
		
		frame.addKeyListener(new KeyListener() {
			
			int upcount=0;
			int downcount=0;
			int leftcount=0;
			int rightcount=0;
			
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch(keyCode) {
				case KeyEvent.VK_UP:
					up.setText("up:"+Integer.toString(upcount++));
					break;
				case KeyEvent.VK_DOWN:
					down.setText("down:"+Integer.toString(downcount++));
					break;
				
				case KeyEvent.VK_LEFT:
					left.setText("Left:"+Integer.toString(leftcount++));
					break;
				
				case KeyEvent.VK_RIGHT:
					right.setText("right:"+Integer.toString(rightcount++));
					break;
				
				}
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		frame.add(panel);
		
		}

	public static void main(String[] args) {

		new ArrowKeys();

	}

}
