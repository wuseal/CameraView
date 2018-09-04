package com.cjt2325.cameralibrary.state;

import android.view.Surface;
import android.view.SurfaceHolder;

import com.cjt2325.cameralibrary.CameraInterface;

/**
 * =====================================
 * 作    者: 陈嘉桐
 * 版    本：1.1.4
 * 创建日期：2017/9/8
 * 描    述：
 * =====================================
 */
public interface State {

    void start(SurfaceHolder holder, float screenProp);

    void stop();

    void foucs(float x, float y, CameraInterface.FocusCallback callback);

    void swtich(SurfaceHolder holder, float screenProp);

    void restart();

    void capture();

    void record(Surface surface, float screenProp);

    void stopRecord(boolean isShort, long time);

    void cancle(SurfaceHolder holder, float screenProp);

    void confirm();

    void zoom(float zoom, int type);

    void flash(String mode);

    /**
     * 是否有前置摄像头
     * @return
     */
    boolean hasFrontCamera();

    /**
     * 是否有后置摄像头
     * @return
     */
    boolean hasBackCamera();

    /**
     * 是否有前置闪光灯
     * 这个方法必须在打开相机后才能开始调用
     * @return
     */
    boolean hasFrontFlash();

    /**
     * 是否有后置闪光灯
     * 这个方法必须在打开相机后才能开始调用
     * @return
     */
    boolean hasBackFlash();


    /**
     * 当前是否打开了后置摄像头
     * @return
     */
    boolean isBackCameraOpen();


    /**
     * 当前是否打开了前置摄像头
     * @return
     */
    boolean isFrontCameraOpen();
}
