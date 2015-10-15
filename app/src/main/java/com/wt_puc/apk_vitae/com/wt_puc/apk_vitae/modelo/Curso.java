package com.wt_puc.apk_vitae.com.wt_puc.apk_vitae.modelo;

import java.util.Calendar;

/**
 * @author WT
 * Created by wt on 14/10/15.
 */
public class Curso {

    private Long id;
    private TipoCurso tipoCurso;
    private String nome;
    private StatusCurso statusCurso;
    private Calendar dataConclusao;
    private Calendar dataPrevisão;
    private Calendar dataInicio;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoCurso getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(TipoCurso tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public StatusCurso getStatusCurso() {
        return statusCurso;
    }

    public void setStatusCurso(StatusCurso statusCurso) {
        this.statusCurso = statusCurso;
    }

    public Calendar getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(Calendar dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public Calendar getDataPrevisão() {
        return dataPrevisão;
    }

    public void setDataPrevisão(Calendar dataPrevisão) {
        this.dataPrevisão = dataPrevisão;
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }
}
