package day10;

public class NullPointException {
//	nullpointException : ��ü�� �޸𸮿� �ε����� �ʾҰų� (null)�� ���¿��� .(��Ʈ �����ڷ�) �ش� ��ü�� ���� �� ��� �߻� 
	
	public static boolean isEmpty(String str){
		//str.length�� �����ϴ� ���� �����δ� null�� �ƴ����� ������ ���� "" ���� �༮���� �ɷ��ֱ� ����
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
		
		
		//nullpointException ȸ�� ����
		String data3=null;
		if(isEmpty(data3)){
			System.out.println("null �Դϴ�");}
			else{
				System.out.println(data3.toString());
			}
		// �ٷ� ������ �ɾ� �ټ��� ����
		if(data3==null ||"".equals(data3)){
			
		}
	}
}
