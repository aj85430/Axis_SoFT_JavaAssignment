package assignment3;

abstract class PrepaidCard
{
    int CardNo;
    double availableBalance;
    double swipeLimit;
    
    abstract boolean swipeCard(double amount);
    public abstract String toString();
    
    public double rechargeCard(double amount)
    {
    	availableBalance= availableBalance+amount;
    	return availableBalance;
    }
    
}
