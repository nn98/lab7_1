package lab7_1;

import java.util.Scanner;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab7_1: ������");
		
		Stack<Integer> stack=new Stack<Integer>();
		Scanner s=new Scanner(System.in);
		int t;
		do {
			System.out.println("1:���� 2:���� 3:��ȸ 4:�հ� 5:����");
			t=s.nextInt();
			switch(t) {
			case 1:
				System.out.println("������ ������ �Է�:");
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
		System.out.println("����.");
	}

}
