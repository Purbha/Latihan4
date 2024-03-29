package com.ims_hr.latihan4;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button B_Submit;
    EditText E_Pesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Inisial();
        Listen_B_Submit();
    }

    private void Inisial() {
        B_Submit = findViewById(R.id.button_Main_Submit);
        E_Pesan = findViewById(R.id.editText_Main_Pesan);
    }

    private void Listen_B_Submit() {
        B_Submit.setOnClickListener(v -> {
            String Pesan = E_Pesan.getText().toString();
            Toast.makeText(MainActivity.this, Pesan, Toast.LENGTH_SHORT).show();
        });
    }

}
