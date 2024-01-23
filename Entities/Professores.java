package Entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Professores implements Comparable <Professores> {
    
    private String nome;
    private String sexo;
    private String dataDeNascimento;
    private String cpf;
    private String disciplina;
    private LocalDateTime dataeHora;
    
    public Professores(String nome, String sexo, String dataDeNascimento, 
                       String cpf, String disciplina, LocalDateTime dataeHora) {

        this.nome = nome;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.disciplina = disciplina;
        this.dataeHora = dataeHora;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public LocalDateTime getDataeHora() {
        return dataeHora;
    }
    public void setDataeHora(LocalDateTime dataeHora) {
        this.dataeHora = dataeHora;
    } 
    
    public String formato (){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String horario = dataeHora.format(formato);
        return horario;
    }

    @Override
    public int compareTo(Professores outroProfessor) {
        return this.nome.compareTo(outroProfessor.nome);
    }


        
}
