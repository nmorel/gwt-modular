package com.github.nmorel.gwt.home;

import com.github.nmorel.gwt.common.mvp.ModulePlaceHistoryMapper;
import com.google.gwt.place.shared.Place;

/**
 * @author Nicolas Morel
 */
public class HomePlaceHistoryMapper implements ModulePlaceHistoryMapper {

    @Override
    public Place getPlace(String s) {

        if ("home".equals(s)) {
            return new HomePlace();
        }

        return null;
    }

    @Override
    public String getToken(Place place) {

        if (place instanceof HomePlace) {
            return "home";
        }

        return null;
    }

}
