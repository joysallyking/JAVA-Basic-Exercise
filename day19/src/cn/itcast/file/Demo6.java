package cn.itcast.file;

import java.io.File;

/*
�ļ�����أ�
	staic File[] listRoots()	�г����еĸ�Ŀ¼��Window�о�������ϵͳ���̷���
	list()						����Ŀ¼�µ��ļ�����Ŀ¼�������������ļ��������ļ����������᷵��null��
	listFiles()					����Ŀ¼�µ��ļ�����Ŀ¼����File��ʵ���������������ļ��������ļ����������᷵��null��


	list(FilenameFilter filter)	����ָ����ǰĿ¼�з��Ϲ������������ļ�����Ŀ¼�������ļ����������᷵��null��
	listFiles(FilenameFilter filter)	����ָ����ǰĿ¼�з��Ϲ������������ļ�����Ŀ¼�������ļ����������᷵��null��
*/
public class Demo6 {
	
	public static void main(String[] args) {
		/*File[] roots = File.listRoots(); //�г����еĸ�Ŀ¼
		for(File file  : roots){
			System.out.println(file);
		}*/
		
		File file = new File("F:\\1208\\day17");
		
		/*
		String[] fileNames = file.list(); //�� ��ǰ�ļ���������������ļ��������ļ����� �洢��һ��String���� �������� ���ء�
		for(String fileName : fileNames){
			System.out.println(fileName);
		}*/
		
		
		File[] files = file.listFiles(); // �� ��ǰ�ļ���������������ļ������ļ��ж�ʹ����һ��FIle����������Ȼ�����ЩFile����洢��һ��FIle�����з���
		for(File fileItem : files){
			System.out.println("�ļ�����"+ fileItem.getName());
		}
		
		
		
	}

}
