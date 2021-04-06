package com.fuckcode.clcrm.core.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author dongyang.yu
 * @since 2018-08-17
 */
@ApiModel(value="SmsTemplate对象", description="")
public class SmsTemplate implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "模板编码")
    private String tplCode;

    @ApiModelProperty(value = "模板名称")
    private String tplName;

    @ApiModelProperty(value = "模板内容")
    private String tplContent;

    @ApiModelProperty(value = "短信签名")
    private String smsFreeSign;

    private LocalDateTime updateTime;

    private LocalDateTime createTime;

    private Integer status;

    @ApiModelProperty(value = "发送方式；多种不同的方式以英文逗号分隔,单词之间不得互相包含。可选的为[SMS,MY_MSG,APP_ONE_PUSH] 默认为SMS;MY_MSG为查询用户消息列表会显示该条消息;APP_ONE_PUSH表示会推送给某个指定的人")
    private String sendWay;

    @ApiModelProperty(value = "组织机构编码，8100重庆，8200深圳。 具体详见boss org表")
    private String orgCode;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTplCode() {
        return tplCode;
    }

    public void setTplCode(String tplCode) {
        this.tplCode = tplCode;
    }

    public String getTplName() {
        return tplName;
    }

    public void setTplName(String tplName) {
        this.tplName = tplName;
    }

    public String getTplContent() {
        return tplContent;
    }

    public void setTplContent(String tplContent) {
        this.tplContent = tplContent;
    }

    public String getSmsFreeSign() {
        return smsFreeSign;
    }

    public void setSmsFreeSign(String smsFreeSign) {
        this.smsFreeSign = smsFreeSign;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSendWay() {
        return sendWay;
    }

    public void setSendWay(String sendWay) {
        this.sendWay = sendWay;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    @Override
    public String toString() {
        return "SmsTemplate{" +
        ", id=" + id +
        ", tplCode=" + tplCode +
        ", tplName=" + tplName +
        ", tplContent=" + tplContent +
        ", smsFreeSign=" + smsFreeSign +
        ", updateTime=" + updateTime +
        ", createTime=" + createTime +
        ", status=" + status +
        ", sendWay=" + sendWay +
        ", orgCode=" + orgCode +
        "}";
    }
}
