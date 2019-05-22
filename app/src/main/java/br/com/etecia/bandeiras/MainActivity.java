package br.com.etecia.bandeiras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.sql.Array;

import br.com.etecia.bandeiras.Model.State;

public class MainActivity extends AppCompatActivity {

      State states []= {new State ("erica","rica","nobre","brasileira")};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
