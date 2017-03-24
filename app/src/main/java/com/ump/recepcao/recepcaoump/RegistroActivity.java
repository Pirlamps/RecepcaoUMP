package com.ump.recepcao.recepcaoump;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.ump.recepcao.recepcaoump.model.Registro;

/**
 * Created by Felipe Dourado on 22/03/2017.
 */

public class RegistroActivity extends Activity {

    //Quando uma activity for chamada, o método "onCreate" é onde seu código irá começar a rodar
    DatabaseReference ref;
    ValueEventListener listener;


    /* Request...*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* Atribui a (layout)view para a (java)activity */
        setContentView(R.layout.activity_registro);

        ref = FirebaseDatabase.getInstance().getReference().child("Registro");

        final EditText nomeVisitante = (android.widget.EditText) findViewById(R.id.nomeVisitante);
        final EditText telefone = (android.widget.EditText) findViewById(R.id.telefone);
        final TextView idade = (android.widget.TextView) findViewById(R.id.idade);
        final Spinner spinner = (android.widget.Spinner) findViewById(R.id.spinner);
        final EditText observacao = (android.widget.EditText) findViewById(R.id.observacao);
        final Button salvar = (android.widget.Button) findViewById(R.id.salvar);

        //Se você quiser pegar o click de um botão é só fazer assim:
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nome = nomeVisitante.getText().toString();
                Integer tel = Integer.parseInt(telefone.getText().toString());
                Integer ida = Integer.parseInt(idade.getText().toString());
                String obs = observacao.getText().toString();

                Registro registro = new Registro();

                /**/

                registro.setNomeVisitante(nome);
                registro.setTelefone(tel);
                registro.setIdade(ida);
                registro.setObservacao(obs);

                /*De onde eu estou e para onde eu vou redirecionar quando clicar no botão */
                Intent intent = new Intent(RegistroActivity.this, SucessoActivity.class);
                startActivity(intent);

                ref.setValue(new Registro());

            }
        });























        /* Spinner para criar as idades */
        Spinner spinners;
        String[] arraySpinner = new String[21];

        spinners = (Spinner) findViewById(R.id.spinner);

        int y = 0;
        for (int i = 18; i <= 38; i++) {
            arraySpinner[y] = String.valueOf(i);
            y++;
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, arraySpinner);
        spinners.setAdapter(adapter);


    }
}



