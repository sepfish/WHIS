import java.awt.Color;

public class PlayingCard extends GameObject {
	
	Type type;
	/*types of cards:
	 * fire normal - 5
	 * fire double - 4
	 * fire draw 2 - 2
	 * wind normal - 5
	 * wind reverse - 4
	 * wind draw 2 - 2
	 * water normal - 5
	 * water change - 4
	 * water draw 2 - 2
	 * light (change) - 3
	 * dark (negation) - 3
	 * water -> fire - 3
	 * fire -> wind - 3
	 * wind -> water - 3
	 */
	enum Type {
		FIRE_NORMAL (2), 
		FIRE_DOUBLE (1), 
		FIRE_DRAW2 (5), 
		WIND_NORMAL (2), 
		WIND_REVERSE (1), 
		WIND_DRAW2 (5), 
		WATER_NORMAL (2), 
		WATER_CHANGE (1), 
		WATER_DRAW2 (5), 
		LIGHT (1), //light and dark cards double the score
		DARK (1), 
		WATER_FIRE (1), 
		FIRE_WIND (1), 
		WIND_WATER (1)
		;
		
		private final int score;
		
		private Type(int s) {
			score = s;
		}
	}

	PlayingCard(int x, int y, int width, int height, Type type) {
		super(x, y, width, height, Color.GREEN);
		// TODO Auto-generated constructor stub
		type = this.type;
	}

}
