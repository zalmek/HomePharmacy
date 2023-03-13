package com.example.myapplication.Logic

import androidx.compose.ui.graphics.ImageBitmap

interface ImageProvider {
    fun provideImageD(): ImageBitmap
    fun provideImageE(): ImageBitmap
    fun provideImageContentD(): ImageBitmap
    fun provideImageContentE(): ImageBitmap
    companion object Provider{
        fun provideImageD(): ImageBitmap {
            TODO()
        }
        fun provideImageE(): ImageBitmap {
            TODO()
        }
        fun provideImageContentD(): String {
            TODO()
        }
        fun provideImageContentE(): String {
            TODO()
        }
    }
}