package com.github.nmorel.gwt.common.gin;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.PlaceHistoryHandler;

/**
 * @author Nicolas Morel
 */
@GinModules(value = {ModularModule.class}, properties = "modular.ginjector.extensions")
public interface ModularGinjector extends Ginjector {

    PlaceHistoryHandler getPlaceHistoryHandler();

}
