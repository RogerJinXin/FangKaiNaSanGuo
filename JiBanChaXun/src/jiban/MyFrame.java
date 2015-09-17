package jiban;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 * @author JinXin
 *
 */
public class MyFrame extends JFrame {

	private static final long serialVersionUID = 8277756218077207265L;

	JPanel panelN = new JPanel(new GridLayout(1, 6, 3, 3));
	JTextField member1 = new JTextField();
	JTextField member2 = new JTextField();
	JTextField member3 = new JTextField();
	JTextField member4 = new JTextField();
	JTextField member5 = new JTextField();
	JButton button = new JButton("查询");
	JPanel panelS = new JPanel(new BorderLayout());
	JTextField result = new JTextField();

	public MyFrame(String title) throws HeadlessException {
		super(title);

		setLayout(new BorderLayout());

		panelN.add(member1);
		panelN.add(member2);
		panelN.add(member3);
		panelN.add(member4);
		panelN.add(member5);
		panelN.add(button);
		panelN.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		getContentPane().add(panelN, BorderLayout.NORTH);
		
		panelS.add(result);
		getContentPane().add(panelS, BorderLayout.CENTER);

		setVisible(true);
		setSize(800, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // 让窗体居中显示
	}

}
