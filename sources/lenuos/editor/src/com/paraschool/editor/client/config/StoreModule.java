package com.paraschool.editor.client.config;

import com.google.gwt.inject.client.AbstractGinModule;
import com.paraschool.editor.client.ResourceStore;
import com.paraschool.editor.client.presenter.ResourceListPresenter;

/*
 * Created at 8 nov. 2010
 * By bathily
 */
public class StoreModule extends AbstractGinModule {

	@Override
	protected void configure() {
		bind(ResourceStore.class).to(ResourceListPresenter.class);
	}

}
