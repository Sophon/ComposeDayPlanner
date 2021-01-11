package com.example.dayplanner.ui.dayview

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.preferredHeight
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.example.dayplanner.R
import com.example.dayplanner.ui.primary

private const val TITLE = "Day View"

@Composable
fun DayViewToolbar(
    clickHandler: (() -> Unit)?
) {
    TopAppBar(
        backgroundColor = primary,
        contentColor = Color.White,
        title = {
            Text(
                text = TITLE,
                style = MaterialTheme.typography.h6
            )
        },

        actions = {
            ProvideEmphasis(emphasis = AmbientEmphasisLevels.current.medium) {
                Icon(
                    vectorResource(id = R.drawable.ic_list_white_24dp),
                    modifier = Modifier
                        .clickable(onClick = { clickHandler?.invoke() })
                        .padding(horizontal = 16.dp)
                        .preferredHeight(36.dp)
                )
            }
        }
    )
}