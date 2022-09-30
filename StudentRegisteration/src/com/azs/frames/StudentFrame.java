package com.azs.frames;
import java.awt.EventQueue;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.azs.beans.StudentBean;
import com.azs.dao.StudentDao;
import com.azs.daoImpl.StudentDaoImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;

public class StudentFrame extends JFrame {

	private JPanel contentPane;
	private JTextField nameTextField;
	private JTextField rollNotextField;
	private JTextField batchTextField;
	private JTextField sectionTextField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final JComboBox countryComboBox;
	private final JRadioButton femaleRadioButton;
	private final JRadioButton maleRadioButton;
	private final JCheckBox matricCheckBox;
	private final JCheckBox interCheckBox;
	private final JCheckBox gradCheckBox;
	private final JCheckBox postGradCheckBox;
	private final JTextArea addressTextArea;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();
	private StudentBean studentBean = new StudentBean();
	private StudentDao studentDao = new StudentDaoImpl();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentFrame frame = new StudentFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}//end of main method

	/**
	 * Create the frame.
	 */
	public StudentFrame() {
		setTitle("Student Registeration Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 776, 514);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setBounds(48, 39, 78, 14);
		contentPane.add(nameLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Roll Number");
		lblNewLabel_1.setBounds(48, 78, 78, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Batch");
		lblNewLabel_2.setBounds(48, 126, 78, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Section");
		lblNewLabel_3.setBounds(48, 173, 78, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setBounds(48, 211, 78, 14);
		contentPane.add(lblNewLabel_4);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(182, 36, 215, 20);
		contentPane.add(nameTextField);
		nameTextField.setColumns(10);
		
		rollNotextField = new JTextField();
		rollNotextField.setBounds(182, 78, 215, 20);
		contentPane.add(rollNotextField);
		rollNotextField.setColumns(10);
		
		batchTextField = new JTextField();
		batchTextField.setBounds(182, 123, 215, 20);
		contentPane.add(batchTextField);
		batchTextField.setColumns(10);
		
		sectionTextField = new JTextField();
		sectionTextField.setBounds(182, 170, 215, 20);
		contentPane.add(sectionTextField);
		sectionTextField.setColumns(10);
		
		maleRadioButton = new JRadioButton("Male");
		maleRadioButton.setBackground(Color.YELLOW);
		buttonGroup.add(maleRadioButton);
		maleRadioButton.setBounds(182, 207, 78, 23);
		maleRadioButton.setSelected(true);
		contentPane.add(maleRadioButton);
		
		femaleRadioButton = new JRadioButton("Female");
		femaleRadioButton.setBackground(Color.YELLOW);
		buttonGroup.add(femaleRadioButton);
		femaleRadioButton.setBounds(274, 207, 123, 23);
		contentPane.add(femaleRadioButton);
		
		JButton saveButton = new JButton("Save");
		saveButton.setAction(action);
		saveButton.setBounds(48, 441, 78, 23);
		contentPane.add(saveButton);
		
		JButton printButton = new JButton("Print");
		printButton.setAction(action_1);
		printButton.setBounds(136, 441, 78, 23);
		contentPane.add(printButton);
		
		JButton getDatabaseButton = new JButton("Print From Database");
		getDatabaseButton.setAction(action_3);
		getDatabaseButton.setBounds(327, 441, 70, 23);
		contentPane.add(getDatabaseButton);
		
		JLabel lblNewLabel = new JLabel("Qualification");
		lblNewLabel.setBounds(48, 256, 78, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("Address");
		lblNewLabel_5.setBounds(48, 323, 78, 14);
		contentPane.add(lblNewLabel_5);
		
		matricCheckBox = new JCheckBox("Matric");
		matricCheckBox.setBackground(Color.YELLOW);
		matricCheckBox.setBounds(185, 252, 78, 23);
		contentPane.add(matricCheckBox);
		
		gradCheckBox = new JCheckBox("Graduate");
		gradCheckBox.setBackground(Color.YELLOW);
		gradCheckBox.setBounds(185, 285, 78, 23);
		contentPane.add(gradCheckBox);
		
		interCheckBox = new JCheckBox("Intermediate");
		interCheckBox.setBackground(Color.YELLOW);
		interCheckBox.setBounds(274, 252, 123, 23);
		contentPane.add(interCheckBox);
		
		postGradCheckBox = new JCheckBox("Post Graduate");
		postGradCheckBox.setBackground(Color.YELLOW);
		postGradCheckBox.setBounds(274, 285, 123, 23);
		contentPane.add(postGradCheckBox);
		
		addressTextArea = new JTextArea();
		addressTextArea.setBounds(182, 318, 215, 40);
		contentPane.add(addressTextArea);
		
		JLabel lblNewLabel_6 = new JLabel("Country");
		lblNewLabel_6.setBounds(48, 373, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		countryComboBox = new JComboBox<String>();
		countryComboBox.setBounds(182, 369, 215, 22);
		populateCountryComboBox();
		contentPane.add(countryComboBox);
		
		JButton btnNewButton = new JButton("Database");
		btnNewButton.setAction(action_2);
		btnNewButton.setBounds(224, 441, 89, 23);
		contentPane.add(btnNewButton);	
		
	}/**
	 * End of Constructor.
	 */
	
	//------->Methods
	//------->Method to insert data into Country Combo Box
	private void populateCountryComboBox() {
		countryComboBox.addItem("Pakistan");
		countryComboBox.addItem("India");
		countryComboBox.addItem("China");
	}
	// Method to fetch data from TextFilds
	public int getStudentInfo() {
			try {
				studentBean.setStudentName(nameTextField.getText());
				studentBean.setStudentRollNo(rollNotextField.getText());
				studentBean.setStudentBatch(batchTextField.getText());
				studentBean.setStudentSection(sectionTextField.getText());
					
					if(maleRadioButton.isSelected())
						studentBean.setStudentGender("Male");
					else
						studentBean.setStudentGender("Female");
					
					if(matricCheckBox.isSelected())
						studentBean.setStudentQualification("Matric, ");
					if(interCheckBox.isSelected())
						studentBean.setStudentQualification(studentBean.getStudentQualification()+"Inter, ");
					if(gradCheckBox.isSelected())
						studentBean.setStudentQualification(studentBean.getStudentQualification()+"Graduate, ");
					if(postGradCheckBox.isSelected())
						studentBean.setStudentQualification(studentBean.getStudentQualification()+"Post-Graduate, ");
				
					studentBean.setStudentAddress(addressTextArea.getText());
					studentBean.setStudentCountry(countryComboBox.getSelectedItem().toString());

				return 1;
			}
			catch (Exception e) {
				return 0;
			}
		}
	//----> Method to save record into JSON File
		private boolean saveInfoToJSONFile() {
			getStudentInfo();	
			JSONObject json = new JSONObject();
			json.put("ID", studentBean.generateId());
		    json.put("Name", studentBean.getStudentName());
		    json.put("Roll_No", studentBean.getStudentRollNo());
		    json.put("Batch", studentBean.getStudentBatch());
		    json.put("Section", studentBean.getStudentSection());
		    json.put("Gender", studentBean.getStudentGender());
		    json.put("Qualification", studentBean.getStudentQualification());
		    json.put("Address", studentBean.getStudentAddress());
		    json.put("Country", studentBean.getStudentCountry());
		    try {
		         FileWriter file = new FileWriter("student.json");
		         file.write(json.toJSONString());
		         file.close();
		         return true;
		      } catch (IOException e) {
		         return false;
		      }
		}
		
		//-----> method to get data from JSON File
		private boolean getInfoFromJson() {
			// TODO Auto-generated method stub
			JSONParser parser = new JSONParser();
			try {
				JSONObject json = (JSONObject) parser.parse(new FileReader("student.json"));
				studentBean.setStudentName(json.get("Name").toString());
				studentBean.setStudentRollNo(json.get("Roll_No").toString());
				studentBean.setStudentQualification(json.get("Qualification").toString());
				studentBean.setStudentBatch(json.get("Batch").toString());
				studentBean.setStudentSection(json.get("Section").toString());
				studentBean.setStudentGender(json.get("Gender").toString());
				studentBean.setStudentCountry(json.get("Country").toString());
				studentBean.setStudentAddress(json.get("Address").toString());
				return true;
			} catch (Exception e) {
				e.printStackTrace();
			return false;
			}
		}

//------------> End of Methods
		
		
	//-----> Button Events
	//-----> Insert data to JSON File
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "JSON");
			putValue(SHORT_DESCRIPTION, "Save data to JSON file.");
		}
		public void actionPerformed(ActionEvent e) {
			if(saveInfoToJSONFile())
				JOptionPane.showMessageDialog(rootPane, "Record Saved To JSON File!");
			else
				JOptionPane.showMessageDialog(rootPane, "Record Saving Error!");
		}
	}//end of SwingAction Class JSON

	
	//-----> Fetch data from JSON File
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Fetch JSON");
			putValue(SHORT_DESCRIPTION, "Get Data From JSON File");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}//end of SwingAction_1 Class Get from JSON
	
	//----------> Insert data to MySql Database
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Database");
			putValue(SHORT_DESCRIPTION, "Insert data to MySql Database");
		}
		public void actionPerformed(ActionEvent e) {
			getStudentInfo();
			
			if(studentDao.createStudent(studentBean)==1)
				JOptionPane.showMessageDialog(rootPane, "Record Saved To SQl Database!");
			else
				JOptionPane.showMessageDialog(rootPane, "Database Record Saving Error!");
		}		
		
	}//end of SwingAction_2 Class Insert data to MySql Database
	
	
	//This event will fetch records from MySql database
	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "Show Records");
			putValue(SHORT_DESCRIPTION, "Show Database Records");
		}
		public void actionPerformed(ActionEvent e) {
			
			new Students(studentDao.getAllStudents());
		}

	}//end of fetching MySql database records Class SwingAction_3
}//end of main class
