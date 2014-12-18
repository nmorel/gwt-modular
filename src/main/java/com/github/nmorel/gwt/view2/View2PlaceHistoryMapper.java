package com.github.nmorel.gwt.view2;

import com.github.nmorel.gwt.common.mvp.ModulePlaceHistoryMapper;
import com.google.gwt.place.shared.Place;

/**
 * @author Nicolas Morel
 */
public class View2PlaceHistoryMapper implements ModulePlaceHistoryMapper {

    @Override
    public Place getPlace(String s) {

        if ("view2".equals(s)) {
            return new View2Place();
        }

        return null;
    }

    @Override
    public String getToken(Place place) {

        if (place instanceof View2Place) {
            return "view2";
        }

        return null;
    }

}
