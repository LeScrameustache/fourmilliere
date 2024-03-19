package interfacesGraphiques;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import monde.Fourmi;
import monde.Fourmiliere;
import monde.Nourriture;

public class Board extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = -1939592616626029205L;

	// controls the delay between each tick in ms
    private final int DELAY = 25;
    // controls the size of the board
    public static final int TILE_SIZE = 3;
    public static final int ROWS = 100;
    public static final int COLUMNS = 100;
  
 // keep a reference to the timer object that triggers actionPerformed() in
    // case we need access to it in another method
    private Timer timer;
    // objects that appear on the game board
    private Fourmiliere f;
    private Nourriture nourriture;

	public Board() {
		// set the game board size
        setPreferredSize(new Dimension(TILE_SIZE * COLUMNS, TILE_SIZE * ROWS));
        // set the game board background color
        setBackground(new Color(232, 232, 232));

        // initialize the field state
       this.f = new Fourmiliere(new Point(100,100),100);
       this.nourriture = new Nourriture(new Point(150,150), 50);
        // this timer will call the actionPerformed() method every DELAY ms
        timer = new Timer(DELAY, this);
        timer.start();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		for(Fourmi fourmi : this.f.getListeFourmis()) {
			fourmi.ramasseNourriture(nourriture);
			fourmi.seDeplace();
		}
		repaint();
	}
	
	@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // when calling g.drawImage() we can use "this" for the ImageObserver 
        // because Component implements the ImageObserver interface, and JPanel 
        // extends from Component. So "this" Board instance, as a Component, can 
        // react to imageUpdate() events triggered by g.drawImage()

        // draw our graphics.
        drawBackground(g);
        this.f.draw(g);
        this.nourriture.draw(g);
        for(Fourmi fourmi : this.f.getListeFourmis()) {
			fourmi.draw(g);
		}
       
        
        // this smooths out animations on some systems
        Toolkit.getDefaultToolkit().sync();
    }
	
	private void drawBackground(Graphics g) {
        // draw a checkered background
        g.setColor(new Color(0, 0, 0));
    }

}
