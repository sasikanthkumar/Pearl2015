package bits_pearl_2015.org.pearl_2015;

import android.content.Context;

import it.gmariotti.cardslib.library.internal.Card;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Sasikanth on 3/10/15.
 */
public class ColorCard extends Card {
    protected String meventName, meventRoomNum, meventCost, meventTime;
    protected int count;

    public ColorCard(Context context) {
        this(context, R.layout.carddemo_color_inner_base_main);
    }

    public ColorCard(Context context, int innerLayout) {
        super(context, innerLayout);
        init();
    }

    private void init() {

        //Add ClickListener
        setOnClickListener(new OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                //Toast.makeText(getContext(), "Click Listener card=" + count, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void setupInnerViewElements(ViewGroup parent, View view) {

        //Retrieve elements
        TextView eventNameText = (TextView) parent.findViewById(R.id.eventName);
        TextView eventRoomNumText = (TextView) parent.findViewById(R.id.eventRoomNum);
        TextView eventCostText = (TextView) parent.findViewById(R.id.eventCost);
        TextView eventTimeText = (TextView) parent.findViewById(R.id.eventTime);

        if (eventNameText != null)
            eventNameText.setText(meventName);
        if (eventRoomNumText != null)
            eventRoomNumText.setText(meventRoomNum);
        if (eventCostText != null)
            eventCostText.setText(meventCost);
        if (eventTimeText != null)
            eventTimeText.setText(meventTime);
    }


    public String getCost() {
        return meventCost;
    }

    public void setMeventCost(String cost) {
        meventCost = cost;
    }

    public String getTime() {
        return meventTime;
    }

    public void setMeventTime(String time) {
        meventTime = time;
    }

    public String getRoomNum() {
        return meventRoomNum;
    }

    public void setMeventRoomNum(String roomNum) {
        meventRoomNum = roomNum;
    }

    public String getTitle() {
        return meventName;
    }

    public void setTitle(String eventTitle) {
        meventName = eventTitle;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}