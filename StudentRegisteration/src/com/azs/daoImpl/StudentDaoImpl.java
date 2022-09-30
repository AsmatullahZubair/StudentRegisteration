package com.azs.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.azs.beans.StudentBean;
import com.azs.connection.SQLConnection;
import com.azs.dao.StudentDao;

public class StudentDaoImpl implements StudentDao {
//Creating MySQL database Connection
private static final Connection con = SQLConnection.makeConnection();
private static PreparedStatement pst;
private static ResultSet rst;
	
	@Override
	public int createStudent(StudentBean studentBean) {
		String sqlQuery = "insert into student values(?,?,?,?,?,?,?,?,?)";
		try {
			pst=con.prepareStatement(sqlQuery);
			pst.setInt(1, studentBean.generateId());
			pst.setString(2, studentBean.getStudentRollNo());
			pst.setString(3, studentBean.getStudentName());
			pst.setString(4, studentBean.getStudentBatch());
			pst.setString(5, studentBean.getStudentSection());
			pst.setString(6, studentBean.getStudentGender());
			pst.setString(7, studentBean.getStudentQualification());
			pst.setString(8, studentBean.getStudentAddress());
			pst.setString(9, studentBean.getStudentCountry());
			if(pst.executeUpdate()==1)
				return 1;
				} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return 0;
	}

	@Override
	public ResultSet getAllStudents() {
		String sqlQuery = "select * from student";
		try {
			pst=con.prepareStatement(sqlQuery);
			rst = pst.executeQuery();		
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		return rst;
	}

}
