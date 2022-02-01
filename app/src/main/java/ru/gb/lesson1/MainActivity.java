package ru.gb.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView helloWorldTv;
    private Button pressMeButton;
    private CheckBox checkMeCb;


    private EditText operand1;
    private EditText operand2;
    private Button sumButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloWorldTv = findViewById(R.id.hello_world_text);
        checkMeCb = findViewById(R.id.check_me_cb);
        pressMeButton = findViewById(R.id.press_me_button);

        operand1 = findViewById(R.id.operand1);
        operand2 = findViewById(R.id.operand2);
        sumButton = findViewById(R.id.calc_button_sum);

        //pressMeButton.setOnClickListener(view -> helloWorldTv.setText("My name is ..."));
        pressMeButton.setOnClickListener(this);
        checkMeCb.setOnClickListener(this);

        sumButton.setOnClickListener(view -> sum(
                Integer.parseInt(operand1.getText().toString()),
                Integer.parseInt(operand2.getText().toString())
        ));
    }

    private void sum(int op1, int op2) {
        Toast.makeText(this, "Sum is: " + (op1 + op2), Toast.LENGTH_SHORT).show();
    }

    private void hello()
    {
        Toast.makeText(this, "Hello, world", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.check_me_cb:
                Toast.makeText(this, "Checkbox pressed!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.press_me_button:
                helloWorldTv.setText("My name is ...");
                break;
        }

    }
}