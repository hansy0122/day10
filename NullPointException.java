package day10;

public class NullPointException {
//	nullpointException : 갹체를 메모리에 로딩하지 않았거나 (null)인 상태에서 .(도트 연산자로) 해당 객체로 접근 할 경우 발생 
	
	public static boolean isEmpty(String str){
		//str.length를 조사하는 것은 실제로는 null은 아니지만 내용이 없는 "" 같은 녀석들을 걸러주기 위함
		return (str==null||str.length()==0);
	}
	public static boolean isNotEmpty(String str){
		return !isEmpty(str);
	}
	public static void main(String ar[]){
//		String data=null;
//		System.out.println(data.toString());
//
//		String data2=new String("data2");
//		data2=null;
//		data2=new String("data2");
//		System.out.println(data2);
		
		
		//nullpointException 회피 예제
		String data3=null;
		if(isEmpty(data3)){
			System.out.println("null 입니다");}
			else{
				System.out.println(data3.toString());
			}
		// 바로 조건을 걸어 줄수도 있음
		if(data3==null ||"".equals(data3)){
			
		}
	}
}
