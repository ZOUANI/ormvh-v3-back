package ma.zs.generated.service.impl;

import java.util.Date;

import ma.zs.generated.service.util.DateUtil;

public abstract class AbstractService<T> {
    
	public void prepareSave(T item) {
		// TODO ouiam beansUtil 
		// if createdBy==null  item.setCreatedBy(SecurityUtil.connectedUser)
		// if createdAt==null  item.setCreatedAt(today)

	}
	
	public void prepareUpdate(T item) {
		// TODO ouiam beansUtil 
		
	}
	

	    public  String addConstraint(String beanAbrev, String atributeName, String operator, Object value) {
	        boolean condition = value != null;
	        if (value != null && value.getClass().getSimpleName().equals("String")) {
	            condition = condition && !value.equals("");
	        }
	        if (condition && operator.equals("LIKE")) {
	            return " AND " + beanAbrev + "." + atributeName + " " + operator + " '%" + value + "%'";
	        } else if (condition) {
	            return " AND " + beanAbrev + "." + atributeName + " " + operator + " '" + value + "'";
	        }

	        return "";
	    }

	    public  String addConstraintOr(String beanAbrev, String atributeName, String operator, Object value) {
	        boolean condition = value != null;
	        if (value != null && value.getClass().getSimpleName().equals("String")) {
	            condition = condition && !value.equals("");
	        }
	        if (condition) {
	            return " OR " + beanAbrev + "." + atributeName + " " + operator + " '" + value + "'";
	        }
	        return "";
	    }

	    public  String addConstraintMinMax(String beanAbrev, String atributeName, Object valueMin, Object valueMax) {
	        String requette = "";
	        if (valueMin != null) {
	            requette += " AND " + beanAbrev + "." + atributeName + " >= '" + valueMin + "'";
	        }
	        if (valueMax != null) {
	            requette += " AND " + beanAbrev + "." + atributeName + " <= '" + valueMax + "'";
	        }
	        return requette;
	    }

	    public  String addConstraintDate(String beanAbrev, String atributeName, String operator, Date value) {
	        return addConstraint(beanAbrev, atributeName, operator, DateUtil.converte(value));
	    }

	    public  String addConstraintDate(String beanAbrev, String atributeName, String operator, String value) {
	        return addConstraintDate(beanAbrev, atributeName, operator, DateUtil.convert(value));
	    }

	    public  String addConstraintMinMaxDate(String beanAbrev, String atributeName, Date valueMin, Date valueMax) {
	        return addConstraintMinMax(beanAbrev, atributeName,  DateUtil.converte(valueMin),  DateUtil.converte(valueMax));
	    }

	     public  String addConstraintMinMaxDate(String beanAbrev, String atributeName, String valueMin, String valueMax) {
	        return addConstraintMinMaxDate(beanAbrev, atributeName,  DateUtil.convert(valueMin),  DateUtil.convert(valueMax));
	    }
}
