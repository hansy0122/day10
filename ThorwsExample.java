package day10;

public class ThorwsExample {
	public static void main(String ar[]){
		try{
			findClass();
		}catch(ClassNotFoundException e ){
			System.err.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
	public static void findClass() throws ClassNotFoundException{
		Class clazz= Class.forName("java.lang.String2");
	}
}	
