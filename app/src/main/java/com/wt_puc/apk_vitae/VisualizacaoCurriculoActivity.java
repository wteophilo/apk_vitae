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

public class VisualizacaoCurriculoActivity extends AppCompatActivity {

    private Button btFormacaoAcademica;
    private Button btFormacaoProfissional;
    private Button btContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizacao_curriculo);
        btFormacaoProfissional = (Button) findViewById(R.id.btProfissional);
        btFormacaoAcademica = (Button) findViewById(R.id.btAcademica);
        btContato = (Button) findViewById(R.id.btContato);
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
                Uri uri = Uri.parse("https://br.linkedin.com/pub/willian-teophilo");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}
