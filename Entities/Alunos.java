package Entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Alunos implements Comparable <Alunos> {
    
    private String nome;
    private String sexo;
    private String dataDeNascimento;
    private String cpf;
    private Integer numeroDeMatricula;
    private LocalDateTime dataeHora;

    public Alunos(String nome, String sexo, String dataDeNascimento, 
                  String cpf, Integer numeroDeMatricula, LocalDateTime dataeHora) {

        this.nome = nome;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.numeroDeMatricula = numeroDeMatricula;
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
    public Integer getNumeroDeMatricula() {
        return numeroDeMatricula;
    }
    public void setNumeroDeMatricula(Integer numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
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
    public int compareTo(Alunos outroAluno) {
        return this.nome.compareTo(outroAluno.nome);
    }
    
}
