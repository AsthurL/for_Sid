/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetMenu;

import java.util.ArrayList;

/**
 *
 * @author Asthur Araujo
 */
public class studentRecurse implements Comparable<studentRecurse>{
  
    /*
    private String name, course;
    private Double semester1;
    private Double semester2;
    
    private Double highNote; {if(semester1 > semester2){highNote = (double) semester1;} if(semester1 < semester2){highNote = (double) semester2;};}

    private Integer id, order;
    private Double average = (semester1 + semester2) / 2;
    private Double sumAverage = (semester1 + semester2) / 2; */
		
    private static String name;
    private static String course;
    private static Double semester1;
    private static Double semester2; 
    private static Double highNote;
    private static Integer id, order;
    private static Double average;
   // private Double sumAverage = (double) 0;

    public void setHighNote(Double highNote) {
        this.highNote = highNote;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public void setAverage(Double average) {
        this.average = average;
    }
   
    //public static double geralAverage (ArrayList<studentRecurse> student) {
	//	return sumAverage / student.size();}
    
    public static Double  average (Double semester1, Double semester2){return average = (semester1 + semester2) / 2;}
    public static Double highNote (Double semester1, Double semester2){
    if(semester1 > semester2){return highNote = semester1;} else{return highNote = semester2;}}
    
    
    
    
    public studentRecurse(Integer id, String name, String course, Double semester1, Double semester2) {
		this.name = name;
		this.course = course;
		this.semester1 = (double) semester1;
		this.semester2 = (double) semester2;
		this.id = id;
                average = this.average;
                highNote = this.highNote;
		//this.sumAverage += (semester1 + semester2) / 2;
		//if(semester1 > semester2){highNote = semester1;};if(semester1 < semester2){highNote = semester2;};
		//average = (semester1 + semester2) / 2;
    }
    public String toString() {
			return "ID: "+id+"\n"+
		           "Name: "+name+"\n"+
		           "Course: "+course+"\n"+
				   "Average: "+String.format("%.2f", average)+"\n"+
			"Student high note: "+ String.format("%.2f", highNote)+
                                "\n";} 
    
   

    public static Integer position (ArrayList <studentRecurse>student, int id) {
		for (int i = 0; i < student.size(); i++) {
                    
			if (student.get(i).getId() == id) {return i;}}return null;} //Retorna validação ID

    
    
    
   

  
    
    
    
    
    
    
    
    
    
   
 
    
    
    
    
    
    
    
    
     public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setSemester1(Double semester1) {
        this.semester1 = semester1;
    }

    public void setSemester2(Double semester2) {
        this.semester2 = semester2;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    

    
    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public Double getSemester1() {
        return semester1;
    }

    public Double getSemester2() {
        return semester2;
    }

    public Double getHighNote() {
        return highNote;
    }

    public Integer getId() {
        return id;
    }

    public Integer getOrder() {
        return order;
    }

    public Double getAverage() {
        return average;
    }

   

    
    public int compareTo(studentRecurse otherStudent) {
        if (this.id > otherStudent.getId()) { 
				  return 1; } if (this.id < otherStudent.getId()) {return -1;} return 0;
    }
 
    

    
    
}
