package cn.itcast.jdk15;
/*
jdk1.5������֮------->�ɱ����

���� ����һ���������ӷ����ܣ��������������� �ļӷ������ǲ�ȷ������

�ɱ�����ĸ�ʽ��
	
	��������... ������

�ɱ����Ҫ ע���ϸ�ڣ� 
	1. ���һ������ ���β�ʹ�����˿ɱ����֮����ô���ø÷�����ʱ����Դ��ݲ���Ҳ���Բ����ݲ�����
	2. �ɱ����ʵ������һ���������
	3. �ɱ��������λ���β��е����һ��������
	4. һ���������ֻ����һ���ɱ� ��������Ϊ�ɱ����Ҫλ���β������һ��λ���ϡ�
	

 
 */
public class Demo4 {

	public static void main(String[] args) {
		int[] arr = {1,2,45,6,7};
		/*System.out.println(arr);
			add(arr);*/
		add();
	}
	
	
	public static void add(int... arr){ //������0
		
		int result = 0;
		for(int item : arr){
			result+=item;
		}
		System.out.println("�ܺͣ�"+ result);
	}
	

	
}
