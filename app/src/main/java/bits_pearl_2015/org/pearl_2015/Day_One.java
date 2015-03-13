package bits_pearl_2015.org.pearl_2015;

import android.graphics.Typeface;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.astuetz.PagerSlidingTabStrip;


public class Day_One extends ActionBarActivity {
    private final Handler handler = new Handler();

    private PagerSlidingTabStrip tabs;
    private ViewPager pager;
    private MyPagerAdapter adapter;
    int day_number;
    TextView dayNumberToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day__one);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        day_number = getIntent().getIntExtra("day_number", 1);

        //Toast.makeText(Day_One.this, day_number + "", Toast.LENGTH_SHORT).show();
        dayNumberToolbar = (TextView) findViewById(R.id.dayToolbarTitle);
        Typeface nova = Typeface.createFromAsset(this.getAssets(), "fonts/ProximaNova-Reg.ttf");

        setToolbarTitle(day_number);
        dayNumberToolbar.setTypeface(nova);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        pager = (ViewPager) findViewById(R.id.pager);
        adapter = new MyPagerAdapter(getSupportFragmentManager());
        pager.setPageTransformer(true, new ZoomOutPageTransformer());

        pager.setAdapter(adapter);
        tabs.setViewPager(pager);
        tabs.setTextColor(Color.WHITE);
        tabs.setIndicatorHeight(2);

    }

    public void setToolbarTitle(int day_number) {
        switch (day_number) {
            case 1:
                dayNumberToolbar.setText("13th March");
                break;
            case 2:
                dayNumberToolbar.setText("14th March");
                break;
            case 3:
                dayNumberToolbar.setText("15th March");
                break;
            default:
                dayNumberToolbar.setText("13th March");
                break;

        }
    }

    public class MyPagerAdapter extends FragmentPagerAdapter {

        private final String[] TITLES = {"Morning", "Afternoon", "Evening"};

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return TITLES[position];
        }

        @Override
        public int getCount() {
            return TITLES.length;
        }

        @Override
        public Fragment getItem(int position) {
            Fragment f = null;
            switch (position) {
                case 0:
                    f = Day_One_Morning.newInstance(day_number);
                    break;
                case 1:
                    f = Day_One_Afternoon.newInstance(day_number);
                    break;
                case 2:
                    f = Day_One_Evening.newInstance(day_number);
                    break;
                default:
                    f = Day_One_Morning.newInstance(day_number);
                    break;
            }
            return f;

        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.push_right_enter, R.anim.push_right_exit);
    }
}
