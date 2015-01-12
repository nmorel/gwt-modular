package com.github.nmorel.gwt.view1;

import com.github.nmorel.gwt.common.mvp.MenuBuilder;
import com.github.nmorel.gwt.common.views.layout.AppLayout;

/**
 * @author Nicolas Morel
 */
public class View1MenuBuilder implements MenuBuilder {
    @Override
    public void build(AppLayout appLayout) {
        appLayout.addLink("View 1", "view1");
    }
}
