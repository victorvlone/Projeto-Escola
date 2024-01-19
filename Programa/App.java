package Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entities.Alunos;
import Entities.Professores;

public class App {
    public static void main(String[] args) {

        Alunos alunos;
        Professores professores;
        List<Alunos> listaAlunos = new ArrayList<>();
        List<Professores> listaProfessores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Listas");
        System.out.println("2. Cadastros");
        System.out.println("3. Sair\n");

        System.out.print("Como deseja prosseguir?");
        String resposta = scanner.nextLine();
        resposta = resposta.toUpperCase();

        while (resposta != "SAIR" && resposta != "3") {
            if (resposta == "CADASTROS" || resposta == "2") {

                System.out.println("1. Alunos");
                System.out.println("2. Professores");
                System.out.println("3. Voltar\n");
        
                System.out.print("Como deseja prosseguir? ");
                String MenuCadastros = scanner.nextLine();
                MenuCadastros = MenuCadastros.toUpperCase();

                while (MenuCadastros != "VOLTAR" || MenuCadastros != "3") {
                    if (MenuCadastros == "1" || MenuCadastros == "ALUNOS") {

                        System.out.print("Primeiro nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Sobrenome: ");
                        String sobrenome = scanner.nextLine();
                        System.out.println("Sexo: ");
                        String sexo = scanner.nextLine();
                        System.out.print("Data de nascimento: ");
                        String dataDeNascimento = scanner.nextLine();
                        System.out.println("CPF: ");
                        String CPF = scanner.nextLine();

                        alunos = new Alunos(nome, sobrenome, sexo, dataDeNascimento, CPF);
                        listaAlunos.add(alunos);
                        
                        System.out.println("Aperta 1 se deseja adicionar mais um");
                        System.out.println("aluno, 2 se deseja cadastrar um professor");
                        System.out.println("ou 3 se deseja voltar ao menu principal.\n");

                        System.out.print("Como deseja prosseguir? ");
                        MenuCadastros = scanner.nextLine();

                        if (MenuCadastros == "3") {
                            MenuCadastros = "4";
                        }
                        
                    } else if(MenuCadastros == "2" || MenuCadastros == "PROFESSORES"){

                        System.out.print("Primeiro nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Sobrenome: ");
                        String sobrenome = scanner.nextLine();
                        System.out.print("Data de nascimento: ");
                        String dataDeNascimento = scanner.nextLine();
                        System.out.println("CPF: ");
                        String CPF = scanner.nextLine();
                        System.out.println("Disciplina: ");
                        String Disciplina = scanner.nextLine();

                        professores = new Professores(nome, sobrenome, dataDeNascimento, CPF, Disciplina);
                        listaProfessores.add(professores);

                        System.out.println("Aperta 2 se deseja adicionar mais um");
                        System.out.println("professor, 1 se deseja cadastrar um aluno");
                        System.out.println("ou 3 se deseja voltar ao menu principal.\n");

                        System.out.print("Como deseja prosseguir? ");
                        MenuCadastros = scanner.nextLine();

                        if (MenuCadastros == "3") {
                            MenuCadastros = "4";
                        }

                    } else if (MenuCadastros == "4") {
                        
                        System.out.println("1. Listas");
                        System.out.println("2. Cadastros");
                        System.out.println("3. Sair\n");

                        System.out.print("Como deseja prosseguir?");
                        resposta = scanner.nextLine();
                        resposta = resposta.toUpperCase();
                    }
                }
                
            } else if (resposta == "LISTAS" || resposta == "1") {
                
            }
        }

        scanner.close();
    }
}
