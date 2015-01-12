package com.github.nmorel.gwt.view1;

import com.github.nmorel.gwt.common.mvp.ModuleActivityMapper;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author Nicolas Morel
 */
public class View1ActivityMapper implements ModuleActivityMapper {

    @Inject
    private Provider<View1Activity> view1ActivityProvider;

    @Override
    public Activity getActivity(Place place) {

        if (place instanceof View1Place) {
            return view1ActivityProvider.get();
        }

        return null;
    }
}
