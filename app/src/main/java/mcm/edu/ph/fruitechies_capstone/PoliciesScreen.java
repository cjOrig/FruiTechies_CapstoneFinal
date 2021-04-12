package mcm.edu.ph.fruitechies_capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PoliciesScreen extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policies_screen);

        Button bck = findViewById(R.id.btnBack);

        bck.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent y = new Intent(PoliciesScreen.this, MainScreen.class);

        switch (v.getId()) {

            case R.id.btnBack:
                startActivity(y);
                break;

        }

    }
}