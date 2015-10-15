package com.wt_puc.apk_vitae.com.wt_puc.apk_vitae.modelo;

import java.util.List;

/**
 * @author WT
 * Created by wt on 14/10/15.
 */
public class Curriculum {
    private Long id;
    private String nome;
    private String email;
    private List<Curso> cursos;
    private List<Emprego> empregos;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public List<Emprego> getEmpregos() {
        return empregos;
    }

    public void setEmpregos(List<Emprego> empregos) {
        this.empregos = empregos;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
