/*
 * (C) Copyright IBM Corp. 2023.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.watsonxdata.watsonx_data.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getTableSnapshots options.
 */
public class GetTableSnapshotsOptions extends GenericModel {

  protected String engineId;
  protected String catalogName;
  protected String schemaName;
  protected String tableName;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private String catalogName;
    private String schemaName;
    private String tableName;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetTableSnapshotsOptions instance.
     *
     * @param getTableSnapshotsOptions the instance to initialize the Builder with
     */
    private Builder(GetTableSnapshotsOptions getTableSnapshotsOptions) {
      this.engineId = getTableSnapshotsOptions.engineId;
      this.catalogName = getTableSnapshotsOptions.catalogName;
      this.schemaName = getTableSnapshotsOptions.schemaName;
      this.tableName = getTableSnapshotsOptions.tableName;
      this.authInstanceId = getTableSnapshotsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param engineId the engineId
     * @param catalogName the catalogName
     * @param schemaName the schemaName
     * @param tableName the tableName
     */
    public Builder(String engineId, String catalogName, String schemaName, String tableName) {
      this.engineId = engineId;
      this.catalogName = catalogName;
      this.schemaName = schemaName;
      this.tableName = tableName;
    }

    /**
     * Builds a GetTableSnapshotsOptions.
     *
     * @return the new GetTableSnapshotsOptions instance
     */
    public GetTableSnapshotsOptions build() {
      return new GetTableSnapshotsOptions(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the GetTableSnapshotsOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the GetTableSnapshotsOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the schemaName.
     *
     * @param schemaName the schemaName
     * @return the GetTableSnapshotsOptions builder
     */
    public Builder schemaName(String schemaName) {
      this.schemaName = schemaName;
      return this;
    }

    /**
     * Set the tableName.
     *
     * @param tableName the tableName
     * @return the GetTableSnapshotsOptions builder
     */
    public Builder tableName(String tableName) {
      this.tableName = tableName;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetTableSnapshotsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetTableSnapshotsOptions() { }

  protected GetTableSnapshotsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineId,
      "engineId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogName,
      "catalogName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.schemaName,
      "schemaName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tableName,
      "tableName cannot be null");
    engineId = builder.engineId;
    catalogName = builder.catalogName;
    schemaName = builder.schemaName;
    tableName = builder.tableName;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetTableSnapshotsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the engineId.
   *
   * Engine name.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }

  /**
   * Gets the catalogName.
   *
   * Catalog name.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
  }

  /**
   * Gets the schemaName.
   *
   * Schema name.
   *
   * @return the schemaName
   */
  public String schemaName() {
    return schemaName;
  }

  /**
   * Gets the tableName.
   *
   * Table name.
   *
   * @return the tableName
   */
  public String tableName() {
    return tableName;
  }

  /**
   * Gets the authInstanceId.
   *
   * Instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

