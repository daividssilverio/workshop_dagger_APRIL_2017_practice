package br.com.test.kotlindaggerhell.presentation

import android.app.Application
import javax.inject.Inject
import javax.inject.Provider
import kotlin.reflect.KClass

/**
 * Created by daividsilverio on 15/04/17.
 */
class WorkshopApp : Application() {

    lateinit private var appComponent: AppComponent

    @Inject
    lateinit var componentBuilderMap: Map<Class<*>, @JvmSuppressWildcards Provider<ComponentBuilder<*, *>>>

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
        appComponent.inject(this)
    }

    fun getAppComponent() = appComponent

    fun <T : Any> getComponentBuilder(builderType: KClass<T>) = componentBuilderMap.get(builderType.java) as Provider<T>
}