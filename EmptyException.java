package day10;
// Custom Exception은 기본적으로 jdk에 포함되어있지 않은 예외를
// 직접 만드는 것을 의미한다.

public class EmptyException extends Exception{
	public EmptyException(){
		
	}
	public EmptyException(String msg){
		super(msg);
	}

}
