package day10;

public class NullPointException2 {
	public static void main(String ar[]){
		
		String data=null;
		
		
		
		//alt shift z ������ �ڵ����� ������. 
		try {
			System.out.println(data.toString());
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			System.out.println("�ʴ� ������ ����");
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
			System.out.println("�ʴ� ������ ����");
		}
		
		
		
		try {
			System.out.println(data.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			System.out.println("�ʴ� ������ ����");
		}
		
		System.out.println("���ܰ� �߻��ص� ������� �ʰ� ���� �Ǵ� ��!");
	}
}
