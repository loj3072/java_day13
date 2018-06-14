package edu.skku.excep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
	
	public void fileRead() {
		Scanner s=null; //블럭 안에서 선언한 변수는 블럭 안에서만 사용할 수 있으므로 밖에서 먼저 선언해 둔다.
		try {
			//data생성: day13 우클릭 -new - file - data.txt
			s=new Scanner(new File("data.txt"));//파일 스캐닝. /(System.in) 키보드로부터 입력 //Import해도 빨간 줄이 뜨는 이유: FileNotFoundException이 날 거 같아! 라고 컴파일러가 알려줌. -Checked Exception
			String msg=s.nextLine(); //한 줄을 읽어와라
			System.out.println(msg); //읽어온 것을 찍어봐라
		}catch(FileNotFoundException e) { //파일을 읽어오지 못했으면 그 다음 줄들도 다 에러가 계속 발생하므로 하나로 묶어서 try/catch!
			System.out.println("파일 읽기 실패");
		}finally { //s로 계속 파일을 읽어오고 있으므로 다른 곳에서 파일을 사용하기 위해서는 반드시 파일을 닫아야 한다.
			if(s!=null) s.close(); //에러가 났다면 s는 그대로 null이기 때문에 이 경우 NullPoint에러가 뜬다.  + 결과를 내는 것과 에러를 나타내는 것이 각각 따로 작업하기 때문에 결과 순서는 cpu가 처리하는 대로.
		}
	}

	public static void main(String[] args) {
		//같은 클래스니까 그냥 불러서 쓰고 싶은데.. 왜 에러가 나지? static이니까! 프로그램을 실행하는 main은 반드시  static이어야(VM에서 바로 실행하기 위해) 하니가 지우면 안되고.
		//방법1 new Test
		Test t=new Test();
		t.fileRead();
		
		
	}

}
