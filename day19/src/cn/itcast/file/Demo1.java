package cn.itcast.file;

import java.io.File;

/*
IO��(Input Output) ��

IO������Ҫ�������ǽ���豸���豸֮�� �����ݴ������⡣ ���磺 Ӳ��--->�ڴ�          �ڴ������---->Ӳ����            �Ѽ��̵�����------->�ڴ���

IO������Ӧ�ó�����
	 �������� �� �ϴ���ͷ��   �� ���� �� ����xml�ļ� ... 

���ݱ��浽Ӳ���ϣ������ݾͿ������������Եı��档   ����һ�������ļ�����ʽ���浽Ӳ����

sunʹ����һ��File���������ļ������ļ��еġ�

File���������һ���ļ�����һ���ļ��С�


File��Ĺ��췽����

	File(String pathname)  ָ���ļ������ļ��е�·������һ��File�ļ���
	
	File(File parent, String child)   ���� parent ����·������ child ·�����ַ�������һ���� File ʵ���� 

	File(String parent, String child) 

Ŀ¼�ָ�����  ��windows������ ��Ŀ¼�ָ����� \  ,��linux�����ϵ�Ŀ¼�ָ�����/ .

ע�⣺  ��windows����\ �� / ������ʹ����ΪĿ¼�ָ����� ���ң����д/ ��ʱ��ֻ��Ҫдһ�����ɡ�


*/
public class Demo1 {
	
	public static void main(String[] args) {
		//File file = new File("F:"+File.separator+"a.txt"); //  ��linux�������ǲ���һ���Ϸ�·�������� 
		File file = new File("F:/a.txt"); 
		
		/*File parentFile = new File("F:\\");
		File file = new File("F:\\","a.txt");*/
		System.out.println("������ "+ file.exists());  // exists �жϸ��ļ��Ƿ���ڣ����ڷ���true�����򷵻�false��
//		System.out.println("Ŀ¼�ָ�����"+ File.separator);
	}
	
	
	
}
