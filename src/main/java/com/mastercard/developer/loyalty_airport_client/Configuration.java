/*
 *  Copyright (c) 2019 Mastercard
 
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 
    http://www.apache.org/licenses/LICENSE-2.0
 
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

 * 
 * Loyalty Airport Experience API
 * The Loyalty Airport Lounge APIs offers cardholders, via their issuers, the ability to  access the Mastercard Airport Lounge service through this digital channel.  Cardholders can search for airport lounges, get airport lounge details,  access airport lounges via their personalized Digital Membership Card,  and access their lounge history. These APIs can be used to build a rich,  interactive airport experience within the issuer's existing mobile application.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: loyalty-benefits-support@mastercard.flowdock.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



package com.mastercard.developer.loyalty_airport_client;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-26T11:53:43.013-06:00[America/Chicago]")
public class Configuration {
    private static ApiClient defaultApiClient = new ApiClient();

    /**
     * Get the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @return Default API client
     */
    public static ApiClient getDefaultApiClient() {
        return defaultApiClient;
    }

    /**
     * Set the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @param apiClient API client
     */
    public static void setDefaultApiClient(ApiClient apiClient) {
        defaultApiClient = apiClient;
    }
}
