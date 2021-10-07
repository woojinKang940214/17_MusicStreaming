package woojin.android.kotlin.project.musicstreaming

data class MusicModel(
        val id: Long,
        val track: String,
        val streamUrl: String,
        val artist: String,
        val coverUrl: String,
        val isPlaying: Boolean = false
)
