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
 * Provides functionality required by Healthcare providers to communicate with
 * other systems using the MLLP protocol.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MllpEndpoint {


    public static class MllpCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        MllpCommon(String path) {
            super("mllp", path);
        }
        /**
         * Hostname or IP for connection for the TCP connection. The default
         * value is null, which means any local IP address. The option is a
         * java.lang.String type.
         */
        public T hostname(String hostname) {
            this.properties.put("hostname", hostname);
            return (T) this;
        }
        /**
         * Port number for the TCP connection. The option is a int type.
         */
        public T port(int port) {
            this.properties.put("port", port);
            return (T) this;
        }
        /**
         * Enable/Disable the automatic generation of a MLLP Acknowledgement
         * MLLP Consumers only. The option is a boolean type.
         */
        public T autoAck(boolean autoAck) {
            this.properties.put("autoAck", autoAck);
            return (T) this;
        }
        /**
         * Enable/Disable the buffering of HL7 payloads before writing to the
         * socket. The option is a boolean type.
         */
        @Deprecated
        public T bufferWrites(boolean bufferWrites) {
            this.properties.put("bufferWrites", bufferWrites);
            return (T) this;
        }
        /**
         * Enable/Disable the automatic generation of message headers from the
         * HL7 Message MLLP Consumers only. The option is a boolean type.
         */
        public T hl7Headers(boolean hl7Headers) {
            this.properties.put("hl7Headers", hl7Headers);
            return (T) this;
        }
        /**
         * Enable/Disable strict compliance to the MLLP standard. The MLLP
         * standard specifies START_OF_BLOCKhl7 payloadEND_OF_BLOCKEND_OF_DATA,
         * however, some systems do not send the final END_OF_DATA byte. This
         * setting controls whether or not the final END_OF_DATA byte is
         * required or optional. The option is a boolean type.
         */
        public T requireEndOfData(boolean requireEndOfData) {
            this.properties.put("requireEndOfData", requireEndOfData);
            return (T) this;
        }
        /**
         * Enable/Disable converting the payload to a String. If enabled, HL7
         * Payloads received from external systems will be validated converted
         * to a String. If the charsetName property is set, that character set
         * will be used for the conversion. If the charsetName property is not
         * set, the value of MSH-18 will be used to determine th appropriate
         * character set. If MSH-18 is not set, then the default ISO-8859-1
         * character set will be use. The option is a boolean type.
         */
        public T stringPayload(boolean stringPayload) {
            this.properties.put("stringPayload", stringPayload);
            return (T) this;
        }
        /**
         * Enable/Disable the validation of HL7 Payloads If enabled, HL7
         * Payloads received from external systems will be validated (see
         * Hl7Util.generateInvalidPayloadExceptionMessage for details on the
         * validation). If and invalid payload is detected, a
         * MllpInvalidMessageException (for consumers) or a
         * MllpInvalidAcknowledgementException will be thrown. The option is a
         * boolean type.
         */
        public T validatePayload(boolean validatePayload) {
            this.properties.put("validatePayload", validatePayload);
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
         * Sets whether synchronous processing should be strictly used (this
         * component only supports synchronous operations). The option is a
         * boolean type.
         */
        public T synchronous(boolean synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
        /**
         * The approximate idle time allowed before the Client TCP Connection
         * will be reset. A null value or a value less than or equal to zero
         * will disable the idle timeout. The option is a java.lang.Integer
         * type.
         */
        public T idleTimeout(Integer idleTimeout) {
            this.properties.put("idleTimeout", idleTimeout);
            return (T) this;
        }
        /**
         * Sets the SO_RCVBUF option to the specified value (in bytes). The
         * option is a java.lang.Integer type.
         */
        public T receiveBufferSize(Integer receiveBufferSize) {
            this.properties.put("receiveBufferSize", receiveBufferSize);
            return (T) this;
        }
        /**
         * Sets the SO_SNDBUF option to the specified value (in bytes). The
         * option is a java.lang.Integer type.
         */
        public T sendBufferSize(Integer sendBufferSize) {
            this.properties.put("sendBufferSize", sendBufferSize);
            return (T) this;
        }
        /**
         * The SO_TIMEOUT value (in milliseconds) used after the start of an
         * MLLP frame has been received. The option is a int type.
         */
        public T readTimeout(int readTimeout) {
            this.properties.put("readTimeout", readTimeout);
            return (T) this;
        }
        /**
         * The SO_TIMEOUT value (in milliseconds) used when waiting for the
         * start of an MLLP frame. The option is a int type.
         */
        public T receiveTimeout(int receiveTimeout) {
            this.properties.put("receiveTimeout", receiveTimeout);
            return (T) this;
        }
        /**
         * Set the CamelCharsetName property on the exchange. The option is a
         * java.lang.String type.
         */
        public T charsetName(String charsetName) {
            this.properties.put("charsetName", charsetName);
            return (T) this;
        }
    }

    public static class MllpConsumer
            extends
                MllpCommon<MllpConsumer>
            implements
                EndpointDefinition.Consumer {
        public MllpConsumer(String path) {
            super(path);
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * receive incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. If disabled, the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions by logging them at WARN or ERROR level and ignored.
         * The option is a boolean type.
         */
        public MllpConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (MllpConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public MllpConsumer exceptionHandler(ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (MllpConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public MllpConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (MllpConsumer) this;
        }
        /**
         * The maximum queue length for incoming connection indications (a
         * request to connect) is set to the backlog parameter. If a connection
         * indication arrives when the queue is full, the connection is refused.
         * The option is a java.lang.Integer type.
         */
        public MllpConsumer backlog(Integer backlog) {
            this.properties.put("backlog", backlog);
            return (MllpConsumer) this;
        }
        /**
         * TCP Server Only - Allow the endpoint to start before the TCP
         * ServerSocket is bound. In some environments, it may be desirable to
         * allow the endpoint to start before the TCP ServerSocket is bound. The
         * option is a boolean type.
         */
        public MllpConsumer lenientBind(boolean lenientBind) {
            this.properties.put("lenientBind", lenientBind);
            return (MllpConsumer) this;
        }
        /**
         * The maximum number of concurrent MLLP Consumer connections that will
         * be allowed. If a new connection is received and the maximum is number
         * are already established, the new connection will be reset
         * immediately. The option is a int type.
         */
        public MllpConsumer maxConcurrentConsumers(int maxConcurrentConsumers) {
            this.properties.put("maxConcurrentConsumers", maxConcurrentConsumers);
            return (MllpConsumer) this;
        }
        /**
         * Enable/disable the SO_REUSEADDR socket option. The option is a
         * java.lang.Boolean type.
         */
        public MllpConsumer reuseAddress(Boolean reuseAddress) {
            this.properties.put("reuseAddress", reuseAddress);
            return (MllpConsumer) this;
        }
        /**
         * Timeout (in milliseconds) while waiting for a TCP connection TCP
         * Server Only. The option is a int type.
         */
        public MllpConsumer acceptTimeout(int acceptTimeout) {
            this.properties.put("acceptTimeout", acceptTimeout);
            return (MllpConsumer) this;
        }
        /**
         * TCP Server Only - The number of milliseconds to wait between bind
         * attempts. The option is a int type.
         */
        public MllpConsumer bindRetryInterval(int bindRetryInterval) {
            this.properties.put("bindRetryInterval", bindRetryInterval);
            return (MllpConsumer) this;
        }
        /**
         * TCP Server Only - The number of milliseconds to retry binding to a
         * server port. The option is a int type.
         */
        public MllpConsumer bindTimeout(int bindTimeout) {
            this.properties.put("bindTimeout", bindTimeout);
            return (MllpConsumer) this;
        }
        /**
         * The maximum number of timeouts (specified by receiveTimeout) allowed
         * before the TCP Connection will be reset. The option is a
         * java.lang.Integer type.
         */
        @Deprecated
        public MllpConsumer maxReceiveTimeouts(Integer maxReceiveTimeouts) {
            this.properties.put("maxReceiveTimeouts", maxReceiveTimeouts);
            return (MllpConsumer) this;
        }
    }

    public static class MllpProducer
            extends
                MllpCommon<MllpProducer>
            implements
                EndpointDefinition.Producer {
        public MllpProducer(String path) {
            super(path);
        }
        /**
         * Timeout (in milliseconds) for establishing for a TCP connection TCP
         * Client only. The option is a int type.
         */
        public MllpProducer connectTimeout(int connectTimeout) {
            this.properties.put("connectTimeout", connectTimeout);
            return (MllpProducer) this;
        }
        /**
         * Enable/disable the SO_KEEPALIVE socket option. The option is a
         * java.lang.Boolean type.
         */
        public MllpProducer keepAlive(Boolean keepAlive) {
            this.properties.put("keepAlive", keepAlive);
            return (MllpProducer) this;
        }
        /**
         * Enable/disable the TCP_NODELAY socket option. The option is a
         * java.lang.Boolean type.
         */
        public MllpProducer tcpNoDelay(Boolean tcpNoDelay) {
            this.properties.put("tcpNoDelay", tcpNoDelay);
            return (MllpProducer) this;
        }
    }
    public default MllpConsumer fromMllp(String path) {
        return new MllpConsumer(path);
    }
    public default MllpProducer toMllp(String path) {
        return new MllpProducer(path);
    }
}