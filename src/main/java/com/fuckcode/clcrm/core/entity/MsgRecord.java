package com.fuckcode.clcrm.core.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 所有的消息发送记录（除开短信），由于该表随时有查询的需求，与短信记录不同，所以将除开短信以外的消息放到该表
 * </p>
 *
 * @author dongyang.yu
 * @since 2018-08-17
 */
@ApiModel(value="MsgRecord对象", description="所有的消息发送记录（除开短信），由于该表随时有查询的需求，与短信记录不同，所以将除开短信以外的消息放到该表")
public class MsgRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "信息所属人信息。 所有客户端为all，系统消息为system. 否则为某个用户的唯一ID")
    @TableField("uniqueId")
    private String uniqueId;

    @ApiModelProperty(value = "消息接收人手机")
    private String mobile;

    @ApiModelProperty(value = "消息模版编号")
    private String tplCode;

    @ApiModelProperty(value = "消息正文")
    private String messageBody;

    @ApiModelProperty(value = "发送短信所用签名")
    private String smsFreeSign;

    @ApiModelProperty(value = "消息类型。MY_MSG 我的消息， APP_PUSH推送到APP的消息")
    private String msgType;

    @ApiModelProperty(value = "推送状态(1:成功 0:失败，仅当msg_type未APP_PUSH时有效)")
    private String pushStatusCode;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "消息阅读状态。 0未读， 1已读")
    private String readStatus;

    @ApiModelProperty(value = "推送消息结果描述")
    private String pushStatusMsg;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTplCode() {
        return tplCode;
    }

    public void setTplCode(String tplCode) {
        this.tplCode = tplCode;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getSmsFreeSign() {
        return smsFreeSign;
    }

    public void setSmsFreeSign(String smsFreeSign) {
        this.smsFreeSign = smsFreeSign;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getPushStatusCode() {
        return pushStatusCode;
    }

    public void setPushStatusCode(String pushStatusCode) {
        this.pushStatusCode = pushStatusCode;
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

    public String getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(String readStatus) {
        this.readStatus = readStatus;
    }

    public String getPushStatusMsg() {
        return pushStatusMsg;
    }

    public void setPushStatusMsg(String pushStatusMsg) {
        this.pushStatusMsg = pushStatusMsg;
    }

    @Override
    public String toString() {
        return "MsgRecord{" +
        ", id=" + id +
        ", uniqueId=" + uniqueId +
        ", mobile=" + mobile +
        ", tplCode=" + tplCode +
        ", messageBody=" + messageBody +
        ", smsFreeSign=" + smsFreeSign +
        ", msgType=" + msgType +
        ", pushStatusCode=" + pushStatusCode +
        ", updateTime=" + updateTime +
        ", createTime=" + createTime +
        ", readStatus=" + readStatus +
        ", pushStatusMsg=" + pushStatusMsg +
        "}";
    }
}
