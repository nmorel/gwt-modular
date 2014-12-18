package com.github.nmorel.gwt.view2;

import com.github.nmorel.gwt.common.gin.AbstractModularGinModule;
import com.github.nmorel.gwt.common.mvp.MenuBuilder;
import com.github.nmorel.gwt.common.mvp.ModuleActivityMapper;
import com.github.nmorel.gwt.common.mvp.ModulePlaceHistoryMapper;
import com.google.gwt.inject.client.multibindings.GinMultibinder;
import com.google.inject.Singleton;

/**
 * @author Nicolas Morel
 */
public class View2Module extends AbstractModularGinModule {

    @Override
    protected void configure(GinMultibinder<ModuleActivityMapper> activityMapperMultibinder, GinMultibinder<ModulePlaceHistoryMapper> placeHistoryMapperMultibinder, GinMultibinder<MenuBuilder> menuBuilderMultibinder) {
        activityMapperMultibinder.addBinding().to(View2ActivityMapper.class).in(Singleton.class);
        placeHistoryMapperMultibinder.addBinding().to(View2PlaceHistoryMapper.class).in(Singleton.class);
        menuBuilderMultibinder.addBinding().to(View2MenuBuilder.class).in(Singleton.class);
    }

}
