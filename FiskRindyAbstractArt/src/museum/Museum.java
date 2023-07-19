
package museum;

import java.util.ArrayList;
import java.util.Collections;
import museum.abstracts.Art;
import museum.models.Painting;
import museum.models.Sculpture;


public class Museum {
	public static void main(String[] args) {
		
		ArrayList<Art> museum = new ArrayList<Art> ();
		museum.add(new Painting("The Feast of the Gods", "Giovanni Bellini", "Titians", "oil on canvas"));
		museum.add(new Painting("The Garden of Earthly Delights", "Hieronymus Bosch", "Depictions of Heaven and Hell", "oil on canvas"));
		museum.add(new Painting("Les Demoiselles d'Avinon", "Pablo Picasso", "Women - Prostitutes in Barcelona", "oil on canvas"));
		museum.add(new Sculpture("David", "Michelangelo", "David from David and Goliath", "marble"));
		museum.add(new Sculpture("Discobolus", "Myron", "Greecian discus thrower", "marble"));
		Collections.shuffle(museum);
		
		for(Art collection : museum) {
			collection.viewArt();
		}
		
	}
}
