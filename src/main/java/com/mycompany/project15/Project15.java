package com.mycompany.project15;
import java.util.Scanner;

public class Project15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = in.nextLine();
        System.out.println("Informe sua idade: ");
        int idade = in.nextInt();
        if((idade > 15)&&(idade < 25)){
            System.out.println(nome + " ACEITO!");
        }else{
            System.out.println(nome + " NÃO ACEITO!");
        }
    }
}
