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
public class DramaFragment extends BaseFragment {
    public static final String ARG_SCROLL_Y = "ARG_SCROLL_Y";
    private TextView dramaEvent1Text, dramaEvent2Text, dramaEvent3Text, dramaEvent4Text, dramaEvent5Text, dramaEvent6Text, devesh, prudhvi;
    private MaterialRippleLayout dramaEvent1Ripple,
            dramaEvent2Ripple,
            dramaEvent3Ripple,
            dramaEvent4Ripple,
            dramaEvent5Ripple,
            dramaEvent6Ripple;

    private FloatingActionButton deveshCallfab, prudhviCallfab;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_drama, container, false);

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
        dramaEvent1Text = (TextView) view.findViewById(R.id.dramaEvent1Text);
        dramaEvent2Text = (TextView) view.findViewById(R.id.dramaEvent2Text);
        dramaEvent3Text = (TextView) view.findViewById(R.id.dramaEvent3Text);
        dramaEvent4Text = (TextView) view.findViewById(R.id.dramaEvent4Text);
        dramaEvent5Text = (TextView) view.findViewById(R.id.dramaEvent5Text);
        dramaEvent6Text = (TextView) view.findViewById(R.id.dramaEvent6Text);

        devesh = (TextView) view.findViewById(R.id.devesh);
        prudhvi = (TextView) view.findViewById(R.id.prudhvi);
        Typeface tfMatter = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Reckoner.ttf");
        Typeface Oswald = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Oswald-Regular.ttf");
        devesh.setTypeface(Oswald, Typeface.NORMAL);
        prudhvi.setTypeface(Oswald, Typeface.NORMAL);
        deveshCallfab = (FloatingActionButton) view.findViewById(R.id.deveshCallFab);
        prudhviCallfab = (FloatingActionButton) view.findViewById(R.id.prudhviCallFab);
        deveshCallfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:09553720585"));
                startActivity(callIntent);
            }
        });
        prudhviCallfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:08187874280"));
                startActivity(callIntent);
            }
        });
        dramaEvent1Text.setTypeface(tfMatter, Typeface.NORMAL);
        dramaEvent2Text.setTypeface(tfMatter, Typeface.NORMAL);
        dramaEvent3Text.setTypeface(tfMatter, Typeface.NORMAL);
        dramaEvent4Text.setTypeface(tfMatter, Typeface.NORMAL);
        dramaEvent5Text.setTypeface(tfMatter, Typeface.NORMAL);
        dramaEvent6Text.setTypeface(tfMatter, Typeface.NORMAL);

        dramaEvent1Ripple = (MaterialRippleLayout) view.findViewById(R.id.dramaEvent1Ripple);
        dramaEvent2Ripple = (MaterialRippleLayout) view.findViewById(R.id.dramaEvent2Ripple);
        dramaEvent3Ripple = (MaterialRippleLayout) view.findViewById(R.id.dramaEvent3Ripple);
        dramaEvent4Ripple = (MaterialRippleLayout) view.findViewById(R.id.dramaEvent4Ripple);
        dramaEvent5Ripple = (MaterialRippleLayout) view.findViewById(R.id.dramaEvent5Ripple);
        dramaEvent6Ripple = (MaterialRippleLayout) view.findViewById(R.id.dramaEvent6Ripple);

        dramaEvent1Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Deaf and Dumb" + "<br />"
                                        + "<small>" + "15 MAR 2:00 pm" + "</small>" + "<br />" + "<small>" + "F 102" + "</small>"

                        ))

                        .content(R.string.deafndumb)
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
        dramaEvent2Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Nātyasāstra"
                        ))
                        .content(R.string.natyasastra)
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
        dramaEvent3Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Pastiche"
                        ))
                        .content(R.string.pastiche)
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
        dramaEvent4Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Nukkad Natak"
                                        + "<br />"
                                        + "<small>" + "13 MAR 3:00 pm" + "</small>" + "<br />" + "<small>" + "LTC LOBBY" + "</small>"

                        ))
                        .content(R.string.nukkad)
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
        dramaEvent5Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Mono Acting"
                                        + "<br />"
                                        + "<small>" + "Prelims 13 MAR 1:00 pm" + "</small>" + "<br />" + "<small>" + "G 107" + "</small>"
                                        + "<br />"
                                        + "<small>" + "Finals 14 MAR 1:00 pm" + "</small>" + "<br />" + "<small>" + "G 107" + "</small>"


                        ))
                        .content(R.string.mono_acting)
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
        dramaEvent6Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("On-line"))
                        .content(R.string.online_drama)
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