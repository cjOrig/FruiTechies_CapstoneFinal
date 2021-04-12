package mcm.edu.ph.fruitechies_capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CourseScreen extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_screen);
        Button bak =findViewById(R.id.bak);

        bak.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent vi = new Intent(CourseScreen.this, MainScreen.class);

        switch (v.getId()){
            case R.id.bak:
                startActivity(vi);
                break;
        }

    }
}