package cn.itcast.file;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

/*
��ȡ��
	getName()		��ȡ�ļ����ļ��е����ƣ��������ϼ�·����
	getPath()       ���ؾ���·�������������·��������Ŀ¼Ҫָ��
	getAbsolutePath()	��ȡ�ļ��ľ���·�������ļ��Ƿ����û��ϵ
	length()		��ȡ�ļ��Ĵ�С���ֽ�����������ļ��������򷵻�0L��������ļ���Ҳ����0L��
	getParent()		���ش˳���·������Ŀ¼��·�����ַ����������·����û��ָ����Ŀ¼���򷵻�null��
	lastModified()	��ȡ���һ�α��޸ĵ�ʱ�䡣
	

*/
public class  Demo5{

	public static void main(String[] args) {
		File file = new File("..\\..\\a.txt");
		System.out.println("�ļ�����"+ file.getName());
		System.out.println("��ȡ����·����"+ file.getPath());
		System.out.println("getAbsolutePath��ȡ����·����"+file.getAbsolutePath());
		System.out.println("��ȡ�ļ��ĵĴ�С(�ֽ�Ϊ��λ)��"+ file.length());
		System.out.println("��ȡ�ļ��ĸ�·����"+ file.getParent());
		
		//ʹ�ú���ֵת����Date����
		long lastModified = file.lastModified();
		Date date = new Date(lastModified);	
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy��MM��dd��  HH:mm:ss");
		System.out.println("��ȡ���һ�ε��޸�ʱ��(����ֵ)��"+ dateFormat.format(date) );
		
	}
	
	
}
