package com.wiapp.feelnote.ui.noteListScreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wiapp.feelnote.model.Note

@Composable
fun NoteListScreen(notes: Note) {
    Card(
        modifier = Modifier
            .size(95.dp)
            .padding(8.dp)
            .clickable {  },
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = stringResource(id = notes.title))
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = stringResource(id = notes.description))

        }
    }
}

@Composable
@Preview(showBackground = true)
fun ScreenPreview(){
    //NoteListScreen()
}
