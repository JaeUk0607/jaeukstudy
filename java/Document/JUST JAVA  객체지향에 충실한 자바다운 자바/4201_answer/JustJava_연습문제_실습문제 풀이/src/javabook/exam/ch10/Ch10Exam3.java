package javabook.exam.ch10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ch10Exam3 extends JFrame{	
	String jdbcDriver = "com.mysql.jdbc.Driver";
	String jdbcUrl = "jdbc:mysql://localhost/javadb";
	Connection conn;
	
	PreparedStatement pstmt;
	ResultSet rs;
		
	Ch10Exam3() {		
		super("Login");
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		add(panel);
		
		JLabel userLabel = new JLabel("아이디");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);

		JLabel passwordLabel = new JLabel("비밀번호");
		passwordLabel.setBounds(10, 40, 80, 25);
		panel.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 160, 25);
		panel.add(passwordText);

		JButton loginButton = new JButton("로그인");
		loginButton.setBounds(10, 80, 80, 25);
		loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				connectDB();
				
				boolean result = checkUser(userText.getText(),new String(passwordText.getPassword()));
				if(result == true) {
					JOptionPane.showMessageDialog(null, "로그인 성공!!");
				}
				else{
					JOptionPane.showMessageDialog(null, "로그인 실패!!");
				}
				closeDB();
			}
			
		});
		panel.add(loginButton);
		
		JButton registerButton = new JButton("등록");
		registerButton.setBounds(180, 80, 80, 25);
		panel.add(registerButton);
		
		setVisible(true);
	}
	
	// DB연결 메서드
	public void connectDB() {
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(jdbcUrl,"javabook","1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// DB 연결 종료 메서드
	public void closeDB() {
		try {
			pstmt.close();
			rs.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
	public boolean checkUser(String id, String passwd) {
		String sql = "select * from login where id=? and passwd=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, passwd);
			
			rs = pstmt.executeQuery();
			rs.last();
			
			if(rs.getRow() == 0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public static void main(String[] args) {
		Ch10Exam3 app = new Ch10Exam3();
		
	}
}
