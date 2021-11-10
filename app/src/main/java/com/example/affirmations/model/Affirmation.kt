package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import java.time.ZoneId

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
    )