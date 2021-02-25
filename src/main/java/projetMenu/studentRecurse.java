
package projetMenu;

import java.util.ArrayList;

public class studentRecurse implements Comparable<studentRecurse> {

    private String name;
    private String course;
    private Double semester1;
    private Double semester2;
    private Integer id, order;
    private static Double average;
    private static Double highNote;

    public studentRecurse(Integer id, String name, String course, Double semester1, Double semester2) {
        this.name = name;
        this.course = course;
        this.semester1 = (double) semester1;
        this.semester2 = (double) semester2;
        this.id = id;}

    public String toString() {
        return "ID: " + id + "\n"
                + "Name: " + name + "\n"
                + "Course: " + course + "\n"
                + "Average: " + String.format("%.2f", getAverage()) + "\n"
                + "Student high note: " + String.format("%.2f", getHighNote())
                + "\n";}
    
    public static Integer position(ArrayList<studentRecurse> student, int id) {
        for (int i = 0; i < student.size(); i++) {if (student.get(i).getId() == id) { return i;}} return null;}  //Retorna validação ID          
 
    public void setHighNote(Double highNote) {
        this.highNote = highNote; }
   
    public void setOrder(Integer order) {
        this.order = order;}
    
    public void setAverage(Double average) {
        this.average = average;}
    
    public void setName(String name) {
        this.name = name;}
    
    public void setCourse(String course) {
        this.course = course;}
    
    public void setSemester1(Double semester1) {
        this.semester1 = semester1;}
    
    public void setSemester2(Double semester2) {
        this.semester2 = semester2;}
    
    public void setId(Integer id) {
        this.id = id;}
    
    public String getName() {
        return name;}
    
    public String getCourse() {
        return course;}
    
    public Double getSemester1() {
        return semester1;}
    
    public Double getSemester2() {
        return semester2;}

    public Double getHighNote() {
        if (semester1 > semester2) {
            return semester1;
        } else { return semester2;}}
           
    public Integer getId() {
        return id;}
   
    public Integer getOrder() {
        return order;}
    
    public Double getAverage() {
        return (semester1 + semester2) / 2;}

    public int compareTo(studentRecurse otherStudent) {
        if (this.id > otherStudent.getId()) {
            return 1;}       
        if (this.id < otherStudent.getId()) {
            return -1;}
        return 0;}
        
}
