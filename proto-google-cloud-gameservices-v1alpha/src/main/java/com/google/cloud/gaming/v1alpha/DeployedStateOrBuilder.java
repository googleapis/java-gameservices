/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1alpha/common.proto

package com.google.cloud.gaming.v1alpha;

@java.lang.Deprecated
public interface DeployedStateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1alpha.DeployedState)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Details about fleets.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1alpha.FleetDetails fleets = 1;</code>
   */
  java.util.List<com.google.cloud.gaming.v1alpha.FleetDetails> getFleetsList();
  /**
   *
   *
   * <pre>
   * Details about fleets.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1alpha.FleetDetails fleets = 1;</code>
   */
  com.google.cloud.gaming.v1alpha.FleetDetails getFleets(int index);
  /**
   *
   *
   * <pre>
   * Details about fleets.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1alpha.FleetDetails fleets = 1;</code>
   */
  int getFleetsCount();
  /**
   *
   *
   * <pre>
   * Details about fleets.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1alpha.FleetDetails fleets = 1;</code>
   */
  java.util.List<? extends com.google.cloud.gaming.v1alpha.FleetDetailsOrBuilder>
      getFleetsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Details about fleets.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1alpha.FleetDetails fleets = 1;</code>
   */
  com.google.cloud.gaming.v1alpha.FleetDetailsOrBuilder getFleetsOrBuilder(int index);
}
