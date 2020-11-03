package com.example.unitconverter

data class Units(
    val unit: String,
    val icon: Int
)

fun listOfUnits(): List<Units> {
    return listOf<Units>(
        Units("Speed", R.drawable.ic_speed),
        Units("Mass", R.drawable.ic_mass),
        Units("Time", R.drawable.ic_time),
        Units("Temperature", R.drawable.ic_termprature_),
        Units("Distance", R.drawable.ic_speed),
        Units("Area", R.drawable.ic_area),
        Units("DTR", R.drawable.ic_internet),
        Units("Volume", R.drawable.volume),
        Units("Length", R.drawable.length)

    )
}