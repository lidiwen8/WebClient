/**
 * PageBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.webservice.imgservice;

public class PageBean  implements java.io.Serializable {
    private java.lang.Object[] beanList;

    private int pc;

    private int pr;

    private int tp;

    private int tr;

    private java.lang.String url;

    public PageBean() {
    }

    public PageBean(
           java.lang.Object[] beanList,
           int pc,
           int pr,
           int tp,
           int tr,
           java.lang.String url) {
           this.beanList = beanList;
           this.pc = pc;
           this.pr = pr;
           this.tp = tp;
           this.tr = tr;
           this.url = url;
    }


    /**
     * Gets the beanList value for this PageBean.
     * 
     * @return beanList
     */
    public java.lang.Object[] getBeanList() {
        return beanList;
    }


    /**
     * Sets the beanList value for this PageBean.
     * 
     * @param beanList
     */
    public void setBeanList(java.lang.Object[] beanList) {
        this.beanList = beanList;
    }


    /**
     * Gets the pc value for this PageBean.
     * 
     * @return pc
     */
    public int getPc() {
        return pc;
    }


    /**
     * Sets the pc value for this PageBean.
     * 
     * @param pc
     */
    public void setPc(int pc) {
        this.pc = pc;
    }


    /**
     * Gets the pr value for this PageBean.
     * 
     * @return pr
     */
    public int getPr() {
        return pr;
    }


    /**
     * Sets the pr value for this PageBean.
     * 
     * @param pr
     */
    public void setPr(int pr) {
        this.pr = pr;
    }


    /**
     * Gets the tp value for this PageBean.
     * 
     * @return tp
     */
    public int getTp() {
        return tp;
    }


    /**
     * Sets the tp value for this PageBean.
     * 
     * @param tp
     */
    public void setTp(int tp) {
        this.tp = tp;
    }


    /**
     * Gets the tr value for this PageBean.
     * 
     * @return tr
     */
    public int getTr() {
        return tr;
    }


    /**
     * Sets the tr value for this PageBean.
     * 
     * @param tr
     */
    public void setTr(int tr) {
        this.tr = tr;
    }


    /**
     * Gets the url value for this PageBean.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this PageBean.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PageBean)) return false;
        PageBean other = (PageBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.beanList==null && other.getBeanList()==null) || 
             (this.beanList!=null &&
              java.util.Arrays.equals(this.beanList, other.getBeanList()))) &&
            this.pc == other.getPc() &&
            this.pr == other.getPr() &&
            this.tp == other.getTp() &&
            this.tr == other.getTr() &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBeanList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBeanList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBeanList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getPc();
        _hashCode += getPr();
        _hashCode += getTp();
        _hashCode += getTr();
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PageBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://util", "PageBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util", "beanList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://Impl.service", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util", "pc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util", "pr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util", "tp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util", "tr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
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
