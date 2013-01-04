/*
  Copyright (C) 2012-2013 the original author or authors.

  See the LICENSE.txt file distributed with this work for additional
  information regarding copyright ownership.

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
*/

package jcommon.init;

import jcommon.extract.IResourceCallback;
import jcommon.extract.IResourceFilter;
import jcommon.extract.IResourceProgressListener;
import jcommon.extract.Registry;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * Utilities for accessing various system attributes and configuration.
 *
 * @author David Hoyt <dhoyt@hoytsoft.org>
 */
public final class Sys extends jcommon.core.Sys {
  //<editor-fold defaultstate="collapsed" desc="Getters">
  public static boolean isRegistryInitialized() {
    return Registry.isInitialized();
  }
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Public Static Methods">
  public static boolean initializeRegistry() {
    try {
      return Loader.initializeRegistryReferences();
    } catch(Throwable t) {
      throw new RuntimeException(t);
    }
  }

  public static boolean initializeRegistry(final IRegistryReferenceInitializeListener Listener) {
    try {
      return Loader.initializeRegistryReferences(Listener);
    } catch(Throwable t) {
      throw new RuntimeException(t);
    }
  }

  public static boolean initializeSystem() {
    try {
      return Loader.initializeSystemLoaders();
    } catch(Throwable t) {
      throw new RuntimeException(t);
    }
  }

  public static boolean initializeSystem(final ISystemLoaderInitializeListener Listener) {
    try {
      return Loader.initializeSystemLoaders(Listener);
    } catch(Throwable t) {
      throw new RuntimeException(t);
    }
  }

  public static boolean initialize() {
    try {
      return Loader.initialize();
    } catch(Throwable t) {
      throw new RuntimeException(t);
    }
  }

  public static boolean initialize(final IInitializeListener Listener) {
    try {
      return Loader.initialize(Listener);
    } catch(Throwable t) {
      throw new RuntimeException(t);
    }
  }

  public static boolean initialize(final boolean cleanRegistryAfterInitialization) {
    try {
      return Loader.initialize(cleanRegistryAfterInitialization);
    } catch(Throwable t) {
      throw new RuntimeException(t);
    }
  }

  public static boolean initialize(final boolean cleanRegistryAfterInitialization, final IInitializeListener Listener) {
    try {
      return Loader.initialize(cleanRegistryAfterInitialization, Listener);
    } catch(Throwable t) {
      throw new RuntimeException(t);
    }
  }

  public static boolean cleanRegistry() {
    return Registry.clear();
  }

  public static Future loadNativeResourcesAsync(final String registryReferenceName) {
    return Registry.loadResources(registryReferenceName);
  }

  public static Future loadNativeResourcesAsync(final String registryReferenceName, final IResourceCallback callback) {
    return Registry.loadResources(registryReferenceName, callback);
  }

  public static Future loadNativeResourcesAsync(final String registryReferenceName, final IResourceProgressListener progress, final IResourceCallback callback) {
    return Registry.loadResources(registryReferenceName, progress, callback);
  }

  public static Future loadNativeResourcesAsync(final String registryReferenceName, final IResourceFilter filter, final IResourceProgressListener progress, final IResourceCallback callback) {
    return Registry.loadResources(registryReferenceName, filter, progress, callback);
  }

  public static Future loadNativeResourcesAsync(final String registryReferenceName, final ExecutorService executor, final IResourceFilter filter, final IResourceProgressListener progress, final IResourceCallback callback) {
    return Registry.loadResources(registryReferenceName, executor, filter, progress, callback);
  }

  public static boolean loadNativeResources(final String registryReferenceName) {
    return loadResourcesAndWaitHelper(loadNativeResourcesAsync(registryReferenceName));
  }

  public static boolean loadNativeResources(final String registryReferenceName, final IResourceCallback callback) {
    return loadResourcesAndWaitHelper(loadNativeResourcesAsync(registryReferenceName, callback));
  }

  public static boolean loadNativeResources(final String registryReferenceName, final IResourceProgressListener progress, final IResourceCallback callback) {
    return loadResourcesAndWaitHelper(loadNativeResourcesAsync(registryReferenceName, progress, callback));
  }

  public static boolean loadNativeResources(final String registryReferenceName, final IResourceFilter filter, final IResourceProgressListener progress, final IResourceCallback callback) {
    return loadResourcesAndWaitHelper(loadNativeResourcesAsync(registryReferenceName, filter, progress, callback));
  }

  public static boolean loadNativeResources(final String registryReferenceName, final ExecutorService executor, final IResourceFilter filter, final IResourceProgressListener progress, final IResourceCallback callback) {
    return loadResourcesAndWaitHelper(loadNativeResourcesAsync(registryReferenceName, executor, filter, progress, callback));
  }
  //</editor-fold>
}
