//18.02.12

import java.util.Stack;

import kr.or.bit.Coin;
import kr.or.bit.Mystack;

public class Ex05_Stack_Collection {

	public static void main(String[] args) {
		// LIFO
		// Collection Framework 제공하는 Stack
		Stack stack = new Stack();
		stack.push("A");
		stack.push("B");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		// System.out.println(stack.pop());
		// System.out.println(stack.pop()); java.util.EmptyStackException

		Mystack my = new Mystack(10);
		System.out.println(my.full());
		my.push(20);
		my.push(30);
		// my.push(40);
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());

		///////////////////////////////////
		// JAVA API 제공하느 Stack 클래스
		Stack<Coin> coinBox = new Stack<Coin>();

		// 동전케이스에 동전을 끼움
		// 100원, 50원, 500원, 10원 순서로 넣는다.
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));

		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");

		}

	}
}
