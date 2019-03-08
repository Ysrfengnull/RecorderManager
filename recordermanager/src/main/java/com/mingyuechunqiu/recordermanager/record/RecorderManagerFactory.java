package com.mingyuechunqiu.recordermanager.record;

import com.mingyuechunqiu.recordermanager.interpect.RecorderManagerIntercept;

/**
 * <pre>
 *     author : xyj
 *     Github : https://github.com/MingYueChunQiu
 *     e-mail : xiyujieit@163.com
 *     time   : 2019/2/21
 *     desc   : 录制管理工厂类
 *     version: 1.0
 * </pre>
 */
public class RecorderManagerFactory {

    /**
     * 创建录制管理类实例（使用默认录制类）
     *
     * @return 返回录制管理类实例
     */
    public static RecorderManagerable newInstance() {
        return newInstance(new RecorderHelper());
    }

    /**
     * 创建录制管理类实例（使用默认录制类）
     *
     * @param intercept 录制管理器拦截器
     * @return 返回录制管理类实例
     */
    public static RecorderManagerable newInstance(RecorderManagerIntercept intercept) {
        return newInstance(new RecorderHelper(), intercept);
    }

    /**
     * 创建录制管理类实例
     *
     * @param recorderable 实际录制类
     * @return 返回录制管理类实例
     */
    public static RecorderManagerable newInstance(Recorderable recorderable) {
        return newInstance(recorderable, null);
    }

    /**
     * 创建录制管理类实例
     *
     * @param recorderable 实际录制类
     * @param intercept    录制管理器拦截器
     * @return 返回录制管理类实例
     */
    public static RecorderManagerable newInstance(Recorderable recorderable, RecorderManagerIntercept intercept) {
        return new RecorderManager(recorderable, intercept);
    }
}
