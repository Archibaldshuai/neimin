package com.zpark.neimin.first.common;

import java.util.List;

public class BootstrapTable {
    private int total;
    private List<?> rows;

    public BootstrapTable(int total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "BootstrapTable{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
