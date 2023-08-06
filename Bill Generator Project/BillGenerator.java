public class BillGenerator {
    public static void main(String[] args){
        Burger obj=new Burger(true);
        obj.Addfrench_fries();
        obj.GetBill();

//
//        DeluxBurger obj1=new DeluxBurger(false);
//        obj1.Addfrench_fries();
//
//        obj1.GetBill();
    }
}

class Burger{
    private int price;
    private boolean veg;
    private int Addcoca_colaprice = 100;
    private int Addfriesprice=50;
    private int Addsoftyprice=20;
    private boolean isAddcoca_cola = false;
    private boolean isAddfries= false;
    private boolean isAddSofty=false;
    private int baseprize;

    public Burger(boolean veg){
        this.veg=veg;
        if (this.veg){
            this.price=200;
        }
        else {
            this.price=500;
        }
        baseprize=this.price;

    }
    public void Addcoca_cola(){
        isAddcoca_cola=true;
        this.price=this.price+Addcoca_colaprice;
    }
    public void Addfrench_fries(){
        isAddfries=true;
        this.price=this.price+Addfriesprice;
    }
    public void Addsofty(){
        isAddSofty=true;
        this.price=this.price+Addsoftyprice;
    }
    public void GetBill(){
        String Bill="";
        System.out.println("Burger: "+ baseprize);
        if (isAddcoca_cola){
            Bill=Bill+"Add Coca Cola: "+Addcoca_colaprice+"\n";
        }
        if (isAddfries){
            Bill=Bill+"Add French Fries: "+Addfriesprice+"\n";
        }if (isAddSofty){
            Bill=Bill+"Add Softy: "+Addsoftyprice+"\n";
        }
        Bill=Bill+"Bill: "+this.price+"\n";
        System.out.println(Bill);
    }

}



