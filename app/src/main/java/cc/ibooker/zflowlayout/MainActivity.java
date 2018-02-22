package cc.ibooker.zflowlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.TextView;

import cc.ibooker.zflowlayoutlib.FlowLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FlowLayout flowLayout = findViewById(R.id.flowlayout);

        LayoutInflater inflater = LayoutInflater.from(this);
        for (int i = 0; i < 20; i++) {
            TextView textView = (TextView) inflater.inflate(R.layout.tag_textview, flowLayout, false);
            if (i == 3)
                textView.setText("Android1111" + i);
            else if (i == 6)
                textView.setText("Jave1111" + i);
            else if (i == 10)
                textView.setText("kotlin1111" + i);
            else
                textView.setText("测试" + i);
            flowLayout.addView(textView);
        }
    }
}
