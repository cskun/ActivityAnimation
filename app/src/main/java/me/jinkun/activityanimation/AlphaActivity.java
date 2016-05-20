package me.jinkun.activityanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class AlphaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha);
    }

    @Override
    public void finish() {
        super.finish();
        //设置当前Activity退出的动画和新Activity进入的动画
        overridePendingTransition(R.anim.anim_alpha_in, R.anim.anim_alpha_out);
    }
}
