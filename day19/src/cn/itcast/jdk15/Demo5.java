package cn.itcast.jdk15;

import java.util.ArrayList;

/*
 jdk1.5������֮-----�Զ�װ�����Զ����䡣
 
 java��������� �����ԣ��κ����ﶼ����ʹ�������������sun��ʹ����
 һЩ������java�а��ֻ���������������
 
 	������������            ��װ����
 	byte     	  Byte
	short      	  Short
	int           Integer
	long          Long 
	
	float          Float
	double         Double 
	
	boolean        Boolean 
	
	char          Character

�������������������˶�Ӧ �İ�װ ���͵ĺô���
	
 */
public class Demo5 {
	
	public static void main(String[] args) {
		String str = "12";
		
		//�ַ���ת����int�������ݡ� ���԰��ַ���ת���ɶ�Ӧ������
		int i = Integer.parseInt(str);
		System.out.println(i+1);
		
		//������ת�����ַ���
		System.out.println("������ת���ɶ�Ӧ ���ַ�����"+Integer.toString(i));
		
		//������ת���ɶ�Ӧ�Ľ�����ʽ
		System.out.println("10�Ķ����ƣ�"+ Integer.toBinaryString(10));
		System.out.println("10�Ķ����ƣ�"+ Integer.toBinaryString(10));
		System.out.println("10��ʮ�����ƣ�"+ Integer.toHexString(10));
		
		
		//���԰��ַ������ɶ�Ӧ�Ľ������ݰ���ת��
		String data = "10";
		int a = Integer.parseInt(data, 2);
		System.out.println("a="+a);
		
		
		//���ϣ� �����ǿ��Դ洢��������������ݵ�������
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		//�Զ�װ�䣺 �Զ���java�Ļ���������������ת���ɶ����������ݡ�
		int temp = 10;  //������������
		Integer b =temp; //��a�洢��ֵ�����b������
		
		
		//�Զ����䣺 ���������͵�����ת���ɻ������͵�����
		Integer c = new Integer(13);
		int d = c; //
		System.out.println(d);
		
		
		
		//���õ���������
		Integer e = 128;
		Integer f = 128; 
		System.out.println("ͬһ��������"+(e==f)); // Integer���ڲ�ά�� �˻������飬�û�������洢��-128~127 ��Щ������һ�������С�������ȡ�����������뵽�����Χ֮�ڵģ���ô��ֱ�ӴӸû������л�ȡ��Ӧ�����ݡ�
		
		
	}
	
}
