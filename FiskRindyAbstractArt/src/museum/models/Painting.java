
package museum.models;

import museum.abstracts.Art;

public class Painting extends Art {
	
	private String paintType;
	
	public Painting(String title, String author, String description, String paintType) {
		super(title, author, description);
		this.paintType = paintType;
	}
	
	public void viewArt() {
		String result = "";
		result += "Title:  " +getTitle() +"\n";
		result += "Author:  " +getAuthor() +"\n";
		result += "Description:  " +getDescription() +"\n";
		result += "paintType:  " +paintType +"\n";
		System.out.println(result);
	}
	
	
//	GETTERS & SETTERS
	
	public String getPaintType() {
		return paintType;
	}
	
	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}
}
