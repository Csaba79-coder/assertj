/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2022 the original author or authors.
 */
package org.assertj.core.api.uri;

import static org.mockito.Mockito.verify;

import org.assertj.core.api.UriAssert;
import org.assertj.core.api.UriAssertBaseTest;

/**
 * Test for <code>{@link org.assertj.core.api.UriAssert#hasPath(String)}</code>.
 */
class UriAssert_hasPath_Test extends UriAssertBaseTest {
  private String expected = "/pages/";

  @Override
  protected UriAssert invoke_api_method() {
    return assertions.hasPath(expected);
  }

  @Override
  protected void verify_internal_effects() {
    verify(uris).assertHasPath(getInfo(assertions), getActual(assertions), expected);
  }
}