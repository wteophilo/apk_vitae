package com.wt_puc.apk_vitae.modelo;

/**
 * Created by wt on 25/10/15.
 */
public class FormacaoAcademica {
    private Integer id;
    private String tipoGraducao;
    private String curso;
    private String instituicao;
    private int ano;
    private Usuario usuario;

    public String getTipoGraducao() {
        return tipoGraducao;
    }

    public void setTipoGraducao(String tipoGraducao) {
        this.tipoGraducao = tipoGraducao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
