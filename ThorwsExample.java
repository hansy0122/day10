package day10;

public class ThorwsExample {
	public static void main(String ar[]){
		try{
			findClass();
		}catch(ClassNotFoundException e ){
			System.err.println("클래스가 존재하지 않습니다.");
		}
	}
	public static void findClass() throws ClassNotFoundException{
		Class clazz= Class.forName("java.lang.String2");
	}
}	
