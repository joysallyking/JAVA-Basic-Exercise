package cn.itcast.jdk15;
/*
 switch���õ��������ͣ� byte \ char \short \ int \ String\ö������
 
 ע�⣺ 
 	case���������ö��ֵ��ֻ��Ҫ��дö��ֵ���ɣ�����Ҫ�������� ö��ֵ�������ĸ�ö����ġ�
 	
 
 
 */

//����ö����
enum Season{
	spring,summer,autumn,winter;
}

enum Person2{
	student,worker;
}


public class Demo8 {
	
	public static void main(String[] args) {
		Season season = Season.summer;
		switch(season){
			case spring:
				System.out.println("����...");
				break;
			case summer:
				System.out.println("����...");
				break;
			case autumn:
				System.out.println("����...");
				break;
			case winter:
				System.out.println("����...");
				break;		
		}
		
		
		
		
		
	}
}
