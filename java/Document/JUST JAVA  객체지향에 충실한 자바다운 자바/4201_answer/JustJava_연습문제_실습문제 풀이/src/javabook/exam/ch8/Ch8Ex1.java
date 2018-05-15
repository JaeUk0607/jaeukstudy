package javabook.exam.ch8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/* 8장 실습문제 1~2번
 * 교재 이미지는 예시로 똑같이 만들 필요는 없으며 일반적인 계산기를 생각하고 구현하면 됨.
 * - 최소요구 사항은 사칙연산과 AC(계산초기화) 기능이다.
 * - 본 구현에서는 연속된 계산은 지원하지 않고 두 수에 대한 사칙연산만 지원한다.
 * - 각종 연산오류에 대해서는 별도의 예외처리를 생략함.
 */
public class Ch8Ex1 extends JFrame{
	// 결과 레이블
	JLabel label;

	// 숫자 버튼과 기능 버튼
	JButton btn[] = new JButton[10];
	JButton fbtn[] = new JButton[6];

	// 기능버튼 레이블 문자열
	String[] blabels = {"+","-","*","AC","=","/"};

	// 계산을 위한 변수
	int num1, num2, result;
	String tmpNum="";
	String operator;

	public Ch8Ex1() {
		// 윈도우 설정
		super("Calcurator");
		setBounds(200, 200, 210, 300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 결과 레이블 설정
		label = new JLabel("0", JLabel.RIGHT);
		label.setFont(new Font("굴림", Font.BOLD, 40));
		label.setBackground(Color.LIGHT_GRAY);
		add(label, BorderLayout.NORTH);

		// UI 메인 패널 구성
		JPanel p = new JPanel(new GridLayout(4, 4, 1, 1));
		add(p, BorderLayout.CENTER);

		// 버튼 초기화
		makeNumBtns();
		makeFncBtns();

		// 패널에 버튼추가
		int bn = 7;
		for(int i=0;i<3;i++){
			for(int j=bn,cnt=0;cnt<3;j++,cnt++) {
				p.add(btn[j]);
			}
			p.add(fbtn[i]);
			bn -= 3;
		}

		// 마지막 라인은 별도 추가
		p.add(btn[0]);
		p.add(fbtn[3]);
		p.add(fbtn[4]);
		p.add(fbtn[5]);

		setVisible(true);
	}

	// 숫자 버튼 생성 및 레이블, 이벤트 추가
	void makeNumBtns() {
		NumberHandler nh = new NumberHandler();

		for(int i=0;i<btn.length;i++ ) {
			btn[i] = new JButton(Integer.toString(i));
			btn[i].addActionListener(nh);
		}
	}

	// 기능 버튼 생성 및 레이블, 이벤트 추가
	void makeFncBtns() {
		CalcHandler ch = new CalcHandler();

		for(int i=0;i<fbtn.length;i++) {
			fbtn[i] = new JButton(blabels[i]);
			fbtn[i].setBackground(Color.GRAY);
			fbtn[i].addActionListener(ch);
		}    	
	}

	// 숫자 이벤트 처리 핸들러 클래스
	class NumberHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String s = e.getActionCommand();
			tmpNum += s;
			label.setText(tmpNum);
		}
	}


	// 연산자 및 기타 기능 처리 핸들러 클래스
	class CalcHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String in = e.getActionCommand();
			if(in.equals("=")) {
				num2 = Integer.parseInt(tmpNum);
				
				switch(operator) {
				case "+": result = num1+num2; break;
				case "-": result = num1-num2; break;
				case "*": result = num1*num2; break;
				case "/": result = num1/num2; break;
				}
				label.setText(Integer.toString(result));
			}
			else if (in.equals("AC")){
				label.setText("0");
				tmpNum = "";
				num1 = 0; num2 = 0; result = 0;
			}
			else {
				operator = in;
				num1 = Integer.parseInt(label.getText());
				tmpNum = "";
				label.setText(operator);
			}
		}
	}

	public static void main(String[] args) {
		new Ch8Ex1();
	}
}