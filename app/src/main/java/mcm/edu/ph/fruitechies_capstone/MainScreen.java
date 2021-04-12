package mcm.edu.ph.fruitechies_capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        Button start = findViewById(R.id.btnStart);
        Button settings = findViewById(R.id.btnSet);
        Button legal = findViewById(R.id.btnLeg);

        legal.setOnClickListener(this);
        settings.setOnClickListener(this);
        start.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent p = new Intent(MainScreen.this, PoliciesScreen.class);
        Intent o = new Intent(MainScreen.this, SettingScreen.class);
        Intent i = new Intent(MainScreen.this, CourseScreen.class);


        switch (v.getId()) {
            case R.id.btnLeg:
                startActivity(p);
                break;
            case R.id.btnSet:
                startActivity(o);
                break;
            case  R.id.btnStart:
                startActivity(i);
                break;


        }

    }
}