package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView ivLogo;

    TextView txtUsername;
    TextView txtPassword;

    EditText edtUsername;
    EditText edtPassword;

    Button btnSignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();

        //onCreate: pertama dijalanin dan cuman sekali [create instance activity]
    }

    private void initListener() {
        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edtUsername.getText().toString();
                String password = edtPassword.getText().toString();
                validateLogin(username, password);

            }
        });
    }

    private void validateLogin(String username, String password) {
        if(!username.isEmpty() && !password.isEmpty()){
            if(username.equals("admin") && password.equals("admin")){
                Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(MainActivity.this, "Invalid username or password!", Toast.LENGTH_LONG).show();
            }

        }
        else{
            Toast.makeText(MainActivity.this, "Please enter username or password!", Toast.LENGTH_LONG).show();
        }
    }


    private void initView() {
        ivLogo = findViewById(R.id.iv_logo);
        txtUsername = findViewById(R.id.txt_title_username);
        txtPassword = findViewById(R.id.txt_title_password);
        edtUsername = findViewById(R.id.edt_username);
        edtPassword = findViewById(R.id.edt_password);
        btnSignin = findViewById(R.id.btn_sign_in);
    }

    @Override
    protected void onStart() {
        super.onStart();
        //ketika user interface terlihat oleh user
    }

    @Override
    protected void onResume() {
        super.onResume();
        //ketika di foreground
    }

    @Override
    protected void onPause() {
        super.onPause();
        //ketika kembali ke background
    }

    @Override
    protected void onStop() {
        super.onStop();
        //ketika user interface tidak terlihat oleh user
        //i.e : pindah activity
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //destroy instance activity
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        //ketika user balik lagi ke activity ini, dari activity lain
    }

    public void testMethod(){
        //fix something
    }

    public void testMethod2(){

    }


}
