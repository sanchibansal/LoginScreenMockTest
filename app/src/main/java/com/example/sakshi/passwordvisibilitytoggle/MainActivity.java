package com.example.sakshi.passwordvisibilitytoggle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.name;
import static com.example.sakshi.passwordvisibilitytoggle.R.id.username;

public class MainActivity extends AppCompatActivity {
    //declaring editTexts and Button
    EditText ed1, ed2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //associating editTexts and Buttons with their respective IDs
        ed1=(EditText)findViewById(username);
        ed2=(EditText)findViewById(R.id.password);
        button=(Button)findViewById(R.id.submit);
        //onclick listener for button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //hardcoded password and username
                String pass = "helloacadgild";
                String username = "acadgild";
                String name;
                String password;
                //getting text from both the EditTexts
                name=ed1.getText().toString().trim();
                password=ed2.getText().toString().trim();


               if(!name.equals(username) || !password.equals(pass)){
                   if(name.isEmpty()){
                       //setting error if name is empty
                       ed1.setError("Enter username");
                   }
                   if(password.isEmpty()){
                       //setting error if password is empty
                       ed2.setError("Enter Password");

                   }
                   if(!password.isEmpty() && !name.isEmpty() ) {
                       //displays toast if password and username are incorrect
                       Toast.makeText(MainActivity.this, "Username or password is incorrect", Toast.LENGTH_SHORT).show();
                   }
               }

                if(name.equals(username) && password.equals(pass)){
                    //displays toast when the username and password match.
                    Toast.makeText(MainActivity.this, "Welcome "+name, Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
