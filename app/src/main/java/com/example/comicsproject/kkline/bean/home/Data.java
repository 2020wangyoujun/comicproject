/**
  * Copyright 2023 bejson.com 
  */
package com.example.comicsproject.kkline.bean.home;
import java.util.List;

/**
 * Auto-generated: 2023-01-25 21:40:55
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Data {

    private Ad_detail ad_detail;
    private Discovery_tab_extra_info discovery_tab_extra_info;
    private List<Info_list> info_list;
    private long server_time;
    private int since;
    public void setAd_detail(Ad_detail ad_detail) {
         this.ad_detail = ad_detail;
     }
     public Ad_detail getAd_detail() {
         return ad_detail;
     }

    public void setDiscovery_tab_extra_info(Discovery_tab_extra_info discovery_tab_extra_info) {
         this.discovery_tab_extra_info = discovery_tab_extra_info;
     }
     public Discovery_tab_extra_info getDiscovery_tab_extra_info() {
         return discovery_tab_extra_info;
     }

    public void setInfo_list(List<Info_list> info_list) {
         this.info_list = info_list;
     }
     public List<Info_list> getInfo_list() {
         return info_list;
     }

    public void setServer_time(long server_time) {
         this.server_time = server_time;
     }
     public long getServer_time() {
         return server_time;
     }

    public void setSince(int since) {
         this.since = since;
     }
     public int getSince() {
         return since;
     }

}