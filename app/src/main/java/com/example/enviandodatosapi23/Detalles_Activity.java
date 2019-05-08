package com.example.enviandodatosapi23;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Detalles_Activity extends AppCompatActivity {
    TextView tvNombre,tvCorreo,tvTelefono;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        tvNombre= findViewById(R.id.tvNombre);
        tvCorreo= findViewById(R.id.tvCorreo);
        tvTelefono= findViewById(R.id.tvTelefono);

        Bundle bundle = getIntent().getExtras();

        tvNombre.setText(bundle.getString("nombre"));
        tvCorreo.setText(bundle.getString("correo"));
        tvTelefono.setText(bundle.getString("telefono"));
    }
}
