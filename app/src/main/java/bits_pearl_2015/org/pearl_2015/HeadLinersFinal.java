package bits_pearl_2015.org.pearl_2015;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.TypefaceSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.Theme;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidviewhover.BlurLayout;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks;
import com.github.ksoichiro.android.observablescrollview.ScrollState;
import com.github.ksoichiro.android.observablescrollview.Scrollable;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.view.ViewHelper;


public class HeadLinersFinal<S extends Scrollable> extends BaseActivity implements ObservableScrollViewCallbacks {
    private Toolbar mToolbar;
    private S mScrollable;
    private BlurLayout vishalShekharBlurLayout, glitteratiBlurLayout, mudgalBlurLayout, vhoneBlurLayout, tillDeafBlurLayout, terpsicoreBlurLayout, fragloreBlurLayout, xandriaBlurLayout, advaitaBlurLayout;
    private TextView vishalShekharText, glitteratiText, tillDeafText, terpsicoreText, xandriaText, mudgalText, vhoneText, advaitaText, fragloreText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head_liners_final);
        Typeface nova = Typeface.createFromAsset(this.getAssets(), "fonts/ProximaNova-Reg.ttf");

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mScrollable = (S) findViewById(R.id.scrollable);
        TextView testToolBartitle = (TextView) findViewById(R.id.headlinersTollbarText);
        testToolBartitle.setTypeface(nova);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        Typeface healinersTypeface = Typeface.createFromAsset(this.getAssets(), "fonts/Oswald-Regular.ttf");

        mScrollable.setScrollViewCallbacks(this);
        BlurLayout.setGlobalDefaultDuration(400);

        xandriaText = (TextView) findViewById(R.id.xandriaText);
        xandriaText.setTypeface(healinersTypeface);

        xandriaBlurLayout = (BlurLayout) findViewById(R.id.xandriablurLayout);
        View xandriaHover = LayoutInflater.from(HeadLinersFinal.this).inflate(R.layout.xandria_hover_resource, null);
        xandriaHover.findViewById(R.id.xandriabookTicketsButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent VnSBookTicketsIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://in.bookmyshow.com/events/xandria-live/ET00028808"));
                startActivity(VnSBookTicketsIntent);
            }
        });
        xandriaHover.findViewById(R.id.xandriaDetailsButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(HeadLinersFinal.this)
                        .title(Html.fromHtml("Xandria" + "<br />" + "<small>" + "14 MAR 8:00 pm" + "</small>" + "<br />" + "<small>" + "STAGE 1" + "</small>"))

                        .content(R.string.xandria)
                        .positiveText("CLOSE")
                        .positiveColorRes(R.color.material_red_400)
                        .titleGravity(GravityEnum.CENTER)
                        .titleColorRes(R.color.material_red_400)
                        .contentColorRes(android.R.color.white)
                        .backgroundColorRes(R.color.material_blue_grey_800)
                        .dividerColorRes(R.color.material_pink_500)
                        .btnSelector(R.drawable.md_btn_selector_custom, DialogAction.POSITIVE)
                        .positiveColor(Color.WHITE)
                        .theme(Theme.DARK)

                        .show();
            }
        });
        xandriaBlurLayout.setHoverView(xandriaHover);

        xandriaBlurLayout.addChildAppearAnimator(xandriaHover, R.id.xandriabookTicketsText, Techniques.ZoomInUp, 1000);
        xandriaBlurLayout.addChildDisappearAnimator(xandriaHover, R.id.xandriabookTicketsText, Techniques.ZoomOutDown);
        xandriaBlurLayout.addChildAppearAnimator(xandriaHover, R.id.xandriaDetailsText, Techniques.ZoomInUp, 1000);
        xandriaBlurLayout.addChildDisappearAnimator(xandriaHover, R.id.xandriaDetailsText, Techniques.ZoomOutDown);
        xandriaBlurLayout.addChildAppearAnimator(xandriaHover, R.id.xandriabookTicketsButton, Techniques.ZoomInUp, 1000);
        xandriaBlurLayout.addChildDisappearAnimator(xandriaHover, R.id.xandriabookTicketsButton, Techniques.ZoomOutDown);
        xandriaBlurLayout.addChildAppearAnimator(xandriaHover, R.id.xandriaDetailsButton, Techniques.ZoomInUp, 1000);
        xandriaBlurLayout.addChildDisappearAnimator(xandriaHover, R.id.xandriaDetailsButton, Techniques.ZoomOutDown);
        xandriaBlurLayout.setBlurDuration(1000);


        //advaita
        advaitaText = (TextView) findViewById(R.id.advaitaText);
        advaitaText.setTypeface(healinersTypeface);

        advaitaBlurLayout = (BlurLayout) findViewById(R.id.advaitaBlurLayout);
        View advaitaHover = LayoutInflater.from(HeadLinersFinal.this).inflate(R.layout.advaita_hover_resource, null);
        advaitaHover.findViewById(R.id.advaitabookTicketsButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent VnSBookTicketsIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://in.bookmyshow.com/events/coke-studio-featuring-advaita/ET00028676"));
                startActivity(VnSBookTicketsIntent);
            }
        });
        advaitaHover.findViewById(R.id.advaitaDetailsButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(HeadLinersFinal.this)
                        .title("")
                        .title(Html.fromHtml("Advaita" + "<br />" + "<small>" + "13 MAR 7:00 pm" + "</small>" + "<br />" + "<small>" + "STAGE 1" + "</small>"))

                        .content(R.string.advaita)
                        .positiveText("CLOSE")
                        .positiveColorRes(R.color.material_red_400)
                        .titleGravity(GravityEnum.CENTER)
                        .titleColorRes(R.color.material_red_400)
                        .contentColorRes(android.R.color.white)
                        .backgroundColorRes(R.color.material_blue_grey_800)
                        .dividerColorRes(R.color.material_pink_500)
                        .btnSelector(R.drawable.md_btn_selector_custom, DialogAction.POSITIVE)
                        .positiveColor(Color.WHITE)
                        .theme(Theme.DARK)

                        .show();
            }
        });
        advaitaBlurLayout.setHoverView(advaitaHover);

        advaitaBlurLayout.addChildAppearAnimator(advaitaHover, R.id.advaitabookTicketsText, Techniques.ZoomInUp, 1000);
        advaitaBlurLayout.addChildDisappearAnimator(advaitaHover, R.id.advaitabookTicketsText, Techniques.ZoomOutDown);
        advaitaBlurLayout.addChildAppearAnimator(advaitaHover, R.id.advaitaDetailsText, Techniques.ZoomInUp, 1000);
        advaitaBlurLayout.addChildDisappearAnimator(advaitaHover, R.id.advaitaDetailsText, Techniques.ZoomOutDown);
        advaitaBlurLayout.addChildAppearAnimator(advaitaHover, R.id.advaitabookTicketsButton, Techniques.ZoomInUp, 1000);
        advaitaBlurLayout.addChildDisappearAnimator(advaitaHover, R.id.advaitabookTicketsButton, Techniques.ZoomOutDown);
        advaitaBlurLayout.addChildAppearAnimator(advaitaHover, R.id.advaitaDetailsButton, Techniques.ZoomInUp, 1000);
        advaitaBlurLayout.addChildDisappearAnimator(advaitaHover, R.id.advaitaDetailsButton, Techniques.ZoomOutDown);
        advaitaBlurLayout.setBlurDuration(1000);


        //vishal shekhar


        vishalShekharText = (TextView) findViewById(R.id.vishalShekharText);
        vishalShekharText.setTypeface(healinersTypeface, Typeface.NORMAL);
        vishalShekharBlurLayout = (BlurLayout) findViewById(R.id.vishalShekharBlurLayout);
        View vishalShekharHover = LayoutInflater.from(HeadLinersFinal.this).inflate(R.layout.vishal_shekhar_hover_resource, null);
        vishalShekharHover.findViewById(R.id.VnSbookTicketsButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent VnSBookTicketsIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://in.bookmyshow.com/events/vishal-shekhar-live/ET00020237"));
                startActivity(VnSBookTicketsIntent);
            }
        });
        vishalShekharHover.findViewById(R.id.VnSDetailsButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(HeadLinersFinal.this)
                        .title(Html.fromHtml("Vishal Shekhar" + "<br />" + "<small>" + "15 MAR 7:00 pm" + "</small>" + "<br />" + "<small>" + "STAGE 1" + "</small>"))

                        .content(R.string.vishalShekharText)
                        .positiveText("CLOSE")
                        .positiveColorRes(R.color.material_red_400)
                        .titleGravity(GravityEnum.CENTER)
                        .titleColorRes(R.color.material_red_400)
                        .contentColorRes(android.R.color.white)
                        .backgroundColorRes(R.color.material_blue_grey_800)
                        .dividerColorRes(R.color.material_pink_500)
                        .btnSelector(R.drawable.md_btn_selector_custom, DialogAction.POSITIVE)
                        .positiveColor(Color.WHITE)
                        .theme(Theme.DARK)

                        .show();
            }
        });
        vishalShekharBlurLayout.setHoverView(vishalShekharHover);

        vishalShekharBlurLayout.addChildAppearAnimator(vishalShekharHover, R.id.VnSbookTicketsText, Techniques.ZoomInUp, 1000);
        vishalShekharBlurLayout.addChildDisappearAnimator(vishalShekharHover, R.id.VnSbookTicketsText, Techniques.ZoomOutDown);
        vishalShekharBlurLayout.addChildAppearAnimator(vishalShekharHover, R.id.VnSDetailsText, Techniques.ZoomInUp, 1000);
        vishalShekharBlurLayout.addChildDisappearAnimator(vishalShekharHover, R.id.VnSDetailsText, Techniques.ZoomOutDown);
        vishalShekharBlurLayout.addChildAppearAnimator(vishalShekharHover, R.id.VnSbookTicketsButton, Techniques.ZoomInUp, 1000);
        vishalShekharBlurLayout.addChildDisappearAnimator(vishalShekharHover, R.id.VnSbookTicketsButton, Techniques.ZoomOutDown);
        vishalShekharBlurLayout.addChildAppearAnimator(vishalShekharHover, R.id.VnSDetailsButton, Techniques.ZoomInUp, 1000);
        vishalShekharBlurLayout.addChildDisappearAnimator(vishalShekharHover, R.id.VnSDetailsButton, Techniques.ZoomOutDown);
        vishalShekharBlurLayout.setBlurDuration(1000);


        //mudgal
        mudgalText = (TextView) findViewById(R.id.mudgalText);
        mudgalText.setTypeface(healinersTypeface, Typeface.NORMAL);

        mudgalBlurLayout = (BlurLayout) findViewById(R.id.mudgalBlurLayout);
        View mudgalHover = LayoutInflater.from(HeadLinersFinal.this).inflate(R.layout.mudgal_hover_resource, null);
        mudgalHover.findViewById(R.id.mudgalDetailsButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(HeadLinersFinal.this)
                        .title(Html.fromHtml("Arushi Mudgal"))

                        .content(R.string.mudgal)
                        .positiveText("CLOSE")
                        .positiveColorRes(R.color.material_red_400)
                        .titleGravity(GravityEnum.CENTER)
                        .titleColorRes(R.color.material_red_400)
                        .contentColorRes(android.R.color.white)
                        .backgroundColorRes(R.color.material_blue_grey_800)
                        .dividerColorRes(R.color.material_pink_500)
                        .btnSelector(R.drawable.md_btn_selector_custom, DialogAction.POSITIVE)
                        .positiveColor(Color.WHITE)
                        .theme(Theme.DARK)

                        .show();
            }
        });
        mudgalBlurLayout.setHoverView(mudgalHover);
        mudgalBlurLayout.addChildAppearAnimator(mudgalHover, R.id.mudgalDetailsText, Techniques.ZoomInUp, 1000);
        mudgalBlurLayout.addChildDisappearAnimator(mudgalHover, R.id.mudgalDetailsText, Techniques.ZoomOutDown);
        mudgalBlurLayout.addChildAppearAnimator(mudgalHover, R.id.mudgalDetailsButton, Techniques.ZoomInUp, 1000);
        mudgalBlurLayout.addChildDisappearAnimator(mudgalHover, R.id.mudgalDetailsButton, Techniques.ZoomOutDown);
        mudgalBlurLayout.setBlurDuration(1000);

//vhone

        vhoneText = (TextView) findViewById(R.id.vhoneText);
        vhoneText.setTypeface(healinersTypeface, Typeface.NORMAL);

        vhoneBlurLayout = (BlurLayout) findViewById(R.id.vhoneBlurLayout);
        View vhoneHover = LayoutInflater.from(HeadLinersFinal.this).inflate(R.layout.vhone_hover_resource, null);
        vhoneHover.findViewById(R.id.vhoneDetailsButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(HeadLinersFinal.this)
                        .title(Html.fromHtml("VH1 Supersonic" + "<br />" + "<small>" + "15 MAR 9:00 pm" + "</small>" + "<br />" + "<small>" + "STAGE 1" + "</small>"))

                        .content(R.string.vhoneText)
                        .positiveText("CLOSE")
                        .positiveColorRes(R.color.material_red_400)
                        .titleGravity(GravityEnum.CENTER)
                        .titleColorRes(R.color.material_red_400)
                        .contentColorRes(android.R.color.white)
                        .backgroundColorRes(R.color.material_blue_grey_800)
                        .dividerColorRes(R.color.material_pink_500)
                        .btnSelector(R.drawable.md_btn_selector_custom, DialogAction.POSITIVE)
                        .positiveColor(Color.WHITE)
                        .theme(Theme.DARK)

                        .show();
            }
        });
        vhoneBlurLayout.setHoverView(vhoneHover);
        vhoneBlurLayout.addChildAppearAnimator(vhoneHover, R.id.vhoneDetailsText, Techniques.ZoomInUp, 1000);
        vhoneBlurLayout.addChildDisappearAnimator(vhoneHover, R.id.vhoneDetailsText, Techniques.ZoomOutDown);
        vhoneBlurLayout.addChildAppearAnimator(vhoneHover, R.id.vhoneDetailsButton, Techniques.ZoomInUp, 1000);
        vhoneBlurLayout.addChildDisappearAnimator(vhoneHover, R.id.vhoneDetailsButton, Techniques.ZoomOutDown);
        vhoneBlurLayout.setBlurDuration(1000);


        //Glitterati

    /*    glitteratiText = (TextView) findViewById(R.id.glitteratiText);
        glitteratiText.setTypeface(healinersTypeface, Typeface.NORMAL);

        glitteratiBlurLayout = (BlurLayout) findViewById(R.id.glitteratiBlurLayout);
        View glitteratiHover = LayoutInflater.from(HeadLinersFinal.this).inflate(R.layout.glitterati_hover_resource, null);
        glitteratiHover.findViewById(R.id.glitteratiDetailsButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(HeadLinersFinal.this)
                        .title("Glitterati")
                        .content(R.string.glitteratiText)
                        .positiveText("CLOSE")
                        .positiveColorRes(R.color.material_red_400)
                        .titleGravity(GravityEnum.CENTER)
                        .titleColorRes(R.color.material_red_400)
                        .contentColorRes(android.R.color.white)
                        .backgroundColorRes(R.color.material_blue_grey_800)
                        .dividerColorRes(R.color.material_pink_500)
                        .btnSelector(R.drawable.md_btn_selector_custom, DialogAction.POSITIVE)
                        .positiveColor(Color.WHITE)
                        .theme(Theme.DARK)

                        .show();
            }
        });
        glitteratiBlurLayout.setHoverView(glitteratiHover);
        glitteratiBlurLayout.addChildAppearAnimator(glitteratiHover, R.id.glitteartiDetailsText, Techniques.ZoomInUp, 1000);
        glitteratiBlurLayout.addChildDisappearAnimator(glitteratiHover, R.id.glitteartiDetailsText, Techniques.ZoomOutDown);
        glitteratiBlurLayout.addChildAppearAnimator(glitteratiHover, R.id.glitteratiDetailsButton, Techniques.ZoomInUp, 1000);
        glitteratiBlurLayout.addChildDisappearAnimator(glitteratiHover, R.id.glitteratiDetailsButton, Techniques.ZoomOutDown);
        glitteratiBlurLayout.setBlurDuration(1000);
*/

        //Till Deaf do We Part
  /*      tillDeafText = (TextView) findViewById(R.id.tillDeafText);
        tillDeafText.setTypeface(healinersTypeface, Typeface.NORMAL);

        tillDeafBlurLayout = (BlurLayout) findViewById(R.id.tillDeafBlurLayout);
        View tillDeafHover = LayoutInflater.from(HeadLinersFinal.this).inflate(R.layout.till_deaf_hover_resource, null);
        tillDeafHover.findViewById(R.id.tillDeafDetailsButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(HeadLinersFinal.this)
                        .title("Till Deaf do We Part")
                        .content(R.string.tillDeafText)
                        .positiveText("CLOSE")
                        .positiveColorRes(R.color.material_red_400)
                        .titleGravity(GravityEnum.CENTER)
                        .titleColorRes(R.color.material_red_400)
                        .contentColorRes(android.R.color.white)
                        .backgroundColorRes(R.color.material_blue_grey_800)
                        .dividerColorRes(R.color.material_pink_500)
                        .btnSelector(R.drawable.md_btn_selector_custom, DialogAction.POSITIVE)
                        .positiveColor(Color.WHITE)
                        .theme(Theme.DARK)

                        .show();
            }
        });
        tillDeafBlurLayout.setHoverView(tillDeafHover);
        tillDeafBlurLayout.addChildAppearAnimator(tillDeafHover, R.id.tillDeafDetailsText, Techniques.ZoomInUp, 1000);
        tillDeafBlurLayout.addChildDisappearAnimator(tillDeafHover, R.id.tillDeafDetailsText, Techniques.ZoomOutDown);
        tillDeafBlurLayout.addChildAppearAnimator(tillDeafHover, R.id.tillDeafDetailsButton, Techniques.ZoomInUp, 1000);
        tillDeafBlurLayout.addChildDisappearAnimator(tillDeafHover, R.id.tillDeafDetailsButton, Techniques.ZoomOutDown);
        tillDeafBlurLayout.setBlurDuration(1000);
*/
        //Terpsicore
    /*    terpsicoreText = (TextView) findViewById(R.id.terpiscoreText);
        terpsicoreText.setTypeface(healinersTypeface, Typeface.NORMAL);

        terpsicoreBlurLayout = (BlurLayout) findViewById(R.id.terpiscoreBlurLayout);
        View terpsicoreHover = LayoutInflater.from(HeadLinersFinal.this).inflate(R.layout.terpsicore_hover_resource, null);
        terpsicoreHover.findViewById(R.id.terpiscoreDetailsButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(HeadLinersFinal.this)
                        .title("Terpsicore")
                        .content(R.string.terpsicoreText)
                        .positiveText("CLOSE")
                        .positiveColorRes(R.color.material_red_400)
                        .titleGravity(GravityEnum.CENTER)
                        .titleColorRes(R.color.material_red_400)
                        .contentColorRes(android.R.color.white)
                        .backgroundColorRes(R.color.material_blue_grey_800)
                        .dividerColorRes(R.color.material_pink_500)
                        .btnSelector(R.drawable.md_btn_selector_custom, DialogAction.POSITIVE)
                        .positiveColor(Color.WHITE)
                        .theme(Theme.DARK)

                        .show();
            }
        });
        terpsicoreBlurLayout.setHoverView(terpsicoreHover);
        terpsicoreBlurLayout.addChildAppearAnimator(terpsicoreHover, R.id.terpiscoreDetailsText, Techniques.ZoomInUp, 1000);
        terpsicoreBlurLayout.addChildDisappearAnimator(terpsicoreHover, R.id.terpiscoreDetailsText, Techniques.ZoomOutDown);
        terpsicoreBlurLayout.addChildAppearAnimator(terpsicoreHover, R.id.terpiscoreDetailsButton, Techniques.ZoomInUp, 1000);
        terpsicoreBlurLayout.addChildDisappearAnimator(terpsicoreHover, R.id.terpiscoreDetailsButton, Techniques.ZoomOutDown);
        terpsicoreBlurLayout.setBlurDuration(1000);

*/


        //fraglore

  /*      fragloreText = (TextView) findViewById(R.id.fragloreText);
        fragloreText.setTypeface(healinersTypeface, Typeface.NORMAL);

        fragloreBlurLayout = (BlurLayout) findViewById(R.id.fragloreBlurLayout);
        View fragloreHover = LayoutInflater.from(HeadLinersFinal.this).inflate(R.layout.fraglore_hover_resource, null);
        fragloreHover.findViewById(R.id.fragloreDetailsButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(HeadLinersFinal.this)
                        .title("Fraglore")
                        .content(R.string.fraglore)
                        .positiveText("CLOSE")
                        .positiveColorRes(R.color.material_red_400)
                        .titleGravity(GravityEnum.CENTER)
                        .titleColorRes(R.color.material_red_400)
                        .contentColorRes(android.R.color.white)
                        .backgroundColorRes(R.color.material_blue_grey_800)
                        .dividerColorRes(R.color.material_pink_500)
                        .btnSelector(R.drawable.md_btn_selector_custom, DialogAction.POSITIVE)
                        .positiveColor(Color.WHITE)
                        .theme(Theme.DARK)

                        .show();
            }
        });
        fragloreBlurLayout.setHoverView(fragloreHover);
        fragloreBlurLayout.addChildAppearAnimator(fragloreHover, R.id.fragloreDetailsText, Techniques.ZoomInUp, 1000);
        fragloreBlurLayout.addChildDisappearAnimator(fragloreHover, R.id.fragloreDetailsText, Techniques.ZoomOutDown);
        fragloreBlurLayout.addChildAppearAnimator(fragloreHover, R.id.fragloreDetailsButton, Techniques.ZoomInUp, 1000);
        fragloreBlurLayout.addChildDisappearAnimator(fragloreHover, R.id.fragloreDetailsButton, Techniques.ZoomOutDown);
        fragloreBlurLayout.setBlurDuration(1000);*/

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