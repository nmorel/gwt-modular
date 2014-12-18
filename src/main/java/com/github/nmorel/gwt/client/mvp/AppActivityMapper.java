package com.github.nmorel.gwt.client.mvp;

import com.github.nmorel.gwt.client.views.error.ErrorActivity;
import com.github.nmorel.gwt.client.views.home.HomeActivity;
import com.github.nmorel.gwt.client.views.home.HomePlace;
import com.github.nmorel.gwt.client.views.view1.View1Activity;
import com.github.nmorel.gwt.client.views.view1.View1Place;
import com.github.nmorel.gwt.client.views.view2.View2Activity;
import com.github.nmorel.gwt.client.views.view2.View2Place;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author Nicolas Morel
 */
public class AppActivityMapper implements ActivityMapper {

    @Inject
    private Provider<ErrorActivity> backActivityProvider;

    @Inject
    private Provider<HomeActivity> homeActivityProvider;

    @Inject
    private Provider<View1Activity> view1ActivityProvider;

    @Inject
    private Provider<View2Activity> view2ActivityProvider;

    @Override
    public Activity getActivity(Place place) {

        if (place instanceof HomePlace) {
            return homeActivityProvider.get();
        } else if (place instanceof View1Place) {
            return view1ActivityProvider.get();
        } else if (place instanceof View2Place) {
            return view2ActivityProvider.get();
        }

        return backActivityProvider.get();
    }
}
