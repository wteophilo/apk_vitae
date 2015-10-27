package com.wt_puc.apk_vitae.DAO;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.wt_puc.apk_vitae.modelo.FormacaoAcademica;
import com.wt_puc.apk_vitae.modelo.FormacaoProfissional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wt on 26/10/15.
 */
public class FormacaoProfissionalDAO {

    private SQLiteDatabase db;

    public FormacaoProfissionalDAO(Context context){
        BDCore bdCore = new BDCore(context);
        db = bdCore.getWritableDatabase();
    }

    public List<FormacaoProfissional> listaFormacoes(){
        List<FormacaoProfissional> formacaoProfissionals = new ArrayList<FormacaoProfissional>();
        String[] colunas = new String[]{"_id","empresa","cargo","dataEntrada","dataSaida"};
        Cursor cursor  = db.query("formacaoProfissional",colunas,null,null,null,null,"dataSaida asc");
        if (cursor.getCount()>0){
            cursor.moveToFirst();
            do{
                FormacaoProfissional formacaoProfissional = new FormacaoProfissional();
                formacaoProfissional.setId(cursor.getInt(0));
                formacaoProfissional.setNomeEmpresa(cursor.getString(1));
                formacaoProfissional.setCargo(cursor.getString(2));
                formacaoProfissional.setDataInicial(cursor.getString(3));
                formacaoProfissional.setDataFinal(cursor.getString(4));

                formacaoProfissionals.add(formacaoProfissional);
            }while(cursor.moveToNext());
        }
        return formacaoProfissionals;
    }
}
