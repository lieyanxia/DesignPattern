package responsibilitychain;

public class SchoolMasterApprover extends Approver{
    //构造器
    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() > 30000){
            System.out.println("请求编号id="+purchaseRequest.getId()+"被"+this.name+"处理了");
        }else {
            approver.processRequest(purchaseRequest);
        }
    }
}
