package com.daos;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entities.StudentEntity;
@Repository
@Transactional
public interface StudentMapperDao {
	public StudentEntity getStudent(String studentID);
	public StudentEntity getStudentAndClass(String studentID);
	public List<StudentEntity> getAllStudent();
	public void insertStudent(StudentEntity student);
	public void deleteStudent(StudentEntity student);
	public void updateStudent(StudentEntity student);
}
