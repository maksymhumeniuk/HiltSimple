package com.mhumeniuk.hiltsimple

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.mhumeniuk.hiltsimple.domain.repository.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MyService : Service() {

    @Inject
    lateinit var repository: MyRepository

    override fun onCreate() {
        super.onCreate()
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }
}