package com.joyce.todolist.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import com.joyce.todolist.model.TDLModel
import com.joyce.todolist.model.TestModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject
import kotlin.properties.Delegates

@HiltViewModel
class TDLBaseViewModel @Inject constructor(application: Application) : AndroidViewModel(application) {
    @Inject lateinit var model: TDLModel

    public val testModel: TestModel = TestModel.instance1


    fun getTDLModel(): String {
        return model?.getTDLModel()!!
    }
    fun setTDLModel(tdlModel: String) {
        model.setTDLModel(tdlModel)
    }
}