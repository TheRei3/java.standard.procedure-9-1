package ex9no1;

public class ex9no1 {  //  451p
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2))
			System.out.println("v1�� v2�� �����ϴ�.");
		else
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
		
		v2 = v1;
		
		if(v1.equals(v2))
			System.out.println("v1�� v2�� �����ϴ�.");
		else
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
	}
}

class Value{
	int value;
	
	Value(int value) {
		this.value = value;
	}
}
