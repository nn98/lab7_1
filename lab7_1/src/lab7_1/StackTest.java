package lab7_1;

import java.util.Scanner;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab7_1: 김윤서");
		
		Stack<Integer> stack=new Stack<Integer>();
		Scanner s=new Scanner(System.in);
		int t;
		do {
			System.out.println("1:삽입 2:삭제 3:조회 4:합계 5:종료");
			t=s.nextInt();
			switch(t) {
			case 1:
				System.out.println("삽입할 정수값 입력:");
				int p=s.nextInt();
				stack.push(p);
				break;
			case 2:
				System.out.println("pop: "+stack.pop());
				break;
			case 3:
				System.out.println("peek: "+stack.peek());
				break;
			case 4:
				int sum=0;
				while(!stack.empty()) sum+=stack.pop();
				System.out.println("sum: "+sum);
				break;
			}
			
		}while(t!=5);
		System.out.println("종료.");
	}

}
