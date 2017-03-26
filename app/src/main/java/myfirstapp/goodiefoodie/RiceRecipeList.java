package myfirstapp.goodiefoodie;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by Anjali on 07-09-2015.
 */
public class RiceRecipeList extends ActionBarActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ricerecipelist);


    }
    public void click(View v) {

        switch(v.getId()) {

            case R.id.CorianderRiceTV: // R.id.textView1
                intent = new Intent(this, CorianderRiceRecipe.class);
                break;

        }

        startActivity(intent);
    }

}
