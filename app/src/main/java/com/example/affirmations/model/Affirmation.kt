package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(val @StringRes stringResourceId: Int, @DrawableRes imageResourceId: Int) {

}

