package com.example.marvelapp.data.model.character

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CharacterDataModel(
    @SerializedName("results")
    val results: List<CharacterModel>,
): Serializable
