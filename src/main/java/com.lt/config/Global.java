package com.lt.config;

import com.google.common.collect.Maps;
import com.lt.until.PropertiesLoader;
import org.apache.commons.lang.StringUtils;


import java.util.Map;

public class Global {

    /**
     * 保存全局属性值
     */
    private static Map<String, String> map = Maps.newHashMap();
    /**
     * 属性文件加载对象
     */
    private static PropertiesLoader loader = new PropertiesLoader("jeesite.properties");

    /**
     * 获取配置
     *
     * @see ${fns:getConfig('adminPath')}
     */
    public static String getConfig(String key) {
        String value = map.get(key);
        if (value == null) {
            value = loader.getProperty(key);
            map.put(key, value != null ? value : StringUtils.EMPTY);
        }
        return value;
    }
}
