package edu.skku.thread;

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread t=new MyThread();
		//t.run();//절대 안됨. 알바생이 할 일을 내가 하겠다는 격.
		t.start();//알바생을 스케쥴러에 넣어라. cpu스케줄러에 스레드를 등록함.
		//누가 먼저 작업할지 알 수 없음.
		System.out.println("Main....1");
		System.out.println("Main....2");
		try {
			//t.join();//작업이 끝날 때까지 기다리는 메소드
			Thread.sleep(100);//작업중인 main을 재울 수 있음. 100을 넣으면 0.1초를 의미함// main이 잠들면 대기하고 있던 알바생 스레드가 들어와서 작업함.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main....3");
		System.out.println("Main....4");
		System.out.println("Main....5");
	}

}
class MyThread extends Thread{//Thread를 상속하면 알바생의 기준을 갖췄다고 할 수 있음.
	@Override
	public void run() {//알바생이 할 일을 알려주는 작업. 반드시 오버라이딩해야 함
		System.out.println(Thread.currentThread().getName());
		System.out.println("alba~~~");
	}
}