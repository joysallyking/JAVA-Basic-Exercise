package cn.itcast.jdk15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	
	 public static void main(String[] args) {
		 	List list = new ArrayList();
			list.add("1");
			list.add("4");
			list.add("2");
			list.add("7");
			
			// ��Ϊ2�����һ��Ԫ���ˣ�Ҳ����ɾ���� û���ڵ����˵�������next������
			Iterator<String> it = list.iterator();
			while(it.hasNext()){
				String s = it.next();
				if("1".equals(s)){
					list.remove("1");
					break;
				}
			}
			System.out.println(list);
		}

}
