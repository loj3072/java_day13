package edu.skku.excep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Parent{
	public Car drive(Car c) throws IOException{}
	Car work(Car c) {}
}

class Child extends Parent{
	//public Car drive(Car c) throws IOException{}   //�״�� ���ų�
	//public Car drive(Car c) throws FildNotFoundException{} //sub�� �ϰų�
	public Car drive(Car c) {} //���ϰų�
	
	//public Car work(Car c) {}
	//		 Car work(Car c) {} //modifier�� default�� public�̰ų� default.
	public Bus work(Car c) {} //super�� throws�� ������ ���� throws�� �� ����. //�������̵�: �Ķ���ʹ� ������ ���ƾ� �ϰ�(sub�� �� �� ����. �Ķ���Ͱ� �޶����� �������̵��� �ƴ϶� �����ε��� ��), ����Ÿ���� sub�� �͵� �ȴ�.
	
}



public class Test3 {
	
	public void fileRead() throws FileNotFoundException {
		Scanner s=new Scanner(new File("data.txt"));//���� ��ĳ��. /(System.in) Ű����κ��� �Է� //Import�ص� ���� ���� �ߴ� ����: FileNotFoundException�� �� �� ����! ��� �����Ϸ��� �˷���. -Checked Exception
		String msg=s.nextLine(); //�� ���� �о�Ͷ�
		System.out.println(msg); //�о�� ���� ������
	}

	public static void main(String[] args) throws FileNotFoundException {
		//���� Ŭ�����ϱ� �׳� �ҷ��� ���� ������.. �� ������ ����? static�̴ϱ�! ���α׷��� �����ϴ� main�� �ݵ��  static�̾��(VM���� �ٷ� �����ϱ� ����) �ϴϰ� ����� �ȵǰ�.
		//���1 new Test
		Test3 t=new Test3();
		t.fileRead(); //throws�ϴϱ� ������ ����/ �Ʊ�� �ƴϾ��µ�! fileRead()�� ������ main���� ������ ������. main�� VirtualMachine���� �����µ�... VM���� �����ٴ� ���� �׳� �״´ٴ� ��
		//�����ϸ� �׳� ������ ���ο��� �ذ��ϴ� ���� ����.
		
		
	}

}
