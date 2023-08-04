package com.mhumeniuk.hiltsimple

import androidx.lifecycle.ViewModel
import com.mhumeniuk.hiltsimple.domain.repository.MyRepository
import dagger.Lazy
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor (
    private val repository: Lazy<MyRepository>
): ViewModel() {

    init {
        repository.get()
    }
}
