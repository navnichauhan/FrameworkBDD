package basePack;

public class ImplementLogin extends Base {
    public static void urlAccess()
    {
        if(driver==null|| driver.toString().contains("null"))
        {
            driver=getDriver();
        }
        openURL();
    }
public static void openURL()
{
    driver.get("https://magento.softwaretestingboard.com/");
}
}


