/**
 * SnapGames
 * 
 * Game Development Java
 * 
 * GDJ101
 * 
 * @year 2017
 */
package com.snapgames.gdj.gdj101;

import java.awt.Dimension;

import javax.swing.JPanel;

/**
 * the basic Game container is a JPanel child.
 * 
 * @author Frederic
 *
 */
@SuppressWarnings("serial")
public class Game extends JPanel {

	/**
	 * The title for the game instance.
	 */
	private String title = "game";

	private Dimension dimension = null;

	/**
	 * the default constructor for the {@link Game} panel with a game
	 * <code>title</code>.
	 * 
	 * @param title
	 *            the title for the game.
	 */
	private Game(String title) {
		this.title = title;
		this.dimension = new Dimension(640, 400);
	}

	/**
	 * return the title of the game.
	 * 
	 * @return
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * return the dimension of the Game display.
	 * 
	 * @return
	 */
	public Dimension getDimension() {
		return dimension;
	}

	/**
	 * The main entry point to start our GDJ101 game.
	 * 
	 * @param argv
	 */
	public static void main(String[] argv) {
		Game game = new Game("GDJ101");
		@SuppressWarnings("unused")
		Window window = new Window(game);
	}

}
