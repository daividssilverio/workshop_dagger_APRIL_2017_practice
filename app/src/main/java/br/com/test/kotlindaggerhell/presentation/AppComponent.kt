package br.com.test.kotlindaggerhell.presentation

import br.com.test.kotlindaggerhell.data.ApiModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by daividsilverio on 15/04/17.
 */

@Singleton
@Component(modules = arrayOf(ApiModule::class, SubcomponentsModule::class))
interface AppComponent {
    fun inject(workshopApp: WorkshopApp)
}