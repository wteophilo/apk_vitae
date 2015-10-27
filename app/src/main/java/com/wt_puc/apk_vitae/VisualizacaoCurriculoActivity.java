package com.wt_puc.apk_vitae;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.wt_puc.apk_vitae.DAO.FormacaoAcademicaDAO;
import com.wt_puc.apk_vitae.DAO.FormacaoProfissionalDAO;
import com.wt_puc.apk_vitae.DAO.UsuarioDAO;
import com.wt_puc.apk_vitae.modelo.FormacaoAcademica;
import com.wt_puc.apk_vitae.modelo.FormacaoProfissional;
import com.wt_puc.apk_vitae.modelo.Usuario;

import java.util.List;

public class VisualizacaoCurriculoActivity extends AppCompatActivity {

    private Button btFormacaoAcademica;
    private Button btFormacaoProfissional;
    private Button btContato;
    private TextView txtNome;
    private TextView txtEmail;
    private TextView txtCursoSuperio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizacao_curriculo);
        btFormacaoProfissional = (Button) findViewById(R.id.btProfissional);
        btFormacaoAcademica = (Button) findViewById(R.id.btAcademica);
        btContato = (Button) findViewById(R.id.btContato);
        txtNome = (TextView)findViewById(R.id.txtNome);
        txtEmail = (TextView)findViewById(R.id.txtEmail);
        txtCursoSuperio = (TextView) findViewById(R.id.txtCursoSuperio);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btFormacaoAcademica.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), FormacaoAcademicaActivity.class));
            }
        });

        btFormacaoProfissional.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), FormacaoProfissionalActivity.class));
            }
        });

        btContato.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                Uri uri = Uri.parse("https://br.linkedin.com/pub/willian-teophilo/37/a19/677");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        UsuarioDAO usuarioDAO = new UsuarioDAO(this);
        FormacaoAcademicaDAO formacaoAcademicaDAO = new FormacaoAcademicaDAO(this);
        FormacaoProfissionalDAO formacaoProfissionalDAO = new FormacaoProfissionalDAO(this);

        List<FormacaoProfissional> listaProfissional  = formacaoProfissionalDAO.listaFormacoes();
        List<FormacaoAcademica> listaAcademica = formacaoAcademicaDAO.listaFormacoes();
        Usuario usuario = usuarioDAO.buscar().get(0);

        if (usuario != null){
            txtNome.setText(usuario.getNome());
            txtEmail.setText(usuario.getEmail());
        }

        if (listaAcademica != null){
            txtCursoSuperio.setText(listaAcademica.get(0).getCurso());
        }


    }
}
