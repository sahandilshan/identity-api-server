/*
 * Copyright (c) 2024, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.api.server.application.management.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.identity.api.server.application.management.v1.SharedApplicationResponse;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class SharedApplicationsResponse  {
  
    private List<SharedApplicationResponse> sharedApplications = null;


    /**
    **/
    public SharedApplicationsResponse sharedApplications(List<SharedApplicationResponse> sharedApplications) {

        this.sharedApplications = sharedApplications;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("sharedApplications")
    @Valid
    public List<SharedApplicationResponse> getSharedApplications() {
        return sharedApplications;
    }
    public void setSharedApplications(List<SharedApplicationResponse> sharedApplications) {
        this.sharedApplications = sharedApplications;
    }

    public SharedApplicationsResponse addSharedApplicationsItem(SharedApplicationResponse sharedApplicationsItem) {
        if (this.sharedApplications == null) {
            this.sharedApplications = new ArrayList<>();
        }
        this.sharedApplications.add(sharedApplicationsItem);
        return this;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SharedApplicationsResponse sharedApplicationsResponse = (SharedApplicationsResponse) o;
        return Objects.equals(this.sharedApplications, sharedApplicationsResponse.sharedApplications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sharedApplications);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class SharedApplicationsResponse {\n");
        
        sb.append("    sharedApplications: ").append(toIndentedString(sharedApplications)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n");
    }
}

