package com.webank.wedatasphere.streamis.project.server.entity.request;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * created by yangzhiyue on 2021/4/23
 * Description:
 */
@XmlRootElement
public class DeleteProjectRequest {

    /**
     * streamis工程是全局唯一的
     */
    @NotNull(message = "streamis projetName can not null")
    private String projectName;


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}