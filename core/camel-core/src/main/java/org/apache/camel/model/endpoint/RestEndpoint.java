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
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.EndpointDefinition;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The rest component is used for either hosting REST services (consumer) or
 * calling external REST services (producer).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface RestEndpoint {


    public static class RestCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        RestCommon(String path) {
            super("rest", path);
        }
        /**
         * HTTP method to use. The option is a java.lang.String type.
         */
        public T method(String method) {
            this.properties.put("method", method);
            return (T) this;
        }
        /**
         * The base path. The option is a java.lang.String type.
         */
        public T path(String path) {
            this.properties.put("path", path);
            return (T) this;
        }
        /**
         * The uri template. The option is a java.lang.String type.
         */
        public T uriTemplate(String uriTemplate) {
            this.properties.put("uriTemplate", uriTemplate);
            return (T) this;
        }
        /**
         * The Camel Rest component to use for the REST transport, such as
         * restlet, spark-rest. If no component has been explicit configured,
         * then Camel will lookup if there is a Camel component that integrates
         * with the Rest DSL, or if a org.apache.camel.spi.RestConsumerFactory
         * is registered in the registry. If either one is found, then that is
         * being used. The option is a java.lang.String type.
         */
        public T componentName(String componentName) {
            this.properties.put("componentName", componentName);
            return (T) this;
        }
        /**
         * Media type such as: 'text/xml', or 'application/json' this REST
         * service accepts. By default we accept all kinds of types. The option
         * is a java.lang.String type.
         */
        public T consumes(String consumes) {
            this.properties.put("consumes", consumes);
            return (T) this;
        }
        /**
         * To declare the incoming POJO binding type as a FQN class name. The
         * option is a java.lang.String type.
         */
        public T inType(String inType) {
            this.properties.put("inType", inType);
            return (T) this;
        }
        /**
         * To declare the outgoing POJO binding type as a FQN class name. The
         * option is a java.lang.String type.
         */
        public T outType(String outType) {
            this.properties.put("outType", outType);
            return (T) this;
        }
        /**
         * Media type such as: 'text/xml', or 'application/json' this REST
         * service returns. The option is a java.lang.String type.
         */
        public T produces(String produces) {
            this.properties.put("produces", produces);
            return (T) this;
        }
        /**
         * Name of the route this REST services creates. The option is a
         * java.lang.String type.
         */
        public T routeId(String routeId) {
            this.properties.put("routeId", routeId);
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

    public static class RestConsumer
            extends
                RestCommon<RestConsumer>
            implements
                EndpointDefinition.Consumer {
        public RestConsumer(String path) {
            super(path);
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option is a boolean type.
         */
        public RestConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (RestConsumer) this;
        }
        /**
         * Human description to document this REST service. The option is a
         * java.lang.String type.
         */
        public RestConsumer description(String description) {
            this.properties.put("description", description);
            return (RestConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public RestConsumer exceptionHandler(ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (RestConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public RestConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (RestConsumer) this;
        }
    }

    public static class RestProducer
            extends
                RestCommon<RestProducer>
            implements
                EndpointDefinition.Producer {
        public RestProducer(String path) {
            super(path);
        }
        /**
         * The swagger api doc resource to use. The resource is loaded from
         * classpath by default and must be in JSon format. The option is a
         * java.lang.String type.
         */
        public RestProducer apiDoc(String apiDoc) {
            this.properties.put("apiDoc", apiDoc);
            return (RestProducer) this;
        }
        /**
         * Configures the binding mode for the producer. If set to anything
         * other than 'off' the producer will try to convert the body of the
         * incoming message from inType to the json or xml, and the response
         * from json or xml to outType. The option is a
         * org.apache.camel.spi.RestConfiguration.RestBindingMode type.
         */
        public RestProducer bindingMode(RestBindingMode bindingMode) {
            this.properties.put("bindingMode", bindingMode);
            return (RestProducer) this;
        }
        /**
         * Host and port of HTTP service to use (override host in swagger
         * schema). The option is a java.lang.String type.
         */
        public RestProducer host(String host) {
            this.properties.put("host", host);
            return (RestProducer) this;
        }
        /**
         * Query parameters for the HTTP service to call. The option is a
         * java.lang.String type.
         */
        public RestProducer queryParameters(String queryParameters) {
            this.properties.put("queryParameters", queryParameters);
            return (RestProducer) this;
        }
    }

    public static enum RestBindingMode {
        auto, off, json, xml, json_xml;
    }
    public default RestConsumer fromRest(String path) {
        return new RestConsumer(path);
    }
    public default RestProducer toRest(String path) {
        return new RestProducer(path);
    }
}