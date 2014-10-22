package com.example.linus.databasprojektht14;



import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 *
 */
public class ResultFragment extends Fragment {
    private TextView tvConfirmation;
    private TextView tvConfirmationDate;
    private TextView tvShowConfirmationDate;
    private TextView tvBussID;
    private TextView tvShowBussID;
    private TextView tvConfirmationShowDepart;
    private TextView tvConfirmationArrive;
    private TextView tvConfirmationShowArrive;
    private TextView tvConfirmationNumber;
    private TextView tvConfirmationShowNumber;
    private TextView tvConfirmationPrice;
    private TextView tvConfirmationShowPrice;

    public ResultFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_search, container, false);

        tvConfirmation = (TextView) view.findViewById(R.id.tvConfirmation);
        tvConfirmationDate = (TextView) view.findViewById(R.id.tvConfirmationDate);
        tvShowConfirmationDate = (TextView) view.findViewById(R.id.tvShowConfirmationDate);
        tvBussID = (TextView) view.findViewById(R.id.tvBussID);
        tvShowBussID = (TextView) view.findViewById(R.id.tvShowBussID);
        tvConfirmationShowDepart = (TextView) view.findViewById(R.id.tvConfirmationShowDepart);
        tvConfirmationArrive = (TextView) view.findViewById(R.id.tvConfirmationArrive);
        tvConfirmationShowArrive = (TextView) view.findViewById(R.id.tvConfirmationShowArrive);
        tvConfirmationNumber = (TextView) view.findViewById(R.id.tvConfirmationNumber);
        tvConfirmationShowNumber = (TextView) view.findViewById(R.id.tvConfirmationShowNumber);
        tvConfirmationPrice = (TextView) view.findViewById(R.id.tvConfirmationPrice);
        tvConfirmationShowPrice = (TextView) view.findViewById(R.id.tvConfirmationShowPrice);
    }


}
