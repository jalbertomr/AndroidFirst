package com.bext.contadormanual.mainactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador = 0;
    }

    public void incrementar(View vista) {
        contador++;
        resultado();
    }

    public void decrementar(View vista) {
        contador--;
        resultado();
    }

    public void resetear( View vista) {
        contador = 0;
        resultado();
    }

    public void resultado() {
        TextView texto = (TextView)findViewById(R.id.textContador);
        texto.setText("Contador: =" + contador);
    }
}
