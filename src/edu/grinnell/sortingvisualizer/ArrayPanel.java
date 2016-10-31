package edu.grinnell.sortingvisualizer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ArrayPanel extends JPanel {

    private NoteIndices notes;
    
    private static final Color COLOR_START = new Color(111, 0, 255);
    private static final Color COLOR_END = new Color(0, 170, 255);
    
    /**
     * Constructs a new ArrayPanel that renders the given note indices to
     * the screen.
     * @param notes the indices to render
     * @param width the width of the panel
     * @param height the height of the panel
     */
    public ArrayPanel(NoteIndices notes, int width, int height) {
        this.notes = notes;
        this.setPreferredSize(new Dimension(width, height));
    }

    @Override
    public void paintComponent(Graphics g) {
    	g.setColor(Color.WHITE);
    	g.fillRect(0, 0, getWidth(), getHeight());
    	
    	Integer[] nts = notes.getNotes();
        int rectWidth = getWidth() / nts.length;
        for(int i = 0; i < nts.length; i++) {
        	if(notes.isHighlighted(i)) {
        		g.setColor(Color.RED);
        	} else {
        		g.setColor(getColorDiff(nts[i] + 1, nts.length));
        	}
        	int height = getHeight() / nts.length * (nts[i] + 1);
        	g.fillRect(rectWidth * i, getHeight() - height, rectWidth, height);
        }
    }
    
    private Color getColorDiff(int num, int denom) {
    	int r = (COLOR_END.getRed() - COLOR_START.getRed()) / denom,
    		g = (COLOR_END.getGreen() - COLOR_START.getGreen()) / denom,
    		b = (COLOR_END.getBlue() - COLOR_START.getBlue()) / denom;
    	return new Color(COLOR_START.getRed() + r * num, COLOR_START.getGreen() + g * num,
    			COLOR_START.getBlue() + b * num);
    }
}