/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetMenu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class SistemaControl {
   Scanner sc = new Scanner(System.in);
   ArrayList<studentRecurse> student = new ArrayList<>();
  
     
     
     public Object incluirAluno (){   
                    System.out.println("#INSIRA OS DADOS DO ALUNO:");
                    System.out.println("ID do aluno:");
                    int id = sc.nextInt();
                    Integer idConference = studentRecurse.position(student, id);
                    while (idConference != null) {
                        System.out.print("ID Ja cadastrado! DIGITE NOVAMENTE: ");
                        System.out.println("");
                        id = sc.nextInt();
                        idConference = studentRecurse.position(student, id);}
                    System.out.println("Nome do aluno:");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Curso do aluno:");
                    String course = sc.nextLine();
                    System.out.println("Nota do primeiro semestre:");
                    Double semester1 = sc.nextDouble();
                    
                    while (semester1 < 0 || semester1 > 10) {
                        System.out.println("Noda do primeiro semestre não econtra-se entre 0 e 10! DIGITE NOVAMENTE: ");
                        semester1 = sc.nextDouble();}
                    System.out.println("Nota do segundo semestre:");
                    Double semester2 = sc.nextDouble();
                   
                    while (semester2 < 0 || semester2 > 10) {
                        System.out.println("Noda do segundo semestre não econtra-se entre 0 e 10! DIGITE NOVAMENTE: ");
                        semester2 = sc.nextDouble();}                    
                    student.add( new studentRecurse(id, name, course, semester1, semester2));
                    System.out.println("DADOS:" + "\n" + student + "\n");
       return null;
    }
    
     public Object alterarAluno (){ 
     if (student.size() != 0) {
                        System.out.println("Insira o ID do aluno:");
                       int id = sc.nextInt();
                      Integer  idConference = studentRecurse.position(student, id);
                        while (idConference == null) {
                            System.out.print("ID não cadastrado! DIGITE NOVAMENTE: ");
                            System.out.println("");
                            id = sc.nextInt();
                            idConference = studentRecurse.position(student, id);}
                        
                        System.out.println("Qual dado deseja alterar?:");
                        System.out.println();
                        System.out.println("1: ID DO ALUNO" + "\n" + "2: NOME DO ALUNO" + "\n" + "3: CURSO DO ALUNO" + "\n" + "4: NOTAS" + "\n" + "5: RETORNAR");
                       int pick = sc.nextInt();
                        sc.nextLine();
                        switch (pick) {
                            case 1:
                                System.out.print("NOVO ID: ");
                                System.out.println("");
                                student.get(idConference).setId(sc.nextInt());
                                break;
                            case 2:
                                System.out.print("NOVO NOME: ");
                                System.out.println("");
                                student.get(idConference).setName(sc.nextLine());
                                while (student.get(idConference).getName().trim().equalsIgnoreCase("")) {
                                    System.out.print("Nome invalido! DIGITE NOVAMENTE: ");
                                    System.out.println("");
                                    student.get(idConference).setName(sc.nextLine());}                                
                                break;
                            case 3:
                                System.out.print("NOVO CURSO: ");
                                System.out.println("");
                                student.get(idConference).setCourse(sc.nextLine());
                                while (student.get(idConference).getCourse().trim().equalsIgnoreCase("")) {
                                    System.out.print("Nome invalido! DIGITE NOVAMENTE: ");
                                    System.out.println("");
                                    student.get(idConference).setCourse(sc.nextLine());}                               
                                break;
                            case 4:
                                System.out.print("NOTA PRIMEIRO SEMESTRE: ");
                                System.out.println("");
                                student.get(idConference).setSemester1(sc.nextDouble());
                                while (student.get(idConference).getSemester1() < 0 || student.get(idConference).getSemester1() > 10) {
                                    System.out.println("Noda do primeiro semestre não econtra-se entre 0 e 10! DIGITE NOVAMENTE: ");
                                    student.get(idConference).setSemester1(sc.nextDouble());}
                                System.out.print("NOTA SEGUNDO SEMESTRE: ");
                                System.out.println("");
                                student.get(idConference).setSemester2(sc.nextDouble());
                                while (student.get(idConference).getSemester2() < 0 || student.get(idConference).getSemester2() > 10) {
                                    System.out.println("Noda do primeiro semestre não econtra-se entre 0 e 10! DIGITE NOVAMENTE: ");
                                    student.get(idConference).setSemester2(sc.nextDouble());;}                               
                                break;
                        case 5: System.out.println("RETORNANDO");
                        break;
                        }}                        
                    else {
                        System.out.println("NENHUM ALUNO CADASTRADO");}
      return null;
     }
    
    public Object imprimirAluno(){
     if (student.size() != 0) {
                        System.out.println("Insira o ID do aluno que deseja visualizar:");
                       int id = sc.nextInt();
                        Integer idConference = studentRecurse.position(student, id);
                        while (idConference == null) {
                            System.out.print("ID não encontrado! DIGITE NOVAMENTE: ");
                            System.out.println("");
                            id = sc.nextInt();
                            idConference = studentRecurse.position(student, id);}                        
                        System.out.println("DADOS:" + "\n" + student.get(idConference));}
                     else {
                        System.out.println("NENHUM ALUNO CADASTRADO");} 
    
   return null; }
    public Object imprimirTodos (){
         System.out.println("Como deseja exibir os dados?: ");
                    System.out.println("1 = ORDENAR POR INCLUSÃO");
                    System.out.println("2 = ORDENAR POR NOME ");
                    System.out.println("3 = ORDENAR POR ID");
                    System.out.println("4 = ORDENAR POR MÉDIA");
                    int order = sc.nextInt();
                    while (order < 1 || order > 4) {
                        System.out.println("Valor invalido, DIGITE NOVAMETE: ");
                        order = sc.nextInt();}                   
                    switch (order) {
                        case 1:
                            for (studentRecurse a : student) {
                                System.out.print(a);}                            
                            break;
                        case 2:
                            Comparator compare = new Comparator<studentRecurse>() {
                                public int compare(studentRecurse student, studentRecurse otherStudent) {
                                    return student.getName().compareTo(otherStudent.getName());}};                             
                            Collections.sort(student, compare);
                            System.out.println("Segue dados cadastrados: ");
                            for (studentRecurse b : student) {
                                System.out.println(b);
                                System.out.println("---------------------------------");}                           
                            break;
                        case 3:
                            Collections.sort(student);
                            System.out.println("Segue dados cadastrados: ");
                            for (studentRecurse b : student) {
                                System.out.println(b);
                                System.out.println("---------------------------------");}                           
                            break;
                        case 4:
                            Collections.sort(student, new Comparator<studentRecurse>() {
                                public int compare(studentRecurse student, studentRecurse otherStudent) {
                                    if (student.getAverage() < otherStudent.getAverage()) {
                                        return 1;
                                    } else if (student.getAverage() > otherStudent.getAverage()) {return -1;}                                   
                                     else {return 0;}}});                 
                            System.out.println("Segue dados cadastrados: ");
                            for (studentRecurse b : student) {
                                System.out.println(b);
                                System.out.println("---------------------------------");}
    }
                    return null;
    }   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
