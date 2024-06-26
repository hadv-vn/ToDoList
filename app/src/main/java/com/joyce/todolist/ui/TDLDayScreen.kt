package com.joyce.todolist.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.joyce.todolist.viewmodel.TDLBaseViewModel
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.ui.graphics.Color

@Composable
fun TDLDayScreen(viewModel: TDLBaseViewModel = hiltViewModel()) {
    viewModel.setTDLModel("Today's To-Do List")
    val title by viewModel.testModel.index.collectAsState()

    Box(modifier = Modifier.width(200.dp).height(200.dp)
        .background(color = Color.Blue)) {
        Text(
            text = title.toString()
        )
    }
    viewModel.setTDLModel("Weekly To-Do List")
}