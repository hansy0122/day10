package day10;

public class BoxingUnBoxingExample {
	public static void main(String ar[]) {
		// Boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		// Unboxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		
	
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		//Wrapper Class의 사용 목적
		//기본 자료형은 class가 아니므로 관련된 util method 사용 불가 Ex) Integer.parseInt
		String str="123456";
		int num=Integer.parseInt(str);
		System.out.println(num);
	}
}
