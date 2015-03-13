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
public class hindiFragment extends BaseFragment {

    public static final String ARG_SCROLL_Y = "ARG_SCROLL_Y";
    private TextView hindiEvent1Text, hindiEvent2Text, hindiEvent3Text, shivam, ramKrishna;
    private MaterialRippleLayout hindiEvent1Ripple,
            hindiEvent2Ripple,
            hindiEvent3Ripple;
    private FloatingActionButton shivamCallfab, ramKrishnaCallfab;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hindi, container, false);

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
        hindiEvent1Text = (TextView) view.findViewById(R.id.hindiEvent1Text);
        hindiEvent2Text = (TextView) view.findViewById(R.id.hindiEvent2Text);
        hindiEvent3Text = (TextView) view.findViewById(R.id.hindiEvent3Text);


        Typeface tfMatter = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Reckoner.ttf");
        Typeface Oswald = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Oswald-Regular.ttf");
        shivam = (TextView) view.findViewById(R.id.shivam);
        ramKrishna = (TextView) view.findViewById(R.id.ramKrishna);
        shivam.setTypeface(Oswald, Typeface.NORMAL);
        ramKrishna.setTypeface(Oswald, Typeface.NORMAL);
        hindiEvent1Text.setTypeface(tfMatter, Typeface.NORMAL);
        hindiEvent2Text.setTypeface(tfMatter, Typeface.NORMAL);
        hindiEvent3Text.setTypeface(tfMatter, Typeface.NORMAL);

        shivamCallfab = (FloatingActionButton) view.findViewById(R.id.shivamCallFab);
        ramKrishnaCallfab = (FloatingActionButton) view.findViewById(R.id.ramKrishnaCallFab);
        shivamCallfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:09705076109"));
                startActivity(callIntent);
            }
        });
        ramKrishnaCallfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:07661079396"));
                startActivity(callIntent);
            }
        });
        hindiEvent1Ripple = (MaterialRippleLayout) view.findViewById(R.id.hindiEvent1Ripple);
        hindiEvent2Ripple = (MaterialRippleLayout) view.findViewById(R.id.hindiEvent2Ripple);
        hindiEvent3Ripple = (MaterialRippleLayout) view.findViewById(R.id.hindiEvent3Ripple);


        hindiEvent1Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Abhilekh"


                        ))
                        .content(R.string.abhilekh)
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
        hindiEvent2Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Stand up Comedy"
                                        + "<br />"
                                        + "<small>" +
                                        "14 MAR 11:00 am" + "</small>" + "<br />" + "<small>" +
                                        "F 107" + "</small>"

                        ))
                        .content(R.string.stand_up_comedy)
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
        hindiEvent3Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Youth Mahasaha"
                                        + "<br />"
                                        + "<small>" +
                                        "15 MAR 10:00 am" + "</small>" + "<br />" + "<small>" +
                                        "F 105" + "</small>"

                        ))
                        .content(R.string.youth_mahasabha)
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