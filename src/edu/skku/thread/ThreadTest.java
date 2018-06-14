package edu.skku.thread;

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread t=new MyThread();
		//t.run();//���� �ȵ�. �˹ٻ��� �� ���� ���� �ϰڴٴ� ��.
		t.start();//�˹ٻ��� �����췯�� �־��. cpu�����ٷ��� �����带 �����.
		//���� ���� �۾����� �� �� ����.
		System.out.println("Main....1");
		System.out.println("Main....2");
		try {
			//t.join();//�۾��� ���� ������ ��ٸ��� �޼ҵ�
			Thread.sleep(100);//�۾����� main�� ��� �� ����. 100�� ������ 0.1�ʸ� �ǹ���// main�� ���� ����ϰ� �ִ� �˹ٻ� �����尡 ���ͼ� �۾���.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main....3");
		System.out.println("Main....4");
		System.out.println("Main....5");
	}

}
class MyThread extends Thread{//Thread�� ����ϸ� �˹ٻ��� ������ ����ٰ� �� �� ����.
	@Override
	public void run() {//�˹ٻ��� �� ���� �˷��ִ� �۾�. �ݵ�� �������̵��ؾ� ��
		System.out.println(Thread.currentThread().getName());
		System.out.println("alba~~~");
	}
}