package br.com.test.kotlindaggerhell.presentation

import dagger.Subcomponent

/**
 * Created by daividsilverio on 15/04/17.
 */
@Subcomponent
interface DashboardComponent {

    @Subcomponent.Builder
    interface Builder : ComponentBuilder<View, DashboardComponent>
}