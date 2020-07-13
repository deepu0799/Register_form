package com.example.register_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText name,num,email1,Pass;
    Button Reg;
    TextView lbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name=findViewById(R.id.name);
        num=findViewById(R.id.num);
        Pass =findViewById(R.id.Pass);
        email1=findViewById(R.id.email1);
        Reg=findViewById(R.id.Reg);
        lbtn=findViewById(R.id.lbtn);


        Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name, Num, Mail, passw;
                Name = name.getText().toString();
                Num = num.getText().toString();
                Mail = email1.getText().toString();
                passw = Pass.getText().toString();
                if (Name.equals(" "));
                {
                    Toast.makeText(Register.this, "Name is blank", Toast.LENGTH_LONG).show();
                }
                if (num.equals(""));
                {
                    Toast.makeText(Register.this, "Number is blank", Toast.LENGTH_LONG).show();
                }
                if (passw.equals("")); {
                    Toast.makeText(Register.this, "Password is blank", Toast.LENGTH_LONG).show();
                }
            }
        });
        lbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent R = new Intent(Register.this,MainActivity.class);
                startActivity(R);
            }
        });

    }
}