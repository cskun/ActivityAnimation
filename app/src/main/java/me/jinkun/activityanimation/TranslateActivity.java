package me.jinkun.activityanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TranslateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.anim_exit_translate_in, R.anim.anim_exit_translate_out);
    }
}
