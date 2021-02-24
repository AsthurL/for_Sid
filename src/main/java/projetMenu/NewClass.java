
package projetMenu;
import projetMenu.studentRecurse;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Asthur Araujo
 */
public class NewClass {
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
        
    
    
    ArrayList<studentRecurse> student = new ArrayList<>();
    Integer pick = 0;
    
    
    
    
    
    
    
    
    for(int y = 5; pick <y;){
    System.out.println("*MENU*"+"\n"+"\n"+"1: INCLUIR ALUNO"+"\n"+ "2: ALTERAR ALUNO"+"\n"+ "3: IMPRIMIR ALUNO"+"\n"+ "4: IMPRIMIR TODOS OS ALUNOS"+"\n"+"5: FECHAR PROGRAMA");
    pick = sc.nextInt();
     while (pick < 1 || pick > 5) {
				System.out.println("Valor invalido, DIGITE NOVAMETE: ");
				pick = sc.nextInt();}

    
    
    
    
    
    switch(pick){
        
    case 1: 
    System.out.println("#INSIRA OS DADOS DO ALUNO:");
			System.out.println("ID do aluno:");
			int id = sc.nextInt();
			
                        Integer idConference = studentRecurse.position(student, id);
                        while(idConference != null){
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
                      
                        studentRecurse stud = new studentRecurse(id, name, course, semester1, semester2);
			student.add(stud);
                                System.out.println("DADOS:"+ "\n"+stud);
    break;
    
    case 2: 
    System.out.println("Insira o ID do aluno:");    
        id = sc.nextInt();
        idConference = studentRecurse.position(student, id);
        while(idConference == null){
                        System.out.print("ID não cadastrado! DIGITE NOVAMENTE: ");
                        System.out.println("");
                        id = sc.nextInt();
                        idConference = studentRecurse.position(student, id);}
        System.out.println("Qual dado deseja alterar?:");
        System.out.println();
        System.out.println("1: ID DO ALUNO"+"\n"+"2: NOME DO ALUNO"+"\n"+ "3: CURSO DO ALUNO"+"\n"+ "4: NOTAS"+"\n"+ "5: RETORNAR");
       pick = sc.nextInt();
       sc.nextLine();
        switch(pick){
            case 1: System.out.print("NOVO ID: ");
          System.out.println("");
            student.get(idConference).setId(sc.nextInt());
                break;
                case 2: System.out.print("NOVO NOME: ");
                System.out.println("");
            student.get(idConference).setName(sc.nextLine());
            //sc.nextLine();
                break;
                case 3: System.out.print("NOVO CURSO: ");
                System.out.println("");
            student.get(idConference).setCourse(sc.nextLine());
            //sc.nextLine();
                break;
                case 4: System.out.print("NOTA PRIMEIRO SEMESTRE: ");
                System.out.println("");
            student.get(idConference).setSemester1(sc.nextDouble());
         System.out.print("NOTA SEGUNDO SEMESTRE: ");
         System.out.println("");
            student.get(idConference).setSemester2(sc.nextDouble());
            student.get(idConference).setHighNote(studentRecurse.highNote(student.get(idConference).getSemester1(), student.get(idConference).getSemester2()));
          student.get(idConference).setHighNote(studentRecurse.average(student.get(idConference).getSemester1(), student.get(idConference).getSemester2()));
            break;
        }
        
    break;
    
    case 3: 
    break;
    
    case 4: 
        for ( studentRecurse a : student)
        {System.out.print(a);}
    break;
   default:
        while(0 >= pick && 5 <= pick){System.out.println("Valor informado incorreto! DIGITE NOVAMENTE: "); pick = sc.nextInt();}
    }
    
    
    
    
    
}

System.out.println("PROGRAMA FECHADO");



}
}