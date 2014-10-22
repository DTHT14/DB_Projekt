package com.example.linus.databasprojektht14;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Spinner;
import android.widget.TextView;


import java.util.Calendar;


/**
 * A simple {@link Fragment} subclass.
 *
 */
public class SearchFragment extends Fragment {
    private Spinner departSpinner;
    private TextView tvDepart;
    private TextView tvArrive;
    private Spinner arriveSpinner;
    private TextView tvNumberOfTravelers;
    private Spinner spinnerTraveler;
    private TextView tvDate;
    private CalendarView dateCalendar;
    private TextView tvInputDate;
    private TextView tvDeparture;
    private Button btnSearch;


    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_search, container, false);

        departSpinner = (Spinner) view.findViewById(R.id.spinnerDepart);
        tvDepart = (TextView) view.findViewById(R.id.tvDepart);
        tvArrive = (TextView) view.findViewById(R.id.tvArrive);
        arriveSpinner = (Spinner) view.findViewById(R.id.spinnerArrive);
        tvNumberOfTravelers = (TextView) view.findViewById(R.id.tvNumberOfTravelers);
        spinnerTraveler = (Spinner) view.findViewById(R.id.spinnerTraveler);
        tvDate = (TextView) view.findViewById(R.id.tvDate);
        dateCalendar = (CalendarView) view.findViewById(R.id.dateCalendar);
        tvInputDate = (TextView) view.findViewById(R.id.tvInputDate);
        tvDeparture = (TextView) view.findViewById(R.id.tvDeparture);
        btnSearch = (Button) view.findViewById(R.id.btnSearch);

        return view;
    }


}
