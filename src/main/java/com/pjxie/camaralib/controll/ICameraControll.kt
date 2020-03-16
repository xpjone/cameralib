package com.pjxie.camaralib.controll

import com.pjxie.camaralib.CameraInterface
import com.pjxie.camaralib.CameraListener

/**
 * 创建者：pjxie
 * 创建日期：2019-06-27CameraControllInterface
 * 邮箱：pjxie@iflytek.com
 * 描述：TODO
 */
abstract class ICameraControll : CameraInterface {
    var cameraListener: CameraListener? = null
    fun setPreviewListener(cameraListener: CameraListener) {
        this.cameraListener = cameraListener
    }

}