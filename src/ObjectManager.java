import java.util.ArrayList;

public class ObjectManager {
	
	ArrayList<PlayingCard> deck = new ArrayList<PlayingCard>();
	
	ObjectManager() {
		for (int i = 0; i < 48; i++) {
			deck.add(new PlayingCard(0, 0, 0, 0, PlayingCard.Type.DARK));
		}
	}
}
