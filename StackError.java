package day10;

public class StackError {
	public void overflowError(){
		System.out.println("���� ��� ȣ��!!");
		overflowError();
	}
	
	public static void main(String ar[]){
		StackError ss=new StackError();
		ss.overflowError();
	}
}
