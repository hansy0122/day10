package day10;

public class MemberExample {
	public static void main(String ar[]){
		Member obj1=new Member("blue");
		Member obj2=new Member("blue");
		Member obj3=new Member("red");
		
		
		Object ob=new Object();
		Object ob1=new Object();
		if(ob.equals(ob1)){
			System.out.println("����");
		}
		else{
			System.out.println("�ٸ���");
		}
		
		if(obj1.equals(obj2)){
			System.out.println("obj1=obj2");
		}
		else{
			System.out.println("obj1!=obj2");
		}
		
		if(obj1.equals(obj3)){
			System.out.println("obj1=obj3");
		}
		else{
			System.out.println("obj1!=obj3");
		}
	}
}
