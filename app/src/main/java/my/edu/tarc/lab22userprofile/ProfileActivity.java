package my.edu.tarc.lab22userprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static my.edu.tarc.lab22userprofile.R.id.editTextID;

public class ProfileActivity extends AppCompatActivity {

    private EditText editTextID, editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        editTextID = (EditText)findViewById(R.id.editTextID);
        editTextEmail = (EditText)findViewById(R.id.editTextEmail);
    }

    public void updateProfile(View view){
        String id, email;
        Intent intent = new Intent();
        id = editTextID.getText().toString();
        email = editTextEmail.getText().toString();

        intent.putExtra(MainActivity.USER_ID, id);
        intent.putExtra(MainActivity.USER_EMAIL, email);

        setResult(MainActivity.REQUEST_PROFILE_UPDATE, intent);
        finish();
    }
}
