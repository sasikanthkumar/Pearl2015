package bits_pearl_2015.org.pearl_2015;

/**
 * Created by Sasikanth on 3/1/15.
 */

import android.support.v4.app.Fragment;
import android.widget.ScrollView;

public abstract class ScrollTabHolderFragment extends Fragment implements ScrollTabHolder {

    protected ScrollTabHolder mScrollTabHolder;

    public void setScrollTabHolder(ScrollTabHolder scrollTabHolder) {
        mScrollTabHolder = scrollTabHolder;
    }

    @Override
    public void onScroll(ScrollView view, int x, int y, int oldX, int oldY, int pagePosition) {
        // nothing
    }

}