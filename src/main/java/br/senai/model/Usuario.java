package br.senai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Size(max=100)
    private String nome;

    @Size(max=80)
    private String userneme;

    @Size(max=50)
    private String senha;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUserneme() {
        return userneme;
    }
    public void setUserneme(String userneme) {
        this.userneme = userneme;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {this.senha = senha;}

    @Override
    public String toString() {
        return "Usuario" +
                "id=" + id +
                " nome='" + nome +
                " userneme='" + userneme +
                " senha='" + senha;
    }
}
