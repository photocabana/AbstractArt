
package museum.models;

import museum.abstracts.Art;

public class Sculpture extends Art {

	private String material;
	
	public Sculpture(String title, String author, String description, String material) {
		super(title, author, description);
		this.material = material;
	}
	
	public void viewArt() {
		String result = "";
		result += "Title:  " +getTitle() +"\n";
		result += "Author:  " +getAuthor() +"\n";
		result += "Description:  " +getDescription() +"\n";
		result += "materialType:  " +material +"\n";
		System.out.println(result);
	}
	
	
//	GETTERS & SETTERS
	
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
}
