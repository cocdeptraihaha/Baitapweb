package ltw.ntt.models;

public class CategoryModel {
	private int categoryid;
	private String categoryname;
	private String images;
	private int status;

	// Constructor
	public CategoryModel() {
	}

	public CategoryModel(int categoryid, String categoryname, String images, int status) {
		this.categoryid = categoryid;
		this.categoryname = categoryname;
		this.images = images;
		this.status = status;
	}

	// Getters and Setters
	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Category{" + "categoryid=" + categoryid + ", categoryname='" + categoryname + '\'' + ", images='"
				+ images + '\'' + ", status=" + status + '}';
	}
}
