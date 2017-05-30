package com.interfaces.dao;

import java.util.List;

import com.entity.StudentEntity;

public interface StudentMapperDao {
	public StudentEntity getStudent(String studentID);
	public StudentEntity getStudentAndClass(String studentID);
	public List<StudentEntity> getAllStudent();
	public void insertStudent(StudentEntity student);
	public void deleteStudent(StudentEntity student);
	public void updateStudent(StudentEntity student);
}
