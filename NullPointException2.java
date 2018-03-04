package day10;

public class NullPointException2 {
	public static void main(String ar[]){
		
		String data=null;
		
		
		
		//alt shift z 눌리면 자동으로 생성됨. 
		try {
			System.out.println(data.toString());
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			System.out.println("너는 무조건 실행");
		}
		
		
		try {
			System.out.println(data.toString());
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			System.out.println("너는 무조건 실행");
		}
		
		
		
		try {
			System.out.println(data.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			System.out.println("너는 무조건 실행");
		}
		
		System.out.println("예외가 발생해도 조욜되지 않고 실행 되는 군!");
	}
}
