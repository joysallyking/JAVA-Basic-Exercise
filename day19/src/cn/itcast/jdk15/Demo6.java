package cn.itcast.jdk15;
/*
 jdk1.5������֮-----ö��
 
 ���⣺ĳЩ���������յ����ݱ������ڹ̶���Χ֮�ڵģ� 
 
��������� ��ʱ�����ǵĽ�����������Զ���һ����,Ȼ����˽�л����캯�������Զ������д�������Ķ������ʹ�á�

jdk1.5����������������µĽ�������� ����ʹ��ö��������

һЩ����������ʱ������Ҫ�����ݲ���������ģ���������һ����Χ�ڵ�ֵ��Java5�Ժ����ֱ��ʹ��ö�����Խ����
 	���磺 ���� , �Ա� �� ���� �� ����......
 
 
 */

/*
//�Զ���һ���Ա���
class Gender{
	
	String value;
	
	public static final Gender man = new Gender("��");
	
	public static final Gender woman = new Gender("Ů");
	

	private Gender(String value) {
		this.value = value;
	}
}
*/
enum Gender{
	man("��"),woman("Ů");
	
	String value;
	
	private Gender(String value){
		this.value = value;
	}
}


class Person{
	
	private String name;
	
	private	Gender sex;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getSex() {
		return sex;
	}

	public void setSex(Gender sex) {
		this.sex = sex;
	}		
}

public class Demo6 {
	
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("����");
		p.setSex(Gender.woman);
		System.out.println("���֣�"+ p.getName()+" �Ա�"+ p.getSex().value);
		
	}
	
}
