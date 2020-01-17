import java.awt.Color;

public class PlayingCard extends GameObject {
	
	String type;
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
		FIRE_NORMAL, FIRE_DOUBLE, FIRE_DRAW2, WIND_NORMAL, WIND_REVERSE, WIND_DRAW2, WATER_NORMAL, WATER_CHANGE, WATER_DRAW2, LIGHT, DARK, WATER_FIRE, FIRE_WIND, WIND_WATER
	//fix enum here: http://tutorials.jenkov.com/java/enums.html
	}

	PlayingCard(int x, int y, int width, int height, String type) {
		super(x, y, width, height, Color.GREEN);
		// TODO Auto-generated constructor stub
		type = this.type;
	}

}
