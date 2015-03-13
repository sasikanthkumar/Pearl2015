package bits_pearl_2015.org.pearl_2015;

/**
 * Created by Sasikanth on 3/2/15.
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.ksoichiro.android.observablescrollview.ObservableScrollView;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks;
import com.github.ksoichiro.android.observablescrollview.ScrollUtils;

public class ViewPagerTabScrollViewFragment extends BaseFragment {

    public static final String ARG_SCROLL_Y = "ARG_SCROLL_Y";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scrollview, container, false);

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
}