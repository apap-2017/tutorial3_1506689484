package com.example.tutorial3.service;

import java.util.ArrayList;
import java.util.List;

import com.example.tutorial3.model.StudentModel;

public class InMemoryStudentService implements StudentService {

	private static List<StudentModel> studentList = new ArrayList<StudentModel>();

	@Override
	public StudentModel selectStudent(String npm) {
		for(StudentModel st : studentList) {
			if (st.getNpm().equals(npm)) {
				return st;
			}
		}
		return null;
	}
	
	@Override
	public List<StudentModel> selectAllStudents() {
		return studentList;
	}
	
	@Override
	public void addStudent(StudentModel student) {
		studentList.add(student);
	}
	
	@Override
	public boolean deleteStudent(String npm) {
		for(StudentModel st : studentList) {
			if(st.getNpm().equals(npm)) {
				studentList.remove(st);
				return true;
			}
		}
		return false;
	}
}
