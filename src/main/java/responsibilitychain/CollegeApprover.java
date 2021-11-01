package responsibilitychain;

public class CollegeApprover extends Approver{
    //构造器
    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() > 5000 && purchaseRequest.getPrice() <= 10000){
            System.out.println("请求编号id="+purchaseRequest.getId()+"被"+this.name+"处理了");
        }else {
            approver.processRequest(purchaseRequest);
        }
    }
}
