package cn.itcast.file;

import java.io.File;
import java.io.IOException;

/*
������
	createNewFile()	��ָ��λ�ô���һ�����ļ����ɹ��ͷ���true������Ѵ��ھͲ�����Ȼ�󷵻�false
	mkdir()			��ָ��λ�ô���Ŀ¼����ֻ�ᴴ�����һ��Ŀ¼������ϼ�Ŀ¼�����ھ����쳣��
	mkdirs()		��ָ��λ�ô���Ŀ¼����ᴴ��·�������в����ڵ�Ŀ¼��
	renameTo(File dest)	�������ļ����ļ��У�Ҳ���Բ����ǿյ��ļ��У��ļ���ͬʱ�൱���ļ��ļ���,����ʱ���ܲ����ǿյ��ļ��С��ƶ�/�������ɹ��򷵻�true��ʧ���򷵻�false��

*/

public class Demo3 {
	
	public static void main(String[] args) throws IOException {
		File file = new File("F:\\aa");
		System.out.println("�����ɹ�����"+file.createNewFile()); //createNewFile ����һ��ָ�����ļ���������ļ������ˣ��򲻻��ٴ����������û�д����򴴽��������ɹ�����true�����򷵻�false��
		
		File dir = new  File("F:\\a.txt");
		System.out.println("�����ļ��гɹ���"+dir.mkdir()); // mkdir ����һ�������ļ��У�
		dir = new File("F:\\aa\\bb");
		System.out.println("�����༶�ļ��У�"+ dir.mkdirs());
		
		//renameTo()  ���Ŀ���ļ���Դ�ļ�����ͬһ��·���£���ôrenameTo���������������� ���Ŀ���ļ���Դ�ļ�������ͬһ��·���£���ôrenameTo�����þ��Ǽ��У����һ����ܲ����ļ��С� 
		File destFile = new File("F:\\aaaaaaw");
		System.out.println("�������ɹ���"+file.renameTo(destFile)) ; 
		
	}

}
