package com.github.nmorel.gwt.client;

import com.github.nmorel.gwt.client.gin.ModularGinjector;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

/**
 * @author Nicolas Morel
 */
public class ModularEntryPoint implements EntryPoint {

    public final static ModularGinjector ginjector = GWT.create(ModularGinjector.class);

    @Override
    public void onModuleLoad() {
        ginjector.getPlaceHistoryHandler().handleCurrentHistory();
    }

}
