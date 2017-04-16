package br.com.test.kotlindaggerhell.presentation

import dagger.BindsInstance

/**
 * Created by daividsilverio on 15/04/17.
 */
interface ComponentBuilder<ViewType, ComponentType> {

    @BindsInstance
    fun provideView(viewType: ViewType): ComponentBuilder<ViewType, ComponentType>

    fun build(): ComponentType
}