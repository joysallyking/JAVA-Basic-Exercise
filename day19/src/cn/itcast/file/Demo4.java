package cn.itcast.file;

import java.io.File;

/*
ɾ����
delete()		ɾ���ļ���һ�����ļ��У�������ļ����Ҳ�Ϊ�գ�����ɾ�����ɹ�����true��ʧ�ܷ���false��
deleteOnExit()	���������ֹʱ������ɾ���˳���·������ʾ���ļ���Ŀ¼����֤�����쳣ʱ��������ʱ�ļ�Ҳ���Ա�ɾ��


	�жϣ�
		exists()		�ļ����ļ����Ƿ���ڡ�
		isFile()		�Ƿ���һ���ļ�����������ڣ���ʼ��Ϊfalse��
		isDirectory()	�Ƿ���һ��Ŀ¼����������ڣ���ʼ��Ϊfalse��
		isHidden()		�Ƿ���һ�����ص��ļ����Ƿ������ص�Ŀ¼��
		isAbsolute()	���Դ˳���·�����Ƿ�Ϊ����·������



*/
public class Demo4 {
	
	public static void main(String[] args) {
	/*	
	    ɾ���ġ�
	 * File file = new File("F:\\a.txt");
		System.out.println("ɾ���ɹ��� "+ file.delete()); //delete������������ɾ���ǿյ��ļ��С� delete����������ɾ��һ���ļ���
		file.deleteOnExit();  //jvm�˳���ʱ��ɾ���ļ���  һ������ɾ����ʱ �ļ���		
		System.out.println("������");
		
		�ж�
	*/
		File file = new File("..\\..\\a.txt");
		System.out.println("������"+ file.exists());
		System.out.println("�ж��Ƿ���һ���ļ���"+file.isFile()); //������ļ�����true�����򷵻�false.
		System.out.println("�ж��Ƿ���һ���ļ��У�"+ file.isDirectory()); // ���ļ��з���ture�����򷵻�false.
		System.out.println("�����ص� �ļ���"+ file.isHidden());
		System.out.println("�Ǿ���·��"+ file.isAbsolute());
	}	

}
