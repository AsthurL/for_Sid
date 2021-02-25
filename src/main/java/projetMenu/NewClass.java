package projetMenu;

import projetMenu.studentRecurse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Asthur Araujo
 */
public class NewClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ArrayList<studentRecurse> student = new ArrayList<>();
        Integer pick = 0;

        for (int y = 5; pick < y;) {
            System.out.println("\n" + "*MENU*" + "\n" + "1: INCLUIR ALUNO" + "\n" + "2: ALTERAR ALUNO" + "\n" + "3: IMPRIMIR ALUNO" + "\n" + "4: IMPRIMIR TODOS OS ALUNOS" + "\n" + "5: FECHAR PROGRAMA");
            pick = sc.nextInt();
            while (pick < 1 || pick > 5) {
                System.out.println("Valor invalido, DIGITE NOVAMETE: ");
                pick = sc.nextInt();}
           
            switch (pick) {
                case 1:
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
                    break;


                case 2:
                    if (student.size() != 0) {
                        System.out.println("Insira o ID do aluno:");
                        id = sc.nextInt();
                        idConference = studentRecurse.position(student, id);
                        while (idConference == null) {
                            System.out.print("ID não cadastrado! DIGITE NOVAMENTE: ");
                            System.out.println("");
                            id = sc.nextInt();
                            idConference = studentRecurse.position(student, id);}
                        
                        System.out.println("Qual dado deseja alterar?:");
                        System.out.println();
                        System.out.println("1: ID DO ALUNO" + "\n" + "2: NOME DO ALUNO" + "\n" + "3: CURSO DO ALUNO" + "\n" + "4: NOTAS" + "\n" + "5: RETORNAR");
                        pick = sc.nextInt();
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
                                break;}}                        
                    else {
                        System.out.println("NENHUM ALUNO CADASTRADO");}
                    break;
                case 3:
                    if (student.size() != 0) {
                        System.out.println("Insira o ID do aluno que deseja visualizar:");
                        id = sc.nextInt();
                        idConference = studentRecurse.position(student, id);
                        while (idConference == null) {
                            System.out.print("ID não encontrado! DIGITE NOVAMENTE: ");
                            System.out.println("");
                            id = sc.nextInt();
                            idConference = studentRecurse.position(student, id);}                        
                        System.out.println("DADOS:" + "\n" + student.get(idConference));}
                     else {
                        System.out.println("NENHUM ALUNO CADASTRADO");}                  
                    break;
                case 4:
                    System.out.println("Como deseja exibir os dados?: ");
                    System.out.println("1 = ORDER OF INCLUSION");
                    System.out.println("2 = NAME ORDER");
                    System.out.println("3 = ID ORDER");
                    System.out.println("4 = AVERAGE ORDER");
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
                             break;}
                      break;}} 
        System.out.println("PROGRAMA FECHADO");
    }}

