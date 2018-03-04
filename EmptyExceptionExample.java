package day10;

public class EmptyExceptionExample {
	
	//throws �� ���ܸ� ������ ( �ش�޼��带 ȣ���� ������)
	public static void throwEmpty(String str) throws EmptyException,NullPointerException{
		if(str==null){
			throw new NullPointerException("�Ű������� ���� String�� null �Դϴ�.");
		}
		else if(str.length()==0||"".equals(str.trim())){
			//throw�� ���ܸ� ���������� ����
			throw new EmptyException("�Ű������� ���� String�� ���� �Դϴ�.");
		}
	}
	public static void main(String ar[]){
		String str=null;
		
		try{
			throwEmpty(str);
		}catch(EmptyException e){
			e.printStackTrace();
			System.out.println("�����");
		}catch(NullPointerException e){
			e.printStackTrace();
			System.err.println("null ����");
		}
	}
}
