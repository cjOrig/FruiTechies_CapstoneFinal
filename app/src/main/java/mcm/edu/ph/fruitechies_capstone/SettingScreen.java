package mcm.edu.ph.fruitechies_capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_screen);

        Button back = findViewById(R.id.btnBck);

        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent y = new Intent(SettingScreen.this, MainScreen.class);

        switch (v.getId()) {

            case R.id.btnBck:
                startActivity(y);
                break;

        }
    }
}