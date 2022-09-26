import java.awt.EventQueue;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

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

	private String name, rollNo, section, batch, gender, qualification="", address, country;
	private int id;
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
	}

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
		
		JButton clearButton = new JButton("Clear");
		clearButton.setBounds(327, 441, 70, 23);
		contentPane.add(clearButton);
		
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
	}//end of constructor
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Save");
			putValue(SHORT_DESCRIPTION, "This button will save the data to JSON file.");
		}
		public void actionPerformed(ActionEvent e) {
			if(saveInfoToJSONFile())
				JOptionPane.showMessageDialog(rootPane, "Record Saved To JSON File!");
			else
				JOptionPane.showMessageDialog(rootPane, "Record Saving Error!");
		}
	}//end of SwingAction Class Save
	public boolean getInfo() {
			try {
					setName(nameTextField.getText());
					setRollNo(rollNotextField.getText());
					setBatch(batchTextField.getText());
					setSection(sectionTextField.getText());
					
					if(maleRadioButton.isSelected())
						setGender("Male");
					else
						setGender("Female");
					
					if(matricCheckBox.isSelected())
						setQualification("Matric, ");
					if(interCheckBox.isSelected())
						setQualification(getQualification()+"Inter, ");
					if(gradCheckBox.isSelected())
						setQualification(getQualification()+"Graduate, ");
					if(postGradCheckBox.isSelected())
						setQualification(getQualification()+"Post-Graduate, ");
				
					setAddress(addressTextArea.getText());
					setCountry(countryComboBox.getSelectedItem().toString());

				return true;
			}
			catch (Exception e) {
				return false;
			}
		}
		private boolean saveInfoToJSONFile() {
			getInfo();	
			JSONObject json = new JSONObject();
			json.put("ID", generateId());
		    json.put("Name", getName());
		    json.put("Roll_No", getRollNo());
		    json.put("Batch", getBatch());
		    json.put("Section", getSection());
		    json.put("Gender", getGender());
		    json.put("Qualification", getQualification());
		    json.put("Address", getAddress());
		    json.put("Country", getCountry());
		    try {
		         FileWriter file = new FileWriter("student.json");
		         file.write(json.toJSONString());
		         file.close();
		         return true;
		      } catch (IOException e) {
		         return false;
		      }
		}
		
		private void populateCountryComboBox() {
			countryComboBox.addItem("Pakistan");
			countryComboBox.addItem("India");
			countryComboBox.addItem("China");
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getBatch() {
			return batch;
		}

		public void setBatch(String batch) {
			this.batch = batch;
		}
		

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRollNo() {
			return rollNo;
		}

		public void setRollNo(String rollNo) {
			this.rollNo = rollNo;
		}

		public String getSection() {
			return section;
		}

		public void setSection(String section) {
			this.section = section;
		}

		public String getQualification() {
			return qualification;
		}

		public void setQualification(String qualification) {
			this.qualification = qualification;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}
		
		private int generateId() {
			Random randomNumber = new Random(100);
			return randomNumber.nextInt();
		}
		private int getId() {
			return id;
		}
		private void setId(int id) {
			this.id = id;
		}
		private boolean getInfoFromJson() {
			// TODO Auto-generated method stub
			JSONParser parser = new JSONParser();
			try {
				JSONObject json = (JSONObject) parser.parse(new FileReader("student.json"));
		         setName(json.get("Name").toString());
		         setRollNo(json.get("Roll_No").toString());
		         setQualification(json.get("Qualification").toString());
		         setBatch(json.get("Batch").toString());
		         setSection(json.get("Section").toString());
		         setGender(json.get("Gender").toString());
		         setCountry(json.get("Country").toString());
		         setAddress(json.get("Address").toString());
				return true;
			} catch (Exception e) {
				e.printStackTrace();
			return false;
			}
		}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Database");
			putValue(SHORT_DESCRIPTION, "This button will insert the data to MySql Database");
		}
		public void actionPerformed(ActionEvent e) {
			Connection con = SQLConnection.makeConnection();
			getInfo();
			String sqlQuery = "insert into student values(?,?,?,?,?,?,?,?,?)";
			try {
				PreparedStatement pst=con.prepareStatement(sqlQuery);
				pst.setInt(1, generateId());
				pst.setString(2, getRollNo());
				pst.setString(3, getName());
				pst.setString(4, getBatch());
				pst.setString(5, getSection());
				pst.setString(6, getGender());
				pst.setString(7, getQualification());
				pst.setString(8, getAddress());
				pst.setString(9, getCountry());
				if(pst.executeUpdate()==1)
					JOptionPane.showMessageDialog(rootPane, "Record Saved To SQl Database!");
				else
					JOptionPane.showMessageDialog(rootPane, "Database Record Saving Error!");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Print");
			putValue(SHORT_DESCRIPTION, "This Button Will Get Data From Database");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
