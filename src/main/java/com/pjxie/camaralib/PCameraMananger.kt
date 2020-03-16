package com.pjxie.camaralib

import android.app.Activity
import android.view.TextureView
import androidx.lifecycle.LifecycleOwner
import com.pjxie.camaralib.controll.CameraControll
import com.pjxie.camaralib.controll.CameraxControll
import com.pjxie.camaralib.controll.ICameraControll

/**
 * 创建者：pjxie
 * 创建日期：2019-06-27CameraMananger
 * 邮箱：pjxie@iflytek.com
 * 描述：TODO
 */
open class PCameraMananger private constructor() : CameraInterface {


    companion object {
        lateinit var lifecycleOwner: LifecycleOwner

        val instance: PCameraMananger by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            PCameraMananger()
        }
            get
    }

    private lateinit var iCameraControll: ICameraControll

    override fun initCamera(activity: Activity, autoFitTextureView: TextureView) {
        if (lifecycleOwner == null) {
            System.out.println("camera")
            iCameraControll = CameraControll()
        } else {
            System.out.println("camerax")
            iCameraControll = CameraxControll(lifecycleOwner)
        }
        iCameraControll.initCamera(activity, autoFitTextureView)
    }

    override fun capture(filePath: String) {
        iCameraControll.capture(filePath)
    }

    override fun switchCamera() {
        iCameraControll.switchCamera()
    }


    override fun onResume() {
        iCameraControll.onResume()
    }

    override fun onPause() {
        iCameraControll.onPause()
    }

    fun setPreviewListener(cameraListener: CameraListener){
        iCameraControll.setPreviewListener(cameraListener)
    }


}