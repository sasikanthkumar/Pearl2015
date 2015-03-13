package bits_pearl_2015.org.pearl_2015;

import android.content.Intent;
import android.os.Handler;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class SearchFlyActivity extends ActionBarActivity implements View.OnClickListener {
    private static int SPLASH_TIME_OUT = 3000;

    public static final String[] keywords = {"Catharsis", "Photog Fest", "Literary", "Quiz", "Drama", "Music", "VFX", "Dances", "Art", "Journal", "Hindi", "Glitterati", "Vishal Shekhar", "Terpsicore", "Fraglore"};
    private KeywordsFlow keywordsFlow;
    private Button btnIn, btnOut;
    Timer timer;
    public int count;
    TimerTask timerTask;
    final Handler handler = new Handler();

    @Override
    protected void onResume() {
        super.onResume();
        startTimer();
    }

    public void startTimer() {

        //set a new Timer

        timer = new Timer();
        count = 0;
        //initialize the TimerTask's job
        initializeTimerTask();

        //schedule the timer, after the first 5000ms the TimerTask will run every 10000ms
        timer.schedule(timerTask, 0, 800); //
    }

    public void stoptimertask() {
        //stop the timer, if it's not already null
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
    }

    public void initializeTimerTask() {
        timerTask = new TimerTask() {
            public void run() {

                //use a handler to run a toast that shows the current timestamp

                handler.post(new Runnable() {
                    public void run() {
                        //get the current timeStamp
                        count++;

                        keywordsFlow.rubKeywords();
                        // keywordsFlow.rubAllViews();
                        feedKeywordsFlow(keywordsFlow, keywords);
                        keywordsFlow.go2Show(KeywordsFlow.ANIMATION_IN);
                    }
                });
            }
        };
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setView();
        initView();
        setListener();
        ImageView test = (ImageView) findViewById(R.id.test);
        Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.test_fade);
        test.startAnimation(fadeInAnimation);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent intent = new Intent(SearchFlyActivity.this,
                        SplashScreen.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                stoptimertask();
                SearchFlyActivity.this.finish();


            }
        }, SPLASH_TIME_OUT);

    }

    public void onClick(View v) {
        if (v == btnIn) {
            keywordsFlow.rubKeywords();
            // keywordsFlow.rubAllViews();
            feedKeywordsFlow(keywordsFlow, keywords);
            keywordsFlow.go2Show(KeywordsFlow.ANIMATION_IN);
        } else if (v == btnOut) {
            keywordsFlow.rubKeywords();
            // keywordsFlow.rubAllViews();
            feedKeywordsFlow(keywordsFlow, keywords);
            keywordsFlow.go2Show(KeywordsFlow.ANIMATION_OUT);
        } else if (v instanceof TextView) {
            String keyword = ((TextView) v).getText().toString();
            // Intent intent = new Intent();
            // intent.setAction(Intent.ACTION_VIEW);
            // intent.addCategory(Intent.CATEGORY_DEFAULT);
            // intent.setData(Uri.parse("http://www.google.com.hk/#q=" +
            // keyword));
            // startActivity(intent);
            Log.e("Search", keyword);
        }
    }

    public void setView() {
        setContentView(R.layout.activity_custom_serch_fly_main);


    }

    public void initView() {
        btnIn = (Button) findViewById(R.id.button1);
        btnOut = (Button) findViewById(R.id.button2);
        btnIn.setOnClickListener((View.OnClickListener) this);
        btnOut.setOnClickListener((View.OnClickListener) this);
        keywordsFlow = (KeywordsFlow) findViewById(R.id.frameLayout1);
        keywordsFlow.setDuration(600l);
        keywordsFlow.setOnItemClickListener((View.OnClickListener) this);
        // 添加
        feedKeywordsFlow(keywordsFlow, keywords);
        keywordsFlow.go2Show(KeywordsFlow.ANIMATION_IN);

    }

    public void setListener() {

    }

    private static void feedKeywordsFlow(KeywordsFlow keywordsFlow, String[] arr) {
        Random random = new Random();
        for (int i = 0; i < KeywordsFlow.MAX; i++) {
            int ran = random.nextInt(arr.length);
            String tmp = arr[ran];
            keywordsFlow.feedKeyword(tmp);
        }
    }
}
