package com.github.nmorel.gwt.view1;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Label;

/**
 * @author Nicolas Morel
 */
public class View1Activity extends AbstractActivity {

    @Override
    public void start(AcceptsOneWidget acceptsOneWidget, EventBus eventBus) {
        acceptsOneWidget.setWidget(new Label("View1"));
    }

}
