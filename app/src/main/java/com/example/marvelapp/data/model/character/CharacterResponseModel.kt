package com.example.marvelapp.data.model.character

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CharacterResponseModel(
    @SerializedName("data")
    val data: CharacterDataModel
): Serializable