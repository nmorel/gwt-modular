package com.github.nmorel.gwt.client.gin;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.PlaceHistoryHandler;

/**
 * @author Nicolas Morel
 */
@GinModules(value = {ModularModule.class})
public interface ModularGinjector extends Ginjector {

    PlaceHistoryHandler getPlaceHistoryHandler();

}
