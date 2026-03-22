package com.example.midterm2

// Layout modifiers
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding

// LazyColumn + items DSL
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items

// UI components
import androidx.compose.material3.Card
import androidx.compose.material3.Text

// Compose core
import androidx.compose.runtime.Composable

// UI modifiers
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StudentListScreen() {

    // Sample data: list of 20 student names
    val students = listOf(
        "Alice","Bob","Charlie","Dana","Eric",
        "Fatima","Grace","Hiro","Isabel","Jack",
        "Karen","Luis","Maya","Nate","Olivia",
        "Priya","Quinn","Ravi","Sara","Tom"
    )

    // LazyColumn creates a vertically scrollable list
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {

        // items() DSL iterates through the list and creates a composable for each student
        items(students) { student ->

            // Each item is displayed inside a Card
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {

                // Display student name
                Text(
                    text = student,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}