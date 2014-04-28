package com.mulberry.toolkit.collect;

import java.io.Serializable;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zizhi.zhzzh
 *         Date: 1/16/14
 *         Time: 9:58 PM
 * ��Ӧ�̳�List������Collection���ϵ����࣬Hessian��ʹ��CollectionSerializer���������л��Ĺ����л����Ĭ�ϵĹ��캯����
 * ����һ���µ�List��Ȼ����List��һ��һ�����Ԫ�أ��ⲻ�����⣬�ؼ��Ǿ�Ȼ�����List֮������ݣ������ҳ��ص����ݣ���϶���
 * ���Եģ���Ȼ������չSerializerFactory������������Ҫ����ע��_staticSerializerMap���൱���㡣���������ǵ�Ӧ���У�
 * recordsһ���趨���Ͳ���ϣ�����÷����¼��ϱ������Ծ����̳�Iterable�ӿڣ���ȥ�����п��Ը��ļ��ϵ����з�����
 *
 */
public class PaginatedList<T extends Serializable> implements Iterable<T>, Serializable {

    private static final long serialVersionUID = -7663937119013112333L;

    private final List<T>     records;
    private int pageSize;
    private int totalCount;
    private int pageIndex;

    public PaginatedList(){
        this.records = new ArrayList<T>();//Collections.emptyList();
    }

    public PaginatedList(List<T> records) {
        this.records = records;
    }

    public PaginatedList(List<T> records, int pageSize) {
        this(records);
        this.pageSize = pageSize;
    }

    public PaginatedList(List<T> records, int pageSize, int totalCount) {
        this(records, pageSize);
        this.totalCount = totalCount;
    }

    public PaginatedList(List<T> records, int pageSize, int totalCount, int pageIndex) {
        this(records, pageSize, totalCount);
        this.pageIndex = pageIndex;
    }

    public List<T> getRecords() {
        return records;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int size() {
        return records.size();
    }

    public boolean isEmpty() {
        return records.isEmpty();
    }

    public boolean contains(Object o) {
        return records.contains(o);
    }

    public Iterator<T> iterator() {
        return records.iterator();
    }

    public Object[] toArray() {
        return records.toArray();
    }

    public <E> E[] toArray(E[] ts) {
        return records.toArray(ts);
    }

    public boolean containsAll(Collection<?> objects) {
        return records.containsAll(objects);
    }

    public T get(int i) {
        return records.get(i);
    }

    public int indexOf(Object o) {
        return records.indexOf(o);
    }

    public int lastIndexOf(Object o) {
        return records.lastIndexOf(o);
    }

    public List<T> subList(int i, int i2) {
        return records.subList(i, i2);
    }

}
