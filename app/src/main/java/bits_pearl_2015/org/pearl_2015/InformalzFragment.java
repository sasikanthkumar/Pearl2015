package bits_pearl_2015.org.pearl_2015;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
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
public class InformalzFragment extends BaseFragment {

    public static final String ARG_SCROLL_Y = "ARG_SCROLL_Y";
    private TextView informalzEvent1Text, informalzEvent2Text, informalzEvent3Text, informalzEvent4Text, informalzEvent5Text, informalzEvent6Text, informalzEvent7Text, phanindranaidu;
    private MaterialRippleLayout informalzEvent1Ripple, informalzEvent2Ripple, informalzEvent3Ripple, informalzEvent4Ripple, informalzEvent5Ripple, informalzEvent6Ripple, informalzEvent7Ripple;
    private FloatingActionButton phanindranaiduCallfab;

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_informalz, container, false);

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

        phanindranaiduCallfab = (FloatingActionButton) view.findViewById(R.id.phanindranaiduCallFab);
        phanindranaiduCallfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:09542476555"));
                startActivity(callIntent);
            }
        });
        informalzEvent1Text = (TextView) view.findViewById(R.id.informalzEvent1Text);
        //informalzEvent2Text = (TextView) view.findViewById(R.id.informalzEvent2Text);
        informalzEvent3Text = (TextView) view.findViewById(R.id.informalzEvent3Text);
        informalzEvent4Text = (TextView) view.findViewById(R.id.informalzEvent4Text);
        informalzEvent5Text = (TextView) view.findViewById(R.id.informalzEvent5Text);
        informalzEvent6Text = (TextView) view.findViewById(R.id.informalzEvent6Text);
        informalzEvent7Text = (TextView) view.findViewById(R.id.informalzEvent7Text);


        phanindranaidu = (TextView) view.findViewById(R.id.phanindranaidu);
        Typeface tfMatter = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Reckoner.ttf");
        Typeface Oswald = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Oswald-Regular.ttf");
        phanindranaidu.setTypeface(Oswald);
        informalzEvent1Text.setTypeface(tfMatter, Typeface.NORMAL);
        //informalzEvent2Text.setTypeface(tfMatter, Typeface.NORMAL);
        informalzEvent3Text.setTypeface(tfMatter, Typeface.NORMAL);
        informalzEvent4Text.setTypeface(tfMatter, Typeface.NORMAL);
        informalzEvent5Text.setTypeface(tfMatter, Typeface.NORMAL);
        informalzEvent6Text.setTypeface(tfMatter, Typeface.NORMAL);
        informalzEvent7Text.setTypeface(tfMatter, Typeface.NORMAL);

        informalzEvent1Ripple = (MaterialRippleLayout) view.findViewById(R.id.informalzEvent1Ripple);
        //informalzEvent2Ripple = (MaterialRippleLayout) view.findViewById(R.id.informalzEvent2Ripple);
        informalzEvent3Ripple = (MaterialRippleLayout) view.findViewById(R.id.informalzEvent3Ripple);
        informalzEvent4Ripple = (MaterialRippleLayout) view.findViewById(R.id.informalzEvent4Ripple);
        informalzEvent5Ripple = (MaterialRippleLayout) view.findViewById(R.id.informalzEvent5Ripple);
        informalzEvent6Ripple = (MaterialRippleLayout) view.findViewById(R.id.informalzEvent6Ripple);
        informalzEvent7Ripple = (MaterialRippleLayout) view.findViewById(R.id.informalzEvent7Ripple);


        informalzEvent1Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title("Laser Tag")
                        .content(R.string.laserTag)
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
     /*   informalzEvent2Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title("Paint Ball")
                        .content(R.string.paintBall)
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
        });*/
        informalzEvent3Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title("Bull Ride")
                        .content(R.string.bullRide)
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
        informalzEvent4Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title("Balloon Shooting")
                        .content(R.string.balloonShooting)
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
        informalzEvent5Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title("Treasure Hunt")
                        .content(R.string.treasureHunt)
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
        informalzEvent6Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title("Bidding")
                        .content(R.string.bidding)
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
        informalzEvent7Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title("Quiz")
                        .content(R.string.quiz)
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
