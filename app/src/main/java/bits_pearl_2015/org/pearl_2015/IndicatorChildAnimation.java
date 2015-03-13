package bits_pearl_2015.org.pearl_2015;

import android.view.View;

import com.daimajia.slider.library.Animations.BaseAnimationInterface;

/**
 * Created by Sasikanth on 3/1/15.
 */
public class IndicatorChildAnimation implements BaseAnimationInterface {
    private final static String TAG = "IndicatorChildAnimation";


    @Override
    public void onPrepareCurrentItemLeaveScreen(View current) {
        View descriptionLayout = current.findViewById(com.daimajia.slider.library.R.id.description_layout);
        if (descriptionLayout != null) {
            current.findViewById(com.daimajia.slider.library.R.id.description_layout).setVisibility(View.INVISIBLE);

        }
    }

    @Override
    public void onPrepareNextItemShowInScreen(View next) {
        View descriptionLayout = next.findViewById(com.daimajia.slider.library.R.id.description_layout);
        if (descriptionLayout != null) {
            next.findViewById(com.daimajia.slider.library.R.id.description_layout).setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void onCurrentItemDisappear(View view) {

    }

    @Override
    public void onNextItemAppear(View view) {
        View descriptionLayout = view.findViewById(com.daimajia.slider.library.R.id.description_layout);
        if (descriptionLayout != null) {
            view.findViewById(com.daimajia.slider.library.R.id.description_layout).setVisibility(View.INVISIBLE);

        }
    }
}
