import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;

public class Student extends JFrame {

	private JPanel contentPane;
	private JTextField nametextField;
	private JTextField rollnotextField;
	private JTextField batchtextField;
	private JTextField sectiontextField;
	private JTextField gendertextField;
	private JTextField qualificationtextField;
	private JTextField addresstextField;
	private JLabel lblNewLabel_7;
	private JTextField countrytextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student frame = new Student();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Student() {
		setTitle("Student Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 518);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(210, 52, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Roll No");
		lblNewLabel_1.setBounds(210, 94, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Batch");
		lblNewLabel_2.setBounds(210, 132, 66, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setBounds(210, 182, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Section");
		lblNewLabel_4.setBounds(210, 227, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		nametextField = new JTextField();
		nametextField.setBounds(306, 49, 86, 20);
		contentPane.add(nametextField);
		nametextField.setColumns(10);
		
		rollnotextField = new JTextField();
		rollnotextField.setBounds(306, 91, 86, 20);
		contentPane.add(rollnotextField);
		rollnotextField.setColumns(10);
		
		batchtextField = new JTextField();
		batchtextField.setBounds(306, 133, 86, 20);
		contentPane.add(batchtextField);
		batchtextField.setColumns(10);
		
		sectiontextField = new JTextField();
		sectiontextField.setBounds(306, 227, 86, 20);
		contentPane.add(sectiontextField);
		sectiontextField.setColumns(10);
		
		gendertextField = new JTextField();
		gendertextField.setBounds(306, 179, 86, 20);
		contentPane.add(gendertextField);
		gendertextField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Qualification");
		lblNewLabel_5.setBounds(210, 277, 66, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Address");
		lblNewLabel_6.setBounds(210, 330, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		qualificationtextField = new JTextField();
		qualificationtextField.setBounds(306, 274, 86, 20);
		contentPane.add(qualificationtextField);
		qualificationtextField.setColumns(10);
		
		addresstextField = new JTextField();
		addresstextField.setBounds(306, 327, 86, 20);
		contentPane.add(addresstextField);
		addresstextField.setColumns(10);
		
		lblNewLabel_7 = new JLabel("Country");
		lblNewLabel_7.setBounds(210, 377, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		countrytextField = new JTextField();
		countrytextField.setBounds(306, 374, 86, 20);
		contentPane.add(countrytextField);
		countrytextField.setColumns(10);
	}

	public Student(int id, String name, String rollNo, String batch, String section, String gender,
			String qualification, String address, String country) {
		
		setTitle("Student Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 518);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(210, 52, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Roll No");
		lblNewLabel_1.setBounds(210, 94, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Batch");
		lblNewLabel_2.setBounds(210, 132, 66, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setBounds(210, 182, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Section");
		lblNewLabel_4.setBounds(210, 227, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		nametextField = new JTextField();
		nametextField.setBounds(306, 49, 86, 20);
		contentPane.add(nametextField);
		nametextField.setText(name);
		nametextField.setColumns(10);
		
		rollnotextField = new JTextField();
		rollnotextField.setBounds(306, 91, 86, 20);
		contentPane.add(rollnotextField);
		rollnotextField.setText(rollNo);
		rollnotextField.setColumns(10);
		
		batchtextField = new JTextField();
		batchtextField.setBounds(306, 133, 86, 20);
		contentPane.add(batchtextField);
		batchtextField.setText(batch);
		batchtextField.setColumns(10);
		
		sectiontextField = new JTextField();
		sectiontextField.setBounds(306, 227, 86, 20);
		contentPane.add(sectiontextField);
		sectiontextField.setText(section);
		sectiontextField.setColumns(10);
		
		gendertextField = new JTextField();
		gendertextField.setBounds(306, 179, 86, 20);
		contentPane.add(gendertextField);
		gendertextField.setText(gender);
		gendertextField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Qualification");
		lblNewLabel_5.setBounds(210, 277, 66, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Address");
		lblNewLabel_6.setBounds(210, 330, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		qualificationtextField = new JTextField();
		qualificationtextField.setBounds(306, 274, 86, 20);
		contentPane.add(qualificationtextField);
		qualificationtextField.setText(qualification);
		qualificationtextField.setColumns(10);
		
		addresstextField = new JTextField();
		addresstextField.setBounds(306, 327, 86, 20);
		contentPane.add(addresstextField);
		addresstextField.setText(address);
		addresstextField.setColumns(10);
		
		lblNewLabel_7 = new JLabel("Country");
		lblNewLabel_7.setBounds(210, 377, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		countrytextField = new JTextField();
		countrytextField.setBounds(306, 374, 86, 20);
		contentPane.add(countrytextField);
		countrytextField.setText(country);
		countrytextField.setColumns(10);
	}
}
