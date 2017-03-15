package edu.montclair.mobilecomputing.m_alrajab.assignment_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class forgetPass extends AppCompatActivity {

    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pass);

        btn1=(Button)findViewById(R.id.btn_fgtpass);
        btn1.setOnClickListener(new MyLstnr());
    }

    class MyLstnr implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(forgetPass.this, MainActivity.class);
        }
    }
}
