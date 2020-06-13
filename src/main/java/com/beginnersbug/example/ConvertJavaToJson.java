package com.beginnersbug.example;

import com.beginnersbug.example.model.Student;
import com.google.gson.Gson;

public class ConvertJavaToJson {

	public static void main(String[] args) {
		Gson gson = new Gson();
		Student student = new Student();
		student.setStudentId("001");
		student.setStudentName("Rajesh");
		student.setDepartment("JAVA");
		student.setSchoolName("BeginnersBug");

		String jsonString = gson.toJson(student);

		System.out.println(jsonString);

	}

}
