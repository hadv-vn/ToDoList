package com.joyce.todolist.model

import android.os.CountDownTimer
import android.util.Log
import java.util.Timer
import javax.inject.Inject
import kotlin.concurrent.schedule

class TDLModel @Inject constructor() {


    fun getTDLModel(): String {
        return tdlModel
    }
    private var tdlModel: String = ""
    fun setTDLModel(tdlModel: String) {
        this.tdlModel = tdlModel
    }
}