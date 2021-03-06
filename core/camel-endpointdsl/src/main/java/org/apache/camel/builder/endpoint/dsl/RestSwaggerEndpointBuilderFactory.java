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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * An awesome REST endpoint backed by Swagger specifications.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface RestSwaggerEndpointBuilderFactory {


    /**
     * Builder for endpoint for the REST Swagger component.
     */
    public interface RestSwaggerEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedRestSwaggerEndpointBuilder advanced() {
            return (AdvancedRestSwaggerEndpointBuilder) this;
        }
    }

    /**
     * Advanced builder for endpoint for the REST Swagger component.
     */
    public interface AdvancedRestSwaggerEndpointBuilder
            extends
                EndpointProducerBuilder {
        default RestSwaggerEndpointBuilder basic() {
            return (RestSwaggerEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedRestSwaggerEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedRestSwaggerEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedRestSwaggerEndpointBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedRestSwaggerEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * REST Swagger (camel-rest-swagger)
     * An awesome REST endpoint backed by Swagger specifications.
     * 
     * Category: rest,swagger,http
     * Available as of version: 2.19
     * Maven coordinates: org.apache.camel:camel-rest-swagger
     * 
     * Syntax: <code>rest-swagger:specificationUri#operationId</code>
     * 
     * Path parameter: specificationUri
     * Path to the Swagger specification file. The scheme, host base path are
     * taken from this specification, but these can be overridden with
     * properties on the component or endpoint level. If not given the component
     * tries to load swagger.json resource from the classpath. Note that the
     * host defined on the component and endpoint of this Component should
     * contain the scheme, hostname and optionally the port in the URI syntax
     * (i.e. http://api.example.com:8080). Overrides component configuration.
     * The Swagger specification can be loaded from different sources by
     * prefixing with file: classpath: http: https:. Support for https is
     * limited to using the JDK installed UrlHandler, and as such it can be
     * cumbersome to setup TLS/SSL certificates for https (such as setting a
     * number of javax.net.ssl JVM system properties). How to do that consult
     * the JDK documentation for UrlHandler.
     * Default value: swagger.json
     * 
     * Path parameter: operationId (required)
     * ID of the operation from the Swagger specification.
     */
    default RestSwaggerEndpointBuilder restSwagger(String path) {
        class RestSwaggerEndpointBuilderImpl extends AbstractEndpointBuilder implements RestSwaggerEndpointBuilder, AdvancedRestSwaggerEndpointBuilder {
            public RestSwaggerEndpointBuilderImpl(String path) {
                super("rest-swagger", path);
            }
        }
        return new RestSwaggerEndpointBuilderImpl(path);
    }
}