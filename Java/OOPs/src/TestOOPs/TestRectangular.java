package TestOOPs;
import OOPs.ExRectangular;

public class TestRectangular {
	
	public static void main(String[] args) {
		ExRectangular obj=new ExRectangular();
		obj.setHeight(7);
		obj.setWidth(7);
		System.out.println(obj.getHeight());
		System.out.println(obj.getWidth());
		System.out.println(obj.toString());
		System.out.println(obj.acreage());
		System.out.println(obj.perimeter());
	}

}
