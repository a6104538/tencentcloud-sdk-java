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
package com.tencentcloudapi.soe.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KeywordEvaluateRequest extends AbstractModel{

    /**
    * 流式数据包的序号，从1开始，当IsEnd字段为1后后续序号无意义，当IsLongLifeSession不为1且为非流式模式时无意义。
    */
    @SerializedName("SeqId")
    @Expose
    private Integer SeqId;

    /**
    * 是否传输完毕标志，若为0表示未完毕，若为1则传输完毕开始评估，非流式模式下无意义。
    */
    @SerializedName("IsEnd")
    @Expose
    private Integer IsEnd;

    /**
    * 语音文件类型 	1: raw, 2: wav, 3: mp3, 4: speex (语言文件格式目前仅支持 16k 采样率 16bit 编码单声道，如有不一致可能导致评估不准确或失败)。
    */
    @SerializedName("VoiceFileType")
    @Expose
    private Integer VoiceFileType;

    /**
    * 语音编码类型	1:pcm。
    */
    @SerializedName("VoiceEncodeType")
    @Expose
    private Integer VoiceEncodeType;

    /**
    * 当前数据包数据, 流式模式下数据包大小可以按需设置，在网络良好的情况下，建议设置为0.5k，且必须保证分片帧完整（16bit的数据必须保证音频长度为偶数），编码格式要求为BASE64。
    */
    @SerializedName("UserVoiceData")
    @Expose
    private String UserVoiceData;

    /**
    * 语音段唯一标识，一个完整语音一个SessionId。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 关键词列表
    */
    @SerializedName("Keywords")
    @Expose
    private Keyword [] Keywords;

    /**
    * 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 SoeAppId 可以在[控制台](https://console.cloud.tencent.com/soe)【应用管理】下新建。
    */
    @SerializedName("SoeAppId")
    @Expose
    private String SoeAppId;

    /**
    * 查询标识，当该参数为1时，该请求为查询请求，请求返回该 Session 评估结果。
    */
    @SerializedName("IsQuery")
    @Expose
    private Integer IsQuery;

    /**
     * Get 流式数据包的序号，从1开始，当IsEnd字段为1后后续序号无意义，当IsLongLifeSession不为1且为非流式模式时无意义。 
     * @return SeqId 流式数据包的序号，从1开始，当IsEnd字段为1后后续序号无意义，当IsLongLifeSession不为1且为非流式模式时无意义。
     */
    public Integer getSeqId() {
        return this.SeqId;
    }

    /**
     * Set 流式数据包的序号，从1开始，当IsEnd字段为1后后续序号无意义，当IsLongLifeSession不为1且为非流式模式时无意义。
     * @param SeqId 流式数据包的序号，从1开始，当IsEnd字段为1后后续序号无意义，当IsLongLifeSession不为1且为非流式模式时无意义。
     */
    public void setSeqId(Integer SeqId) {
        this.SeqId = SeqId;
    }

    /**
     * Get 是否传输完毕标志，若为0表示未完毕，若为1则传输完毕开始评估，非流式模式下无意义。 
     * @return IsEnd 是否传输完毕标志，若为0表示未完毕，若为1则传输完毕开始评估，非流式模式下无意义。
     */
    public Integer getIsEnd() {
        return this.IsEnd;
    }

    /**
     * Set 是否传输完毕标志，若为0表示未完毕，若为1则传输完毕开始评估，非流式模式下无意义。
     * @param IsEnd 是否传输完毕标志，若为0表示未完毕，若为1则传输完毕开始评估，非流式模式下无意义。
     */
    public void setIsEnd(Integer IsEnd) {
        this.IsEnd = IsEnd;
    }

    /**
     * Get 语音文件类型 	1: raw, 2: wav, 3: mp3, 4: speex (语言文件格式目前仅支持 16k 采样率 16bit 编码单声道，如有不一致可能导致评估不准确或失败)。 
     * @return VoiceFileType 语音文件类型 	1: raw, 2: wav, 3: mp3, 4: speex (语言文件格式目前仅支持 16k 采样率 16bit 编码单声道，如有不一致可能导致评估不准确或失败)。
     */
    public Integer getVoiceFileType() {
        return this.VoiceFileType;
    }

    /**
     * Set 语音文件类型 	1: raw, 2: wav, 3: mp3, 4: speex (语言文件格式目前仅支持 16k 采样率 16bit 编码单声道，如有不一致可能导致评估不准确或失败)。
     * @param VoiceFileType 语音文件类型 	1: raw, 2: wav, 3: mp3, 4: speex (语言文件格式目前仅支持 16k 采样率 16bit 编码单声道，如有不一致可能导致评估不准确或失败)。
     */
    public void setVoiceFileType(Integer VoiceFileType) {
        this.VoiceFileType = VoiceFileType;
    }

    /**
     * Get 语音编码类型	1:pcm。 
     * @return VoiceEncodeType 语音编码类型	1:pcm。
     */
    public Integer getVoiceEncodeType() {
        return this.VoiceEncodeType;
    }

    /**
     * Set 语音编码类型	1:pcm。
     * @param VoiceEncodeType 语音编码类型	1:pcm。
     */
    public void setVoiceEncodeType(Integer VoiceEncodeType) {
        this.VoiceEncodeType = VoiceEncodeType;
    }

    /**
     * Get 当前数据包数据, 流式模式下数据包大小可以按需设置，在网络良好的情况下，建议设置为0.5k，且必须保证分片帧完整（16bit的数据必须保证音频长度为偶数），编码格式要求为BASE64。 
     * @return UserVoiceData 当前数据包数据, 流式模式下数据包大小可以按需设置，在网络良好的情况下，建议设置为0.5k，且必须保证分片帧完整（16bit的数据必须保证音频长度为偶数），编码格式要求为BASE64。
     */
    public String getUserVoiceData() {
        return this.UserVoiceData;
    }

    /**
     * Set 当前数据包数据, 流式模式下数据包大小可以按需设置，在网络良好的情况下，建议设置为0.5k，且必须保证分片帧完整（16bit的数据必须保证音频长度为偶数），编码格式要求为BASE64。
     * @param UserVoiceData 当前数据包数据, 流式模式下数据包大小可以按需设置，在网络良好的情况下，建议设置为0.5k，且必须保证分片帧完整（16bit的数据必须保证音频长度为偶数），编码格式要求为BASE64。
     */
    public void setUserVoiceData(String UserVoiceData) {
        this.UserVoiceData = UserVoiceData;
    }

    /**
     * Get 语音段唯一标识，一个完整语音一个SessionId。 
     * @return SessionId 语音段唯一标识，一个完整语音一个SessionId。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 语音段唯一标识，一个完整语音一个SessionId。
     * @param SessionId 语音段唯一标识，一个完整语音一个SessionId。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 关键词列表 
     * @return Keywords 关键词列表
     */
    public Keyword [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 关键词列表
     * @param Keywords 关键词列表
     */
    public void setKeywords(Keyword [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 SoeAppId 可以在[控制台](https://console.cloud.tencent.com/soe)【应用管理】下新建。 
     * @return SoeAppId 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 SoeAppId 可以在[控制台](https://console.cloud.tencent.com/soe)【应用管理】下新建。
     */
    public String getSoeAppId() {
        return this.SoeAppId;
    }

    /**
     * Set 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 SoeAppId 可以在[控制台](https://console.cloud.tencent.com/soe)【应用管理】下新建。
     * @param SoeAppId 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 SoeAppId 可以在[控制台](https://console.cloud.tencent.com/soe)【应用管理】下新建。
     */
    public void setSoeAppId(String SoeAppId) {
        this.SoeAppId = SoeAppId;
    }

    /**
     * Get 查询标识，当该参数为1时，该请求为查询请求，请求返回该 Session 评估结果。 
     * @return IsQuery 查询标识，当该参数为1时，该请求为查询请求，请求返回该 Session 评估结果。
     */
    public Integer getIsQuery() {
        return this.IsQuery;
    }

    /**
     * Set 查询标识，当该参数为1时，该请求为查询请求，请求返回该 Session 评估结果。
     * @param IsQuery 查询标识，当该参数为1时，该请求为查询请求，请求返回该 Session 评估结果。
     */
    public void setIsQuery(Integer IsQuery) {
        this.IsQuery = IsQuery;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SeqId", this.SeqId);
        this.setParamSimple(map, prefix + "IsEnd", this.IsEnd);
        this.setParamSimple(map, prefix + "VoiceFileType", this.VoiceFileType);
        this.setParamSimple(map, prefix + "VoiceEncodeType", this.VoiceEncodeType);
        this.setParamSimple(map, prefix + "UserVoiceData", this.UserVoiceData);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamArrayObj(map, prefix + "Keywords.", this.Keywords);
        this.setParamSimple(map, prefix + "SoeAppId", this.SoeAppId);
        this.setParamSimple(map, prefix + "IsQuery", this.IsQuery);

    }
}

