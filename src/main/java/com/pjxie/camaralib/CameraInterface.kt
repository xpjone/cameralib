package com.pjxie.camaralib

import android.app.Activity
import android.view.TextureView
import androidx.lifecycle.LifecycleOwner

/**
 * 创建者：pjxie
 * 创建日期：2019-06-27CameraInterface
 * 邮箱：pjxie@iflytek.com
 * 描述：TODO
 */
interface CameraInterface {

    fun onResume()

    fun onPause()
    
    fun initCamera(activity: Activity, autoFitTextureView: TextureView)

    fun capture(filePath:String)

    fun switchCamera()

}

interface CameraListener{
    fun preview(byteArray: ByteArray)
}