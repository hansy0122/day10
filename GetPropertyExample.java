package day10;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
	public static void main(String ar[]){
		//System.getProperties()는 시스템의 정보를 가져올수있다.
		//property 란 프로그램용어에서 키와 값의 쌍을 말한다.
		String osName=System.getProperty("os.name");
		String userName=System.getProperty("user.name");
		String userHome=System.getProperty("user.home");
		
		System.out.println(osName);
		System.out.println(userHome);
		System.out.println(userName);
		
		System.out.println("[----------------"+"---------------]");
		
		Properties props =System.getProperties();
		Set keys = props.keySet();
		for(Object objkey : keys){
			String key=(String) objkey;
			String value = System.getProperty(key);
			System.out.println("["+key+"] "+value);
		}
	}
}
