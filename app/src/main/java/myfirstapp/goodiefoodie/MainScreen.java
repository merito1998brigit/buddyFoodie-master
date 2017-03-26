package myfirstapp.goodiefoodie;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.content.Intent;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
/**
 * Created by Anjali on 03-09-2015.
 */
public class MainScreen extends ActionBarActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.RiceButton);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainScreen.this,
                        RiceRecipeList.class);
                startActivity(myIntent);
            }
        });
    }
}