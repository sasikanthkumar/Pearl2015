package bits_pearl_2015.org.pearl_2015;

/**
 * Created by Sasikanth on 3/2/15.
 */

import android.app.Activity;
import android.content.res.TypedArray;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public abstract class BaseFragment extends Fragment {
    public static ArrayList<String> getDummyData() {
        return BaseActivity.getDummyData();
    }

    protected int getActionBarSize() {
        Activity activity = getActivity();
        if (activity == null) {
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        int[] textSizeAttr = new int[]{R.attr.actionBarSize};
        int indexOfAttrTextSize = 0;
        TypedArray a = activity.obtainStyledAttributes(typedValue.data, textSizeAttr);
        int actionBarSize = a.getDimensionPixelSize(indexOfAttrTextSize, -1);
        a.recycle();
        return actionBarSize;
    }

    protected int getScreenHeight() {
        Activity activity = getActivity();
        if (activity == null) {
            return 0;
        }
        return activity.findViewById(android.R.id.content).getHeight();
    }


}