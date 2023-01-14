package com.atrvasa.exception;

import java.util.ArrayList;
import java.util.List;

public class AenahDetail {

    private String key;
    private String plugin;
    private String model;
    private String method;
    private String delegate;

    private String className;
    private String function;
    private String fieldName;


    private List<AenahElement> elements;
    private String innerExceptionMessage;
    private String innerExceptionClassName;

    private List<AenahDetail> exceptionList;

    //region GETTER & SETTER
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getPlugin() {
        return plugin;
    }

    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getDelegate() {
        return delegate;
    }

    public void setDelegate(String delegate) {
        this.delegate = delegate;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public List<AenahElement> getElements() {
        return elements;
    }

    public void setElements(List<AenahElement> elements) {
        this.elements = elements;
    }

    public String getInnerExceptionMessage() {
        return innerExceptionMessage;
    }

    public void setInnerExceptionMessage(String innerExceptionMessage) {
        this.innerExceptionMessage = innerExceptionMessage;
    }

    public String getInnerExceptionClassName() {
        return innerExceptionClassName;
    }

    public void setInnerExceptionClassName(String innerExceptionClassName) {
        this.innerExceptionClassName = innerExceptionClassName;
    }

    public List<AenahDetail> getExceptionList() {
        return exceptionList;
    }

    public void setExceptionList(List<AenahDetail> exceptionList) {
        this.exceptionList = exceptionList;
    }
    //endregion GETTER & SETTER

    public AenahDetail plugin(String plugin) {
        this.plugin = plugin;
        return this;
    }

    public AenahDetail model(String model) {
        this.model = model;
        return this;
    }

    public AenahDetail method(String method) {
        this.method = method;
        return this;
    }

    public AenahDetail function(String function) {
        this.function = function;
        return this;
    }

    public AenahDetail delegate(String delegate) {
        this.delegate = delegate;
        return this;
    }

    public AenahDetail addElement(String key, String value) {
        if (this.getElements() == null)
            this.setElements(new ArrayList<>());

        this.getElements().add(new AenahElement(key, value));

        return this;
    }

    public AenahDetail innerException(Aenah ex) {
        if (ex == null)
            return this;
        if (ex.getDetail() == null)
            return this;

        if (this.exceptionList == null)
            this.setExceptionList(new ArrayList<>());

        this.exceptionList.add(ex.getDetail());

        return this;
    }

    public AenahDetail innerException(Exception ex) {
        this.innerExceptionClassName = ex.getClass().getName();
        this.innerExceptionMessage = ex.getMessage();
        return this;
    }

    public AenahDetail type(Class<?> type) {
        this.className = type.getName();
        return this;
    }

    public AenahDetail type(Object obj) {
        this.className = obj.getClass().getName();
        return this;
    }

    public AenahDetail type(String className) {
        this.className = className;
        return this;
    }

    public AenahDetail field(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public AenahDetail exceptionList(List<AenahDetail> exList) {
        if (exList == null)
            return this;
        if (this.exceptionList == null)
            this.setExceptionList(new ArrayList<>());

        this.exceptionList.addAll(exList);

        return this;
    }


    @Override
    public String toString() {
        return "AenahDetail{" +
                "key='" + key + '\'' +
                ", plugin='" + plugin + '\'' +
                ", model='" + model + '\'' +
                ", method='" + method + '\'' +
                ", delegate='" + delegate + '\'' +
                ", className='" + className + '\'' +
                ", function='" + function + '\'' +
                ", fieldName='" + fieldName + '\'' +
                '}';
    }
}
