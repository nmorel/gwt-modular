package com.github.nmorel.gwt.common.mvp;

import com.github.nmorel.gwt.common.views.error.ErrorPlace;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.inject.Inject;

import java.util.Set;

/**
 * @author Nicolas Morel
 */
public class AppPlaceHistoryMapper implements PlaceHistoryMapper {

    @Inject
    private Set<ModulePlaceHistoryMapper> mappers;

    @Override
    public Place getPlace(String s) {

        for (ModulePlaceHistoryMapper mapper : mappers) {
            Place place = mapper.getPlace(s);
            if (null != place) {
                return place;
            }
        }

        return new ErrorPlace();
    }

    @Override
    public String getToken(Place place) {

        for (ModulePlaceHistoryMapper mapper : mappers) {
            String token = mapper.getToken(place);
            if (null != token) {
                return token;
            }
        }

        return "error";
    }

}
