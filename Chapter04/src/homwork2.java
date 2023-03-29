import java.util.Scanner;

 public class homwork2 {

	 public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			// 문제1) 각 연산식을 대입 연산자 하나로 구성된 연산식으로 수정하세요.
			int val = 0;
			
			//val = val + 10;
			val += 10;	
			
			//val = val - 5;		
			val -= 5;
					
			//val = val * 3;
			val *= 3;		
			
			//val = val / 5;
			val /= 5;
			
			// 문제2) 변수 val의 값이 양수일 경우엔 변수 값을, 아닐 경우엔 0을 담는 변수를 선언하세요. (단, 삼항연산자를 사용)
			int intResult = 0;
			if (val > 0) {
			System.out.println(intResult);
			}else {
				System.out.println(0);
			}
			/* 문제 3) 다음과 같이 두 개의 정수가 주어졌을 경우 
		  			    두 정 수 중에서 음수가 있다면 'One of a or b is negative number'를,
		  			    만일 그렇지 않다면 'both a and b are zero or more'를 출력하도록 구현하세요. */ 
			int a = 10;
			int b = -8;
			String strResult = "One of a or b is negative number";
			
			if (a < 0 || b < 0) {
			System.out.println(strResult);
			}else{
				System.out.println("both a and b are zero or more");
			}

			// 문제4) 차례대로 x와 y의 값이 주어졌을 때 어느 사분면에 해당되는지 출력하도록 구현하세요.
			// 각 사분면에 해당 하는 x와 y의 값은 아래를 참조하세요.
			// 제1사분면 : x>0, y>0
			// 제2사분면 : x<0, y>0
			// 제3사분면 : x<0, y<0
			// 제4사분면 : x>0, y<0
			// 문제출처, 백준(https://www.acmicpc.net/) 14681번 문제
			int x = 1;
			int y = -1;
			if( x>0 && y>0) {
				System.out.println("제1사분면");
			}else if(x<0 && y>0){
				System.out.println("제2사분면");
			}else if(x<0 && y<0){
				System.out.println("제3사분면");
			}else if(x>0 && y<0){
				System.out.println("제4사분면");

			// 문제5) 연도가 주어졌을 때 해당 년도가 윤년인지를 확인해서 출력하도록 하세요.
			// 윤년은 연도가 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일때입니다.
			// 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이며,
			// 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아닙니다.
			// HiNT : 이중 IF문 사용
			// 문제출처, 백준(https://www.acmicpc.net/) 2753번 문제
				
				int year = 1997;
				if (year/4 == 0 ) {	
					if(year/100 != 0) {
					}else if(year/100 == 400){
						System.out.println("윤년입니다 ");
					}
				}else {
					System.out.println("윤년아닙니다 ");
				}
			
			// 문제6) switch문을 이용하여 가위, 바위, 보 중 하나가 주어졌을 때 사용자 어떤 값을 가져야 이길 수 있는 지를 출력하도록
			// 구현하세요.
			// 예를 들어, 가위가 주어졌을 때 "이기기 위해선 바위를 내야합니다." 라고 출력하도록 하세요.
			// 한 단어를 입력받을 경우 Scanner객체의 next() 함수를 사용하면 됩니다.
				System.out.println("가위바위보>");
				String score = scanner.nextLine();	
				switch(score){
				case "가위":		
					System.out.println("이기기 위해서 바위를 내셔야합니다.");
					break;
				case "바위":		
					System.out.println("이기기 위해서 보를 내셔야합니다.");
					break;
				case "보":		
					System.out.println("이기기 위해서 가위를 내셔야합니다.");
					break;
				}
				
				

			// 문제7) 차례대로 m과 n을 입력받아 m단을 n번째까지 출력하도록 하세요.
			// 예를 들어 2와 3을 입력받았을 경우 아래처럼 출력합니다.
			// 2 X 1 = 2
			// 2 X 2 = 4
			// 2 X 3 = 6
			System.out.println("m 을 입력해주세요");	
			int m = scanner.nextInt();
			System.out.println("n 을 입력해주세요");	
			int n = scanner.nextInt();
			
			for(int j=1; j<=n; j++) {
				System.out.println(m + " * " + j + " = " +(m*j));
			}
			
				
				
				
			//문제 8)
			//	구구단 출력
			// 	첨부파일 확인 후 해당 그림과 같이 구현해 볼 것.
			//	파일명 : gugu.png
				 for(int j=1; j<10 ; j++) {
					 for(int i=2; i<=5 ; i++) {
						 System.out.printf("%d x %d = %-4d", i,j,i*j);
					 }  System.out.println();
				 }
			
			


		//161.7

			boolean run =true;
			int balance = 0;
			while(run) {
				System.out.println("-------------------------------");
				System.out.println("1.예금 \\ 2.출금 \\ 3.잔고 \\ 4.종료");
				System.out.println("-------------------------------");
				System.out.println("선택> ");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.println("예금액>");
					int price =scanner.nextInt();
					break;
				case 2:
					System.out.println("출금액>");
					int price2 =scanner.nextInt();
					break;			
				case 3:
					System.out.println("잔고>");
					int price3 =scanner.nextInt();
					break;
				case 4:
					System.out.println("프로그램종료");
					break;
				}break;
				
				
			} System.out.println("프로그램 종료");

		}

	}
