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
public class photogFestFragment extends BaseFragment {
    public static final String ARG_SCROLL_Y = "ARG_SCROLL_Y";
    private TextView photogFestEvent1Text, photogFestEvent2Text, photogFestEvent3Text, photogFestEvent4Text, rituparna,
            photogFestEvent5Text,
            photogFestEvent6Text,
            photogFestEvent7Text,
            photogFestEvent8Text,
            photogFestEvent9Text;
    private MaterialRippleLayout photogFestEvent1Ripple, photogFestEvent2Ripple, photogFestEvent3Ripple, photogFestEvent4Ripple,
            photogFestEvent5Ripple,
            photogFestEvent6Ripple,
            photogFestEvent7Ripple,
            photogFestEvent8Ripple,
            photogFestEvent9Ripple;

    private FloatingActionButton rituparnaCallfab;

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_photog_fest, container, false);

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

        rituparnaCallfab = (FloatingActionButton) view.findViewById(R.id.rituparna_CallFab);
        rituparnaCallfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:09948254063"));
                startActivity(callIntent);
            }
        });
        photogFestEvent1Text = (TextView) view.findViewById(R.id.photogFestEvent1Text);
        photogFestEvent2Text = (TextView) view.findViewById(R.id.photogFestEvent2Text);
        photogFestEvent3Text = (TextView) view.findViewById(R.id.photogFestEvent3Text);
        photogFestEvent4Text = (TextView) view.findViewById(R.id.photogFestEvent4Text);
        photogFestEvent5Text = (TextView) view.findViewById(R.id.photogFestEvent5Text);
        photogFestEvent6Text = (TextView) view.findViewById(R.id.photogFestEvent6Text);
        photogFestEvent7Text = (TextView) view.findViewById(R.id.photogFestEvent7Text);
        photogFestEvent8Text = (TextView) view.findViewById(R.id.photogFestEvent8Text);
        photogFestEvent9Text = (TextView) view.findViewById(R.id.photogFestEvent9Text);

        rituparna = (TextView) view.findViewById(R.id.rituparna);
        Typeface tfMatter = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Reckoner.ttf");
        Typeface Oswald = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Oswald-Regular.ttf");
        rituparna.setTypeface(Oswald, Typeface.NORMAL);
        photogFestEvent1Text.setTypeface(tfMatter, Typeface.NORMAL);
        photogFestEvent2Text.setTypeface(tfMatter, Typeface.NORMAL);
        photogFestEvent3Text.setTypeface(tfMatter, Typeface.NORMAL);
        photogFestEvent4Text.setTypeface(tfMatter, Typeface.NORMAL);
        photogFestEvent5Text.setTypeface(tfMatter, Typeface.NORMAL);
        photogFestEvent6Text.setTypeface(tfMatter, Typeface.NORMAL);
        photogFestEvent7Text.setTypeface(tfMatter, Typeface.NORMAL);
        photogFestEvent8Text.setTypeface(tfMatter, Typeface.NORMAL);
        photogFestEvent9Text.setTypeface(tfMatter, Typeface.NORMAL);

        photogFestEvent1Ripple = (MaterialRippleLayout) view.findViewById(R.id.photogFestEvent1Ripple);
        photogFestEvent2Ripple = (MaterialRippleLayout) view.findViewById(R.id.photogFestEvent2Ripple);
        photogFestEvent3Ripple = (MaterialRippleLayout) view.findViewById(R.id.photogFestEvent3Ripple);
        photogFestEvent4Ripple = (MaterialRippleLayout) view.findViewById(R.id.photogFestEvent4Ripple);
        photogFestEvent5Ripple = (MaterialRippleLayout) view.findViewById(R.id.photogFestEvent5Ripple);
        photogFestEvent6Ripple = (MaterialRippleLayout) view.findViewById(R.id.photogFestEvent6Ripple);
        photogFestEvent7Ripple = (MaterialRippleLayout) view.findViewById(R.id.photogFestEvent7Ripple);
        photogFestEvent8Ripple = (MaterialRippleLayout) view.findViewById(R.id.photogFestEvent8Ripple);
        photogFestEvent9Ripple = (MaterialRippleLayout) view.findViewById(R.id.photogFestEvent9Ripple);

        photogFestEvent1Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Anti-Image" + "<br />" + "<small>" + "15 MAR 2:00 pm" + "</small>" + "<br />" + "<small>" + "F 204" + "</small>"))

                        .content(R.string.anti_image)
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
        photogFestEvent2Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("CMYK" + "<br />" + "<small>" + "14 MAR 12:30 pm" + "</small>" + "<br />" + "<small>" + "F 106" + "</small>"))

                        .content(R.string.cmyk)
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
        photogFestEvent3Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Expressions" + "<br />" + "<small>" + "13 MAR 2:00 pm" + "</small>" + "<br />" + "<small>" + "F 106" + "</small>"))

                        .content(R.string.expressions)
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
        photogFestEvent4Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Fiesta Chroma"))
                        .content(R.string.fiestaChroma)
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
        photogFestEvent5Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Light Painting" +
                                        "<br />" + "<small>" + "13 MAR 7:00 pm" + "</small>" + "<br />" + "<small>" + "Rocks" + "</small>"
                                        + "<br />" + "<small>" + "14 MAR 2:00 am" + "</small>" + "<br />" + "<small>" + "Rocks" + "</small>"

                        ))

                        .content(R.string.lightPainting)
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
        photogFestEvent6Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Photog Quiz" + "<br />" + "<small>" + "15 MAR 10:00 am" + "</small>" + "<br />" + "<small>" + "F 106" + "</small>"))

                        .content(R.string.photogQuiz)
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
        photogFestEvent7Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Photog Race" + "<br />" + "<small>" + "14 MAR 4:00 pm" + "</small>" + "<br />" + "<small>" + "Mess 1 Lawns" + "</small>"))

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
        photogFestEvent8Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title(Html.fromHtml("Template" + "<br />" + "<small>" + "15 MAR 12:30 pm" + "</small>" + "<br />" + "<small>" + "F 106" + "</small>"))

                        .content(R.string.template)
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
        photogFestEvent9Ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialDialog.Builder(getActivity())
                        .title("Themes 2K15")

                        .content(R.string.themes)
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
