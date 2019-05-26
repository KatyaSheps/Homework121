package ru.sheps.android.homework121;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editUsername = findViewById(R.id.editName);
        final EditText editEmail = findViewById(R.id.editEmail);
        Button btnOK = (Button) findViewById(R.id.btnOK);
        Button btnClear = (Button) findViewById(R.id.btnClear);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "ПОдписка на рассылку успешно оформлена для пльзователя " + editUsername + " и направлена по адресу " + editEmail,
                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editUsername.setText("");
                editEmail.setText("");
            }
        });
    }
}
