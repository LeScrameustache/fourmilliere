package interfacesGraphiques;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import monde.Fourmilliere;

public class Board extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = -1939592616626029205L;

	// controls the delay between each tick in ms
    private final int DELAY = 25;
    // controls the size of the board
    public static final int TILE_SIZE = 3;
    public static final int ROWS = 260;
    public static final int COLUMNS = 260;
    // controls how many coins appear on the board
    public static final int NUM_COINS = 5;
 // keep a reference to the timer object that triggers actionPerformed() in
    // case we need access to it in another method
    private Timer timer;
    // objects that appear on the game board
    private Fourmilliere f;

	public Board() {
		// set the game board size
        setPreferredSize(new Dimension(TILE_SIZE * COLUMNS, TILE_SIZE * ROWS));
        // set the game board background color
        setBackground(new Color(232, 232, 232));

        // initialize the field state
       

        // this timer will call the actionPerformed() method every DELAY ms
        timer = new Timer(DELAY, this);
        timer.start();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
