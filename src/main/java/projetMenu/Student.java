/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetMenu;


import java.util.ArrayList;
public class Student implements Comparable<Student>{

	private String name, course;
    private Double semester1, semester2, highNote;
    private Integer id, order;
    private Double average;
    private static Double sumAverage = (double) 0;
   
    public static double geralAverage (ArrayList<Student> student) {
		return sumAverage / student.size();}

    public static Integer position (ArrayList <Student> student, int id) {
		for (Integer i = 0; i <= student.size(); i++) {
			if (student.get(i).getId() == id) {return i;}	else {return null;}} return null;}
    
		public Student(Integer id, String name, String course, Double semester1, Double semester2) {
		this.name = name;
		this.course = course;
		this.semester1 = semester1;
		this.semester2 = semester2;
		this.id = id;
		this.sumAverage += (semester1 + semester2) / 2;
		if(semester1 > semester2){highNote = semester1;};if(semester1 < semester2){highNote = semester2;};
		average = (semester1 + semester2) / 2;}

		public String toString() {
			return "ID: "+id+"\n"+
		           "Name: "+name+"\n"+
		           "Course: "+course+"\n"+
				   "Average: "+String.format("%.2f", average)+"\n"+
			"Student high note: "+ String.format("%.2f", highNote);}

		public Integer getOrder() {
			return order;}

		public void setOrder(Integer order) {
			this.order = order;}

		public String getName() {
			return name;}
		
		public void setName(String name) {
			this.name = name;}
		
		public String getCourse() {
			return course;}
		
		public void setCourse(String course) {
			this.course = course;}
		
		public Double getSemester1() {
			return semester1;}
		
		public void setSemester1(Double semester1) {
			this.semester1 = semester1;}
		
		public Double getSemester2() {
			return semester2;}
		
		public void setSemester2(Double semester2) {
			this.semester2 = semester2;}
		
		public Double getAverage() {
			return average;}
		
		public void setAverage(double average) {
			this.average = average;}
		
		public Double getHighNote() {
			return highNote;}
		
		public void setAverage(Double average) {
			this.average = average;}
		
		public Integer getId() {
			return id;}

			public int compareTo(Student otherStudent) {
			if (this.id > otherStudent.getId()) { 
				  return 1; } if (this.id < otherStudent.getId()) {return -1;} return 0;}
				   
			public static String getSumAverage() {
				return Double.toString(sumAverage);}
}