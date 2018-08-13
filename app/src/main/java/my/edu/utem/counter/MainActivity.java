package my.edu.utem.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    int count = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.count_textView);
    }

    public void incrementPressed(View view) {
        count++;
        textView.setText(count+""); //+"" concate dgn empty string "" utk tukar kpd string
    }

    public void ResetPressed(View view) {
        count = 0;
        textView.setText(count+"");
    }

    public void decrementPressed(View view) {
        count--;

        if (count<0){
            Log.d("debug", "Number cannot less then zero");
            Toast.makeText(MainActivity.this, "Number cannot less then zero", Toast.LENGTH_LONG).show();
            textView.setText("Number cannot less then zero");
        }

        else
            textView.setText(count+"");
    }
}
