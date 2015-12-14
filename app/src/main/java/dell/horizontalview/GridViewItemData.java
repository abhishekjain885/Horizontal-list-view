package dell.horizontalview;

/**
 * Created by dell on 10/21/2015.
 */
public class GridViewItemData
{
    String itemDescription;
    String imageURL;
    String itemPrice;
    String id;
    GridViewItemData(String id,String itemDescription,String imageURL,String itemPrice)
    {
        this.id=id;
        this.itemDescription=itemDescription;
        this.imageURL=imageURL;
        this.itemPrice=itemPrice;
    }

    GridViewItemData(String itemDescription,String imageURL,String itemPrice)
    {
        this.itemDescription=itemDescription;
        this.imageURL=imageURL;
        this.itemPrice=itemPrice;
    }
}

