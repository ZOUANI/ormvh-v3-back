package ma.zs.generated.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.security.Security;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ma.zs.generated.bean.Bordereau;
import ma.zs.generated.bean.User;
import ma.zs.generated.security.SecurityUtil;
import org.apache.commons.beanutils.PropertyUtils;

import ma.zs.generated.service.util.DateUtil;

public abstract class AbstractService<T> {
    public abstract T save(T t);

    public List<T> create(List<T> items) {
        List<T> list = new ArrayList<T>();
        if (items != null) {
            items.forEach(item -> list.add(create(item)));
        }
        return items;
    }

    public T create(T t) {
        prepareSave(t);
        return save(t);

    }

    public void prepareSave(T item) {
        try {
            if (PropertyUtils.getProperty(item, "createdBy") == null) {
                PropertyUtils.setProperty(item, "createdBy", SecurityUtil.getCurrentUser());
            }
            if (PropertyUtils.getProperty(item, "createdAt") == null) {
                PropertyUtils.setProperty(item, "createdAt", new Date());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void prepareUpdate(T item) {
        try {
            PropertyUtils.setProperty(item, "updatedBy", SecurityUtil.getCurrentUser());
            PropertyUtils.setProperty(item, "updatedAt", new Date());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String addConstraint(String beanAbrev, String atributeName, String operator, Object value) {
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

    public String addConstraintOr(String beanAbrev, String atributeName, String operator, Object value) {
        boolean condition = value != null;
        if (value != null && value.getClass().getSimpleName().equals("String")) {
            condition = condition && !value.equals("");
        }
        if (condition) {
            return " OR " + beanAbrev + "." + atributeName + " " + operator + " '" + value + "'";
        }
        return "";
    }

    public String addConstraintMinMax(String beanAbrev, String atributeName, Object valueMin, Object valueMax) {
        String requette = "";
        if (valueMin != null) {
            requette += " AND " + beanAbrev + "." + atributeName + " >= '" + valueMin + "'";
        }
        if (valueMax != null) {
            requette += " AND " + beanAbrev + "." + atributeName + " <= '" + valueMax + "'";
        }
        return requette;
    }

    public String addConstraintDate(String beanAbrev, String atributeName, String operator, Date value) {
        return addConstraint(beanAbrev, atributeName, operator, DateUtil.converte(value));
    }

    public String addConstraintDate(String beanAbrev, String atributeName, String operator, String value) {
        return addConstraintDate(beanAbrev, atributeName, operator, DateUtil.convert(value));
    }

    public String addConstraintMinMaxDate(String beanAbrev, String atributeName, Date valueMin, Date valueMax) {
        return addConstraintMinMax(beanAbrev, atributeName, DateUtil.converte(valueMin), DateUtil.converte(valueMax));
    }

    public String addConstraintMinMaxDate(String beanAbrev, String atributeName, String valueMin, String valueMax) {
        return addConstraintMinMaxDate(beanAbrev, atributeName, DateUtil.convert(valueMin), DateUtil.convert(valueMax));
    }
}
