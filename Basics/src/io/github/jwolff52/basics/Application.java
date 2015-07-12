package io.github.jwolff52.basics;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Application extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -91435994025641528L;

	public Application() {

        initUI();
    }

    private void initUI() {

        add(new Board());

        setSize(330, 330);

        setTitle("Donut");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Application ex = new Application();
                ex.setVisible(true);
            }
        });
    }

}
