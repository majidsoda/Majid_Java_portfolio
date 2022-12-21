package day42;

public class Book {

	private String title;
	private String author;
	private int pages; 
	
	public String getTitle() {
		return title; 
	}
	public void setTitle(String title) {
		if(title == null || title.isEmpty()) {
			throw new IllegalArgumentException("Invalid title");
		}
		
		this.title = title; 
	}
	public String getAuthor() {
		return author; 
	}
	public void setAuthor(String author) {
		this.author = author; 
	}
	public int getPages() {
		return pages; 
	}
	public void setPages(int pages) {
		if(pages <1) {
			throw new IllegalArgumentException("Invalid pages");
		}
		this.pages = pages; 
	}

}
