package com.github.nmorel.gwt.common.gin;

import com.github.nmorel.gwt.common.mvp.MenuBuilder;
import com.github.nmorel.gwt.common.mvp.ModuleActivityMapper;
import com.github.nmorel.gwt.common.mvp.ModulePlaceHistoryMapper;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.inject.client.multibindings.GinMultibinder;

/**
 * @author Nicolas Morel
 */
public abstract class AbstractModularGinModule extends AbstractGinModule {


    @Override
    protected void configure() {
        GinMultibinder<ModuleActivityMapper> activityMapperMultibinder = GinMultibinder.newSetBinder(binder(), ModuleActivityMapper.class);
        GinMultibinder<ModulePlaceHistoryMapper> placeHistoryMapperMultibinder = GinMultibinder.newSetBinder(binder(), ModulePlaceHistoryMapper.class);
        GinMultibinder<MenuBuilder> menuBuilderMultibinder = GinMultibinder.newSetBinder(binder(), MenuBuilder.class);

        configure(activityMapperMultibinder, placeHistoryMapperMultibinder, menuBuilderMultibinder);
    }

    protected abstract void configure(GinMultibinder<ModuleActivityMapper> activityMapperMultibinder, GinMultibinder<ModulePlaceHistoryMapper> placeHistoryMapperMultibinder, GinMultibinder<MenuBuilder> menuBuilderMultibinder);
}
