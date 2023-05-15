package com.example.puzzlegame

import android.content.Context
import androidx.appcompat.widget.AppCompatImageView

class PuzzlePiece(context: Context?): AppCompatImageView(context!!) {
    var xCoord = 0
    var yCoord = 0
    var pieceWith = 0
    var pieceHeight = 0
    var canMoove = true
}