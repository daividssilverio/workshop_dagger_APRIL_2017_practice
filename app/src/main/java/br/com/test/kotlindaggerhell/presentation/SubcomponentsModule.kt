package br.com.test.kotlindaggerhell.presentation

import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

/**
 * Created by daividsilverio on 15/04/17.
 */
@Module(subcomponents = arrayOf(DashboardComponent::class))
abstract class SubcomponentsModule {

    @Binds
    @IntoMap
    @ClassKey(DashboardComponent.Builder::class)
    abstract fun bindDashboardBuilder(dashboardComponentBuilder: DashboardComponent.Builder): ComponentBuilder<*, *>
}

