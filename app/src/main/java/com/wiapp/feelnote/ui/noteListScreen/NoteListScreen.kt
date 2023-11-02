package com.wiapp.feelnote.ui.noteListScreen

import android.widget.Button
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wiapp.feelnote.R
import com.wiapp.feelnote.model.Note

@Composable
fun ItemNote(notes: Note, onElementClick: (String,String) -> Unit) {
    val test = stringResource(id = notes.title)
    val test2 = stringResource(id = notes.description)
    Column(
        Modifier
            .fillMaxSize()
    ) {
        Card(
            modifier = Modifier
                .height(95.dp)
                .padding(10.dp)
                .clickable { onElementClick(test, test2) },
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
    }


@Composable
@Preview(showBackground = true)
fun ScreenPreview(){
    //NoteListScreen(notes = Note(R.string.title_note_1,R.string.description_note_1))
}
