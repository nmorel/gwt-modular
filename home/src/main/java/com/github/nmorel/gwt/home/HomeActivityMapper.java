package com.github.nmorel.gwt.home;

import com.github.nmorel.gwt.common.mvp.ModuleActivityMapper;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author Nicolas Morel
 */
public class HomeActivityMapper implements ModuleActivityMapper {

    @Inject
    private Provider<HomeActivity> homeActivityProvider;

    @Override
    public Activity getActivity(Place place) {

        if (place instanceof HomePlace) {
            return homeActivityProvider.get();
        }

        return null;
    }
}
