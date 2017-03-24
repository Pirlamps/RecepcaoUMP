package com.ump.recepcao.recepcaoump;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Felipe Dourado on 22/03/2017.
 */

public class MainActivity extends Activity {

    /* Request...*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*Atribui a (layout)view para a (java)activity */
        setContentView(R.layout.activity_main);

        final Button novo = (Button) findViewById(R.id.button);

    /* Acao de clicar no botão */
    novo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            /*De onde eu estou e para onde eu vou redirecionar quando clicar no botão */
            Intent intent = new Intent(MainActivity.this, RegistroActivity.class);
            startActivity(intent);

        }
    });

    }

}
