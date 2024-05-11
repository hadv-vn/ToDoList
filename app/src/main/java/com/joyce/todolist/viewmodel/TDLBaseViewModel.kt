package com.joyce.todolist.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.joyce.todolist.model.TDLModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TDLBaseViewModel @Inject constructor(application: Application) : AndroidViewModel(application) {
    @Inject lateinit var model: TDLModel

    fun getTDLModel(): String {
        return model.getTDLModel()
    }
}