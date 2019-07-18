package pardillo.john.jv.basiclogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtUsername, txtPassword;
    private Button btnSubmit, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtUsername = this.findViewById(R.id.editText);
        this.txtPassword = this.findViewById(R.id.editText2);
        this.btnSubmit = this.findViewById(R.id.button);
        this.btnClear = this.findViewById(R.id.button2);

        this.btnSubmit.setOnClickListener(this);
        this.btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button:
                String username = this.txtUsername.getText().toString();
                String password = this.txtPassword.getText().toString();

                if(username.equals("ucmain") && password.equals("ccs1234")) {
                    Toast.makeText(this, "Login Success", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(this, "Login Failed! Please check your credentials", Toast.LENGTH_LONG).show();
                }

                break;

            case R.id.button2:
                this.txtUsername.setText("");
                this.txtPassword.setText("");

                break;
        }
    }
}