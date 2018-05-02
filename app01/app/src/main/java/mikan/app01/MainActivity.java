package mikan.app01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn1_click(View view){
        int count;
        TextView output = (TextView)findViewById(R.id.lblOutput);
        count=Integer.parseInt(output.getText().toString());
        count++;
        output.setText(Integer.toString(count));
    }

    public void btn2_click(View view){
        int count;
        TextView output = (TextView)findViewById(R.id.lblOutput);
        count=Integer.parseInt(output.getText().toString());
        count--;
        output.setText(Integer.toString(count));
    }

    public void btn3_click(View view){
        TextView output = (TextView)findViewById(R.id.lblOutput);
        output.setText("0");
    }

    public void btn4_click(View view){
        int count;
        TextView output = (TextView)findViewById(R.id.lblOutput);
        count=Integer.parseInt(output.getText().toString());
        count=count*count;
        output.setText(Integer.toString(count));
    }

}
