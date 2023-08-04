package com.mhumeniuk.hiltsimple.domain.repository

interface MyRepository {

    suspend fun doNetworkCall()
}