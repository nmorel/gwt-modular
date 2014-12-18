package com.github.nmorel.gwt.client.views.layout;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author Nicolas Morel
 */
public class AppLayout implements AcceptsOneWidget, IsWidget {

    interface LayoutUiBinder extends UiBinder<Widget, AppLayout> {
    }

    private static LayoutUiBinder ourUiBinder = GWT.create(LayoutUiBinder.class);

    private final Widget widget;

    @UiField
    SimplePanel container;

    public AppLayout() {
        widget = ourUiBinder.createAndBindUi(this);
    }


    @Override
    public void setWidget(IsWidget isWidget) {
        container.setWidget(isWidget);
    }

    @Override
    public Widget asWidget() {
        return widget;
    }
}
