/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetMenu;

import java.time.Clock;
import java.util.Scanner;

/**
 *
 * @author Asthur Araujo
 */
public class projetMenu {
    public static void main(String[] args) {
   SistemaControl sistema = new SistemaControl();
   Scanner sc = new Scanner(System.in);
   Integer pick = 0;

        for (int y = 5; pick < y;) {
            System.out.println("\n" + "*MENU*" + "\n" + "1: INCLUIR ALUNO" + "\n" + "2: ALTERAR ALUNO" + "\n" + "3: IMPRIMIR ALUNO" + "\n" + "4: IMPRIMIR TODOS OS ALUNOS" + "\n" + "5: FECHAR PROGRAMA");
            pick = sc.nextInt();
            while (pick < 1 || pick > 5) {
                System.out.println("Valor invalido, DIGITE NOVAMETE: ");
                pick = sc.nextInt();}
            switch(pick){
                case 1 : sistema.incluirAluno(); break;
                case 2 : sistema.alterarAluno(); break;
                case 3 : sistema.imprimirAluno(); break;
                case 4 : sistema.imprimirTodos(); break;
            }    
            }
             System.out.println("PROGRAMA FECHADO");
             System.exit(0);
}}
