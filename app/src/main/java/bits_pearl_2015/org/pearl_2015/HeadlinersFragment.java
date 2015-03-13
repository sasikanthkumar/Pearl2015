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
public class HeadlinersFragment extends BaseFragment {

    public static final String ARG_SCROLL_Y = "ARG_SCROLL_Y";
    private TextView headlinersEvent1Text, headlinersEvent2Text, headlinersEvent3Text, headlinersEvent4Text,
            headlinersEvent5Text,
            headlinersEvent6Text,
            headlinersEvent7Text,
            headlinersEvent8Text,
            headlinersEvent9Text;
    private MaterialRippleLayout headlinersEvent1Ripple, headlinersEvent2Ripple, headlinersEvent3Ripple, headlinersEvent4Ripple,
            headlinersEvent5Ripple,
            headlinersEvent6Ripple,
            headlinersEvent7Ripple,
            headlinersEvent8Ripple,
            headlinersEvent9Ripple;


    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_headliners, container, false);

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


        headlinersEvent1Text = (TextView) view.findViewById(R.id.headlinersEvent1Text);
        headlinersEvent2Text = (TextView) view.findViewById(R.id.headlinersEvent2Text);
        headlinersEvent3Text = (TextView) view.findViewById(R.id.headlinersEvent3Text);
        headlinersEvent4Text = (TextView) view.findViewById(R.id.headlinersEvent4Text);
        headlinersEvent5Text = (TextView) view.findViewById(R.id.headlinersEvent5Text);
        headlinersEvent6Text = (TextView) view.findViewById(R.id.headlinersEvent6Text);
        headlinersEvent7Text = (TextView) view.findViewById(R.id.headlinersEvent7Text);
        headlinersEvent8Text = (TextView) view.findViewById(R.id.headlinersEvent8Text);
        headlinersEvent9Text = (TextView) view.findViewById(R.id.headlinersEvent9Text);

        Typeface tfMatter = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Reckoner.ttf");
        Typeface Oswald = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Oswald-Regular.ttf");
        headlinersEvent1Text.setTypeface(tfMatter, Typeface.NORMAL);
        headlinersEvent2Text.setTypeface(tfMatter, Typeface.NORMAL);
        headlinersEvent3Text.setTypeface(tfMatter, Typeface.NORMAL);
        headlinersEvent4Text.setTypeface(tfMatter, Typeface.NORMAL);
        headlinersEvent5Text.setTypeface(tfMatter, Typeface.NORMAL);
        headlinersEvent6Text.setTypeface(tfMatter, Typeface.NORMAL);
        headlinersEvent7Text.setTypeface(tfMatter, Typeface.NORMAL);
        headlinersEvent8Text.setTypeface(tfMatter, Typeface.NORMAL);
        headlinersEvent9Text.setTypeface(tfMatter, Typeface.NORMAL);

        headlinersEvent1Ripple = (MaterialRippleLayout) view.findViewById(R.id.headlinersEvent1Ripple);
        headlinersEvent2Ripple = (MaterialRippleLayout) view.findViewById(R.id.headlinersEvent2Ripple);
        headlinersEvent3Ripple = (MaterialRippleLayout) view.findViewById(R.id.headlinersEvent3Ripple);
        headlinersEvent4Ripple = (MaterialRippleLayout) view.findViewById(R.id.headlinersEvent4Ripple);
        headlinersEvent5Ripple = (MaterialRippleLayout) view.findViewById(R.id.headlinersEvent5Ripple);
        headlinersEvent6Ripple = (MaterialRippleLayout) view.findViewById(R.id.headlinersEvent6Ripple);
        headlinersEvent7Ripple = (MaterialRippleLayout) view.findViewById(R.id.headlinersEvent7Ripple);
        headlinersEvent8Ripple = (MaterialRippleLayout) view.findViewById(R.id.headlinersEvent8Ripple);
        headlinersEvent9Ripple = (MaterialRippleLayout) view.findViewById(R.id.headlinersEvent9Ripple);

        headlinersEvent1Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Glitterati" + "<br />" + "<small>" + "Prelims 14 MAR 9:00 am" + "</small>" + "<br />" + "<small>" + "LTC LOBBY" + "</small>" + "<br />" + "<small>" + "Finals 14 MAR 10:00 pm" + "</small>" + "<br />" + "<small>" + "STAGE 1" + "</small>"))

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
        headlinersEvent2Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Cyphers" + "<br />" + "<small>" + "14 MAR 3:00 pm" + "</small>" + "<br />" + "<small>" + "B-BLOCK LOBBY" + "</small>"))

                        .content(R.string.cyphersText)
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
        headlinersEvent3Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Femina Miss Diva" + "<br />" + "<small>" + "13 MAR 2:00 pm" + "</small>" + "<br />" + "<small>" + "AUDITORIUM" + "</small>"))

                        .content(R.string.missdivaText)
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
        headlinersEvent4Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("The World Fest"))
                        .content(R.string.worldfestText)
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
        headlinersEvent5Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title("")
                        .title(Html.fromHtml("Till Deaf do we Part" + "<br />" + "<small>" + "Regionals 13 MAR 9:00 am" + "</small>" +
                                "<br />" + "<small>" + "STAGE 2" + "</small>" +
                                "<br />" + "<small>" + "Finals 13 MAR 9:00 pm" + "</small>" + "<br />" + "<small>" + "STAGE 1" + "</small>" +
                                "<br/>" + "<small>" + "Winner 14 MAR 7:00 pm" + "</small>" + "<br />" + "<small>" + "STAGE 1" + "</small>"))

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
        headlinersEvent6Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Aspire Talks" + "<br />" + "<small>" + "15 MAR 1:00 pm" + "</small>" + "<br />" + "<small>" + "F 105" + "</small>"))

                        .content(R.string.aspireTalksText)
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
        headlinersEvent7Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Fraglore" + "<br />" + "<small>" + "13 14 15 MAR 8:00 am" + "</small>" + "<br />" + "<small>" + "G 105 G 106" + "</small>"))
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
        headlinersEvent8Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Googled" +
                                "<br />" + "<small>" + "Prelims 13 MAR 4:30 pm" + "</small>" + "<br />" + "<small>" + "IPC 2" + "</small>"+
                                "<br />" + "<small>" + "Prelims 14 MAR 4:00 pm" + "</small>" + "<br />" + "<small>" + "IPC 2" + "</small>"+
                                "<br />" + "<small>" + "Finals 14 MAR 12:00 pm" + "</small>" + "<br />" + "<small>" + "IPC 2" + "</small>"))

                        .content(R.string.googledText)
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
        headlinersEvent9Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Terpsichore" +
                                "<br />" + "<small>" + "Prelims 14 MAR 9:00 am" + "</small>" + "<br />" + "<small>" + "Dance Room" + "</small>"+
                                "<br />" + "<small>" + "Finals 15 MAR 2:00 pm" + "</small>" + "<br />" + "<small>" + "Auditorium" + "</small>"))

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

    }

}
