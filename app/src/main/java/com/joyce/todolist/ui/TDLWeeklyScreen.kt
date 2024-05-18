package com.joyce.todolist.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.joyce.todolist.viewmodel.TDLBaseViewModel

@Composable
fun TDLWeeklyScreen(viewModel: TDLBaseViewModel = hiltViewModel()) {
    val tdlPlanner = viewModel.getTDLModel()
    Box(modifier = Modifier.width(200.dp).height(200.dp)
        .background(color = Color.Red)) {
        Text(
            text = tdlPlanner
        )
    }
}