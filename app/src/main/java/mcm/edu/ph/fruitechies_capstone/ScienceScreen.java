package mcm.edu.ph.fruitechies_capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScienceScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_screen);
        Button submit = findViewById(R.id.subMit);

        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(ScienceScreen.this, resultScreen.class);

        switch (v.getId()){
            case R.id.subMit:
                startActivity(i);
                break;

        }

    }
}