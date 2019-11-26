package com.fuchangyao.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGnameIsNull() {
            addCriterion("gname is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("gname is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("gname =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("gname <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("gname >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("gname >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("gname <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("gname <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("gname like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("gname not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("gname in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("gname not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("gname between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("gname not between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGcontentIsNull() {
            addCriterion("gcontent is null");
            return (Criteria) this;
        }

        public Criteria andGcontentIsNotNull() {
            addCriterion("gcontent is not null");
            return (Criteria) this;
        }

        public Criteria andGcontentEqualTo(String value) {
            addCriterion("gcontent =", value, "gcontent");
            return (Criteria) this;
        }

        public Criteria andGcontentNotEqualTo(String value) {
            addCriterion("gcontent <>", value, "gcontent");
            return (Criteria) this;
        }

        public Criteria andGcontentGreaterThan(String value) {
            addCriterion("gcontent >", value, "gcontent");
            return (Criteria) this;
        }

        public Criteria andGcontentGreaterThanOrEqualTo(String value) {
            addCriterion("gcontent >=", value, "gcontent");
            return (Criteria) this;
        }

        public Criteria andGcontentLessThan(String value) {
            addCriterion("gcontent <", value, "gcontent");
            return (Criteria) this;
        }

        public Criteria andGcontentLessThanOrEqualTo(String value) {
            addCriterion("gcontent <=", value, "gcontent");
            return (Criteria) this;
        }

        public Criteria andGcontentLike(String value) {
            addCriterion("gcontent like", value, "gcontent");
            return (Criteria) this;
        }

        public Criteria andGcontentNotLike(String value) {
            addCriterion("gcontent not like", value, "gcontent");
            return (Criteria) this;
        }

        public Criteria andGcontentIn(List<String> values) {
            addCriterion("gcontent in", values, "gcontent");
            return (Criteria) this;
        }

        public Criteria andGcontentNotIn(List<String> values) {
            addCriterion("gcontent not in", values, "gcontent");
            return (Criteria) this;
        }

        public Criteria andGcontentBetween(String value1, String value2) {
            addCriterion("gcontent between", value1, value2, "gcontent");
            return (Criteria) this;
        }

        public Criteria andGcontentNotBetween(String value1, String value2) {
            addCriterion("gcontent not between", value1, value2, "gcontent");
            return (Criteria) this;
        }

        public Criteria andGpriceIsNull() {
            addCriterion("gprice is null");
            return (Criteria) this;
        }

        public Criteria andGpriceIsNotNull() {
            addCriterion("gprice is not null");
            return (Criteria) this;
        }

        public Criteria andGpriceEqualTo(Double value) {
            addCriterion("gprice =", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotEqualTo(Double value) {
            addCriterion("gprice <>", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceGreaterThan(Double value) {
            addCriterion("gprice >", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("gprice >=", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceLessThan(Double value) {
            addCriterion("gprice <", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceLessThanOrEqualTo(Double value) {
            addCriterion("gprice <=", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceIn(List<Double> values) {
            addCriterion("gprice in", values, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotIn(List<Double> values) {
            addCriterion("gprice not in", values, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceBetween(Double value1, Double value2) {
            addCriterion("gprice between", value1, value2, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotBetween(Double value1, Double value2) {
            addCriterion("gprice not between", value1, value2, "gprice");
            return (Criteria) this;
        }

        public Criteria andGfenIsNull() {
            addCriterion("gfen is null");
            return (Criteria) this;
        }

        public Criteria andGfenIsNotNull() {
            addCriterion("gfen is not null");
            return (Criteria) this;
        }

        public Criteria andGfenEqualTo(Integer value) {
            addCriterion("gfen =", value, "gfen");
            return (Criteria) this;
        }

        public Criteria andGfenNotEqualTo(Integer value) {
            addCriterion("gfen <>", value, "gfen");
            return (Criteria) this;
        }

        public Criteria andGfenGreaterThan(Integer value) {
            addCriterion("gfen >", value, "gfen");
            return (Criteria) this;
        }

        public Criteria andGfenGreaterThanOrEqualTo(Integer value) {
            addCriterion("gfen >=", value, "gfen");
            return (Criteria) this;
        }

        public Criteria andGfenLessThan(Integer value) {
            addCriterion("gfen <", value, "gfen");
            return (Criteria) this;
        }

        public Criteria andGfenLessThanOrEqualTo(Integer value) {
            addCriterion("gfen <=", value, "gfen");
            return (Criteria) this;
        }

        public Criteria andGfenIn(List<Integer> values) {
            addCriterion("gfen in", values, "gfen");
            return (Criteria) this;
        }

        public Criteria andGfenNotIn(List<Integer> values) {
            addCriterion("gfen not in", values, "gfen");
            return (Criteria) this;
        }

        public Criteria andGfenBetween(Integer value1, Integer value2) {
            addCriterion("gfen between", value1, value2, "gfen");
            return (Criteria) this;
        }

        public Criteria andGfenNotBetween(Integer value1, Integer value2) {
            addCriterion("gfen not between", value1, value2, "gfen");
            return (Criteria) this;
        }

        public Criteria andGsumIsNull() {
            addCriterion("gsum is null");
            return (Criteria) this;
        }

        public Criteria andGsumIsNotNull() {
            addCriterion("gsum is not null");
            return (Criteria) this;
        }

        public Criteria andGsumEqualTo(Integer value) {
            addCriterion("gsum =", value, "gsum");
            return (Criteria) this;
        }

        public Criteria andGsumNotEqualTo(Integer value) {
            addCriterion("gsum <>", value, "gsum");
            return (Criteria) this;
        }

        public Criteria andGsumGreaterThan(Integer value) {
            addCriterion("gsum >", value, "gsum");
            return (Criteria) this;
        }

        public Criteria andGsumGreaterThanOrEqualTo(Integer value) {
            addCriterion("gsum >=", value, "gsum");
            return (Criteria) this;
        }

        public Criteria andGsumLessThan(Integer value) {
            addCriterion("gsum <", value, "gsum");
            return (Criteria) this;
        }

        public Criteria andGsumLessThanOrEqualTo(Integer value) {
            addCriterion("gsum <=", value, "gsum");
            return (Criteria) this;
        }

        public Criteria andGsumIn(List<Integer> values) {
            addCriterion("gsum in", values, "gsum");
            return (Criteria) this;
        }

        public Criteria andGsumNotIn(List<Integer> values) {
            addCriterion("gsum not in", values, "gsum");
            return (Criteria) this;
        }

        public Criteria andGsumBetween(Integer value1, Integer value2) {
            addCriterion("gsum between", value1, value2, "gsum");
            return (Criteria) this;
        }

        public Criteria andGsumNotBetween(Integer value1, Integer value2) {
            addCriterion("gsum not between", value1, value2, "gsum");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}