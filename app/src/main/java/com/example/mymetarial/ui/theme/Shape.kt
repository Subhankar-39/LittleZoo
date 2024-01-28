// Shapes.kt

package com.example.mymetarial.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val shapes = Shapes(
    large = RoundedCornerShape(50.dp,15.dp,50.dp,15.dp),
    medium = RoundedCornerShape(12.dp),
    small = RoundedCornerShape(0.dp),
    //card = RoundedCornerShape(16.dp) // Add a new shape for the Card
    // Add more shape definitions as needed
)
