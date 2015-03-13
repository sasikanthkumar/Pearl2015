package bits_pearl_2015.org.pearl_2015;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollView;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks;
import com.github.ksoichiro.android.observablescrollview.ScrollState;
import com.github.ksoichiro.android.observablescrollview.Scrollable;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.view.ViewHelper;


public class ContactUs<S extends Scrollable> extends BaseActivity implements ObservableScrollViewCallbacks {
    private Toolbar mToolbar;
    private S mScrollable;
    private FloatingActionButton nikhilCallfab, vishnuCallfab, devrathCallfab, pradumnaCallfab, arjunCallfab;
    private TextView nikhilText, vishnuText, devrathText, pradyumnaText, arjunText;
    private TextView nikhilDesigh, vishnuDesig, devrathDesig, pradyumnaDesig, arjunDesig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        Typeface nova = Typeface.createFromAsset(this.getAssets(), "fonts/ProximaNova-Reg.ttf");

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        TextView contactUsToolbarText = (TextView) findViewById(R.id.contactUsToolbarText);
        contactUsToolbarText.setTypeface(nova);
        mScrollable = (S) findViewById(R.id.scrollable);
        mScrollable.setScrollViewCallbacks(this);

        nikhilCallfab = (FloatingActionButton) findViewById(R.id.nikhilCallFab);
        vishnuCallfab = (FloatingActionButton) findViewById(R.id.vishnuCallFab);
        devrathCallfab = (FloatingActionButton) findViewById(R.id.devrathCallFab);
        arjunCallfab = (FloatingActionButton) findViewById(R.id.arjunCallFab);
        pradumnaCallfab = (FloatingActionButton) findViewById(R.id.padyumnaCallFab);
        nikhilCallfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:09542554003"));
                startActivity(callIntent);
            }
        });
        vishnuCallfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:09848294152"));
                startActivity(callIntent);
            }
        });
        devrathCallfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:08498085505"));
                startActivity(callIntent);
            }
        });
        pradumnaCallfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:09010300025"));
                startActivity(callIntent);
            }
        });
        arjunCallfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:09948582067"));
                startActivity(callIntent);
            }
        });

        Typeface oswaldRegular = Typeface.createFromAsset(this.getAssets(), "fonts/Oswald-Regular.ttf");
        nikhilText = (TextView) findViewById(R.id.nikhilText);
        vishnuText = (TextView) findViewById(R.id.vishnuText);
        pradyumnaText = (TextView) findViewById(R.id.pradyumnaText);
        devrathText = (TextView) findViewById(R.id.devrathText);
        arjunText = (TextView) findViewById(R.id.arjunText);

        nikhilText.setTypeface(oswaldRegular);
        vishnuText.setTypeface(oswaldRegular);
        pradyumnaText.setTypeface(oswaldRegular);
        devrathText.setTypeface(oswaldRegular);
        arjunText.setTypeface(oswaldRegular);

        Typeface bebasNeue = Typeface.createFromAsset(this.getAssets(), "fonts/Bebas_Neue.ttf");


        nikhilDesigh = (TextView) findViewById(R.id.nikhilDesig);
        vishnuDesig = (TextView) findViewById(R.id.vishnuDesig);
        pradyumnaDesig = (TextView) findViewById(R.id.pradyumnaDesig);
        devrathDesig = (TextView) findViewById(R.id.devrathDesig);
        arjunDesig = (TextView) findViewById(R.id.arjunDesig);


        nikhilDesigh.setTypeface(bebasNeue);
        vishnuDesig.setTypeface(bebasNeue);
        pradyumnaDesig.setTypeface(bebasNeue);
        devrathDesig.setTypeface(bebasNeue);
        arjunDesig.setTypeface(bebasNeue);

    }


    @Override
    public void onScrollChanged(int scrollY, boolean firstScroll, boolean dragging) {
    }

    @Override
    public void onDownMotionEvent() {
    }

    @Override
    public void onUpOrCancelMotionEvent(ScrollState scrollState) {
        Log.e("DEBUG", "onUpOrCancelMotionEvent: " + scrollState);
        if (scrollState == ScrollState.UP) {
            if (toolbarIsShown()) {
                hideToolbar();
            }
        } else if (scrollState == ScrollState.DOWN) {
            if (toolbarIsHidden()) {
                showToolbar();
            }
        }
    }

    private boolean toolbarIsShown() {
        return ViewHelper.getTranslationY(mToolbar) == 0;
    }

    private boolean toolbarIsHidden() {
        return ViewHelper.getTranslationY(mToolbar) == -mToolbar.getHeight();
    }

    private void showToolbar() {
        moveToolbar(0);
    }

    private void hideToolbar() {
        moveToolbar(-mToolbar.getHeight());
    }

    private void moveToolbar(float toTranslationY) {
        if (ViewHelper.getTranslationY(mToolbar) == toTranslationY) {
            return;
        }
        ValueAnimator animator = ValueAnimator.ofFloat(ViewHelper.getTranslationY(mToolbar), toTranslationY).setDuration(200);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                float translationY = (float) animation.getAnimatedValue();
                ViewHelper.setTranslationY(mToolbar, translationY);
                ViewHelper.setTranslationY((View) mScrollable, translationY);
                FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) ((View) mScrollable).getLayoutParams();
                lp.height = (int) -translationY + getScreenHeight() - lp.topMargin;
                ((View) mScrollable).requestLayout();
            }
        });
        animator.start();
    }

}