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
public class artFragment extends BaseFragment {

    public static final String ARG_SCROLL_Y = "ARG_SCROLL_Y";
    private TextView artEvent1Text, artEvent2Text, artEvent3Text, artEvent4Text, subhi, sanjana;
    private MaterialRippleLayout artEvent1Ripple,
            artEvent2Ripple,
            artEvent3Ripple,
            artEvent4Ripple;

    private FloatingActionButton subhiCallfab, sanjanaCallfab;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_art, container, false);

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
        artEvent1Text = (TextView) view.findViewById(R.id.artEvent1Text);
        artEvent2Text = (TextView) view.findViewById(R.id.artEvent2Text);
        artEvent3Text = (TextView) view.findViewById(R.id.artEvent3Text);
        artEvent4Text = (TextView) view.findViewById(R.id.artEvent4Text);


        subhi = (TextView) view.findViewById(R.id.shubi);
        sanjana = (TextView) view.findViewById(R.id.sanjana);
        Typeface tfMatter = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Reckoner.ttf");
        Typeface Oswald = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Oswald-Regular.ttf");
        subhi.setTypeface(Oswald, Typeface.NORMAL);
        sanjana.setTypeface(Oswald, Typeface.NORMAL);
        subhiCallfab = (FloatingActionButton) view.findViewById(R.id.shubiCallFab);
        sanjanaCallfab = (FloatingActionButton) view.findViewById(R.id.sanjanaCallFab);
        subhiCallfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:09912758669"));
                startActivity(callIntent);
            }
        });
        sanjanaCallfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:0818592061"));
                startActivity(callIntent);
            }
        });
        artEvent1Text.setTypeface(tfMatter, Typeface.NORMAL);
        artEvent2Text.setTypeface(tfMatter, Typeface.NORMAL);
        artEvent3Text.setTypeface(tfMatter, Typeface.NORMAL);
        artEvent4Text.setTypeface(tfMatter, Typeface.NORMAL);

        artEvent1Ripple = (MaterialRippleLayout) view.findViewById(R.id.artEvent1Ripple);
        artEvent2Ripple = (MaterialRippleLayout) view.findViewById(R.id.artEvent2Ripple);
        artEvent3Ripple = (MaterialRippleLayout) view.findViewById(R.id.artEvent3Ripple);
        artEvent4Ripple = (MaterialRippleLayout) view.findViewById(R.id.artEvent4Ripple);


        artEvent1Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Avant Grade"
                                        + "<br />"
                                        + "<small>" + "15 MAR 1:00 pm" + "</small>" + "<br />" + "<small>" + "Rocks" + "</small>"

                        ))
                        .content(R.string.avant_grade)
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
        artEvent2Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Schedios"
                                        + "<br />"
                                        + "<small>" + "14 MAR 2:00 pm" + "</small>" + "<br />" + "<small>" + "F 201" + "</small>"

                        ))
                        .content(R.string.schedios)
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
        artEvent3Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Spawn It"
                                        + "<br />"
                                        + "<small>" + "13 MAR 11:00 am" + "</small>" + "<br />" + "<small>" + "F 201" + "</small>"

                        ))
                        .content(R.string.spawn_it)
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
        artEvent4Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Waste smART"
                                        + "<br />"
                                        + "<small>" + "15 MAR 3:00 pm" + "</small>" + "<br />" + "<small>" + "Stage 2" + "</small>"

                        ))
                        .content(R.string.waste_smart)
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