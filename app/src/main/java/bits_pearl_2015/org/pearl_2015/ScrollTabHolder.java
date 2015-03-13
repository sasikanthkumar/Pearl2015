package bits_pearl_2015.org.pearl_2015;

/**
 * Created by Sasikanth on 3/1/15.
 */

import android.widget.ScrollView;

public interface ScrollTabHolder {

    void adjustScroll(int scrollHeight, int headerTranslationY);

    void onScroll(ScrollView view, int x, int y, int oldX, int oldY, int pagePosition);


}
