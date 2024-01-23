package Programa;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
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
        Random random = new Random();

        System.out.println("1. Listas");
        System.out.println("2. Cadastros");
        System.out.println("3. Sair\n");

        System.out.print("Como deseja prosseguir? ");
        String resposta = scanner.nextLine();
        resposta = resposta.toUpperCase();

        while (!resposta.equals("SAIR") && !resposta.equals("3")) {
            if (resposta.equals("CADASTROS") || resposta.equals("2")) {

                System.out.println("\n1. Alunos");
                System.out.println("2. Professores");
                System.out.println("3. Voltar\n");
        
                System.out.print("Como deseja prosseguir? ");
                String MenuCadastros = scanner.nextLine();
                MenuCadastros = MenuCadastros.toUpperCase();

                while (!MenuCadastros.equals("VOLTAR") && !MenuCadastros.equals("3")) {
                    if (MenuCadastros.equals("1") || MenuCadastros.equals("ALUNOS")) {

                        System.out.println("\nCADASTRO DE ALUNO\n");
                        System.out.print("Nome completo: ");
                        String nome = scanner.nextLine();
                        System.out.print("Sexo: ");
                        String sexo = scanner.nextLine();
                        sexo = sexo.toUpperCase();

                        while (!sexo.equals("MASCULINO") && !sexo.equals("FEMININO")) {
                            System.out.print("Digite masculino ou feminino: ");
                            sexo = scanner.nextLine();
                            sexo = sexo.toUpperCase();
                        }
                        
                        System.out.print("Data de nascimento: ");
                        String dataDeNascimento = scanner.nextLine();
                        System.out.print("CPF: ");
                        String CPF = scanner.nextLine();
                        Integer NdeMatricula = random.nextInt((int) Math.pow(10, 5));
                        LocalDateTime DataeHora = LocalDateTime.now();

                        alunos = new Alunos(nome, sexo, dataDeNascimento, CPF, NdeMatricula, DataeHora);
                        listaAlunos.add(alunos);
                        
                        System.out.println("\nDigite 1 se deseja adicionar mais um");
                        System.out.println("aluno, 2 se deseja cadastrar um professor");
                        System.out.println("ou 3 se deseja voltar ao menu principal.\n");

                        System.out.print("Como deseja prosseguir? ");
                        MenuCadastros = scanner.nextLine();

                        if (MenuCadastros.equals("3")) {
                            MenuCadastros = "4";
                        }
                        
                    } else if(MenuCadastros.equals("2") && MenuCadastros.equals("PROFESSORES")){

                        System.out.println("\nCADASTRO DE PROFESSOR\n");
                        System.out.print("Nome completo: ");
                        String nome = scanner.nextLine();
                        System.out.print("Sexo: ");
                        String sexo = scanner.nextLine();
                        sexo = sexo.toUpperCase();

                        while (!sexo.equals("MASCULINO") && !sexo.equals("FEMININO")) {
                            System.out.print("Digite masculino ou feminino: ");
                            sexo = scanner.nextLine();
                            sexo = sexo.toUpperCase();
                        }

                        System.out.print("Data de nascimento: ");
                        String dataDeNascimento = scanner.nextLine();
                        System.out.println("CPF: ");
                        String CPF = scanner.nextLine();
                        System.out.println("Disciplina: ");
                        String Disciplina = scanner.nextLine();
                        LocalDateTime DataeHora = LocalDateTime.now();

                        professores = new Professores(nome, sexo, dataDeNascimento, CPF, Disciplina, DataeHora);
                        listaProfessores.add(professores);

                        System.out.println("\nDigite 2 se deseja adicionar mais um");
                        System.out.println("professor, 1 se deseja cadastrar um aluno");
                        System.out.println("ou 3 se deseja voltar ao menu principal.\n");

                        System.out.print("Como deseja prosseguir? ");
                        MenuCadastros = scanner.nextLine();

                        if (MenuCadastros.equals("3")) {
                            MenuCadastros = "4";
                        }

                    } else if (MenuCadastros.equals("4")) {
                        
                        System.out.println("\n1. Listas");
                        System.out.println("2. Cadastros");
                        System.out.println("3. Sair\n");

                        System.out.print("Como deseja prosseguir?");
                        resposta = scanner.nextLine();
                        resposta = resposta.toUpperCase();
                        break;

                    }
                }
                
            } else if (resposta.equals("LISTAS") || resposta.equals("1")) {

                System.out.println("\n1. Alunos por ordem de matrícula     4. Professores por ordem de inscrição");
                System.out.println("2. Alunos por ordem alfabetica         5. Professores por ordem alfabetica");
                System.out.println("3. Alunos divididos por sexo           6. professores divididos por sexo");
                System.out.println("7. Voltar\n");

                System.out.print("Como deseja prosseguir? ");
                String MenuListas = scanner.nextLine();

                while (!MenuListas.equals("7")) {
                    int i = 1;
                    if (MenuListas.equals("1")) {
                        for (Alunos aluno : listaAlunos) {

                            System.out.printf("\nDADOS DO %dº ALUNO\n", i);
                            System.out.printf("\nNome completo: %s\n", aluno.getNome());
                            System.out.println("Sexo: " + aluno.getSexo());
                            System.out.println("Data de nascimento: " + aluno.getDataDeNascimento());
                            System.out.println("CPF: " + aluno.getCpf());
                            System.out.println("Número de matrícula: " + aluno.getNumeroDeMatricula());
                            System.out.println("Cadastro realizado as " + aluno.formato());

                            i++;
                        }

                        System.out.print("\nDigite 7 para voltar ao menu de listas: ");
                        MenuListas = scanner.nextLine();

                    } else if (MenuListas.equals("2")){
                        Collections.sort(listaAlunos);
                        System.out.printf("\nALUNOS POR ORDEM DE MATRICULA\n");

                        for(Alunos aluno : listaAlunos){
                            
                        System.out.printf("\nNome completo: %s\n", aluno.getNome());
                        System.out.println("Sexo: " + aluno.getSexo());
                        System.out.println("Data de nascimento: " + aluno.getDataDeNascimento());
                        System.out.println("CPF: " + aluno.getCpf());
                        System.out.println("Número de matrícula: " + aluno.getNumeroDeMatricula());
                        System.out.println("Cadastro realizado as " + aluno.formato());

                        }

                        System.out.print("\nDigite 7 para voltar ao menu de listas: ");
                        MenuListas = scanner.nextLine();

                    } else if (MenuListas.equals("3")){

                    } else if (MenuListas.equals("4")){
                        for (Professores professor : listaProfessores){

                            System.out.printf("\nDADOS DO %dº PROFESSOR\n", i);
                            System.out.printf("\nNome completo: %s\n", professor.getNome());
                            System.out.println("Sexo: " + professor.getSexo());
                            System.out.println("Data de nascimento: " + professor.getDataDeNascimento());
                            System.out.println("CPF: " + professor.getCpf());
                            System.out.println("Disciplina: " + professor.getDisciplina());
                            System.out.println("Cadastro realizado as " + professor.formato());

                            i++;
                        }

                        System.out.print("\nDigite 7 para voltar ao menu de listas: ");
                        MenuListas = scanner.nextLine();

                    }   
                }

            }
        }

        scanner.close();
    }
}
