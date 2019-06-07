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

import javax.annotation.Generated;
import org.apache.camel.model.EndpointDefinition;

/**
 * Validates the payload of a message using RelaxNG Syntax using Jing library.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface JingEndpoint {


    public static class JingCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        JingCommon(String path) {
            super("jing", path);
        }
        /**
         * URL to a local resource on the classpath or a full URL to a remote
         * resource or resource on the file system which contains the schema to
         * validate against. The option is a java.lang.String type.
         */
        public T resourceUri(String resourceUri) {
            this.properties.put("resourceUri", resourceUri);
            return (T) this;
        }
        /**
         * Whether to validate using RelaxNG compact syntax or not. By default
         * this is false for using RelaxNG XML Syntax (rng) And true is for
         * using RelaxNG Compact Syntax (rnc). The option is a boolean type.
         */
        public T compactSyntax(boolean compactSyntax) {
            this.properties.put("compactSyntax", compactSyntax);
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
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        public T synchronous(boolean synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
    }

    public static class JingProducer
            extends
                JingCommon<JingProducer>
            implements
                EndpointDefinition.Producer {
        public JingProducer(String path) {
            super(path);
        }
    }
    public default JingProducer toJing(String path) {
        return new JingProducer(path);
    }
}