package com.wt_puc.apk_vitae.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by wt on 25/10/15.
 */
public class BDCore extends SQLiteOpenHelper {
    private static final String DB_NAME = "APK_VITAE_DB";
    private static final int VERSAO = 1;

    public BDCore(Context context){
        super(context,DB_NAME,null,VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        criandoTabelas(db);
        preenchendoTabela(db);
    }

    private void preenchendoTabela(SQLiteDatabase db) {
        db.execSQL("insert into usuario values (null,'Willian R.S.Teophilo','wteophilo@gmail.com'");
        //Formação Academica
        db.execSQL("insert into formacaoAcademica values (null,'Graduação','Engenharia da Computação','Universidade Braz Cubas'," +
                "2013");
        db.execSQL("insert into formacaoAcademica values (null,'Pós Graduação','Arquitetura de Software Distribuído','PUC Minas'" +
                "2016");

        //Formação Professional
        db.execSQL("insert into formacaoProfissional values (null,'Digital Software Ltda','Programador Jr'," +
                "'01/01/2013','Atualmente'");
        db.execSQL("insert into formacaoProfissional values (null,'Digital Software Ltda','Estagiário'," +
                "'10/07/2012','31/12/2012'");
        db.execSQL("insert into formacaoProfissional values (null,'Compsis Ltda','Estagiário'," +
                "'15/03/2011','10/06/2012'");
    }

    private void criandoTabelas(SQLiteDatabase db) {
        db.execSQL("create table usuario(id_usuario integer primary key autoincrement, nome text not null," +
                "email text not null);");

        db.execSQL("create table formacaoAcademica(id_academica integer primary key autoincrement," +
                "tipoGraducao text not null, nomeCurso text not null,instituicao text not null, " +
                "anoConclusao integer not null," +
                "id_usuario integer not null, " +
                "FOREIGN KEY(id_usuario) REFERENCES usuario(id_usuario));");

        db.execSQL("create table formacaoProfissional(id_profissional integer primary key autoincrement," +
                "empresa text not null, cargo text not null, dataEntrada text not null, dataSaida text not null," +
                "id_usuario integer not null, " +
                "FOREIGN KEY(id_usuario) REFERENCES usuario(id_usuario));");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
