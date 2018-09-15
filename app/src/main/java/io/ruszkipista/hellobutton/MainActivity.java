package io.ruszkipista.hellobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int mCounter = 0;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.text_count);
        mTextView.setText(getString(R.string.message_format,mCounter));

    }

    public void increase_counter(View view){
        mCounter++;
        updateView();
    }
    public void decrease_counter(View view){
        mCounter--;
        updateView();
    }

    private void updateView(){
        mTextView.setText(getString(R.string.message_format,mCounter));
    }
}
