package com.github.nmorel.gwt.home;

import com.github.nmorel.gwt.common.mvp.MenuBuilder;
import com.github.nmorel.gwt.common.views.layout.AppLayout;

/**
 * @author Nicolas Morel
 */
public class HomeMenuBuilder implements MenuBuilder {
    @Override
    public void build(AppLayout appLayout) {
        appLayout.addLink("Home", "home");
    }
}
