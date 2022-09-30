package com.azs.dao;

import java.sql.ResultSet;

import com.azs.beans.StudentBean;

public interface StudentDao {
	public int createStudent(StudentBean studentBean);
	public ResultSet getAllStudents();

}
