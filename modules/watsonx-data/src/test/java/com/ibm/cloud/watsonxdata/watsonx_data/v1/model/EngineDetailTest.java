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

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.EngineDetail;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.NodeDescription;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EngineDetail model.
 */
public class EngineDetailTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEngineDetail() throws Throwable {
    EngineDetail engineDetailModel = new EngineDetail();
    assertNull(engineDetailModel.getGroupId());
    assertNull(engineDetailModel.getRegion());
    assertNull(engineDetailModel.getSizeConfig());
    assertNull(engineDetailModel.getCreatedOn());
    assertNull(engineDetailModel.getEngineDisplayName());
    assertNull(engineDetailModel.getOrigin());
    assertNull(engineDetailModel.getPort());
    assertNull(engineDetailModel.getType());
    assertNull(engineDetailModel.getVersion());
    assertNull(engineDetailModel.getWorker());
    assertNull(engineDetailModel.getActions());
    assertNull(engineDetailModel.getAssociatedCatalogs());
    assertNull(engineDetailModel.getStatus());
    assertNull(engineDetailModel.getTags());
    assertNull(engineDetailModel.getCoordinator());
    assertNull(engineDetailModel.getCreatedBy());
    assertNull(engineDetailModel.getHostName());
    assertNull(engineDetailModel.getStatusCode());
    assertNull(engineDetailModel.getDescription());
    assertNull(engineDetailModel.getEngineId());
  }
}