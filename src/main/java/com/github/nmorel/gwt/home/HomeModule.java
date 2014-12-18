package com.github.nmorel.gwt.home;

import com.github.nmorel.gwt.common.gin.AbstractModularGinModule;
import com.github.nmorel.gwt.common.mvp.MenuBuilder;
import com.github.nmorel.gwt.common.mvp.ModuleActivityMapper;
import com.github.nmorel.gwt.common.mvp.ModulePlaceHistoryMapper;
import com.google.gwt.inject.client.multibindings.GinMultibinder;
import com.google.inject.Singleton;

/**
 * @author Nicolas Morel
 */
public class HomeModule extends AbstractModularGinModule {

    @Override
    protected void configure(GinMultibinder<ModuleActivityMapper> activityMapperMultibinder, GinMultibinder<ModulePlaceHistoryMapper> placeHistoryMapperMultibinder, GinMultibinder<MenuBuilder> menuBuilderMultibinder) {
        activityMapperMultibinder.addBinding().to(HomeActivityMapper.class).in(Singleton.class);
        placeHistoryMapperMultibinder.addBinding().to(HomePlaceHistoryMapper.class).in(Singleton.class);
        menuBuilderMultibinder.addBinding().to(HomeMenuBuilder.class).in(Singleton.class);
    }

}
