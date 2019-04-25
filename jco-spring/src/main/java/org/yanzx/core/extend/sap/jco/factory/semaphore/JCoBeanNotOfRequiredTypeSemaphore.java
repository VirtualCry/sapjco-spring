package org.yanzx.core.extend.sap.jco.factory.semaphore;

import org.springframework.beans.BeansException;

/**
 * Description:
 *
 * @author VirtualCry
 * @date 2018/12/28 13:44
 */
public class JCoBeanNotOfRequiredTypeSemaphore extends BeansException {

    /** The name of the instance that was of the wrong type */
    private String beanName;

    /** The required type */
    private Class<?> requiredType;

    /** The offending type */
    private Class<?> actualType;


    /**
     * Create a new JCoBeanNotOfRequiredTypeSemaphore.
     * @param beanName the name of the bean requested
     * @param requiredType the required type
     * @param actualType the actual type returned, which did not match
     * the expected type
     */
    public JCoBeanNotOfRequiredTypeSemaphore(String beanName, Class<?> requiredType, Class<?> actualType) {
        super("Bean named '" + beanName + "' is expected to be of type [" + requiredType.getName() +
                "] but was actually of type [" + actualType.getName() + "]");
        this.beanName = beanName;
        this.requiredType = requiredType;
        this.actualType = actualType;
    }


    /**
     * Return the name of the instance that was of the wrong type.
     */
    public String getBeanName() {
        return this.beanName;
    }

    /**
     * Return the expected type for the bean.
     */
    public Class<?> getRequiredType() {
        return this.requiredType;
    }

    /**
     * Return the actual type of the instance found.
     */
    public Class<?> getActualType() {
        return this.actualType;
    }
}
