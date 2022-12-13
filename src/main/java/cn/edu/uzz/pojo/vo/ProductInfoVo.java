package cn.edu.uzz.pojo.vo;

//条件查询封装对象
public class ProductInfoVo {

    private Integer page=1;

    private String pname;

    private Double typeid;

    private Double lprice;

    private Double hprice;

    public ProductInfoVo(String pname, Double typeid, Double lprice, Double hprice,Integer page) {
        this.pname = pname;
        this.typeid = typeid;
        this.lprice = lprice;
        this.hprice = hprice;
        this.page = page;
    }

    public ProductInfoVo(){

    }
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Double getTypeid() {
        return typeid;
    }

    public void setTypeid(Double typeid) {
        this.typeid = typeid;
    }

    public Double getLprice() {
        return lprice;
    }

    public void setLprice(Double lprice) {
        this.lprice = lprice;
    }

    public Double getHprice() {
        return hprice;
    }

    public void setHprice(Double hprice) {
        this.hprice = hprice;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "ProductInfoVo{" +
                "page=" + page +
                ", pname='" + pname + '\'' +
                ", typeid=" + typeid +
                ", lprice=" + lprice +
                ", hprice=" + hprice +
                '}';
    }
}
