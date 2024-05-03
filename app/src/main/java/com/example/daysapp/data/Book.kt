package com.example.daysapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.daysapp.R

data class Book(
    //Name: TITULO LIBRO
    //DESCRIPCION: AUTOR
    @StringRes val nameRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)

