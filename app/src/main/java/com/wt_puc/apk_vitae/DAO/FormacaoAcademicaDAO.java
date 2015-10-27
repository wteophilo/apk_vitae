package com.wt_puc.apk_vitae.DAO;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.wt_puc.apk_vitae.modelo.FormacaoAcademica;
import com.wt_puc.apk_vitae.modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wt on 26/10/15.
 */
public class FormacaoAcademicaDAO {
    private SQLiteDatabase db;

    public FormacaoAcademicaDAO(Context context){
        BDCore bdCore = new BDCore(context);
        db = bdCore.getWritableDatabase();
    }


    public List<FormacaoAcademica> listaFormacoes(){
        List<FormacaoAcademica> formacoesAcademica = new ArrayList<FormacaoAcademica>();
        String[] colunas = new String[]{"_id","tipoGraducao","instituicao","nomeCurso","anoConclusao"};
        Cursor cursor  = db.query("formacaoAcademica",colunas,null,null,null,null,"anoConclusao desc");
        if (cursor.getCount()>0){
            cursor.moveToFirst();
            do{
                FormacaoAcademica formacaoAcademica = new FormacaoAcademica();
                formacaoAcademica.setId(cursor.getInt(0));
                formacaoAcademica.setTipoGraducao(cursor.getString(1));
                formacaoAcademica.setInstituicao(cursor.getString(2));
                formacaoAcademica.setCurso(cursor.getString(3));
                formacaoAcademica.setAno(cursor.getInt(4));
                formacoesAcademica.add(formacaoAcademica);
            }while(cursor.moveToNext());
        }
        return formacoesAcademica;
    }
}
