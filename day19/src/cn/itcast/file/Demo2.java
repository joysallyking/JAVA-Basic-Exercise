package cn.itcast.file;

import java.io.File;

/*
·�����⣺ 

����·���� ���ļ���Ӳ���� ������·��������·��һ�㶼�����̷���ͷ�ġ�

���·��:  ���·��������Դ�ļ�����ڵ�ǰ�������ڵ�·����

 . ��ǰ·��
 
 .. ��һ��·��
 
ע�⣺ �������ǰ���ڵ�·������Դ�ļ�������ͬһ�������棬��û��д���·�� �ġ�

   
*/
public class Demo2 {

	public static void main(String[] args) {
		File file = new  File(".");
		System.out.println("��ǰ·���ǣ�"+ file.getAbsolutePath());
		
		File file2 = new File("..\\..\\a.txt");
		System.out.println("������"+ file2.exists());
		
	}
	
}
