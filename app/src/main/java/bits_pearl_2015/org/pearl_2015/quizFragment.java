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
public class quizFragment extends BaseFragment {

    public static final String ARG_SCROLL_Y = "ARG_SCROLL_Y";
    private TextView quizEvent1Text, quizEvent2Text, quizEvent3Text, quizEvent4Text,
            quizEvent5Text,
            quizEvent6Text,
            quizEvent7Text,
            abhishek;

    private MaterialRippleLayout quizEvent1Ripple, quizEvent2Ripple, quizEvent3Ripple, quizEvent4Ripple,
            quizEvent5Ripple,
            quizEvent6Ripple,
            quizEvent7Ripple;

    private FloatingActionButton abhishekCallfab;
    private FloatingActionButton rituparnaCallfab;

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quiz, container, false);

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


        quizEvent1Text = (TextView) view.findViewById(R.id.quizEvent1Text);
        quizEvent2Text = (TextView) view.findViewById(R.id.quizEvent2Text);
        quizEvent3Text = (TextView) view.findViewById(R.id.quizEvent3Text);
        quizEvent4Text = (TextView) view.findViewById(R.id.quizEvent4Text);
        quizEvent5Text = (TextView) view.findViewById(R.id.quizEvent5Text);
        quizEvent6Text = (TextView) view.findViewById(R.id.quizEvent6Text);
        quizEvent7Text = (TextView) view.findViewById(R.id.quizEvent7Text);

        Typeface tfMatter = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Reckoner.ttf");
        Typeface Oswald = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Oswald-Regular.ttf");

        abhishek = (TextView) view.findViewById(R.id.abhishek);
        abhishek.setTypeface(Oswald);


        abhishekCallfab = (FloatingActionButton) view.findViewById(R.id.abhishekCallFab);
        abhishekCallfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:09505325551"));
                startActivity(callIntent);
            }
        });
        quizEvent1Text.setTypeface(tfMatter, Typeface.NORMAL);
        quizEvent2Text.setTypeface(tfMatter, Typeface.NORMAL);
        quizEvent3Text.setTypeface(tfMatter, Typeface.NORMAL);
        quizEvent4Text.setTypeface(tfMatter, Typeface.NORMAL);
        quizEvent5Text.setTypeface(tfMatter, Typeface.NORMAL);
        quizEvent6Text.setTypeface(tfMatter, Typeface.NORMAL);
        quizEvent7Text.setTypeface(tfMatter, Typeface.NORMAL);

        quizEvent1Ripple = (MaterialRippleLayout) view.findViewById(R.id.quizEvent1Ripple);
        quizEvent2Ripple = (MaterialRippleLayout) view.findViewById(R.id.quizEvent2Ripple);
        quizEvent3Ripple = (MaterialRippleLayout) view.findViewById(R.id.quizEvent3Ripple);
        quizEvent4Ripple = (MaterialRippleLayout) view.findViewById(R.id.quizEvent4Ripple);
        quizEvent5Ripple = (MaterialRippleLayout) view.findViewById(R.id.quizEvent5Ripple);
        quizEvent6Ripple = (MaterialRippleLayout) view.findViewById(R.id.quizEvent6Ripple);
        quizEvent7Ripple = (MaterialRippleLayout) view.findViewById(R.id.quizEvent7Ripple);

        quizEvent1Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("BITS Business Quiz"
                                        + "<br />"
                                        + "<small>" +
                                        "14 MAR 10:00 am" + "</small>" + "<br />" + "<small>" +
                                        "F 105" + "</small>"

                        ))
                        .content(R.string.business_quiz)
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
        quizEvent2Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())

                        .title(Html.fromHtml("Entertainment Quiz"
                                        + "<br />"
                                        + "<small>" +
                                        "13 MAR 3:00 pm" + "</small>" + "<br />" + "<small>" +
                                        "F 105" + "</small>"

                        ))
                        .content(R.string.entertainment_quiz)
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
        quizEvent3Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("India Quiz"
                                        + "<br />"
                                        + "<small>" +
                                        "13 MAR 10:30 am" + "</small>" + "<br />" + "<small>" +
                                        "F 102" + "</small>"

                        ))
                        .content(R.string.india_quiz)
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
        quizEvent4Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Midnight AV"

                        ))
                        .content(R.string.midnight_av)
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
        quizEvent5Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Pearl General Quiz"
                                        + "<br />"
                                        + "<small>" +
                                        "15 MAR 10:00 am" + "</small>" + "<br />" + "<small>" +
                                        "F 102" + "</small>"

                        ))
                        .content(R.string.pearl_general)
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
        quizEvent6Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Sports Quiz"
                                        + "<br />"
                                        + "<small>" +
                                        "14 MAR 2:00 pm" + "</small>" + "<br />" + "<small>" +
                                        "F 102" + "</small>"

                        ))
                        .content(R.string.sports_quiz)
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
        quizEvent7Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("The Potpourri Quiz"
                                        + "<br />"
                                        + "<small>" +
                                        "15 MAR 2:00 pm" + "</small>" + "<br />" + "<small>" +
                                        "F 103" + "</small>"

                        ))
                        .content(R.string.photogRace)
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
