/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PushDataInfo extends AbstractModel{

    /**
    * 流名称。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 推流路径。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 推流客户端ip。
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * 接流服务器ip。
    */
    @SerializedName("ServerIp")
    @Expose
    private String ServerIp;

    /**
    * 推流视频帧率，单位是Hz。
    */
    @SerializedName("VideoFps")
    @Expose
    private Integer VideoFps;

    /**
    * 推流视频码率，单位是bps。
    */
    @SerializedName("VideoSpeed")
    @Expose
    private Integer VideoSpeed;

    /**
    * 推流音频帧率，单位是Hz。
    */
    @SerializedName("AudioFps")
    @Expose
    private Integer AudioFps;

    /**
    * 推流音频码率，单位是bps。
    */
    @SerializedName("AudioSpeed")
    @Expose
    private Integer AudioSpeed;

    /**
    * 推流域名。
    */
    @SerializedName("PushDomain")
    @Expose
    private String PushDomain;

    /**
    * 推流开始时间。
    */
    @SerializedName("BeginPushTime")
    @Expose
    private String BeginPushTime;

    /**
    * 音频编码格式，
例："AAC"。
    */
    @SerializedName("Acodec")
    @Expose
    private String Acodec;

    /**
    * 视频编码格式，
例："H264"。
    */
    @SerializedName("Vcodec")
    @Expose
    private String Vcodec;

    /**
    * 分辨率。
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * 采样率。
    */
    @SerializedName("AsampleRate")
    @Expose
    private Integer AsampleRate;

    /**
     * Get 流名称。 
     * @return StreamName 流名称。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set 流名称。
     * @param StreamName 流名称。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get 推流路径。 
     * @return AppName 推流路径。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 推流路径。
     * @param AppName 推流路径。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 推流客户端ip。 
     * @return ClientIp 推流客户端ip。
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set 推流客户端ip。
     * @param ClientIp 推流客户端ip。
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get 接流服务器ip。 
     * @return ServerIp 接流服务器ip。
     */
    public String getServerIp() {
        return this.ServerIp;
    }

    /**
     * Set 接流服务器ip。
     * @param ServerIp 接流服务器ip。
     */
    public void setServerIp(String ServerIp) {
        this.ServerIp = ServerIp;
    }

    /**
     * Get 推流视频帧率，单位是Hz。 
     * @return VideoFps 推流视频帧率，单位是Hz。
     */
    public Integer getVideoFps() {
        return this.VideoFps;
    }

    /**
     * Set 推流视频帧率，单位是Hz。
     * @param VideoFps 推流视频帧率，单位是Hz。
     */
    public void setVideoFps(Integer VideoFps) {
        this.VideoFps = VideoFps;
    }

    /**
     * Get 推流视频码率，单位是bps。 
     * @return VideoSpeed 推流视频码率，单位是bps。
     */
    public Integer getVideoSpeed() {
        return this.VideoSpeed;
    }

    /**
     * Set 推流视频码率，单位是bps。
     * @param VideoSpeed 推流视频码率，单位是bps。
     */
    public void setVideoSpeed(Integer VideoSpeed) {
        this.VideoSpeed = VideoSpeed;
    }

    /**
     * Get 推流音频帧率，单位是Hz。 
     * @return AudioFps 推流音频帧率，单位是Hz。
     */
    public Integer getAudioFps() {
        return this.AudioFps;
    }

    /**
     * Set 推流音频帧率，单位是Hz。
     * @param AudioFps 推流音频帧率，单位是Hz。
     */
    public void setAudioFps(Integer AudioFps) {
        this.AudioFps = AudioFps;
    }

    /**
     * Get 推流音频码率，单位是bps。 
     * @return AudioSpeed 推流音频码率，单位是bps。
     */
    public Integer getAudioSpeed() {
        return this.AudioSpeed;
    }

    /**
     * Set 推流音频码率，单位是bps。
     * @param AudioSpeed 推流音频码率，单位是bps。
     */
    public void setAudioSpeed(Integer AudioSpeed) {
        this.AudioSpeed = AudioSpeed;
    }

    /**
     * Get 推流域名。 
     * @return PushDomain 推流域名。
     */
    public String getPushDomain() {
        return this.PushDomain;
    }

    /**
     * Set 推流域名。
     * @param PushDomain 推流域名。
     */
    public void setPushDomain(String PushDomain) {
        this.PushDomain = PushDomain;
    }

    /**
     * Get 推流开始时间。 
     * @return BeginPushTime 推流开始时间。
     */
    public String getBeginPushTime() {
        return this.BeginPushTime;
    }

    /**
     * Set 推流开始时间。
     * @param BeginPushTime 推流开始时间。
     */
    public void setBeginPushTime(String BeginPushTime) {
        this.BeginPushTime = BeginPushTime;
    }

    /**
     * Get 音频编码格式，
例："AAC"。 
     * @return Acodec 音频编码格式，
例："AAC"。
     */
    public String getAcodec() {
        return this.Acodec;
    }

    /**
     * Set 音频编码格式，
例："AAC"。
     * @param Acodec 音频编码格式，
例："AAC"。
     */
    public void setAcodec(String Acodec) {
        this.Acodec = Acodec;
    }

    /**
     * Get 视频编码格式，
例："H264"。 
     * @return Vcodec 视频编码格式，
例："H264"。
     */
    public String getVcodec() {
        return this.Vcodec;
    }

    /**
     * Set 视频编码格式，
例："H264"。
     * @param Vcodec 视频编码格式，
例："H264"。
     */
    public void setVcodec(String Vcodec) {
        this.Vcodec = Vcodec;
    }

    /**
     * Get 分辨率。 
     * @return Resolution 分辨率。
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 分辨率。
     * @param Resolution 分辨率。
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get 采样率。 
     * @return AsampleRate 采样率。
     */
    public Integer getAsampleRate() {
        return this.AsampleRate;
    }

    /**
     * Set 采样率。
     * @param AsampleRate 采样率。
     */
    public void setAsampleRate(Integer AsampleRate) {
        this.AsampleRate = AsampleRate;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "ServerIp", this.ServerIp);
        this.setParamSimple(map, prefix + "VideoFps", this.VideoFps);
        this.setParamSimple(map, prefix + "VideoSpeed", this.VideoSpeed);
        this.setParamSimple(map, prefix + "AudioFps", this.AudioFps);
        this.setParamSimple(map, prefix + "AudioSpeed", this.AudioSpeed);
        this.setParamSimple(map, prefix + "PushDomain", this.PushDomain);
        this.setParamSimple(map, prefix + "BeginPushTime", this.BeginPushTime);
        this.setParamSimple(map, prefix + "Acodec", this.Acodec);
        this.setParamSimple(map, prefix + "Vcodec", this.Vcodec);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "AsampleRate", this.AsampleRate);

    }
}

