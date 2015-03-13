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
public class journalFragment extends BaseFragment {


    public static final String ARG_SCROLL_Y = "ARG_SCROLL_Y";
    private TextView journalEvent1Text, journalEvent2Text, journalEvent3Text, kartik, aditya;
    private MaterialRippleLayout journalEvent1Ripple,
            journalEvent2Ripple,
            journalEvent3Ripple;
    private FloatingActionButton kartikCallfab, adityaCallfab;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_journal, container, false);

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
        journalEvent1Text = (TextView) view.findViewById(R.id.journalEvent1Text);
        journalEvent2Text = (TextView) view.findViewById(R.id.journalEvent2Text);
        journalEvent3Text = (TextView) view.findViewById(R.id.journalEvent3Text);


        Typeface tfMatter = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Reckoner.ttf");
        Typeface Oswald = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Oswald-Regular.ttf");


        kartik = (TextView) view.findViewById(R.id.kartik);
        kartik.setTypeface(Oswald);
        aditya = (TextView) view.findViewById(R.id.aditya);
        aditya.setTypeface(Oswald);


        kartikCallfab = (FloatingActionButton) view.findViewById(R.id.kartikCallFab);
        kartikCallfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:09542053330 "));
                startActivity(callIntent);
            }
        });

        adityaCallfab = (FloatingActionButton) view.findViewById(R.id.adityaCallFab);
        adityaCallfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:08185092055 "));
                startActivity(callIntent);
            }
        });

        journalEvent1Text.setTypeface(tfMatter, Typeface.NORMAL);
        journalEvent2Text.setTypeface(tfMatter, Typeface.NORMAL);
        journalEvent3Text.setTypeface(tfMatter, Typeface.NORMAL);

        journalEvent1Ripple = (MaterialRippleLayout) view.findViewById(R.id.journalEvent1Ripple);
        journalEvent2Ripple = (MaterialRippleLayout) view.findViewById(R.id.journalEvent2Ripple);
        journalEvent3Ripple = (MaterialRippleLayout) view.findViewById(R.id.journalEvent3Ripple);


        journalEvent1Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Football Manager"
                                        + "<br />"
                                        + "<small>" +
                                        "14 MAR 5:00 pm" + "</small>" + "<br />" + "<small>" +
                                        "F 105" + "</small>"

                        ))
                        .content(R.string.football_manager)
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
        journalEvent2Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("The Fourth Estate"
                                        + "<br />"
                                        + "<small>" +
                                        "15 MAR 1:00 pm" + "</small>" + "<br />" + "<small>" +
                                        "F 201" + "</small>"

                        ))
                        .content(R.string.fourth_estate)
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
        journalEvent3Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title("The Front Page")
                        .content(R.string.front_page)
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