package day10;
// Custom Exception�� �⺻������ jdk�� ���ԵǾ����� ���� ���ܸ�
// ���� ����� ���� �ǹ��Ѵ�.

public class EmptyException extends Exception{
	public EmptyException(){
		
	}
	public EmptyException(String msg){
		super(msg);
	}

}
