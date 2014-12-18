package com.github.nmorel.gwt.view2;

import com.github.nmorel.gwt.common.mvp.ModuleActivityMapper;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author Nicolas Morel
 */
public class View2ActivityMapper implements ModuleActivityMapper {

    @Inject
    private Provider<View2Activity> view2ActivityProvider;

    @Override
    public Activity getActivity(Place place) {

        if (place instanceof View2Place) {
            return view2ActivityProvider.get();
        }

        return null;
    }
}
