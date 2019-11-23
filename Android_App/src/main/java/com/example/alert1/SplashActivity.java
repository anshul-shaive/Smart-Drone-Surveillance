package com.example.alert1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class SplashActivity extends Activity {
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        LogoLauncher logoLauncher=new LogoLauncher();
        logoLauncher.start();

}
    class  LogoLauncher extends Thread{
        public void run(){
            try {
                sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            Intent intent;
            intent = new Intent(SplashActivity.this,Register.class);
            startActivity(intent);
            SplashActivity.this.finish();
        }
    }
    }
