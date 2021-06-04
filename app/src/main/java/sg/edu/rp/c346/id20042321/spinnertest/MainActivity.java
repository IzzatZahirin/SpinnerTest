package sg.edu.rp.c346.id20042321.spinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spnYesNo;
    TextView spnText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        spnYesNo = findViewById (R.id.spinner);
        spnText = findViewById (R.id.textView);

        spnYesNo.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener () {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        spnText.setText ("Spinner Item, Yes Selected");
                        break;
                    case 1:
                        spnText.setText ("Spinner Item, No Selected");
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });
    }
}