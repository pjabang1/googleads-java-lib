// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * VideoCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201702;


/**
 * A {@code Creative} that contains DFP-hosted video ads and is served
 * via VAST 2.0 XML.  This creative is read-only.
 */
public class VideoCreative  extends com.google.api.ads.dfp.axis.v201702.BaseVideoCreative  implements java.io.Serializable {
    public VideoCreative() {
    }

    public VideoCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201702.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201702.CreativePolicyViolation[] policyViolations,
           com.google.api.ads.dfp.axis.v201702.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201702.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201702.BaseCustomFieldValue[] customFieldValues,
           java.lang.String destinationUrl,
           com.google.api.ads.dfp.axis.v201702.DestinationUrlType destinationUrlType,
           java.lang.Integer duration,
           java.lang.Boolean allowDurationOverride,
           com.google.api.ads.dfp.axis.v201702.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls,
           long[] companionCreativeIds,
           java.lang.String customParameters,
           java.lang.String vastPreviewUrl,
           com.google.api.ads.dfp.axis.v201702.SslScanResult sslScanResult,
           com.google.api.ads.dfp.axis.v201702.SslManualOverride sslManualOverride) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
            policyViolations,
            appliedLabels,
            lastModifiedDateTime,
            customFieldValues,
            destinationUrl,
            destinationUrlType,
            duration,
            allowDurationOverride,
            trackingUrls,
            companionCreativeIds,
            customParameters,
            vastPreviewUrl,
            sslScanResult,
            sslManualOverride);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoCreative)) return false;
        VideoCreative other = (VideoCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201702", "VideoCreative"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}