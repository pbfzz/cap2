package chapter.android.aweme.ss.com.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class SUIBIAN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suibian);

        int num =getIntent().getIntExtra("position",-1);
        TextView textView =findViewById(R.id.sui);
        textView.setText(" 当前页面："+num+1);
    }



}
