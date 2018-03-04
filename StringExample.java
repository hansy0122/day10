package day10;

public class StringExample {
	public static void main(String ar[]){
		String str=new String("abc");
		System.out.println(str.hashCode());
		str+="abc";
		System.out.println(str.hashCode());
		str+="abc";
		System.out.println(str.hashCode());
		
		StringBuilder builder =new StringBuilder();
		System.out.println(builder.hashCode());
		builder.append("abc");
		System.out.println(builder.hashCode());
		builder.append("abc");
		System.out.println(builder.hashCode());
		builder.append("abc");
		
	
	}
}
