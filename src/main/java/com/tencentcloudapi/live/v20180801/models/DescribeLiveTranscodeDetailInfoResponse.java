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

public class DescribeLiveTranscodeDetailInfoResponse extends AbstractModel{

    /**
    * 统计数据列表。
    */
    @SerializedName("DataInfoList")
    @Expose
    private TranscodeDetailInfo [] DataInfoList;

    /**
    * 页码。
    */
    @SerializedName("PageNum")
    @Expose
    private Integer PageNum;

    /**
    * 每页个数。
    */
    @SerializedName("PageSize")
    @Expose
    private Integer PageSize;

    /**
    * 总个数。
    */
    @SerializedName("TotalNum")
    @Expose
    private Integer TotalNum;

    /**
    * 总页数。
    */
    @SerializedName("TotalPage")
    @Expose
    private Integer TotalPage;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 统计数据列表。 
     * @return DataInfoList 统计数据列表。
     */
    public TranscodeDetailInfo [] getDataInfoList() {
        return this.DataInfoList;
    }

    /**
     * Set 统计数据列表。
     * @param DataInfoList 统计数据列表。
     */
    public void setDataInfoList(TranscodeDetailInfo [] DataInfoList) {
        this.DataInfoList = DataInfoList;
    }

    /**
     * Get 页码。 
     * @return PageNum 页码。
     */
    public Integer getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 页码。
     * @param PageNum 页码。
     */
    public void setPageNum(Integer PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 每页个数。 
     * @return PageSize 每页个数。
     */
    public Integer getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页个数。
     * @param PageSize 每页个数。
     */
    public void setPageSize(Integer PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 总个数。 
     * @return TotalNum 总个数。
     */
    public Integer getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 总个数。
     * @param TotalNum 总个数。
     */
    public void setTotalNum(Integer TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 总页数。 
     * @return TotalPage 总页数。
     */
    public Integer getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set 总页数。
     * @param TotalPage 总页数。
     */
    public void setTotalPage(Integer TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DataInfoList.", this.DataInfoList);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

