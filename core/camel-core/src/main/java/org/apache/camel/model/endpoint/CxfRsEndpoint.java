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

import java.util.List;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.EndpointDefinition;
import org.apache.camel.spi.ExceptionHandler;
import org.apache.camel.spi.HeaderFilterStrategy;

/**
 * The cxfrs component is used for JAX-RS REST services using Apache CXF.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface CxfRsEndpoint {


    public static class CxfRsCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        CxfRsCommon(String path) {
            super("cxfrs", path);
        }
        /**
         * To lookup an existing configured CxfRsEndpoint. Must used bean: as
         * prefix. The option is a java.lang.String type.
         */
        public T beanId(String beanId) {
            this.properties.put("beanId", beanId);
            return (T) this;
        }
        /**
         * The service publish address. The option is a java.lang.String type.
         */
        public T address(String address) {
            this.properties.put("address", address);
            return (T) this;
        }
        /**
         * Set the feature list to the CxfRs endpoint. The option is a
         * java.util.List<org.apache.cxf.feature.Feature> type.
         */
        public T features(List<Object> features) {
            this.properties.put("features", features);
            return (T) this;
        }
        /**
         * This option enables CXF Logging Feature which writes inbound and
         * outbound REST messages to log. The option is a boolean type.
         */
        public T loggingFeatureEnabled(boolean loggingFeatureEnabled) {
            this.properties.put("loggingFeatureEnabled", loggingFeatureEnabled);
            return (T) this;
        }
        /**
         * To limit the total size of number of bytes the logger will output
         * when logging feature has been enabled. The option is a int type.
         */
        public T loggingSizeLimit(int loggingSizeLimit) {
            this.properties.put("loggingSizeLimit", loggingSizeLimit);
            return (T) this;
        }
        /**
         * This option is used to specify the model file which is useful for the
         * resource class without annotation. When using this option, then the
         * service class can be omitted, to emulate document-only endpoints. The
         * option is a java.lang.String type.
         */
        public T modelRef(String modelRef) {
            this.properties.put("modelRef", modelRef);
            return (T) this;
        }
        /**
         * Set custom JAX-RS provider(s) list to the CxfRs endpoint. You can
         * specify a string with a list of providers to lookup in the registy
         * separated by comma. The option is a java.lang.String type.
         */
        public T providers(List<Object> providers) {
            this.properties.put("providers", providers);
            return (T) this;
        }
        /**
         * The resource classes which you want to export as REST service.
         * Multiple classes can be separated by comma. The option is a
         * java.util.List<java.lang.Class<?>> type.
         */
        public T resourceClasses(List<Class<Object>> resourceClasses) {
            this.properties.put("resourceClasses", resourceClasses);
            return (T) this;
        }
        /**
         * Sets the locations of the schema(s) which can be used to validate the
         * incoming XML or JAXB-driven JSON. The option is a
         * java.util.List<java.lang.String> type.
         */
        public T schemaLocations(List<String> schemaLocations) {
            this.properties.put("schemaLocations", schemaLocations);
            return (T) this;
        }
        /**
         * This option controls whether the PhaseInterceptorChain skips logging
         * the Fault that it catches. The option is a boolean type.
         */
        public T skipFaultLogging(boolean skipFaultLogging) {
            this.properties.put("skipFaultLogging", skipFaultLogging);
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
         * To use a custom CxfBinding to control the binding between Camel
         * Message and CXF Message. The option is a
         * org.apache.camel.component.cxf.jaxrs.CxfRsBinding type.
         */
        public T binding(Object binding) {
            this.properties.put("binding", binding);
            return (T) this;
        }
        /**
         * To use a custom configured CXF Bus. The option is a
         * org.apache.cxf.Bus type.
         */
        public T bus(Object bus) {
            this.properties.put("bus", bus);
            return (T) this;
        }
        /**
         * This option is used to set the CXF continuation timeout which could
         * be used in CxfConsumer by default when the CXF server is using Jetty
         * or Servlet transport. The option is a long type.
         */
        public T continuationTimeout(long continuationTimeout) {
            this.properties.put("continuationTimeout", continuationTimeout);
            return (T) this;
        }
        /**
         * This option could apply the implementation of
         * org.apache.camel.component.cxf.jaxrs.CxfRsEndpointConfigurer which
         * supports to configure the CXF endpoint in programmatic way. User can
         * configure the CXF server and client by implementing
         * configure{Server/Client} method of CxfEndpointConfigurer. The option
         * is a org.apache.camel.component.cxf.jaxrs.CxfRsEndpointConfigurer
         * type.
         */
        public T cxfRsEndpointConfigurer(Object cxfRsEndpointConfigurer) {
            this.properties.put("cxfRsEndpointConfigurer", cxfRsEndpointConfigurer);
            return (T) this;
        }
        /**
         * Will set the default bus when CXF endpoint create a bus by itself.
         * The option is a boolean type.
         */
        public T defaultBus(boolean defaultBus) {
            this.properties.put("defaultBus", defaultBus);
            return (T) this;
        }
        /**
         * To use a custom HeaderFilterStrategy to filter header to and from
         * Camel message. The option is a
         * org.apache.camel.spi.HeaderFilterStrategy type.
         */
        public T headerFilterStrategy(HeaderFilterStrategy headerFilterStrategy) {
            this.properties.put("headerFilterStrategy", headerFilterStrategy);
            return (T) this;
        }
        /**
         * When the option is true, Camel will perform the invocation of the
         * resource class instance and put the response object into the exchange
         * for further processing. The option is a boolean type.
         */
        public T performInvocation(boolean performInvocation) {
            this.properties.put("performInvocation", performInvocation);
            return (T) this;
        }
        /**
         * When the option is true, JAXRS UriInfo, HttpHeaders, Request and
         * SecurityContext contexts will be available to custom CXFRS processors
         * as typed Camel exchange properties. These contexts can be used to
         * analyze the current requests using JAX-RS API. The option is a
         * boolean type.
         */
        public T propagateContexts(boolean propagateContexts) {
            this.properties.put("propagateContexts", propagateContexts);
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

    public static class CxfRsConsumer
            extends
                CxfRsCommon<CxfRsConsumer>
            implements
                EndpointDefinition.Consumer {
        public CxfRsConsumer(String path) {
            super(path);
        }
        /**
         * Sets how requests and responses will be mapped to/from Camel. Two
         * values are possible: SimpleConsumer: This binding style processes
         * request parameters, multiparts, etc. and maps them to IN headers, IN
         * attachments and to the message body. It aims to eliminate low-level
         * processing of org.apache.cxf.message.MessageContentsList. It also
         * also adds more flexibility and simplicity to the response mapping.
         * Only available for consumers. Default: The default style. For
         * consumers this passes on a MessageContentsList to the route,
         * requiring low-level processing in the route. This is the traditional
         * binding style, which simply dumps the
         * org.apache.cxf.message.MessageContentsList coming in from the CXF
         * stack onto the IN message body. The user is then responsible for
         * processing it according to the contract defined by the JAX-RS method
         * signature. Custom: allows you to specify a custom binding through the
         * binding option. The option is a
         * org.apache.camel.component.cxf.jaxrs.BindingStyle type.
         */
        public CxfRsConsumer bindingStyle(BindingStyle bindingStyle) {
            this.properties.put("bindingStyle", bindingStyle);
            return (CxfRsConsumer) this;
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
        public CxfRsConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (CxfRsConsumer) this;
        }
        /**
         * This option can override the endpointUrl that published from the WADL
         * which can be accessed with resource address url plus _wadl. The
         * option is a java.lang.String type.
         */
        public CxfRsConsumer publishedEndpointUrl(String publishedEndpointUrl) {
            this.properties.put("publishedEndpointUrl", publishedEndpointUrl);
            return (CxfRsConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public CxfRsConsumer exceptionHandler(ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (CxfRsConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public CxfRsConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (CxfRsConsumer) this;
        }
        /**
         * The service beans which you want to export as REST service. Multiple
         * beans can be separated by comma. The option is a
         * java.util.List<java.lang.Object> type.
         */
        public CxfRsConsumer serviceBeans(List<Object> serviceBeans) {
            this.properties.put("serviceBeans", serviceBeans);
            return (CxfRsConsumer) this;
        }
    }

    public static class CxfRsProducer
            extends
                CxfRsCommon<CxfRsProducer>
            implements
                EndpointDefinition.Producer {
        public CxfRsProducer(String path) {
            super(path);
        }
        /**
         * Configure a cookie handler to maintain a HTTP session. The option is
         * a org.apache.camel.http.common.cookie.CookieHandler type.
         */
        public CxfRsProducer cookieHandler(Object cookieHandler) {
            this.properties.put("cookieHandler", cookieHandler);
            return (CxfRsProducer) this;
        }
        /**
         * The hostname verifier to be used. Use the # notation to reference a
         * HostnameVerifier from the registry. The option is a
         * javax.net.ssl.HostnameVerifier type.
         */
        public CxfRsProducer hostnameVerifier(Object hostnameVerifier) {
            this.properties.put("hostnameVerifier", hostnameVerifier);
            return (CxfRsProducer) this;
        }
        /**
         * The Camel SSL setting reference. Use the # notation to reference the
         * SSL Context. The option is a
         * org.apache.camel.support.jsse.SSLContextParameters type.
         */
        public CxfRsProducer sslContextParameters(Object sslContextParameters) {
            this.properties.put("sslContextParameters", sslContextParameters);
            return (CxfRsProducer) this;
        }
        /**
         * This option tells the CxfRsProducer to inspect return codes and will
         * generate an Exception if the return code is larger than 207. The
         * option is a boolean type.
         */
        public CxfRsProducer throwExceptionOnFailure(
                boolean throwExceptionOnFailure) {
            this.properties.put("throwExceptionOnFailure", throwExceptionOnFailure);
            return (CxfRsProducer) this;
        }
        /**
         * If it is true, the CxfRsProducer will use the HttpClientAPI to invoke
         * the service. If it is false, the CxfRsProducer will use the
         * ProxyClientAPI to invoke the service. The option is a boolean type.
         */
        public CxfRsProducer httpClientAPI(boolean httpClientAPI) {
            this.properties.put("httpClientAPI", httpClientAPI);
            return (CxfRsProducer) this;
        }
        /**
         * This option is used to tell CxfRsProducer to ignore the message body
         * of the DELETE method when using HTTP API. The option is a boolean
         * type.
         */
        public CxfRsProducer ignoreDeleteMethodMessageBody(
                boolean ignoreDeleteMethodMessageBody) {
            this.properties.put("ignoreDeleteMethodMessageBody", ignoreDeleteMethodMessageBody);
            return (CxfRsProducer) this;
        }
        /**
         * This option allows you to configure the maximum size of the cache.
         * The implementation caches CXF clients or ClientFactoryBean in
         * CxfProvider and CxfRsProvider. The option is a int type.
         */
        public CxfRsProducer maxClientCacheSize(int maxClientCacheSize) {
            this.properties.put("maxClientCacheSize", maxClientCacheSize);
            return (CxfRsProducer) this;
        }
    }

    public static enum BindingStyle {
        SimpleConsumer, Default, Custom;
    }
    public default CxfRsConsumer fromCxfRs(String path) {
        return new CxfRsConsumer(path);
    }
    public default CxfRsProducer toCxfRs(String path) {
        return new CxfRsProducer(path);
    }
}