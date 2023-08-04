package com.mhumeniuk.hiltsimple.di

import com.mhumeniuk.hiltsimple.data.remote.MyApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMyApi(): MyApi {
        return Retrofit.Builder()
            .baseUrl("http://some.api.com")
            .build()
            .create(MyApi::class.java)
    }

    /**
     * Provide MyRepository over appModule
     */
    /*
    @Provides
    @Singleton
    fun provideMyRepository(api: MyApi, app: Application,@Named("helloOne") string: String): MyRepository {
        return MyRepositoryImpl(api, app, string)
    }
    */

    @Provides
    @Singleton
    @Named("helloOne")
    fun provideStringOne() = "Hello one"

    @Provides
    @Singleton
    @Named("helloTwo")
    fun provideStringTwo() = "Hello two"
}
