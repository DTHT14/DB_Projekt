package se.teq.databasprojekt;



import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link android.app.Fragment} subclass.
 *
 */
public class WelcomeFragment extends Fragment {
    private TextView tvWelcome;
    private TextView tvBlomstermåla;
    private ImageView ivBuss;
    private Controller controller;
    private Button btnContinue;

    public WelcomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_welcome, container, false);
        tvWelcome = (TextView)view.findViewById(R.id.tvWelcome);
        tvBlomstermåla = (TextView)view.findViewById(R.id.tvBlomstermåla);
        ivBuss = (ImageView)view.findViewById(R.id.ivBuss);
        btnContinue = (Button)view.findViewById(R.id.btnContinue);
        buttonListeners();
        return view;
    }

    private void buttonListeners() {
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.startSearch();
            }
        });
    }
    public void setController(Controller controller) {
        this.controller = controller;
    }
}
