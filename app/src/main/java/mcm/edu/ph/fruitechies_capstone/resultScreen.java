package mcm.edu.ph.fruitechies_capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class resultScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_screen);
        Button menu = findViewById(R.id.btnMenu);

        menu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent b = new Intent(resultScreen.this, MainScreen.class);

        switch (v.getId()){
            case R.id.btnMenu:
                startActivity(b);
                break;
        }

    }
}