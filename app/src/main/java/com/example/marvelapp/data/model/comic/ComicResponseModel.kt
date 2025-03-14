package com.example.marvelapp.data.model.comic

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ComicResponseModel(
    @SerializedName("data")
    val data: ComicDataModel
): Serializable
