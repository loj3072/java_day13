package edu.skku.excep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test2 {
	
	public void fileRead() throws FileNotFoundException {
		Scanner s=new Scanner(new File("data.txt"));//���� ��ĳ��. /(System.in) Ű����κ��� �Է� //Import�ص� ���� ���� �ߴ� ����: FileNotFoundException�� �� �� ����! ��� �����Ϸ��� �˷���. -Checked Exception
		String msg=s.nextLine(); //�� ���� �о�Ͷ�
		System.out.println(msg); //�о�� ���� ������
	}

	public static void main(String[] args) throws FileNotFoundException {
		//���� Ŭ�����ϱ� �׳� �ҷ��� ���� ������.. �� ������ ����? static�̴ϱ�! ���α׷��� �����ϴ� main�� �ݵ��  static�̾��(VM���� �ٷ� �����ϱ� ����) �ϴϰ� ����� �ȵǰ�.
		//���1 new Test
		Test2 t=new Test2();
		t.fileRead(); //throws�ϴϱ� ������ ����/ �Ʊ�� �ƴϾ��µ�! fileRead()�� ������ main���� ������ ������. main�� VirtualMachine���� �����µ�... VM���� �����ٴ� ���� �׳� �״´ٴ� ��
		//�����ϸ� �׳� ������ ���ο��� �ذ��ϴ� ���� ����.
		
		
	}

}
