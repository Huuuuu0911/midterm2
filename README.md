# Student List App (LazyColumn)

## Overview
This app demonstrates how to display a scrollable list of data using LazyColumn in Jetpack Compose. A list of 20 student names is rendered efficiently on the screen.

## Features
- Displays a list of 20 student names  
- Uses LazyColumn for vertical scrolling  
- Uses the `items()` DSL to render list items  
- Each item is displayed inside a Card with padding  
- Automatically scrollable  

## Implementation Details
- A list of student names is stored in a Kotlin list  
- `LazyColumn` is used to create a vertically scrollable layout  
- The `items()` DSL iterates over the list and creates a composable for each item  
- Each item is displayed using a Card and Text  
- LazyColumn only composes visible items, improving performance compared to a regular Column  

## How to Run
1. Open the project in Android Studio  
2. Sync Gradle dependencies  
3. Run the app on an emulator or device  
4. Scroll through the list to view all student names  

## AI Usage Disclosure
ChatGPT was used to:
- Assist in writing and refining the README documentation  
- Provide conceptual guidance on LazyColumn and list rendering  
