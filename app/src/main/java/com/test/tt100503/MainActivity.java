package com.test.tt100503;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView tv, tv3;
    Button btn2;
    ToggleButton tb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);
        tb = (ToggleButton) findViewById(R.id.toggleButton);
        btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("567567");
            }
        });

        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true)
                {
                    tv.setText("已選擇");
                }
                else
                {
                    tv.setText("取消選擇");
                }
            }
        });
    }

    public void click1(View v)
    {
        tv.setText("123123");
    }
    public void click3(View v)
    {
        if (v.getId() == R.id.button3)
        {
            tv.setText("AAA");
        }
        if (v.getId() == R.id.button4)
        {
            tv.setText("BBB");
        }
    }

    public void click5(View v)
    {
        int c = Integer.valueOf(tv3.getText().toString());
        c++;
        tv3.setText(String.valueOf(c));

    }
}
