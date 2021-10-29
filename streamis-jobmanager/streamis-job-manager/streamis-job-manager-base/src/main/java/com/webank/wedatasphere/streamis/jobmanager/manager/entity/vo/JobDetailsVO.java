package com.webank.wedatasphere.streamis.jobmanager.manager.entity.vo;

import java.util.List;

public class JobDetailsVO {

    private List<RealTimeTrafficDTO> realTimeTraffic;
    private List<DataNumberDTO> dataNumber;
    private List<LoadConditionDTO> loadCondition;

    public List<RealTimeTrafficDTO> getRealTimeTraffic() {
        return realTimeTraffic;
    }

    public void setRealTimeTraffic(List<RealTimeTrafficDTO> realTimeTraffic) {
        this.realTimeTraffic = realTimeTraffic;
    }

    public List<DataNumberDTO> getDataNumber() {
        return dataNumber;
    }

    public void setDataNumber(List<DataNumberDTO> dataNumber) {
        this.dataNumber = dataNumber;
    }

    public List<LoadConditionDTO> getLoadCondition() {
        return loadCondition;
    }

    public void setLoadCondition(List<LoadConditionDTO> loadCondition) {
        this.loadCondition = loadCondition;
    }

    public static class RealTimeTrafficDTO{
        private String sourceKey;
        private String sourceSpeed;
        private String transformKey;
        private String transformSpeed;
        private String sinkKey;
        private String sinkSpeed;

        public String getSourceKey() {
            return sourceKey;
        }

        public void setSourceKey(String sourceKey) {
            this.sourceKey = sourceKey;
        }

        public String getSourceSpeed() {
            return sourceSpeed;
        }

        public void setSourceSpeed(String sourceSpeed) {
            this.sourceSpeed = sourceSpeed;
        }

        public String getTransformKey() {
            return transformKey;
        }

        public void setTransformKey(String transformKey) {
            this.transformKey = transformKey;
        }

        public String getTransformSpeed() {
            return transformSpeed;
        }

        public void setTransformSpeed(String transformSpeed) {
            this.transformSpeed = transformSpeed;
        }

        public String getSinkKey() {
            return sinkKey;
        }

        public void setSinkKey(String sinkKey) {
            this.sinkKey = sinkKey;
        }

        public String getSinkSpeed() {
            return sinkSpeed;
        }

        public void setSinkSpeed(String sinkSpeed) {
            this.sinkSpeed = sinkSpeed;
        }
    }

    public static class DataNumberDTO{
        private String dataName;
        private Integer dataNumber;

        public String getDataName() {
            return dataName;
        }

        public void setDataName(String dataName) {
            this.dataName = dataName;
        }

        public Integer getDataNumber() {
            return dataNumber;
        }

        public void setDataNumber(Integer dataNumber) {
            this.dataNumber = dataNumber;
        }
    }

    public static class LoadConditionDTO{
        private String type;
        private String host;
        private String memory;
        private String totalMemory;
        private String gcTotalTime;
        private String gcLastTime;
        private String gcLastConsume;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }


        public String getGcTotalTime() {
            return gcTotalTime;
        }

        public void setGcTotalTime(String gcTotalTime) {
            this.gcTotalTime = gcTotalTime;
        }

        public String getGcLastTime() {
            return gcLastTime;
        }

        public void setGcLastTime(String gcLastTime) {
            this.gcLastTime = gcLastTime;
        }

        public String getGcLastConsume() {
            return gcLastConsume;
        }

        public void setGcLastConsume(String gcLastConsume) {
            this.gcLastConsume = gcLastConsume;
        }

        public String getMemory() {
            return memory;
        }

        public void setMemory(String memory) {
            this.memory = memory;
        }

        public String getTotalMemory() {
            return totalMemory;
        }

        public void setTotalMemory(String totalMemory) {
            this.totalMemory = totalMemory;
        }
    }
}