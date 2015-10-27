package com.wt_puc.apk_vitae.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.wt_puc.apk_vitae.modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wt on 25/10/15.
 */
public class UsuarioDAO {
    private SQLiteDatabase db;

    public UsuarioDAO(Context context){
        BDCore bdCore = new BDCore(context);
        db = bdCore.getWritableDatabase();
    }

    public void atualizar(Usuario usuario){
        ContentValues valores = new ContentValues();
        valores.put("nome",usuario.getNome());
        valores.put("email", usuario.getEmail());

        db.update("usuario",valores,"[_id = ?", new String[]{""+usuario.getId()});
    }

    public List<Usuario> buscar(){
        List<Usuario> usuarios = new ArrayList<Usuario>();
        String[] colunas = new String[]{"_id","nome","email"};
        Cursor cursor  = db.query("usuario",colunas,null,null,null,null,"nome asc");
        if (cursor.getCount()>0){
            cursor.moveToFirst();
            do{
                Usuario usuario = new Usuario();
                usuario.setId(cursor.getInt(0));
                usuario.setNome(cursor.getString(1));
                usuario.setEmail(cursor.getString(2));
                usuarios.add(usuario);
            }while(cursor.moveToNext());
        }
        return usuarios;
    }
}
