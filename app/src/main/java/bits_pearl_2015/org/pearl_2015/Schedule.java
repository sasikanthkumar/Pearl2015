package bits_pearl_2015.org.pearl_2015;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.balysv.materialripple.MaterialRippleLayout;


public class Schedule extends ActionBarActivity {
    MaterialRippleLayout day1Ripple, day2Ripple, day3Ripple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        TextView toolbarText = (TextView) findViewById(R.id.scheduleTollbarText);
        Typeface nova = Typeface.createFromAsset(this.getAssets(), "fonts/ProximaNova-Reg.ttf");
        toolbarText.setTypeface(nova);
        day1Ripple = (MaterialRippleLayout) findViewById(R.id.day1Ripple);
        day2Ripple = (MaterialRippleLayout) findViewById(R.id.day2Ripple);
        day3Ripple = (MaterialRippleLayout) findViewById(R.id.day3Ripple);


        day1Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Schedule.this, Day_One.class);
                intent.putExtra("day_number", 1);
                startActivity(intent);
            }
        });

        day2Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Schedule.this, Day_One.class);
                intent.putExtra("day_number", 2);
                startActivity(intent);
            }
        });
        day3Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Schedule.this, Day_One.class);
                intent.putExtra("day_number", 3);
                startActivity(intent);
            }
        });

    }


}
