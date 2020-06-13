package com.beginnersbug.example;

import com.beginnersbug.example.model.Student;
import com.google.gson.Gson;

public class ConvertJsonToJava {

	public static void main(String[] args) {
		try {
			String jsonString = "{\"studentId\":\"001\",\"studentName\":\"Rajesh\",\"schoolName\":\"BeginnerBug\",\"department\":\"Java\"}";
			Gson gson = new Gson();
			Student student = gson.fromJson(jsonString, Student.class);
			System.out.println(student.getStudentName());
			
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
