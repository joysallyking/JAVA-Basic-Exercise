package cn.itcast.jdk15;
/*

ö�٣�һЩ����������ʱ������Ҫ�����ݲ���������ģ���������һ����Χ�ڵ�ֵ������ֱ��ʹ��ö�����Խ����


ö����Ķ����ʽ��
	
	enum ����{
		//ö��ֵ
	}
	
ö��Ҫע���ϸ�ڣ�
	1. ö����Ҳ��һ��������ࡣ
	2. ö��ֵĬ�ϵ����η���public static final��
	3. ö��ֵ������ö��ֵ������������ͣ� Ȼ��ö��ֵ��ָ���˱���Ķ���ġ�
	4. ö����Ĺ��췽��Ĭ�ϵ����η���private�ġ�
	5. ö������Զ����Լ��ĳ�Ա�������Ա������
	6. ö��������Զ��幹�캯�������ǹ��캯�������η�������private��
	7. ö������Դ��ڳ��� �ķ���������ö��ֵ����Ҫʵ�ֳ��� �ķ�����
	8. ö��ֵ����Ҫλ��ö���� �ĵ�һ����䡣
	
	
	
 */

//�Զ���һ��ö����
enum Sex{
	
	
	man("��"){

		@Override
		public void run() {
			System.out.println("��������...");
		}
		
	},woman("Ů"){

		@Override
		public void run() {
			System.out.println("Ů������...");
		}
		
		
	}; //ö��ֵ
	
	String value; //��Ա ����
	

	//	public static final Sex man = new Sex();
	
	
	//���캯��
	private Sex(String  value){
		this.value = value;
	}
	
	//��Ա����
	public void getValue(){
		System.out.println("value :"+ value);
	}
	
	public abstract void run();
	
}

public class Demo7 {
	
	public static void main(String[] args) {
		Sex sex = Sex.man; //��ȡ����ö����Ķ���
		sex.value = "��";
		sex.getValue();
		sex.run();
		
	}
	
}
