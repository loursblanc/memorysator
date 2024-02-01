package com.example.memorysator.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.memorysator.R

@Composable
fun RulesScreen(modifier: Modifier = Modifier ) {
    Column (
        verticalArrangement =  Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        ){
        Text(
            text = stringResource(id = R.string.rules_title),
            Modifier.padding(bottom = 20.dp) //dimensionResource(id = R.dimen.app_title_bottom_padding)
        )
        Text(text = stringResource(id = R.string.rules),
            Modifier.padding(horizontal = dimensionResource(id = R.dimen.paragraph_horizontal_padding))
        )
        Spacer(Modifier.weight(1F))
        Row {
            Button(
                onClick ={ /*Todo*/ },
                Modifier.padding(vertical = dimensionResource(id = R.dimen.large_vertical_padding))
                    .width(dimensionResource(id = R.dimen.width_button))
            ){
                Text(text = stringResource(id = R.string.return_main_menu_button))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RulesScreenPreview(){
    RulesScreen()
}