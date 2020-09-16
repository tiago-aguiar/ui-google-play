package co.tiagoaguiar.clone.googleplay.model

import com.google.gson.annotations.SerializedName

data class Feed(
    val categories: List<Category>
)

data class Category(
    val title: String,
    val games: List<Game>
)

data class Game(
    @SerializedName("imageUrl") val icon: String,
    @SerializedName("Name") val title: String,
    @SerializedName("AppSize") val subtitle: String
)
