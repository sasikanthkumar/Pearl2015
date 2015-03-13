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
import android.widget.Toast;

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
public class VFX_fragment_final extends BaseFragment {

    public static final String ARG_SCROLL_Y = "ARG_SCROLL_Y";
    private TextView vfxEvent1Text, vfxEvent2Text, vfxEvent3Text, vfxEvent4Text, vfxEvent5Text, vfxEvent6Text, dheeraj, harsha;
    private MaterialRippleLayout vfxEvent1Ripple,
            vfxEvent2Ripple,
            vfxEvent3Ripple,
            vfxEvent4Ripple,
            vfxEvent5Ripple,
            vfxEvent6Ripple;

    private FloatingActionButton dheerajCallfab, harshaCallfab;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vfx_fragment_final, container, false);

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
        vfxEvent1Text = (TextView) view.findViewById(R.id.vfxEvent1Text);
        vfxEvent2Text = (TextView) view.findViewById(R.id.vfxEvent2Text);
        vfxEvent3Text = (TextView) view.findViewById(R.id.vfxEvent3Text);
        vfxEvent4Text = (TextView) view.findViewById(R.id.vfxEvent4Text);
        vfxEvent5Text = (TextView) view.findViewById(R.id.vfxEvent5Text);
        vfxEvent6Text = (TextView) view.findViewById(R.id.vfxEvent6Text);

        dheeraj = (TextView) view.findViewById(R.id.dheeraj);
        harsha = (TextView) view.findViewById(R.id.harsha);
        Typeface tfMatter = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Reckoner.ttf");
        Typeface Oswald = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Oswald-Regular.ttf");
        dheeraj.setTypeface(Oswald, Typeface.NORMAL);
        harsha.setTypeface(Oswald, Typeface.NORMAL);
        dheerajCallfab = (FloatingActionButton) view.findViewById(R.id.dheerajCallFab);
        harshaCallfab = (FloatingActionButton) view.findViewById(R.id.harshaCallFab);
        dheerajCallfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:09542367979"));
                startActivity(callIntent);
            }
        });
        harshaCallfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:09666669171"));
                startActivity(callIntent);
            }
        });
        vfxEvent1Text.setTypeface(tfMatter, Typeface.NORMAL);
        vfxEvent2Text.setTypeface(tfMatter, Typeface.NORMAL);
        vfxEvent3Text.setTypeface(tfMatter, Typeface.NORMAL);
        vfxEvent4Text.setTypeface(tfMatter, Typeface.NORMAL);
        vfxEvent5Text.setTypeface(tfMatter, Typeface.NORMAL);
        vfxEvent6Text.setTypeface(tfMatter, Typeface.NORMAL);

        vfxEvent1Ripple = (MaterialRippleLayout) view.findViewById(R.id.vfxEvent1Ripple);
        vfxEvent2Ripple = (MaterialRippleLayout) view.findViewById(R.id.vfxEvent2Ripple);
        vfxEvent3Ripple = (MaterialRippleLayout) view.findViewById(R.id.vfxEvent3Ripple);
        vfxEvent4Ripple = (MaterialRippleLayout) view.findViewById(R.id.vfxEvent4Ripple);
        vfxEvent5Ripple = (MaterialRippleLayout) view.findViewById(R.id.vfxEvent5Ripple);
        vfxEvent6Ripple = (MaterialRippleLayout) view.findViewById(R.id.vfxEvent6Ripple);

        vfxEvent1Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("KNIGHTS TEMPLAR CIPHERS" + "<br />" + "<small>" + "13 MAR 11:00 am" + "</small>" + "<br />" + "<small>" + "F 202" + "</small>"))

                        .content(R.string.knights)
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
        vfxEvent2Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("SIGILLUM" + "<br />" + "<small>" + "14 MAR 2:00 pm" + "</small>" + "<br />" + "<small>" + "G 207" + "</small>"))

                        .content(R.string.sigillum)
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
        vfxEvent3Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("MYTHIC DIGITAL ART" + "<br />" + "<small>" + "14 MAR 10:00 am" + "</small>" + "<br />" + "<small>" + "G 207" + "</small>"))

                        .content(R.string.mythicDigitalArt)
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
        vfxEvent4Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title("FX'ED")
                        .content(R.string.fixed)
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
        vfxEvent5Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title("Må")
                        .content(R.string.ma)
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
        vfxEvent6Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title("THY MYTH MANGA")
                        .content(R.string.manga)
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