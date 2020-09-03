package org.example;

public class TestBean {
    private String name;
    private int count;
    BigBean bigBean;

    public TestBean(String name, int count, BigBean bigBean) {
        this.name = name;
        this.count = count;
        this.bigBean = bigBean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", bigBean=" + bigBean.getBigName() +
                '}';
    }
}
