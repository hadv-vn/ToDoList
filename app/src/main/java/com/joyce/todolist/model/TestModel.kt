package com.joyce.todolist.model

import android.os.CountDownTimer
import android.util.Log
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class TestModel private constructor()
{
    private val _index = MutableStateFlow<Int>(0)
    val index : StateFlow<Int> = _index
    init {
        startTimer()
    }

    private fun startTimer() {
        object : CountDownTimer(30000, 1000) {

            // Callback function, fired on regular interval
            override fun onTick(millisUntilFinished: Long) {
                _index.value ++
                Log.d("TDLModel", "Timer triggered $index")
            }

            // Callback function, fired
            // when the time is up
            override fun onFinish() {
                Log.d("TDLModel", "Timer finished")
            }
        }.start()
    }

    companion object {
        private var instance: TestModel? = null

        val instance1: TestModel by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
            TestModel()
        }

        fun getInstance2(): TestModel {
            if (instance == null) {
                synchronized(this) {
                    if (instance == null) {
                        instance = TestModel()
                    }
                }
            }
            return instance!!
        }
    }
}