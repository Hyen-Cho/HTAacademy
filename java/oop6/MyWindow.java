import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyWindow extends JFrame {

	JTextArea area = new JTextArea();
	JTextField field = new JTextField();
	JButton btn = new JButton("전송");

	public MyWindow() {
		setTitle("연습 프로그램");
		
		JPanel panel = new JPanel(new BorderLayout());
		add(new JScrollPane(area), BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);
		panel.add(field, BorderLayout.CENTER);
		panel.add(btn, BorderLayout.EAST);
		
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				String text = field.getText();
				area.append(text);
				area.append("\n");
				field.setText("");
				field.requestFocus();
			}
		};
		field.addActionListener(listener);
		btn.addActionListener(listener);
	
		setBounds(100, 100, 300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		field.requestFocus();
	}

	public static void main(String[] args) {
		new MyWindow();
	}
}