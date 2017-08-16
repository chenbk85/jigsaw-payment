// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entity.proto

package org.jigsaw.payment.model;

public interface AccountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Account)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 账户ID，非主键，生成规则：标示(1)+type(2)+id(12)+sum(1) primary key
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * 账户ID，非主键，生成规则：标示(1)+type(2)+id(12)+sum(1) primary key
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * 账户ID，非主键，生成规则：标示(1)+type(2)+id(12)+sum(1) primary key
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * 用户ID
   * </pre>
   *
   * <code>optional int64 user_id = 2;</code>
   */
  boolean hasUserId();
  /**
   * <pre>
   * 用户ID
   * </pre>
   *
   * <code>optional int64 user_id = 2;</code>
   */
  long getUserId();

  /**
   * <pre>
   * 账户类型：1：奇豆；2：奇点；3：零钱。同一用户同一类型只允许开一个账户
   * </pre>
   *
   * <code>optional .Account.Type type = 3;</code>
   */
  boolean hasType();
  /**
   * <pre>
   * 账户类型：1：奇豆；2：奇点；3：零钱。同一用户同一类型只允许开一个账户
   * </pre>
   *
   * <code>optional .Account.Type type = 3;</code>
   */
  org.jigsaw.payment.model.Account.Type getType();

  /**
   * <pre>
   * 货币类型 1、人民币 2、奇豆  3、积分 4、代金券 5、美元 6、台币
   * </pre>
   *
   * <code>optional .FeeUnit fee_unit = 4;</code>
   */
  boolean hasFeeUnit();
  /**
   * <pre>
   * 货币类型 1、人民币 2、奇豆  3、积分 4、代金券 5、美元 6、台币
   * </pre>
   *
   * <code>optional .FeeUnit fee_unit = 4;</code>
   */
  org.jigsaw.payment.model.FeeUnit getFeeUnit();

  /**
   * <pre>
   * 余额
   * </pre>
   *
   * <code>optional int64 balance = 5;</code>
   */
  boolean hasBalance();
  /**
   * <pre>
   * 余额
   * </pre>
   *
   * <code>optional int64 balance = 5;</code>
   */
  long getBalance();

  /**
   * <pre>
   * 冻结金额
   * </pre>
   *
   * <code>optional int64 frozen = 6;</code>
   */
  boolean hasFrozen();
  /**
   * <pre>
   * 冻结金额
   * </pre>
   *
   * <code>optional int64 frozen = 6;</code>
   */
  long getFrozen();

  /**
   * <pre>
   * 入账总额
   * </pre>
   *
   * <code>optional int64 income = 7;</code>
   */
  boolean hasIncome();
  /**
   * <pre>
   * 入账总额
   * </pre>
   *
   * <code>optional int64 income = 7;</code>
   */
  long getIncome();

  /**
   * <pre>
   * 出账总额
   * </pre>
   *
   * <code>optional int64 outcome = 8;</code>
   */
  boolean hasOutcome();
  /**
   * <pre>
   * 出账总额
   * </pre>
   *
   * <code>optional int64 outcome = 8;</code>
   */
  long getOutcome();

  /**
   * <pre>
   * 状态：0：创建；1、激活；2：冻结；3：销毁
   * </pre>
   *
   * <code>optional .Account.Status status = 9;</code>
   */
  boolean hasStatus();
  /**
   * <pre>
   * 状态：0：创建；1、激活；2：冻结；3：销毁
   * </pre>
   *
   * <code>optional .Account.Status status = 9;</code>
   */
  org.jigsaw.payment.model.Account.Status getStatus();

  /**
   * <pre>
   * 账户等级
   * </pre>
   *
   * <code>optional int32 rank = 10;</code>
   */
  boolean hasRank();
  /**
   * <pre>
   * 账户等级
   * </pre>
   *
   * <code>optional int32 rank = 10;</code>
   */
  int getRank();

  /**
   * <pre>
   * 通知方式：mobile(1)+email(1)
   * </pre>
   *
   * <code>optional int32 notice = 11;</code>
   */
  boolean hasNotice();
  /**
   * <pre>
   * 通知方式：mobile(1)+email(1)
   * </pre>
   *
   * <code>optional int32 notice = 11;</code>
   */
  int getNotice();

  /**
   * <pre>
   * 账户属性，可以bit位扩展
   * </pre>
   *
   * <code>optional int64 attr = 12;</code>
   */
  boolean hasAttr();
  /**
   * <pre>
   * 账户属性，可以bit位扩展
   * </pre>
   *
   * <code>optional int64 attr = 12;</code>
   */
  long getAttr();

  /**
   * <pre>
   * 安全等级
   * </pre>
   *
   * <code>optional int32 security_level = 13;</code>
   */
  boolean hasSecurityLevel();
  /**
   * <pre>
   * 安全等级
   * </pre>
   *
   * <code>optional int32 security_level = 13;</code>
   */
  int getSecurityLevel();

  /**
   * <pre>
   * 沙盒账户：0：否；1：是
   * </pre>
   *
   * <code>optional .Account.Sandbox sandbox = 14;</code>
   */
  boolean hasSandbox();
  /**
   * <pre>
   * 沙盒账户：0：否；1：是
   * </pre>
   *
   * <code>optional .Account.Sandbox sandbox = 14;</code>
   */
  org.jigsaw.payment.model.Account.Sandbox getSandbox();

  /**
   * <pre>
   * 数据摘要，即版本，MD5(ID+BALANCE+FROZEN+STATUS+RANK+ATTR+SECURITY_LEVEL)
   * </pre>
   *
   * <code>optional string version = 15;</code>
   */
  boolean hasVersion();
  /**
   * <pre>
   * 数据摘要，即版本，MD5(ID+BALANCE+FROZEN+STATUS+RANK+ATTR+SECURITY_LEVEL)
   * </pre>
   *
   * <code>optional string version = 15;</code>
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * 数据摘要，即版本，MD5(ID+BALANCE+FROZEN+STATUS+RANK+ATTR+SECURITY_LEVEL)
   * </pre>
   *
   * <code>optional string version = 15;</code>
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * 创建时间
   * </pre>
   *
   * <code>optional int64 create_time = 16 [(.column_option) = { ... }</code>
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * 创建时间
   * </pre>
   *
   * <code>optional int64 create_time = 16 [(.column_option) = { ... }</code>
   */
  long getCreateTime();

  /**
   * <pre>
   * 更新时间
   * </pre>
   *
   * <code>optional int64 update_time = 17 [(.column_option) = { ... }</code>
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * 更新时间
   * </pre>
   *
   * <code>optional int64 update_time = 17 [(.column_option) = { ... }</code>
   */
  long getUpdateTime();

  /**
   * <pre>
   *第三方渠道ID，pay_partner表维护
   * </pre>
   *
   * <code>optional int32 third_type = 18;</code>
   */
  boolean hasThirdType();
  /**
   * <pre>
   *第三方渠道ID，pay_partner表维护
   * </pre>
   *
   * <code>optional int32 third_type = 18;</code>
   */
  int getThirdType();

  /**
   * <pre>
   * 第三方的用户账户
   * </pre>
   *
   * <code>optional string third_account = 19;</code>
   */
  boolean hasThirdAccount();
  /**
   * <pre>
   * 第三方的用户账户
   * </pre>
   *
   * <code>optional string third_account = 19;</code>
   */
  java.lang.String getThirdAccount();
  /**
   * <pre>
   * 第三方的用户账户
   * </pre>
   *
   * <code>optional string third_account = 19;</code>
   */
  com.google.protobuf.ByteString
      getThirdAccountBytes();

  /**
   * <pre>
   * 第三方凭证信息，通用字段，每个渠道区别维护
   * </pre>
   *
   * <code>optional string trird_param = 20;</code>
   */
  boolean hasTrirdParam();
  /**
   * <pre>
   * 第三方凭证信息，通用字段，每个渠道区别维护
   * </pre>
   *
   * <code>optional string trird_param = 20;</code>
   */
  java.lang.String getTrirdParam();
  /**
   * <pre>
   * 第三方凭证信息，通用字段，每个渠道区别维护
   * </pre>
   *
   * <code>optional string trird_param = 20;</code>
   */
  com.google.protobuf.ByteString
      getTrirdParamBytes();
}
