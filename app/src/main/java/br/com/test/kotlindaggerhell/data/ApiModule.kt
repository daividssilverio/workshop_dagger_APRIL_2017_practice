package br.com.test.kotlindaggerhell.data

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by daividsilverio on 15/04/17.
 */
@Module
class ApiModule {

    @Provides
    @Singleton
    fun provideApiServices(): ApiServices {
        return RetrofitApiServices()
    }

    @Provides
    @Singleton
    fun provideJsonProcessor(): JsonProcessor {
        return JajaJsonProcessor()
    }

    @Provides
    @Singleton
    fun provideApiClient(apiServices: ApiServices, jsonProcessor: JsonProcessor): ApiClient {
        return ApiClient(apiServices, jsonProcessor)
    }
}

