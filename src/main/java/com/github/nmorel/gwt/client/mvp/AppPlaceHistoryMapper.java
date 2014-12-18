package com.github.nmorel.gwt.client.mvp;

import com.github.nmorel.gwt.client.views.error.ErrorPlace;
import com.github.nmorel.gwt.client.views.home.HomePlace;
import com.github.nmorel.gwt.client.views.view1.View1Place;
import com.github.nmorel.gwt.client.views.view2.View2Place;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceHistoryMapper;

/**
 * @author Nicolas Morel
 */
public class AppPlaceHistoryMapper implements PlaceHistoryMapper {

    @Override
    public Place getPlace(String s) {

        if ("home".equals(s)) {
            return new HomePlace();
        } else if ("view1".equals(s)) {
            return new View1Place();
        } else if ("view2".equals(s)) {
            return new View2Place();
        }

        return new ErrorPlace();
    }

    @Override
    public String getToken(Place place) {

        if (place instanceof HomePlace) {
            return "home";
        } else if (place instanceof View1Place) {
            return "view1";
        } else if (place instanceof View2Place) {
            return "view2";
        }

        return "error";
    }

}
