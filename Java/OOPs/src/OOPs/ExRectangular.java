package OOPs;

public class ExRectangular {
	
	private int height;
	private int width;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public ExRectangular() {
		System.out.println("Contructor khong co doi so!@");
	}
	public ExRectangular(int height, int width) {
		this.height = height;
		this.width = width;
	}
	public int  acreage() {
		return this.height*this.width;
	}
	public int perimeter() {
		return (this.height+this.width)*2;
	}
	@Override
	public String toString() {
		return "ExRectangular [height=" + height + ", width=" + width + "]";
	}

}
