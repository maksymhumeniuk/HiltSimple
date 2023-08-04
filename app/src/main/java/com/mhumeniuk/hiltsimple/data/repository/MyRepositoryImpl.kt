package com.mhumeniuk.hiltsimple.data.repository

import android.app.Application
import com.mhumeniuk.hiltsimple.R
import com.mhumeniuk.hiltsimple.data.remote.MyApi
import com.mhumeniuk.hiltsimple.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
) : MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("My repository. App name: $appName")
    }

    override suspend fun doNetworkCall() {}
}
