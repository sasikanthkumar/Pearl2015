package bits_pearl_2015.org.pearl_2015;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.Theme;
import com.balysv.materialripple.MaterialRippleLayout;
import com.getbase.floatingactionbutton.FloatingActionButton;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollView;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks;
import com.github.ksoichiro.android.observablescrollview.ScrollUtils;


/**
 * A simple {@link Fragment} subclass.
 */
public class musicFragment extends BaseFragment {

    public static final String ARG_SCROLL_Y = "ARG_SCROLL_Y";
    private TextView musicEvent1Text, musicEvent2Text, musicEvent3Text, musicEvent4Text, musicEvent5Text, meha;
    private MaterialRippleLayout musicEvent1Ripple,
            musicEvent2Ripple,
            musicEvent3Ripple,
            musicEvent4Ripple,
            musicEvent5Ripple;
    private FloatingActionButton mehaCallfab;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_music, container, false);

        final ObservableScrollView scrollView = (ObservableScrollView) view.findViewById(R.id.scroll);
        Activity parentActivity = getActivity();
        if (parentActivity instanceof ObservableScrollViewCallbacks) {
            // Scroll to the specified offset after layout
            Bundle args = getArguments();
            if (args != null && args.containsKey(ARG_SCROLL_Y)) {
                final int scrollY = args.getInt(ARG_SCROLL_Y, 0);
                ScrollUtils.addOnGlobalLayoutListener(scrollView, new Runnable() {
                    @Override
                    public void run() {
                        scrollView.scrollTo(0, scrollY);
                    }
                });
            }
            scrollView.setScrollViewCallbacks((ObservableScrollViewCallbacks) parentActivity);
        }
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        musicEvent1Text = (TextView) view.findViewById(R.id.musicEvent1Text);
        musicEvent2Text = (TextView) view.findViewById(R.id.musicEvent2Text);
        musicEvent3Text = (TextView) view.findViewById(R.id.musicEvent3Text);
        musicEvent4Text = (TextView) view.findViewById(R.id.musicEvent4Text);
        musicEvent5Text = (TextView) view.findViewById(R.id.musicEvent5Text);


        Typeface tfMatter = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Reckoner.ttf");
        Typeface Oswald = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Oswald-Regular.ttf");
        meha = (TextView) view.findViewById(R.id.meha);
        meha.setTypeface(Oswald);
        mehaCallfab = (FloatingActionButton) view.findViewById(R.id.mehaCallFab);
        mehaCallfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:09912651622"));
                startActivity(callIntent);
            }
        });

        musicEvent1Text.setTypeface(tfMatter, Typeface.NORMAL);
        musicEvent2Text.setTypeface(tfMatter, Typeface.NORMAL);
        musicEvent3Text.setTypeface(tfMatter, Typeface.NORMAL);
        musicEvent4Text.setTypeface(tfMatter, Typeface.NORMAL);
        musicEvent5Text.setTypeface(tfMatter, Typeface.NORMAL);

        musicEvent1Ripple = (MaterialRippleLayout) view.findViewById(R.id.musicEvent1Ripple);
        musicEvent2Ripple = (MaterialRippleLayout) view.findViewById(R.id.musicEvent2Ripple);
        musicEvent3Ripple = (MaterialRippleLayout) view.findViewById(R.id.musicEvent3Ripple);
        musicEvent4Ripple = (MaterialRippleLayout) view.findViewById(R.id.musicEvent4Ripple);
        musicEvent5Ripple = (MaterialRippleLayout) view.findViewById(R.id.musicEvent5Ripple);

        musicEvent1Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Gandhaara"
                                        + "<br />"
                                        + "<small>" + "13 MAR 12:00 pm" + "</small>" + "<br />" + "<small>" + "F 105" + "</small>"

                        ))
                        .content(R.string.gandhara)
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
        musicEvent2Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Indiana Tones"
                                        + "<br />"
                                        + "<small>" + "15 MAR 8:00 am" + "</small>" + "<br />" + "<small>" + "Stage 2" + "</small>"

                        ))
                        .content(R.string.indiana_tones)
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
        musicEvent3Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Jhankaar"
                                        + "<br />"
                                        + "<small>" + "Prelims 14 MAR 8:00 am" + "</small>" + "<br />" + "<small>" + "Music Room" + "</small>"
                                        + "<br />"
                                        + "<small>" + "Finals 15 MAR 2:00 pm" + "</small>" + "<br />" + "<small>" + "Stage 2" + "</small>"

                        ))
                        .content(R.string.jhankaar)
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
        musicEvent4Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Pearl JAM"
                                        + "<br />"
                                        + "<small>" + "14 MAR 9:00 am" + "</small>" + "<br />" + "<small>" + "Stage 2" + "</small>"

                        ))
                        .content(R.string.pearl_jam)
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
        musicEvent5Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("SCORE-D"
                                        + "<br />"
                                        + "<small>" + "13 MAR 2:00 pm" + "</small>" + "<br />" + "<small>" + "Music Room" + "</small>"

                        ))
                        .content(R.string.score_d)
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


    }
}