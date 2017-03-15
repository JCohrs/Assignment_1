package edu.montclair.mobilecomputing.m_alrajab.assignment_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static edu.montclair.mobilecomputing.m_alrajab.assignment_1.utils.utils.NAME_MSG_KEY;

public class RegistrationPage extends AppCompatActivity {

    private Button btn1;
    private EditText name;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);

        name=(EditText)findViewById(R.id.Reg_SName);

        btn1=(Button)findViewById(R.id.btn_Reg);
        btn1.setOnClickListener(new MyLstnr());

        password=(EditText)findViewById(R.id.Reg_pass1);

        if(password.getText().length() < 6){
            password.setError("Password must have a minimum of six characters");
        }


    }

    class MyLstnr implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(RegistrationPage.this, LandingScreen.class);
            intent.putExtra(NAME_MSG_KEY, "This account is for: "+name.getText());
        }
    }
}
