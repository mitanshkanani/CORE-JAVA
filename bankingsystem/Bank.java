package bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final String bankId;
    private String bankName;
    private String ifscCode;
    private String address;
    // private  List<Customer> customers=new ArrayList<>();//bank HAS-A customer
    // private  List<Account> accounts=new ArrayList<>();//so each object of account will be here bank HAS-A account

    public Bank(String bankid,String name,String code,String address){
        this.bankId=bankid;
        this.bankName=name;
        this.ifscCode=code;
        this.address=address;
    }

    public String getBankId(){
        return this.bankId;
    }
    public String getBankName(){
        return  this.bankName;
    }
    public String getIfscCode(){
        return this.ifscCode;
    }
    public String getAddress(){
        return this.address;
    }

    public void setBankName(String name){
        this.bankName=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
}
