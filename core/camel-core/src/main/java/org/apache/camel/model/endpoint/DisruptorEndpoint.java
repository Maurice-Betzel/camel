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
import org.apache.camel.WaitForTaskToComplete;
import org.apache.camel.model.EndpointDefinition;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The disruptor component provides asynchronous SEDA behavior using LMAX
 * Disruptor.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DisruptorEndpoint {


    public static class DisruptorCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        DisruptorCommon(String path) {
            super("disruptor", path);
        }
        /**
         * Name of queue. The option is a java.lang.String type.
         */
        public T name(String name) {
            this.properties.put("name", name);
            return (T) this;
        }
        /**
         * The maximum capacity of the Disruptors ringbuffer Will be effectively
         * increased to the nearest power of two. Notice: Mind if you use this
         * option, then its the first endpoint being created with the queue
         * name, that determines the size. To make sure all endpoints use same
         * size, then configure the size option on all of them, or the first
         * endpoint being created. The option is a int type.
         */
        public T size(int size) {
            this.properties.put("size", size);
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

    public static class DisruptorConsumer
            extends
                DisruptorCommon<DisruptorConsumer>
            implements
                EndpointDefinition.Consumer {
        public DisruptorConsumer(String path) {
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
        public DisruptorConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (DisruptorConsumer) this;
        }
        /**
         * Number of concurrent threads processing exchanges. The option is a
         * int type.
         */
        public DisruptorConsumer concurrentConsumers(int concurrentConsumers) {
            this.properties.put("concurrentConsumers", concurrentConsumers);
            return (DisruptorConsumer) this;
        }
        /**
         * Specifies whether multiple consumers are allowed. If enabled, you can
         * use Disruptor for Publish-Subscribe messaging. That is, you can send
         * a message to the queue and have each consumer receive a copy of the
         * message. When enabled, this option should be specified on every
         * consumer endpoint. The option is a boolean type.
         */
        public DisruptorConsumer multipleConsumers(boolean multipleConsumers) {
            this.properties.put("multipleConsumers", multipleConsumers);
            return (DisruptorConsumer) this;
        }
        /**
         * Defines the strategy used by consumer threads to wait on new
         * exchanges to be published. The options allowed are:Blocking,
         * Sleeping, BusySpin and Yielding. The option is a
         * org.apache.camel.component.disruptor.DisruptorWaitStrategy type.
         */
        public DisruptorConsumer waitStrategy(DisruptorWaitStrategy waitStrategy) {
            this.properties.put("waitStrategy", waitStrategy);
            return (DisruptorConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public DisruptorConsumer exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (DisruptorConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public DisruptorConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (DisruptorConsumer) this;
        }
    }

    public static class DisruptorProducer
            extends
                DisruptorCommon<DisruptorProducer>
            implements
                EndpointDefinition.Producer {
        public DisruptorProducer(String path) {
            super(path);
        }
        /**
         * Whether a thread that sends messages to a full Disruptor will block
         * until the ringbuffer's capacity is no longer exhausted. By default,
         * the calling thread will block and wait until the message can be
         * accepted. By disabling this option, an exception will be thrown
         * stating that the queue is full. The option is a boolean type.
         */
        public DisruptorProducer blockWhenFull(boolean blockWhenFull) {
            this.properties.put("blockWhenFull", blockWhenFull);
            return (DisruptorProducer) this;
        }
        /**
         * Defines the producers allowed on the Disruptor. The options allowed
         * are: Multi to allow multiple producers and Single to enable certain
         * optimizations only allowed when one concurrent producer (on one
         * thread or otherwise synchronized) is active. The option is a
         * org.apache.camel.component.disruptor.DisruptorProducerType type.
         */
        public DisruptorProducer producerType(DisruptorProducerType producerType) {
            this.properties.put("producerType", producerType);
            return (DisruptorProducer) this;
        }
        /**
         * Timeout (in milliseconds) before a producer will stop waiting for an
         * asynchronous task to complete. You can disable timeout by using 0 or
         * a negative value. The option is a long type.
         */
        public DisruptorProducer timeout(long timeout) {
            this.properties.put("timeout", timeout);
            return (DisruptorProducer) this;
        }
        /**
         * Option to specify whether the caller should wait for the async task
         * to complete or not before continuing. The following three options are
         * supported: Always, Never or IfReplyExpected. The first two values are
         * self-explanatory. The last value, IfReplyExpected, will only wait if
         * the message is Request Reply based. The option is a
         * org.apache.camel.WaitForTaskToComplete type.
         */
        public DisruptorProducer waitForTaskToComplete(
                WaitForTaskToComplete waitForTaskToComplete) {
            this.properties.put("waitForTaskToComplete", waitForTaskToComplete);
            return (DisruptorProducer) this;
        }
    }

    public static enum DisruptorWaitStrategy {
        Blocking, Sleeping, BusySpin, Yielding;
    }

    public static enum DisruptorProducerType {
        Single, Multi;
    }
    public default DisruptorConsumer fromDisruptor(String path) {
        return new DisruptorConsumer(path);
    }
    public default DisruptorProducer toDisruptor(String path) {
        return new DisruptorProducer(path);
    }
}