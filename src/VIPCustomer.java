public class VIPCustomer extends Customer{
    private int agentID;
    double saleRatio;
    
    public VIPCustomer(){
        customerID="VIP";//Customer에서 private 변수이므로 오류 발생
        bonusRatio=0.05;
        saleRatio=0.1;
    }
    public int getAgentID(){
        return agentID;
    }
}
