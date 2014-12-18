package com.github.nmorel.gwt.client.gin;

import com.github.nmorel.gwt.client.mvp.AppActivityMapper;
import com.github.nmorel.gwt.client.mvp.AppPlaceHistoryMapper;
import com.github.nmorel.gwt.client.views.home.HomePlace;
import com.github.nmorel.gwt.client.views.layout.AppLayout;
import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.google.web.bindery.event.shared.EventBus;

/**
 * @author Nicolas Morel
 */
public class ModularModule extends AbstractGinModule {

    @Override
    protected void configure() {
        bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);
        bind(ActivityMapper.class).to(AppActivityMapper.class).in(Singleton.class);
        bind(PlaceHistoryMapper.class).to(AppPlaceHistoryMapper.class).in(Singleton.class);
    }

    @Provides
    @Singleton
    public PlaceController providesPlaceController(EventBus eventBus) {
        return new PlaceController(eventBus);
    }

    @Provides
    @Singleton
    public PlaceHistoryHandler providesPlaceHistoryHandler(PlaceHistoryMapper placeHistoryMapper, PlaceController placeController, EventBus eventBus, @Named("default") Place defaultPlace, ActivityManager activityManager) {
        PlaceHistoryHandler placeHistoryHandler = new PlaceHistoryHandler(placeHistoryMapper);
        placeHistoryHandler.register(placeController, eventBus, defaultPlace);
        return placeHistoryHandler;
    }

    @Provides
    @Singleton
    public ActivityManager providesActivityManager(ActivityMapper activityMapper, EventBus eventBus, @Named("container") AcceptsOneWidget container) {
        ActivityManager activityManager = new ActivityManager(activityMapper, eventBus);
        activityManager.setDisplay(container);
        return activityManager;
    }

    @Provides
    @Singleton
    @Named("container")
    public AcceptsOneWidget providesContainer() {
        AppLayout appLayout = new AppLayout();
        RootPanel.get().add(appLayout);
        return appLayout;
    }

    @Provides
    @Named("default")
    public Place providesDefaultPlace() {
        return new HomePlace();
    }
}

