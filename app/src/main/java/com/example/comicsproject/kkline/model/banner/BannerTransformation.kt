package com.example.comicsproject.kkline.model.banner

import android.graphics.Bitmap
import android.util.Log
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation
import java.security.MessageDigest

class BannerTransformation :BitmapTransformation() {
    val ID="com.example.glide.transformations.BannerTransformation"
    val ID_BYTES=ID.toByteArray(Charsets.UTF_8)
    override fun updateDiskCacheKey(messageDigest: MessageDigest) {
        messageDigest.update(ID_BYTES)
    }

    override fun transform(
        pool: BitmapPool,
        toTransform: Bitmap,
        outWidth: Int,
        outHeight: Int
    ): Bitmap {
        return Bitmap.createBitmap(toTransform,0,toTransform.height-outHeight,outWidth,outHeight)
    }
}