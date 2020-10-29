package com.example.unitconverter

data class Units(
    val unit: String,
    val icon: Int = R.drawable.ic_baseline_directions_bike_24
)

fun listOfUnits(): List<Units> {
    return listOf<Units>(
        Units("Speed"),
        Units("Mass"),
        Units("Time"),
        Units("Temperature"),
        Units("Distance"),
        Units("Area"),
        Units("Data Transfer Rate"),
        Units("Volume"),
        Units("Length")

    )
}