package day10;

public class EmptyExceptionExample {
	
	//throws 는 예외를 전가함 ( 해당메서드를 호출한 시점에)
	public static void throwEmpty(String str) throws EmptyException,NullPointerException{
		if(str==null){
			throw new NullPointerException("매개변수로 들어온 String이 null 입니다.");
		}
		else if(str.length()==0||"".equals(str.trim())){
			//throw는 예외를 강제적으로 생성
			throw new EmptyException("매개변수로 들어온 String이 공백 입니다.");
		}
	}
	public static void main(String ar[]){
		String str=null;
		
		try{
			throwEmpty(str);
		}catch(EmptyException e){
			e.printStackTrace();
			System.out.println("빈공백");
		}catch(NullPointerException e){
			e.printStackTrace();
			System.err.println("null 예외");
		}
	}
}
