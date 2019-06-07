/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.model.endpoint;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.model.EndpointDefinition;

/**
 * The class component is for invoking Java classes (Java beans) from Camel.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ClassEndpoint {


    public static class ClassCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        ClassCommon(String path) {
            super("class", path);
        }
        /**
         * Sets the name of the bean to invoke. The option is a java.lang.String
         * type.
         */
        public T beanName(String beanName) {
            this.properties.put("beanName", beanName);
            return (T) this;
        }
        /**
         * Sets the name of the method to invoke on the bean. The option is a
         * java.lang.String type.
         */
        public T method(String method) {
            this.properties.put("method", method);
            return (T) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        public T basicPropertyBinding(boolean basicPropertyBinding) {
            this.properties.put("basicPropertyBinding", basicPropertyBinding);
            return (T) this;
        }
        /**
         * If enabled, Camel will cache the result of the first Registry
         * look-up. Cache can be enabled if the bean in the Registry is defined
         * as a singleton scope. The option is a java.lang.Boolean type.
         */
        public T cache(Boolean cache) {
            this.properties.put("cache", cache);
            return (T) this;
        }
        /**
         * Used for configuring additional properties on the bean. The option is
         * a java.util.Map<java.lang.String,java.lang.Object> type.
         */
        public T parameters(Map<String, Object> parameters) {
            this.properties.put("parameters", parameters);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        public T synchronous(boolean synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
    }

    public static class ClassProducer
            extends
                ClassCommon<ClassProducer>
            implements
                EndpointDefinition.Producer {
        public ClassProducer(String path) {
            super(path);
        }
    }
    public default ClassProducer toClass(String path) {
        return new ClassProducer(path);
    }
}