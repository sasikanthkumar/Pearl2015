package bits_pearl_2015.org.pearl_2015;


import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
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
public class CatharsisFragment extends BaseFragment {
    public static final String ARG_SCROLL_Y = "ARG_SCROLL_Y";
    private TextView catharasisEvent1Text, catharasisEvent2Text, catharasisEvent3Text, catharasisEvent4Text, syedshoeb;
    private MaterialRippleLayout catharasisEvent1Ripple, catharasisEvent2Ripple, catharasisEvent3Ripple, catharasisEvent4Ripple;
    private FloatingActionButton syedshoebCallfab;

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_catharsis, container, false);

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

        syedshoebCallfab = (FloatingActionButton) view.findViewById(R.id.syedshoebCallFab);
        syedshoebCallfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:08096753759"));
                startActivity(callIntent);
            }
        });
        catharasisEvent1Text = (TextView) view.findViewById(R.id.catharasisEvent1Text);
        catharasisEvent2Text = (TextView) view.findViewById(R.id.catharasisEvent2Text);
        catharasisEvent3Text = (TextView) view.findViewById(R.id.catharasisEvent3Text);
        catharasisEvent4Text = (TextView) view.findViewById(R.id.catharasisEvent4Text);

        syedshoeb = (TextView) view.findViewById(R.id.syedshoeb);
        Typeface tfMatter = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Reckoner.ttf");
        Typeface Oswald = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Oswald-Regular.ttf");
        syedshoeb.setTypeface(Oswald);
        catharasisEvent1Text.setTypeface(tfMatter, Typeface.NORMAL);
        catharasisEvent2Text.setTypeface(tfMatter, Typeface.NORMAL);
        catharasisEvent3Text.setTypeface(tfMatter, Typeface.NORMAL);
        catharasisEvent4Text.setTypeface(tfMatter, Typeface.NORMAL);

        catharasisEvent1Ripple = (MaterialRippleLayout) view.findViewById(R.id.catharasisEvent1Ripple);
        catharasisEvent2Ripple = (MaterialRippleLayout) view.findViewById(R.id.catharasisEvent2Ripple);
        catharasisEvent3Ripple = (MaterialRippleLayout) view.findViewById(R.id.catharasisEvent3Ripple);
        catharasisEvent4Ripple = (MaterialRippleLayout) view.findViewById(R.id.catharasisEvent4Ripple);

        catharasisEvent1Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("BITS 'talkies'" + "<br />" + "<small>" + "13 14 15 MAR 8:00 am" + "</small>" + "<br />" + "<small>" + "F 104" + "</small>"))

                        .content(R.string.bitsTakies)
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
        catharasisEvent2Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Kaleidoscope" + "<br />" + "<small>" + "13 14 15 MAR 8:00 am" + "</small>" + "<br />" + "<small>" + "F 104" + "</small>"))

                        .content(R.string.kaleidoscope)
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
        catharasisEvent3Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Slumber Party" + "<br />" + "<small>" + "13 14 15 MAR 8:00 am" + "</small>" + "<br />" + "<small>" + "F 104" + "</small>"))

                        .content(R.string.slumberparty)
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
        catharasisEvent4Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("The 48 hour movie" + "<br />" + "<small>" + "13 14 15 MAR 8:00 am" + "</small>" + "<br />" + "<small>" + "F 104" + "</small>"))

                        .content(R.string.hourMovie)
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
