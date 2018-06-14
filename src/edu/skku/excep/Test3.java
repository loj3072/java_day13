package edu.skku.excep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Parent{
	public Car drive(Car c) throws IOException{}
	Car work(Car c) {}
}

class Child extends Parent{
	//public Car drive(Car c) throws IOException{}   //그대로 가거나
	//public Car drive(Car c) throws FildNotFoundException{} //sub를 하거나
	public Car drive(Car c) {} //안하거나
	
	//public Car work(Car c) {}
	//		 Car work(Car c) {} //modifier가 default면 public이거나 default.
	public Bus work(Car c) {} //super에 throws가 없으면 절대 throws할 수 없다. //오버라이딩: 파라미터는 무조건 같아야 하고(sub를 쓸 수 없음. 파라미터가 달라지면 오버라이딩이 아니라 오버로딩이 됨), 리턴타입은 sub가 와도 된다.
	
}



public class Test3 {
	
	public void fileRead() throws FileNotFoundException {
		Scanner s=new Scanner(new File("data.txt"));//파일 스캐닝. /(System.in) 키보드로부터 입력 //Import해도 빨간 줄이 뜨는 이유: FileNotFoundException이 날 거 같아! 라고 컴파일러가 알려줌. -Checked Exception
		String msg=s.nextLine(); //한 줄을 읽어와라
		System.out.println(msg); //읽어온 것을 찍어봐라
	}

	public static void main(String[] args) throws FileNotFoundException {
		//같은 클래스니까 그냥 불러서 쓰고 싶은데.. 왜 에러가 나지? static이니까! 프로그램을 실행하는 main은 반드시  static이어야(VM에서 바로 실행하기 위해) 하니가 지우면 안되고.
		//방법1 new Test
		Test3 t=new Test3();
		t.fileRead(); //throws하니까 빨간줄 됐음/ 아까는 아니었는데! fileRead()가 에러를 main으로 던졌기 때문에. main은 VirtualMachine에게 던지는데... VM에게 던진다는 것은 그냥 죽는다는 것
		//가능하면 그냥 스스로 내부에서 해결하는 것이 좋음.
		
		
	}

}
