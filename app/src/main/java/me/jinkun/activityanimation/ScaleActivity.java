package me.jinkun.activityanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ScaleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.anim_scale_in, R.anim.anim_scale_out);
    }
}
