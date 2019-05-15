/** 
 * <pre>项目名称:asdasd 
 * 文件名称:EasyuiPage.java 
 * 包名:com.jk.ms.util 
 * 创建日期:2019年2月15日下午8:05:44 
 * Copyright (c) 2019, All Rights Reserved.</pre> 
 */  
package com.jk.util;

import java.io.Serializable;

/**
 * <pre>项目名称：asdasd    
 * 类名称：EasyuiPage    
 * 类描述：    
 * 创建人：马帅  
 * 创建时间：2019年2月15日 下午8:05:44    
 * 修改人：马帅     
 * 修改时间：2019年2月15日 下午8:05:44    
 * 修改备注：       
 * @version </pre>    
 */
public class EasyuiPage implements Serializable {
	private static final long serialVersionUID = 7438338671479093678L;
	private Integer total;

private Object rows;

public Integer getTotal() {
	return total;
}

public void setTotal(Integer total) {
	this.total = total;
}

public Object getRows() {
	return rows;
}

public void setRows(Object rows) {
	this.rows = rows;
}

@Override
public String toString() {
	return "EasyuiPage [total=" + total + ", rows=" + rows + "]";
}


}
