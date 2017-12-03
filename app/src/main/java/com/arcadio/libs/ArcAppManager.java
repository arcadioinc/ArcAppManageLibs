
package com.arcadio.libs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ArcAppManager {

    @SerializedName("app_detail")
    @Expose
    private AppDetail appDetail;

    public AppDetail getAppDetail() {
        return appDetail;
    }

    public void setAppDetail(AppDetail appDetail) {
        this.appDetail = appDetail;
    }

}
