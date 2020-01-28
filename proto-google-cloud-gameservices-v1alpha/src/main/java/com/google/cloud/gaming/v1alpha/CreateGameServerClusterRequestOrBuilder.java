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
// source: google/cloud/gaming/v1alpha/game_server_clusters.proto

package com.google.cloud.gaming.v1alpha;

public interface CreateGameServerClusterRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1alpha.CreateGameServerClusterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource name, using the form:
   * `projects/{project}/locations/{location}/realms/{realm-id}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource name, using the form:
   * `projects/{project}/locations/{location}/realms/{realm-id}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The ID of the game server cluster resource to be created.
   * </pre>
   *
   * <code>string game_server_cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The gameServerClusterId.
   */
  java.lang.String getGameServerClusterId();
  /**
   *
   *
   * <pre>
   * Required. The ID of the game server cluster resource to be created.
   * </pre>
   *
   * <code>string game_server_cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for gameServerClusterId.
   */
  com.google.protobuf.ByteString getGameServerClusterIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The game server cluster resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.gaming.v1alpha.GameServerCluster game_server_cluster = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the gameServerCluster field is set.
   */
  boolean hasGameServerCluster();
  /**
   *
   *
   * <pre>
   * Required. The game server cluster resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.gaming.v1alpha.GameServerCluster game_server_cluster = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The gameServerCluster.
   */
  com.google.cloud.gaming.v1alpha.GameServerCluster getGameServerCluster();
  /**
   *
   *
   * <pre>
   * Required. The game server cluster resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.gaming.v1alpha.GameServerCluster game_server_cluster = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gaming.v1alpha.GameServerClusterOrBuilder getGameServerClusterOrBuilder();
}
