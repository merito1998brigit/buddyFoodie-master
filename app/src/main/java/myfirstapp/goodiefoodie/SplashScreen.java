package myfirstapp.goodiefoodie;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import android.content.Intent;

public class SplashScreen extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread logoTimer = new Thread() {
            public void run(){
                try{
                    int logoTimer = 0;
                    while(logoTimer < 5000){
                        sleep(100);
                        logoTimer = logoTimer +100;
                    };
                    startActivity(new Intent("myfirstapp.buddyfoodie.CLEARSCREEN"));
                }

                catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                finally{
                    finish();
                }
            }
        };

        logoTimer.start();
    }


}
