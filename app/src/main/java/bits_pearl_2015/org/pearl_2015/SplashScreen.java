package bits_pearl_2015.org.pearl_2015;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.ShareActionProvider;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.Theme;
import com.balysv.materialripple.MaterialRippleLayout;
import com.daimajia.slider.library.Indicators.PagerIndicator;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.getbase.floatingactionbutton.FloatingActionButton;
import com.pushbots.push.Pushbots;
import com.yalantis.contextmenu.lib.ContextMenuDialogFragment;
import com.yalantis.contextmenu.lib.MenuObject;
import com.yalantis.contextmenu.lib.interfaces.OnMenuItemClickListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class SplashScreen extends ActionBarActivity implements OnMenuItemClickListener {
    private SliderLayout gallery;
    private TextView textHeadliners, textEvents, textContactUs, textLinks, textPearl, odyssey, oneStageLinks, textSchedule;
    LinearLayout headliners, events, contactus, links, schedule;
    private MaterialRippleLayout headlinerRipple, eventsRipple, contactusRipple, aboutusRipple, oneStageRipple, scheduleRipple;
    private DialogFragment mMenuDialogFragment;
    private FragmentManager fragmentManager;
    private Toolbar toolbarSplashScreen;
    private FloatingActionButton contextMenuButton;
    Typeface tfMatter2;
    ShareActionProvider mShareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Pushbots.sharedInstance().init(this);

        Bundle extras = getIntent().getExtras();
        if (null != extras && getIntent().getExtras().containsKey("message") && getIntent().getExtras().containsKey("author")) {
            new MaterialDialog.Builder(SplashScreen.this)
                    .title(extras.getString("author"))
                    .content(extras.getString("message"))
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

        //toolbarSplashScreen = (Toolbar) findViewById(R.id.toolbarSplashScreen);
        //setSupportActionBar(toolbarSplashScreen);
        //getSupportActionBar().setDisplayShowTitleEnabled(false);
        fragmentManager =

                getSupportFragmentManager();

        oneStageLinks = (TextView)

                findViewById(R.id.oneStageLinks);

        oneStageRipple = (MaterialRippleLayout)

                findViewById(R.id.oneStageRipple);


        mMenuDialogFragment = ContextMenuDialogFragment.newInstance((int)

                getResources()

                        .

                                getDimension(R.dimen.contextmenu_height), getMenuObjects

                ());

        textHeadliners = (TextView)

                findViewById(R.id.textHeadliners);

        textEvents = (TextView)

                findViewById(R.id.textEvents);

        textContactUs = (TextView)

                findViewById(R.id.textContactUs);

        textSchedule = (TextView)

                findViewById(R.id.textSchedule);

        textLinks = (TextView)

                findViewById(R.id.textLinks);

        textPearl = (TextView)

                findViewById(R.id.pearl);

        odyssey = (TextView)

                findViewById(R.id.odyssey);

        Typeface tfMatter = Typeface.createFromAsset(this.getAssets(), "fonts/EnglishTowne.ttf");
        tfMatter2 = Typeface.createFromAsset(this.

                        getAssets(),

                "fonts/vivaldi.ttf");


        Typeface nova = Typeface.createFromAsset(this.getAssets(), "fonts/Reckoner.ttf");
        oneStageLinks.setTypeface(nova);
        oneStageRipple.setOnClickListener(new View.OnClickListener()

                                          {
                                              @Override
                                              public void onClick(View v) {
                                                  new MaterialDialog.Builder(SplashScreen.this)
                                                          .title("OneStage")
                                                          .content(R.string.oneStageText)
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
                                          }

        );
        textHeadliners.setTypeface(nova);
        textEvents.setTypeface(nova);
        textContactUs.setTypeface(nova);
        textSchedule.setTypeface(nova);
        odyssey.setTypeface(tfMatter2, Typeface.NORMAL);
        textLinks.setTypeface(nova);
        textPearl.setTypeface(tfMatter, Typeface.NORMAL);
        headlinerRipple = (MaterialRippleLayout)

                findViewById(R.id.headlinersRipple);

        scheduleRipple = (MaterialRippleLayout)

                findViewById(R.id.scheduleRipple);

        eventsRipple = (MaterialRippleLayout)

                findViewById(R.id.eventsRipple);

        contactusRipple = (MaterialRippleLayout)

                findViewById(R.id.contactusRipple);

        headliners = (LinearLayout)

                findViewById(R.id.headliners);

        events = (LinearLayout)

                findViewById(R.id.events);

        schedule = (LinearLayout)

                findViewById(R.id.schedule);

        contactus = (LinearLayout)

                findViewById(R.id.contactUs);

        links = (LinearLayout)

                findViewById(R.id.links);

        aboutusRipple = (MaterialRippleLayout)

                findViewById(R.id.aboutusRipple);

        contextMenuButton = (FloatingActionButton)

                findViewById(R.id.activity_detail_fab);

        contextMenuButton.setOnClickListener(new View.OnClickListener()

                                             {
                                                 @Override
                                                 public void onClick(View v) {
                                                     if (fragmentManager.findFragmentByTag(ContextMenuDialogFragment.TAG) == null) {
                                                         mMenuDialogFragment.show(fragmentManager, ContextMenuDialogFragment.TAG);

                                                     }
                                                 }
                                             }

        );
        scheduleRipple.setOnClickListener(new View.OnClickListener()

                                          {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent scheduleIntent = new Intent(SplashScreen.this, TestActivity.class);
                                                  startActivity(scheduleIntent);
                                                  overridePendingTransition(R.anim.in_translate_top, R.anim.out_translate_top);

                                              }
                                          }

        );
        aboutusRipple.setOnClickListener(new View.OnClickListener()

                                         {
                                             @Override
                                             public void onClick(View v) {
                                                 View dialogView = LayoutInflater.from(SplashScreen.this).inflate(R.layout.dialog_webview, null);
                                                 TextView t = (TextView) dialogView.findViewById(R.id.aboutUsTitle);
                                                 t.setTypeface(tfMatter2, Typeface.NORMAL);
                                                 new MaterialDialog.Builder(SplashScreen.this)
                                                         .title("ABOUT US")
                                                         .content(R.string.aboutUs)
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

                                         }

        );
        contactusRipple.setOnClickListener(new View.OnClickListener()

                                           {
                                               @Override
                                               public void onClick(View v) {
                                                   Intent contactusIntent = new Intent(SplashScreen.this, ContactUs.class);
                                                   startActivity(contactusIntent);
                                                   overridePendingTransition(R.anim.in_translate_top, R.anim.out_translate_top);

                                               }
                                           }

        );
        headlinerRipple.setOnClickListener(new View.OnClickListener()

                                           {
                                               @Override
                                               public void onClick(View v) {
                                                   Intent headLinersIntent = new Intent(SplashScreen.this, HeadLinersFinal.class);
                                                   startActivity(headLinersIntent);
                                                   overridePendingTransition(R.anim.in_translate_top, R.anim.out_translate_top);


                                               }
                                           }

        );
        eventsRipple.setOnClickListener(new View.OnClickListener()

                                        {
                                            @Override
                                            public void onClick(View v) {
                                                Intent eventsIntent = new Intent(SplashScreen.this, Events_final.class);
                                                startActivity(eventsIntent);
                                                overridePendingTransition(R.anim.in_translate_top, R.anim.out_translate_top);

                                            }
                                        }

        );

        gallery = (SliderLayout)

                findViewById(R.id.gallery);

        HashMap<String, Integer> galleryImages = new HashMap<String, Integer>();
        galleryImages.put("Image 1", R.drawable.slider1);
        galleryImages.put("Image 2", R.drawable.slider2);
        galleryImages.put("Image 3", R.drawable.slider3);
        galleryImages.put("Image 4", R.drawable.slider4);
        galleryImages.put("Image 5", R.drawable.slider5);
        galleryImages.put("Image 6", R.drawable.slider6);

        for (
                String name
                : galleryImages.keySet())

        {
            TextSliderView textSliderView = new TextSliderView(this);
            textSliderView.image(galleryImages.get(name)).setScaleType(BaseSliderView.ScaleType.CenterCrop);
            gallery.addSlider(textSliderView);

        }

        gallery.setPresetTransformer(SliderLayout.Transformer.Accordion);
        gallery.setCustomAnimation(new

                        IndicatorChildAnimation()

        );
        gallery.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);

        gallery.setCustomIndicator((PagerIndicator)

                        findViewById(R.id.custom_indicator)

        );

    }

    private List<MenuObject> getMenuObjects() {
        // You can use any [resource, bitmap, drawable, color] as image:
        // item.setResource(...)
        // item.setBitmap(...)
        // item.setDrawable(...)
        // item.setColor(...)
        // You can set image ScaleType:
        // item.setScaleType(ScaleType.FIT_XY)
        // You can use any [resource, drawable, color] as background:
        // item.setBgResource(...)
        // item.setBgDrawable(...)
        // item.setBgColor(...)
        // You can use any [color] as text color:
        // item.setTextColor(...)
        // You can set any [color] as divider color:
        // item.setDividerColor(...)

        List<MenuObject> menuObjects = new ArrayList<>();

        MenuObject close = new MenuObject();
        close.setResource(R.drawable.ic_clear_white_36dp);
        close.setDividerColor(getResources().getColor(R.color.dividerColor));
        close.setBgColor(getResources().getColor(R.color.background_color));

        MenuObject send = new MenuObject("Like Us");
        send.setResource(R.drawable.like_us);
        send.setDividerColor(getResources().getColor(R.color.dividerColor));
        send.setBgColor(getResources().getColor(R.color.background_color));

        MenuObject like = new MenuObject("Follow Us");
        like.setDividerColor(getResources().getColor(R.color.dividerColor));
        like.setBgColor(getResources().getColor(R.color.background_color));
        like.setResource(R.drawable.twitter);

        MenuObject addFr = new MenuObject("Youtube");
        addFr.setDividerColor(getResources().getColor(R.color.dividerColor));
        addFr.setBgColor(getResources().getColor(R.color.background_color));
        addFr.setResource(R.drawable.youtube_icon);

        MenuObject addFav = new MenuObject("Register");
        addFav.setDividerColor(getResources().getColor(R.color.dividerColor));
        addFav.setBgColor(getResources().getColor(R.color.background_color));
        addFav.setResource(R.drawable.register_icon);

        MenuObject share = new MenuObject("Share");
        share.setDividerColor(getResources().getColor(R.color.dividerColor));
        share.setBgColor(getResources().getColor(R.color.background_color));
        share.setResource(R.drawable.share);


        menuObjects.add(close);
        menuObjects.add(send);
        menuObjects.add(addFr);
        menuObjects.add(like);

        menuObjects.add(addFav);
        menuObjects.add(share);
        return menuObjects;

    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_splash_screen, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.context_menu:
                if (fragmentManager.findFragmentByTag(ContextMenuDialogFragment.TAG) == null) {
                    mMenuDialogFragment.show(fragmentManager, ContextMenuDialogFragment.TAG);
                }
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onMenuItemClick(View clickedView, int position) {
        switch (position) {
            case 1:
                Intent likeUsIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/bitspearl"));
                startActivity(likeUsIntent);
                overridePendingTransition(R.anim.in_translate_top, R.anim.out_translate_top);

                break;
            case 2:
                Intent followUsIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/user/dovebitshyd"));
                startActivity(followUsIntent);
                overridePendingTransition(R.anim.in_translate_top, R.anim.out_translate_top);

                break;
            case 3:
                Intent youtubeIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/pearl_BITS?s=07"));
                startActivity(youtubeIntent);
                overridePendingTransition(R.anim.in_translate_top, R.anim.out_translate_top);

                break;
            case 4:
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://bits-pearl.org/Registrations/"));
                startActivity(websiteIntent);
                overridePendingTransition(R.anim.in_translate_top, R.anim.out_translate_top);

                break;
            case 5:
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "Pearl2015";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareBody);
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=bits_pearl_2015.org.pearl_2015");
                startActivity(Intent.createChooser(sharingIntent, "Share via"));
                break;
            default:
                break;
        }
        //Toast.makeText(this, "Clicked on position: " + position, Toast.LENGTH_SHORT).show();
    }
}
