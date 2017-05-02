package db;

import org.litepal.crud.DataSupport;

/**
 * Created by 73773 on 2017/5/2.
 */

public class Goods extends DataSupport{
    private String orderCode;
    private String shipperCode;
    private String logisticCode;
    public String getOrderCode(){
        return orderCode;
    }
    public void setOrderCode(String orderCode){
        this.orderCode=orderCode;
    }
    public String getShipperCode(){
        return shipperCode;
    }
    public void setShipperCode(String shipperCode){
        this.shipperCode=shipperCode;
    }
    public String getLogisticCode(){
        return logisticCode;
    }
    public void setLogisticCode(String logisticCode){
        this.logisticCode=logisticCode;
    }
}
