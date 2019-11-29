import java.awt.Dimension;

import javax.swing.JFrame;

public class Whis {
	JFrame frame;
	GamePanel gamePanel;
	static final int width = 500;
	static final int height = 500;
	
	Whis(){
		frame = new JFrame();
		gamePanel = new GamePanel();
	}
	
	void setup() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(gamePanel);
		frame.setVisible(true);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
        frame.pack();
        frame.addKeyListener(gamePanel);
        gamePanel.startGame();
	}
	
	public static void main(String[] args) {
		Whis whisCards = new Whis();
		whisCards.setup();
	}
	
}

