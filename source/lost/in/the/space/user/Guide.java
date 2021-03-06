package lost.in.the.space.user;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;

/** Pixel dimensions that define how big the Window is and where stuff inside it goes. */
public class Guide {

	// File

	/** Filename skin.png in the present working directory. */
	public static final String skin = "skin.png";
	
	// Define
	
	public static final Dimension window = new Dimension(400, 647);
	public static final Dimension margin = new Dimension(10, 14);
	
	public static final int top = 290;
	public static final int chooseWidth = 35;
	public static final int extWidth = 100;
	
	/** The small font ends up this many pixels high on the screen in both Windows and Mac. */
	public static final int line = 14;
	/** Make text boxes that hold the big font this many pixels high. */
	public static final int big = 40;
	
	// Math
	
	private static int margin(int i) { return i * margin.width; }
	private static int openWidth() { return window.width - margin(3) - chooseWidth; }
	private static int keywordWidth() { return window.width - margin(3) - extWidth; }
	
	private static int a = top;
	private static int b = a + line + margin.height;
	private static int c = b + line;
	private static int d = c + big + margin.height;

	// Place

	public static final Rectangle exit = new Rectangle(327, 0, 25, 19);
	public static final Rectangle close = new Rectangle(352, 0, 44, 19);
	
	public static final Rectangle choose = new Rectangle(margin(1), a, chooseWidth, line);
	public static final Rectangle open = new Rectangle(margin(2) + chooseWidth, a, openWidth(), line);

	public static final Rectangle keywordLabel = new Rectangle(margin(1), b, keywordWidth(), line);
	public static final Rectangle extLabel = new Rectangle(margin(2) + keywordWidth(), b, extWidth, line);

	public static final Rectangle keyword = new Rectangle(margin(1), c, keywordWidth(), big);
	public static final Rectangle ext = new Rectangle(margin(2) + keywordWidth(), c, extWidth, big);
	
	public static final Rectangle status = new Rectangle(margin(1), d, window.width - margin(2), line);
	
	// Icon
	
	/** Where the 16 pixel square icon is pictured in skin.png. */
	public static final Rectangle icon = new Rectangle(keyword.x + 124, keyword.y + 9, 16, 16);
	
	// Color
	
	/** The coordinates to the pixel in skin.png you can eyedropper to get the font ink color. */
	public static final Point ink = new Point(keyword.x + 11, keyword.y + 11);
	public static final Point typeInk = new Point(keyword.x + 31, keyword.y + 11);
	public static final Point typePage = new Point(keyword.x + 29, keyword.y + 9);
	public static final Point selectInk = new Point(keyword.x + 51, keyword.y + 11);
	public static final Point selectPage = new Point(keyword.x + 49, keyword.y + 9);

	// Font
	
	public static final Font font = new Font("Tahoma", Font.PLAIN, 11);
	public static final Font bigFont = new Font("Arial", Font.PLAIN, 24); // Loads Helvetica on Mac, which is good
}
