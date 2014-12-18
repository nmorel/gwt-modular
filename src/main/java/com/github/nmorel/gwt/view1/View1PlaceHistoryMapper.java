package com.github.nmorel.gwt.view1;

import com.github.nmorel.gwt.common.mvp.ModulePlaceHistoryMapper;
import com.google.gwt.place.shared.Place;

/**
 * @author Nicolas Morel
 */
public class View1PlaceHistoryMapper implements ModulePlaceHistoryMapper {

    @Override
    public Place getPlace(String s) {

        if ("view1".equals(s)) {
            return new View1Place();
        }

        return null;
    }

    @Override
    public String getToken(Place place) {

        if (place instanceof View1Place) {
            return "view1";
        }

        return null;
    }

}
