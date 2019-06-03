package ru.sheps.android.homework121;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText username = findViewById(R.id.editName);
        final EditText email = findViewById(R.id.editEmail);
        Button btnOK = findViewById(R.id.btnOK);
        Button btnClear = findViewById(R.id.btnClear);
        final TextView textView = findViewById(R.id.textMessenger);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String textMessage =  getString(R.string.massage1) + " " + username.getText().toString() + " " + getString(R.string.massage2)+ " " +  email.getText().toString();
                textView.setText(textMessage);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username.setText("");
                email.setText("");
            }
        });
    }
}
