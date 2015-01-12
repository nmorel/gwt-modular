package com.github.nmorel.gwt.common.mvp;

import com.github.nmorel.gwt.common.views.error.ErrorActivity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

import java.util.Set;

/**
 * @author Nicolas Morel
 */
public class AppActivityMapper implements ActivityMapper {

    @Inject
    private Provider<ErrorActivity> backActivityProvider;

    @Inject
    private Set<ModuleActivityMapper> mappers;

    @Override
    public Activity getActivity(Place place) {

        for (ModuleActivityMapper mapper : mappers) {
            Activity activity = mapper.getActivity(place);
            if (null != activity) {
                return activity;
            }
        }

        return backActivityProvider.get();
    }
}
