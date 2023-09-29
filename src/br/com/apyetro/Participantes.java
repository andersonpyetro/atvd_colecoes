package br.com.apyetro;
import java.util.Objects;

public class Participantes implements Comparable<Participantes>{

    private String nome;
    private String sexo;
    
    public Participantes(String nome, String sexo){
        this.nome = nome;
        this.sexo = sexo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return nome  +  sexo ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participantes that = (Participantes) o;
        return Objects.equals(nome, that.nome) && Objects.equals(sexo, that.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sexo);
    }

    @Override
    public int compareTo(Participantes o) {
        return 0;
    }
}

