package me.jinkun.activityanimation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListener();
    }

    private void initListener() {
        findViewById(R.id.btn_alpha).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlphaActivity.class);
                startActivity(intent);
                //设置当前Activity退出的动画和新Activity进入的动画
                overridePendingTransition(R.anim.anim_alpha_in, R.anim.anim_alpha_out);
            }
        });

        findViewById(R.id.btn_translate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TranslateActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim_enter_translate_in, R.anim.anim_enter_translate_out);
            }
        });
        findViewById(R.id.btn_TranslateInAndAlphaOut).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TranslateInAndAlphaOutActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim_enter_translate_in, R.anim.anim_enter_translate_out);
            }
        });

        findViewById(R.id.btn_scale).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScaleActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim_scale_in, R.anim.anim_scale_out);
            }
        });


        findViewById(R.id.btn_anim_xml).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnimXmlActivity.class);
                startActivity(intent);
            }
        });
    }
}
