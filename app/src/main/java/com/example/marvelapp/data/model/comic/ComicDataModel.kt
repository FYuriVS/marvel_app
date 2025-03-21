package com.example.marvelapp.data.model.comic

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ComicDataModel(
    @SerializedName("results")
    val result: List<ComicModel>
): Serializable
