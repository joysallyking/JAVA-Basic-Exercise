package cn.itcast.jdk15;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
jdk1.5���ֵ�������---->��ǿforѭ��

��ǿforѭ�������ã� �򻯵���������д��ʽ��(ע�⣺��ǿforѭ���ĵײ㻹��ʹ���˵�����������)

��ǿforѭ�������÷�Χ�� �����ʵ����Iterable�ӿڵĶ��������������󶼿���ʹ����ǿforѭ����

��ǿforѭ���ĸ�ʽ��
 	
 	for(��������  ������  :������Ŀ��){
 	
 	}

��ǿforѭ��Ҫע������
	1. ��ǿforѭ���ײ�Ҳ��ʹ���˵�������ȡ�ģ�ֻ������ȡ��������jvm��ɣ�����Ҫ���ǻ�ȡ���������ѣ�������ʹ����ǿforѭ������Ԫ�صĹ����в�׼ʹ�ü���
	����Լ��ϵ�Ԫ�ظ��������޸ġ�
	2. ����������Ԫ������ǿforѭ������Ԫ�ص�����ʹ�õ������������ϵ�Ԫ��ʱ����ɾ�����ϵ�Ԫ�أ�����ǿforѭ���������ϵ�Ԫ��ʱ�����ܵ��õ�������remove����ɾ��Ԫ�ء�
	3. ��ͨforѭ������ǿforѭ����������ͨforѭ������û�б�����Ŀ�꣬����ǿforѭ��һ��Ҫ�б�����Ŀ�ꡣ

 

 */
public class Demo2 {
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		//���Ԫ��
		set.add("����");
		set.add("��ʣ");
		set.add("����");
		
		/*
		//ʹ�õ���������Set�ļ���.
		Iterator<String> it  = set.iterator();
		while(it.hasNext()){
			String temp = it.next();
			System.out.println("Ԫ�أ�"+ temp);
			it.remove();
		}
		
		
		//ʹ����ǿforѭ�����
		for(String item : set){
			System.out.println("Ԫ�أ�"+ item);
			
		}
		
		
		
		
		int[] arr = {12,5,6,1};
		
	 	��ͨforѭ���ı�����ʽ
	 	for(int i =  0 ; i<arr.length ; i++){
			System.out.println("Ԫ�أ�"+ arr[i]);
		}
		
		//ʹ����ǿforѭ��ʵ��
		for(int item :arr){
			System.out.println("Ԫ�أ�"+ item);
		}
		
		
		
		//���� �ڿ���̨��ӡ5��hello world.
		for(int i = 0 ; i < 5; i++){
			System.out.println("hello world");
		}
		*/
		
		//ע�⣺ Map����û��ʵ��Iterable�ӿڣ�����map���ϲ���ֱ��ʹ����ǿforѭ���������Ҫʹ����ǿforѭ����Ҫ������Collection
		// �ļ��ϡ�
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("001","����");
		map.put("002","����");
		map.put("003","����");
		map.put("004","����");
		Set<Map.Entry<String, String>> entrys = map.entrySet();
		for(Map.Entry<String, String> entry  :entrys){
			System.out.println("����"+ entry.getKey()+" ֵ��"+ entry.getValue());
		}
		
		
	}

}
