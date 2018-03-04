package day10;

import java.io.UnsupportedEncodingException;

import org.omg.CORBA.SystemException;

public class StringMethods {
	public static void main(String[] ar){
		
		//chatAt: 매소드의 매개값으로 주어진 인덱스의 문자를 반환한다.
		String subject ="java programing";
		System.out.println("chatAt : " + subject.charAt(3));
		
		//두문자열의 내용을 비교한다.
		String a ="java";
		String b="java";
		System.out.println(a.equals(b));
		
		//getBytes: 현재 String을 byte[] 배열로 리턴한다.
		//기본 인코딩 바이트값은 System.getproperty("file.encoding") 값이다.
		String c="바이트로 바꿔주세요";
		System.out.println(c.getBytes());
		try{
			System.out.println(c.getBytes("UTF-8"));
		}catch(UnsupportedEncodingException e){
			e.printStackTrace();
		}
		
		//indexOf() 문자열 내에서 주어진 문자열의 위치를 리턴한다.
		//주어진 문자열이 존재하지 않으면 -1을 리턴한다.
		String d="사랑해요";
		System.out.println(d.indexOf("랑"));
		System.out.println(d.indexOf("해요"));
		
		//lenght : 해당 문자열의 길이를 리턴한다
		String e="문자열의 길이는 얼마일까 ?";
		System.out.println(e.length());
		
		//replace 지정한 문자를 다른 글자로 바꾼다.
		String f="바보";
		f.replace("바보", "천재");
		System.out.println(f);
		
		//substring 원본 문자열에서 시작 index의 위치에서 끝가지 잘라서 새로운 문자열을 만든다.
		String g="천재 개발자";
		System.out.println(g.substring(3));
		System.out.println(g.substring(3,4));
		
		//tolowercase 문자열을 소무자로 만든다.
		String h="ABCDE";
		System.out.println(h.toLowerCase());
		
		//toUppercase 문자열을 대문자로 만든다.
				String i="abcde";
				System.out.println(i.toUpperCase());
				
		//trim 문자열의 앞뒤 공백을 제거한다.
			String j="       프로그래머      ";
			System.out.println(j.trim());
			
			
			//valueOf 기본타입을 String으로 변환
			
			int k =1;
			boolean l=true;
			System.out.println(String.valueOf(k));
			System.out.println(String.valueOf(l));
		
		
		
		
		
		
		
		
	}
}
