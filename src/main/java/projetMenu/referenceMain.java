/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetMenu;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import projetMenu.Student;

public class referenceMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Numero de alunos nesta escola: ");
		int numberStudent = sc.nextInt();
		ArrayList<Student> student = new ArrayList<Student>();
		sc.nextLine();
		
		for (int i = 0; i < numberStudent; i++) {
			String position;
			switch (i) {
			case 0:
				position = "primeiro";
				break;
			case 1:
				position = "segundo";
				break;
			case 2:
				position = "terceiro";
				break;
			case 3:
				position = "quarto";
				break;
			case 4:
				position = "quinto";
				break;
			case 5:
				position = "sexto";
				break;
			case 6:
				position = "setimo";
				break;
			case 7:
				position = "oitavo";
				break;
			case 8:
				position = "nono";
				break;
			case 9:
				position = "decimo";
				break;
			default:
				position = "";
			}
			System.out.println("#Dados do " + position + " aluno:");
			System.out.println("ID do aluno:");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Nome do aluno:");
			String name = sc.nextLine();
			System.out.println("Curso do aluno:");
			String course = sc.nextLine();
			System.out.println("Nota do primeiro semestre:");
			Double semester1 = sc.nextDouble();
			while (0 >= semester1 && 10 <= semester1) {
				System.out.println("Noda do primeiro semestre não econtra-se entre 0 e 10! DIGITE NOVAMENTE: ");
				semester1 = sc.nextDouble();}
			System.out.println("Nota do segundo semestre:");
			Double semester2 = sc.nextDouble();
			while (0 >= semester2 && 10 <= semester2) {
				System.out.println("Noda do segundo semestre não econtra-se entre 0 e 10! DIGITE NOVAMENTE: ");
				semester2 = sc.nextDouble();}
			student.add(new Student(id, name, course, semester1, semester2));}
		
		System.out.println("Como deseja exibir os dados?: ");
		System.out.println("1 = ORDER OF INCLUSION");
		System.out.println("2 = NAME ORDER");
		System.out.println("3 = ID ORDER");
		System.out.println("4 = AVERAGE ORDER");
		int order = sc.nextInt();
		
		if (order == 1) {
			System.out.println("Segue dados cadastrados: ");
			for (Student b : student) {
				System.out.println(b);
				System.out.println("---------------------------------");}
			System.out.printf("Média geral de notas: " + Student.geralAverage(student));};

		if (order == 2) {
			Comparator compare = new Comparator<Student>() {
				public int compare(Student student, Student otherStudent) {
					return student.getName().compareTo(otherStudent.getName());}};
			Collections.sort(student, compare);
			System.out.println("Segue dados cadastrados: ");
			for (Student b : student) {
				System.out.println(b);
				System.out.println("---------------------------------");}
			System.out.printf("Média geral de notas: " + Student.geralAverage(student));};
		
		if (order == 3) {
			Collections.sort(student);
			System.out.println("Segue dados cadastrados: ");
			for (Student b : student) {
				System.out.println(b);
				System.out.println("---------------------------------");}
			System.out.printf("Média geral de notas: " + Student.geralAverage(student));};
			
		if (order == 4) {
			Collections.sort(student, new Comparator<Student>() {
				public int compare(Student student, Student otherStudent) {
					if (student.getAverage() < otherStudent.getAverage()) {
						return 1;} else if (student.getAverage() > otherStudent.getAverage()) {return -1;
						} else return 0;}});
			System.out.println("Segue dados cadastrados: ");
			for (Student b : student) {
				System.out.println(b);
				System.out.println("---------------------------------");}
			System.out.printf("Média geral de notas: " + Student.geralAverage(student));};	
	}}