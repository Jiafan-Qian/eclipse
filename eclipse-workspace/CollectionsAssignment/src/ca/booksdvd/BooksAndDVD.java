package ca.booksdvd;


public class BooksAndDVD
{
	private int itemID;
	private String itemName;
	private String author;
	
	public BooksAndDVD(int itemID, String itemName, String author) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.author = author;
	}

	public BooksAndDVD() {
		super();
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + itemID;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BooksAndDVD other = (BooksAndDVD) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (itemID != other.itemID)
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BooksAndDVD [itemID=" + itemID + ", itemName=" + itemName + ", author=" + author + "]";
	}
	
	
	
	
	
	
	
}
