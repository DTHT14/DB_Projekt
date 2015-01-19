package se.teq.databasprojekt;

import android.util.Log;

/**
 * Created by TGH on 10/22/2014.
 */
public class Controller {
    private Communication conn;
    private MainActivity activity;
    private WelcomeFragment welcome;
    private SearchFragment searchFragment;

    public Controller(MainActivity activity) {
        this.activity = activity;
        conn = new Communication();


        welcome = new WelcomeFragment();
        welcome.setController (this);

        searchFragment = new SearchFragment();
        searchFragment.setController (this);

        activity.setFragment(welcome, false);

    }

    public void startSearch() {
        activity.setFragment(searchFragment, true);

    }
}