package com.github.nmorel.gwt.appli;

import com.github.nmorel.gwt.common.gin.ModularGinjector;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

/**
 * @author Nicolas Morel
 */
public class AppliEntryPoint implements EntryPoint {

    public final static ModularGinjector ginjector = GWT.create(ModularGinjector.class);

    @Override
    public void onModuleLoad() {
        ginjector.getPlaceHistoryHandler().handleCurrentHistory();
    }

}
