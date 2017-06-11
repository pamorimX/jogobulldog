package br.com.pamorim.jogobulldog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import br.com.pamorim.jogobulldog.andgraph.AGActivityGame;


public class MainActivity extends AGActivityGame {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //Inicia o motor... o segundo parametro está relacionado ao acelerometro.. (false = desligado, true = ligado)
        init(this, false);
        PrimeiraCena cena1 = new PrimeiraCena(this.vrManager);
        SegundaCena cena2 = new SegundaCena(this.vrManager);
        vrManager.addScene(cena1);
        vrManager.addScene(cena2);

    }
}
