package day10;

import java.io.UnsupportedEncodingException;

import org.omg.CORBA.SystemException;

public class StringMethods {
	public static void main(String[] ar){
		
		//chatAt: �żҵ��� �Ű������� �־��� �ε����� ���ڸ� ��ȯ�Ѵ�.
		String subject ="java programing";
		System.out.println("chatAt : " + subject.charAt(3));
		
		//�ι��ڿ��� ������ ���Ѵ�.
		String a ="java";
		String b="java";
		System.out.println(a.equals(b));
		
		//getBytes: ���� String�� byte[] �迭�� �����Ѵ�.
		//�⺻ ���ڵ� ����Ʈ���� System.getproperty("file.encoding") ���̴�.
		String c="����Ʈ�� �ٲ��ּ���";
		System.out.println(c.getBytes());
		try{
			System.out.println(c.getBytes("UTF-8"));
		}catch(UnsupportedEncodingException e){
			e.printStackTrace();
		}
		
		//indexOf() ���ڿ� ������ �־��� ���ڿ��� ��ġ�� �����Ѵ�.
		//�־��� ���ڿ��� �������� ������ -1�� �����Ѵ�.
		String d="����ؿ�";
		System.out.println(d.indexOf("��"));
		System.out.println(d.indexOf("�ؿ�"));
		
		//lenght : �ش� ���ڿ��� ���̸� �����Ѵ�
		String e="���ڿ��� ���̴� ���ϱ� ?";
		System.out.println(e.length());
		
		//replace ������ ���ڸ� �ٸ� ���ڷ� �ٲ۴�.
		String f="�ٺ�";
		f.replace("�ٺ�", "õ��");
		System.out.println(f);
		
		//substring ���� ���ڿ����� ���� index�� ��ġ���� ������ �߶� ���ο� ���ڿ��� �����.
		String g="õ�� ������";
		System.out.println(g.substring(3));
		System.out.println(g.substring(3,4));
		
		//tolowercase ���ڿ��� �ҹ��ڷ� �����.
		String h="ABCDE";
		System.out.println(h.toLowerCase());
		
		//toUppercase ���ڿ��� �빮�ڷ� �����.
				String i="abcde";
				System.out.println(i.toUpperCase());
				
		//trim ���ڿ��� �յ� ������ �����Ѵ�.
			String j="       ���α׷���      ";
			System.out.println(j.trim());
			
			
			//valueOf �⺻Ÿ���� String���� ��ȯ
			
			int k =1;
			boolean l=true;
			System.out.println(String.valueOf(k));
			System.out.println(String.valueOf(l));
		
		
		
		
		
		
		
		
	}
}
