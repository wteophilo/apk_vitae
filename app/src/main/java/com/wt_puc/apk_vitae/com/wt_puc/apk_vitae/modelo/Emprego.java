package com.wt_puc.apk_vitae.com.wt_puc.apk_vitae.modelo;

import java.util.Calendar;

/**
 * @author WT
 * Created by wt on 14/10/15.
 */
public class Emprego {

    private Long id;
    private Curriculum curriculum;
    private String nomeEmpresa;
    private String ocupacao;
    private Calendar dataInicio;
    private Calendar dataSaida;
    private Boolean empregoAtual;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Curriculum getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Calendar getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Calendar dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Boolean getEmpregoAtual() {
        return empregoAtual;
    }

    public void setEmpregoAtual(Boolean empregoAtual) {
        this.empregoAtual = empregoAtual;
    }
}
