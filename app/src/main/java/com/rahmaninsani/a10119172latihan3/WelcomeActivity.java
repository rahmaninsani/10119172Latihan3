package com.rahmaninsani.a10119172latihan3;

import static com.rahmaninsani.a10119172latihan3.DoneActivity.ID_EXTRA_MSG_EXIT;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

/*
    NIM     : 10119172
    Nama    : Rahman Insani
    Kelas   : IF-5

    Selasa, 26 April 2022
*/

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        ButterKnife.bind(this);

        if (getIntent().getBooleanExtra(ID_EXTRA_MSG_EXIT, false)) {
            finish();
        }
    }

    @OnClick(R.id.btnWalkthroughStart)
    void loginCodeActivity() {
        Intent intent = new Intent(this, LoginCodeActivity.class);
        startActivity(intent);
    }
}