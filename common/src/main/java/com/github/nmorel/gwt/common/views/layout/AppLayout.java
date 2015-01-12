package com.github.nmorel.gwt.common.views.layout;

import com.github.nmorel.gwt.common.mvp.MenuBuilder;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;
import com.google.inject.Inject;

import java.util.Set;

/**
 * @author Nicolas Morel
 */
public class AppLayout implements AcceptsOneWidget, IsWidget {

    interface LayoutUiBinder extends UiBinder<Widget, AppLayout> {
    }

    private static LayoutUiBinder ourUiBinder = GWT.create(LayoutUiBinder.class);

    private final Widget widget;

    @UiField
    FlowPanel menu;

    @UiField
    SimplePanel container;

    @Inject
    public AppLayout(Set<MenuBuilder> builders) {
        widget = ourUiBinder.createAndBindUi(this);
        for (MenuBuilder builder : builders) {
            builder.build(this);
        }
    }

    @Override
    public void setWidget(IsWidget isWidget) {
        container.setWidget(isWidget);
    }

    @Override
    public Widget asWidget() {
        return widget;
    }

    public void addLink(String label, String token) {
        Hyperlink hyperlink = new Hyperlink(label, token);
        hyperlink.getElement().getStyle().setMarginBottom(10, Style.Unit.PX);
        menu.add(hyperlink);
    }
}
