package day10;

public class StackError {
	public void overflowError(){
		System.out.println("무한 재귀 호출!!");
		overflowError();
	}
	
	public static void main(String ar[]){
		StackError ss=new StackError();
		ss.overflowError();
	}
}
