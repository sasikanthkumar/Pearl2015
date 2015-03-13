package bits_pearl_2015.org.pearl_2015;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.balysv.materialripple.MaterialRippleLayout;


public class TestActivity extends ActionBarActivity {
    private MaterialRippleLayout day1Ripple, day2Ripple, day3Ripple;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_button);
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView toolbarText = (TextView) findViewById(R.id.dayToolbarTitle);
        Typeface nova = Typeface.createFromAsset(this.getAssets(), "fonts/ProximaNova-Reg.ttf");
        toolbarText.setTypeface(nova);
        Typeface oswald_light = Typeface.createFromAsset(this.getAssets(), "fonts/Oswald-Light.ttf");
        TextView day1 = (TextView) findViewById(R.id.day_one);
        TextView day2 = (TextView) findViewById(R.id.day_two);
        TextView day3 = (TextView) findViewById(R.id.day_three);
        day1.setTypeface(oswald_light);
        day2.setTypeface(oswald_light);
        day3.setTypeface(oswald_light);
        TextView friday = (TextView) findViewById(R.id.friday);
        friday.setTypeface(nova);
        TextView saturday = (TextView) findViewById(R.id.saturday);
        saturday.setTypeface(nova);
        TextView sunday = (TextView) findViewById(R.id.sunday);
        sunday.setTypeface(nova);
        day1Ripple = (MaterialRippleLayout) findViewById(R.id.day1Ripple);
        day2Ripple = (MaterialRippleLayout) findViewById(R.id.day2Ripple);
        day3Ripple = (MaterialRippleLayout) findViewById(R.id.day3Ripple);


        day1Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestActivity.this, Day_One.class);
                intent.putExtra("day_number", 1);
                overridePendingTransition(R.anim.push_left_enter, R.anim.push_left_exit);

                startActivity(intent);
            }
        });

        day2Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestActivity.this, Day_One.class);
                intent.putExtra("day_number", 2);
                overridePendingTransition(R.anim.push_left_enter, R.anim.push_left_exit);

                startActivity(intent);
            }
        });
        day3Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestActivity.this, Day_One.class);
                intent.putExtra("day_number", 3);
                overridePendingTransition(R.anim.push_left_enter, R.anim.push_left_exit);

                startActivity(intent);
            }
        });

    }


}



