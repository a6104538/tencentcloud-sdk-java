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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMysqlInstanceRequest extends AbstractModel{

    /**
    * 环境名称
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 实例别名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 实例内存大小，单位：MB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例硬盘大小，单位：GB
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * MySQL 版本，值包括：5.7
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
     * Get 环境名称 
     * @return EnvId 环境名称
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境名称
     * @param EnvId 环境名称
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 实例别名 
     * @return Alias 实例别名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 实例别名
     * @param Alias 实例别名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 实例内存大小，单位：MB 
     * @return Memory 实例内存大小，单位：MB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存大小，单位：MB
     * @param Memory 实例内存大小，单位：MB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例硬盘大小，单位：GB 
     * @return Volume 实例硬盘大小，单位：GB
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set 实例硬盘大小，单位：GB
     * @param Volume 实例硬盘大小，单位：GB
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get MySQL 版本，值包括：5.7 
     * @return EngineVersion MySQL 版本，值包括：5.7
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set MySQL 版本，值包括：5.7
     * @param EngineVersion MySQL 版本，值包括：5.7
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);

    }
}

