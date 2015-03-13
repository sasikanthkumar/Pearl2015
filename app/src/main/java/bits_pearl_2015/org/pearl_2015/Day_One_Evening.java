package bits_pearl_2015.org.pearl_2015;


import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nhaarman.listviewanimations.appearance.AnimationAdapter;
import com.nhaarman.listviewanimations.appearance.simple.ScaleInAnimationAdapter;

import java.util.ArrayList;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardArrayAdapter;
import it.gmariotti.cardslib.library.view.CardListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Day_One_Evening extends android.support.v4.app.Fragment {

    private CardListView mListView;
    private CardArrayAdapter mCardArrayAdapter;
    private int day_number;
    private static final String ARG_POSITION = "position";
    private String[] EventNames, EventRooms, EventTimes, EventCost;

    public static Day_One_Evening newInstance(int day_num) {

        Day_One_Evening d = new Day_One_Evening();
        Bundle b = new Bundle();
        b.putInt(ARG_POSITION, day_num);
        d.setArguments(b);
        return d;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        day_number = getArguments().getInt(ARG_POSITION);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_day__one__evening, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayList<Card> cards = new ArrayList<Card>();
        switch (day_number) {
            case 1:
                EventNames = getActivity().getResources().getStringArray(R.array.dayOneEveningEventNames);
                EventRooms = getActivity().getResources().getStringArray(R.array.dayOneEveningEventRooms);
                EventTimes = getActivity().getResources().getStringArray(R.array.dayOneEveningEventTime);
                EventCost = getActivity().getResources().getStringArray(R.array.dayOneEveningEventCost);


                break;
            case 2:
                EventNames = getActivity().getResources().getStringArray(R.array.dayTwoEveningEventNames);

                EventRooms = getActivity().getResources().getStringArray(R.array.dayTwoEveningEventRooms);
                EventTimes = getActivity().getResources().getStringArray(R.array.dayTwoEveningEventTime);
                EventCost = getActivity().getResources().getStringArray(R.array.dayTwoEveningEventCost);
                break;
            case 3:
                EventNames = getActivity().getResources().getStringArray(R.array.dayThreeEveningEventNames);

                EventRooms = getActivity().getResources().getStringArray(R.array.dayThreeEveningEventRooms);
                EventTimes = getActivity().getResources().getStringArray(R.array.dayThreeEveningEventTime);
                EventCost = getActivity().getResources().getStringArray(R.array.dayThreeEveningEventCost);
                break;
            default:
                EventNames = getActivity().getResources().getStringArray(R.array.dayTwoEveningEventNames);

                EventRooms = getActivity().getResources().getStringArray(R.array.dayTwoEveningEventRooms);
                EventTimes = getActivity().getResources().getStringArray(R.array.dayTwoEveningEventTime);
                EventCost = getActivity().getResources().getStringArray(R.array.dayTwoEveningEventCost);
                break;
        }
        for (int i = 0; i < EventNames.length; i++) {
            ColorCard card = new ColorCard(getActivity());
            card.setTitle(EventNames[i]);
            card.setMeventRoomNum(EventRooms[i]);
            card.setMeventTime(EventTimes[i]);
            card.setMeventCost(EventCost[i]);
            card.setCount(i);
            switch (i % 5) {
                case 0:
                    card.setBackgroundResourceId(R.drawable.demoextra_card_selector_color1);
                    break;
                case 1:
                    card.setBackgroundResourceId(R.drawable.demoextra_card_selector_color2);
                    break;
                case 2:
                    card.setBackgroundResourceId(R.drawable.demoextra_card_selector_color3);
                    break;
                case 3:
                    card.setBackgroundResourceId(R.drawable.demoextra_card_selector_color4);
                    break;
                case 4:
                    card.setBackgroundResourceId(R.drawable.demoextra_card_selector_color5);
                    break;
            }
            cards.add(card);

        }
        mCardArrayAdapter = new CardArrayAdapter(getActivity(), cards);
        mListView = (CardListView) view.findViewById(R.id.dayOne_evening_listview);
        if (mListView != null) {
            setScaleAdapter();
        }
    }

    private void setScaleAdapter() {
        AnimationAdapter animCardArrayAdapter = new ScaleInAnimationAdapter(mCardArrayAdapter);
        animCardArrayAdapter.setAbsListView(mListView);
        if (mListView != null) {
            mListView.setExternalAdapter(animCardArrayAdapter, mCardArrayAdapter);
        }
    }

}
