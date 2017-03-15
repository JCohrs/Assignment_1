package edu.montclair.mobilecomputing.m_alrajab.assignment_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.btn_register_MA);
        btn1.setOnClickListener(new MyLstnr());

        btn2=(Button)findViewById(R.id.btn_forgetpassword_MA);
        btn2.setOnClickListener(new MyLstnr2());
    }

    class MyLstnr implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(MainActivity.this, RegistrationPage.class);
            startActivity(intent);
        }
    }

    class MyLstnr2 implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(MainActivity.this, forgetPass.class);
            startActivity(intent);
        }
    }

}
