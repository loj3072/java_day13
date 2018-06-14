package edu.skku.excep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
	
	public void fileRead() {
		Scanner s=null; //�� �ȿ��� ������ ������ �� �ȿ����� ����� �� �����Ƿ� �ۿ��� ���� ������ �д�.
		try {
			//data����: day13 ��Ŭ�� -new - file - data.txt
			s=new Scanner(new File("data.txt"));//���� ��ĳ��. /(System.in) Ű����κ��� �Է� //Import�ص� ���� ���� �ߴ� ����: FileNotFoundException�� �� �� ����! ��� �����Ϸ��� �˷���. -Checked Exception
			String msg=s.nextLine(); //�� ���� �о�Ͷ�
			System.out.println(msg); //�о�� ���� ������
		}catch(FileNotFoundException e) { //������ �о���� �������� �� ���� �ٵ鵵 �� ������ ��� �߻��ϹǷ� �ϳ��� ��� try/catch!
			System.out.println("���� �б� ����");
		}finally { //s�� ��� ������ �о���� �����Ƿ� �ٸ� ������ ������ ����ϱ� ���ؼ��� �ݵ�� ������ �ݾƾ� �Ѵ�.
			if(s!=null) s.close(); //������ ���ٸ� s�� �״�� null�̱� ������ �� ��� NullPoint������ ���.  + ����� ���� �Ͱ� ������ ��Ÿ���� ���� ���� ���� �۾��ϱ� ������ ��� ������ cpu�� ó���ϴ� ���.
		}
	}

	public static void main(String[] args) {
		//���� Ŭ�����ϱ� �׳� �ҷ��� ���� ������.. �� ������ ����? static�̴ϱ�! ���α׷��� �����ϴ� main�� �ݵ��  static�̾��(VM���� �ٷ� �����ϱ� ����) �ϴϰ� ����� �ȵǰ�.
		//���1 new Test
		Test t=new Test();
		t.fileRead();
		
		
	}

}
