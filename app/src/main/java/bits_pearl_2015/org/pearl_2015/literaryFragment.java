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
public class literaryFragment extends BaseFragment {


    public static final String ARG_SCROLL_Y = "ARG_SCROLL_Y";
    private TextView literaryEvent1Text, literaryEvent2Text, literaryEvent3Text, literaryEvent4Text, literaryEvent5Text, literaryEvent6Text, sagar, harshita;
    private MaterialRippleLayout literaryEvent1Ripple,
            literaryEvent2Ripple,
            literaryEvent3Ripple,
            literaryEvent4Ripple,
            literaryEvent5Ripple,
            literaryEvent6Ripple;

    private FloatingActionButton sagarCallfab, harshitaCallfab;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_literary, container, false);

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
        literaryEvent1Text = (TextView) view.findViewById(R.id.literaryEvent1Text);
        literaryEvent2Text = (TextView) view.findViewById(R.id.literaryEvent2Text);
        literaryEvent3Text = (TextView) view.findViewById(R.id.literaryEvent3Text);
        literaryEvent4Text = (TextView) view.findViewById(R.id.literaryEvent4Text);
        literaryEvent5Text = (TextView) view.findViewById(R.id.literaryEvent5Text);
        literaryEvent6Text = (TextView) view.findViewById(R.id.literaryEvent6Text);

        sagar = (TextView) view.findViewById(R.id.sagar);
        harshita = (TextView) view.findViewById(R.id.harshita);
        Typeface tfMatter = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Reckoner.ttf");
        Typeface Oswald = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Oswald-Regular.ttf");
        sagar.setTypeface(Oswald, Typeface.NORMAL);
        harshita.setTypeface(Oswald, Typeface.NORMAL);
        sagarCallfab = (FloatingActionButton) view.findViewById(R.id.sagarCallFab);
        harshitaCallfab = (FloatingActionButton) view.findViewById(R.id.harshitaCallFab);
        sagarCallfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:08985038750"));
                startActivity(callIntent);
            }
        });
        harshitaCallfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:08790716750"));
                startActivity(callIntent);
            }
        });
        literaryEvent1Text.setTypeface(tfMatter, Typeface.NORMAL);
        literaryEvent2Text.setTypeface(tfMatter, Typeface.NORMAL);
        literaryEvent3Text.setTypeface(tfMatter, Typeface.NORMAL);
        literaryEvent4Text.setTypeface(tfMatter, Typeface.NORMAL);
        literaryEvent5Text.setTypeface(tfMatter, Typeface.NORMAL);
        literaryEvent6Text.setTypeface(tfMatter, Typeface.NORMAL);

        literaryEvent1Ripple = (MaterialRippleLayout) view.findViewById(R.id.literaryEvent1Ripple);
        literaryEvent2Ripple = (MaterialRippleLayout) view.findViewById(R.id.literaryEvent2Ripple);
        literaryEvent3Ripple = (MaterialRippleLayout) view.findViewById(R.id.literaryEvent3Ripple);
        literaryEvent4Ripple = (MaterialRippleLayout) view.findViewById(R.id.literaryEvent4Ripple);
        literaryEvent5Ripple = (MaterialRippleLayout) view.findViewById(R.id.literaryEvent5Ripple);
        literaryEvent6Ripple = (MaterialRippleLayout) view.findViewById(R.id.literaryEvent6Ripple);

        literaryEvent1Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Anti-Shipwreck"
                                        + "<br />"
                                        + "<small>" + "Prelims 15 MAR 2:00 pm" + "</small>" + "<br />" + "<small>" + "F 202" + "</small>"
                                        + "<br />"
                                        + "<small>" + "Finals 15 MAR 4:00 pm" + "</small>" + "<br />" + "<small>" + "F 202 F 203" + "</small>"

                        ))
                        .content(R.string.anti_ship)
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
        literaryEvent2Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Double Trouble"
                                        + "<br />"
                                        + "<small>" + "Prelims 14 MAR 10:00 am" + "</small>" + "<br />" + "<small>" + "F 103" + "</small>"
                                        + "<br />"
                                        + "<small>" + "Finals 14 MAR 1:00 pm" + "</small>" + "<br />" + "<small>" + "F 103" + "</small>"

                        ))
                        .content(R.string.double_trouble)
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
        literaryEvent3Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("JAM"
                                        + "<br />"
                                        + "<small>" + "Prelims 13 MAR 9:00 am" + "</small>" + "<br />" + "<small>" + "F 203" + "</small>"

                        ))
                        .content(R.string.jam)
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
        literaryEvent4Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Sherlocked"
                                        + "<br />"
                                        + "<small>" + "15 MAR 12:00 am" + "</small>" + "<br />" + "<small>" + "F 102" + "</small>"

                        ))
                        .content(R.string.sherlocked)
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
        literaryEvent5Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Words of a feather"
                                        + "<br />"
                                        + "<small>" + "14 MAR 2:00 pm" + "</small>" + "<br />" + "<small>" + "F 202" + "</small>"

                        ))
                        .content(R.string.worlds_of_a_fether)
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
        literaryEvent6Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Yin Yang"
                                        + "<br />"
                                        + "<small>" + "15 MAR 10:00 am" + "</small>" + "<br />" + "<small>" + "F 103" + "</small>"

                        ))
                        .content(R.string.ying_yang)
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