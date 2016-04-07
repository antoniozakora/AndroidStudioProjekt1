package com.example.android.kosarka;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int domaci_rezultat = 0;
    int gosti_rezultat = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * prikazuje rezultat gosta
     */
    public void gosti_rezultat1(int rezultat) {
        TextView scoreView = (TextView) findViewById(R.id.gosti_rezultat);
        scoreView.setText(String.valueOf(rezultat));
    }
    /**
     * kada se pritisne button +3, gostima se dodaje još 3 boda
     */
    public void plustrigosti(View view) {
        gosti_rezultat = gosti_rezultat + 3;
        gosti_rezultat1(gosti_rezultat);
    }
    /**
     * kada se pritisne button +, gostima se dodaje još 2 boda
     */
    public void plusdvagosti(View view) {
        gosti_rezultat = gosti_rezultat + 2;
        gosti_rezultat1(gosti_rezultat);
    }
    /**
     * kada se pritisne button SLOBODNO BACANJE, gostima se dodaje još 1 bod
     */
    public void slobodnobacanjegosti(View view) {
        gosti_rezultat = gosti_rezultat + 1;
        gosti_rezultat1(gosti_rezultat);
    }


    /**
     * prikazuje rezultat domaćih
     */
    public void domaci_rezultat1(int rezultat) {
        TextView scoreView = (TextView) findViewById(R.id.domaci_rezultat);
        scoreView.setText(String.valueOf(rezultat));
    }
    /**
     * kada se pritisne button +3, domaćima se dodaje još 3 boda
     */
    public void plustridomaci(View view) {
        domaci_rezultat = domaci_rezultat + 3;
        domaci_rezultat1(domaci_rezultat);

    }
    /**
     * kada se pritisne button +2, domaćima se dodaje još 2 boda
     */
    public void plusdvadomaci(View view) {
        domaci_rezultat= domaci_rezultat + 2;
        domaci_rezultat1(domaci_rezultat);

    }
    /**
     * kada se pritisne button SLOBODNO BACANJE, domaćima se dodaje još 1 bod
     */
    public void slobodnobacanjedomaci(View view) {
        domaci_rezultat = domaci_rezultat + 1;
        domaci_rezultat1(domaci_rezultat);

    }

    /**
     * za button reset
     */

    public void reset(View view) {
        gosti_rezultat = 0;
        domaci_rezultat = 0;
        gosti_rezultat1(gosti_rezultat);
        domaci_rezultat1(domaci_rezultat);

    }
}