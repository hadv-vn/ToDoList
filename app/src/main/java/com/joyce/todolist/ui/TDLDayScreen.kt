package com.joyce.todolist.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.joyce.todolist.viewmodel.TDLBaseViewModel
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun TDLDayScreen(viewModel: TDLBaseViewModel = hiltViewModel()) {
    val tdlPlanner = viewModel.getTDLModel()
    Column {
        Text(
            text = tdlPlanner
        )
    }
}