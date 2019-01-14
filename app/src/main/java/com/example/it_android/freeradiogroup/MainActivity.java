package com.example.it_android.freeradiogroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

import sbingo.freeradiogroup.FreeRadioGroup;


/*类似于苹果的虚拟辅助按钮，可以淡出、拖动、松手后自动贴边等 */

public class MainActivity extends AppCompatActivity {

    private FreeRadioGroup mGroup;
    private TextView mContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGroup = findViewById(R.id.group);
        mContent = findViewById(R.id.content);

        mGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override

            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i) {

                    case R.id.rb_1:

                        mContent.setText("页面1");

                        break;

                    case R.id.rb_2:

                        mContent.setText("页面2");

                        break;

                    case R.id.rb_3:

                        mContent.setText("页面3");

                        break;

                    default:

                }

            }

        });
    }
}
